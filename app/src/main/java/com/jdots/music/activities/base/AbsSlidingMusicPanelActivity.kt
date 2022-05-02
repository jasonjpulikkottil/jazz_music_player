 
package com.jdots.music.activities.base

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.ViewTreeObserver
import android.widget.FrameLayout
import androidx.core.view.ViewCompat
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import code.name.monkey.appthemehelper.util.ATHUtil
import code.name.monkey.appthemehelper.util.ColorUtil
import com.jdots.music.R
import com.jdots.music.RetroBottomSheetBehavior
import com.jdots.music.extensions.*
import com.jdots.music.fragments.LibraryViewModel
import com.jdots.music.fragments.MiniPlayerFragment
import com.jdots.music.fragments.NowPlayingScreen
import com.jdots.music.fragments.NowPlayingScreen.*
import com.jdots.music.fragments.base.AbsPlayerFragment
import com.jdots.music.fragments.player.adaptive.AdaptiveFragment
import com.jdots.music.fragments.player.blur.BlurPlayerFragment
import com.jdots.music.fragments.player.card.CardFragment
import com.jdots.music.fragments.player.cardblur.CardBlurFragment
import com.jdots.music.fragments.player.circle.CirclePlayerFragment
import com.jdots.music.fragments.player.classic.ClassicPlayerFragment
import com.jdots.music.fragments.player.color.ColorFragment
import com.jdots.music.fragments.player.fit.FitFragment
import com.jdots.music.fragments.player.flat.FlatPlayerFragment
import com.jdots.music.fragments.player.full.FullPlayerFragment
import com.jdots.music.fragments.player.gradient.GradientPlayerFragment
import com.jdots.music.fragments.player.material.MaterialFragment
import com.jdots.music.fragments.player.normal.PlayerFragment
import com.jdots.music.fragments.player.peak.PeakPlayerFragment
import com.jdots.music.fragments.player.plain.PlainPlayerFragment
import com.jdots.music.fragments.player.simple.SimplePlayerFragment
import com.jdots.music.fragments.player.tiny.TinyPlayerFragment
import com.jdots.music.helper.MusicPlayerRemote
import com.jdots.music.model.CategoryInfo
import com.jdots.music.util.PreferenceUtil
import com.jdots.music.views.BottomNavigationBarTinted
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetBehavior.*
import kotlinx.android.synthetic.main.sliding_music_panel_layout.*
import org.koin.androidx.viewmodel.ext.android.viewModel

abstract class AbsSlidingMusicPanelActivity : AbsMusicServiceActivity() {
    companion object {
        val TAG: String = AbsSlidingMusicPanelActivity::class.java.simpleName
    }

    protected val libraryViewModel by viewModel<LibraryViewModel>()
    private lateinit var bottomSheetBehavior: RetroBottomSheetBehavior<FrameLayout>
    private var playerFragment: AbsPlayerFragment? = null
    private var miniPlayerFragment: MiniPlayerFragment? = null
    private var nowPlayingScreen: NowPlayingScreen? = null
    private var navigationBarColor: Int = 0
    private var taskColor: Int = 0
    private var lightStatusBar: Boolean = false
    private var lightNavigationBar: Boolean = false
    private var paletteColor: Int = Color.WHITE
    protected abstract fun createContentView(): View
    private val panelState: Int
        get() = bottomSheetBehavior.state

    private val bottomSheetCallbackList = object : BottomSheetCallback() {

        override fun onSlide(bottomSheet: View, slideOffset: Float) {
            setMiniPlayerAlphaProgress(slideOffset)
            dimBackground.show()
            dimBackground.alpha = slideOffset
        }

        override fun onStateChanged(bottomSheet: View, newState: Int) {
            when (newState) {
                STATE_EXPANDED -> {
                    onPanelExpanded()
                }
                STATE_COLLAPSED -> {
                    onPanelCollapsed()
                    dimBackground.hide()
                }
                else -> {
                    println("Do something")
                }
            }
        }
    }

    fun getBottomSheetBehavior() = bottomSheetBehavior

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(createContentView())
        chooseFragmentForTheme()
        setupSlidingUpPanel()
        setupBottomSheet()
        updateColor()

        val themeColor = ATHUtil.resolveColor(this, android.R.attr.windowBackground, Color.GRAY)
        dimBackground.setBackgroundColor(ColorUtil.withAlpha(themeColor, 0.5f))
        dimBackground.setOnClickListener {
            println("dimBackground")

        }
    }

    private fun setupBottomSheet() {
        bottomSheetBehavior = from(slidingPanel) as RetroBottomSheetBehavior
        bottomSheetBehavior.addBottomSheetCallback(bottomSheetCallbackList)
    }

    override fun onResume() {
        super.onResume()
        if (nowPlayingScreen != PreferenceUtil.nowPlayingScreen) {
            postRecreate()
        }
        if (bottomSheetBehavior.state == BottomSheetBehavior.STATE_EXPANDED) {
            setMiniPlayerAlphaProgress(1f)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        bottomSheetBehavior.removeBottomSheetCallback(bottomSheetCallbackList)
    }

    @SuppressLint("InflateParams")
    protected fun wrapSlidingMusicPanel(): View {
        val slidingMusicPanelLayout =
            layoutInflater.inflate(R.layout.sliding_music_panel_layout, null)
        val contentContainer: ViewGroup =
            slidingMusicPanelLayout.findViewById(R.id.mainContentFrame)
        layoutInflater.inflate(R.layout.activity_main_content, contentContainer)
        return slidingMusicPanelLayout
    }

    fun collapsePanel() {
        bottomSheetBehavior.state = STATE_COLLAPSED
    }

    fun expandPanel() {
        bottomSheetBehavior.state = STATE_EXPANDED
        setMiniPlayerAlphaProgress(1f)
    }

    private fun setMiniPlayerAlphaProgress(progress: Float) {
        val alpha = 1 - progress
        miniPlayerFragment?.view?.alpha = alpha
        miniPlayerFragment?.view?.visibility = if (alpha == 0f) View.GONE else View.VISIBLE
        bottomNavigationView.translationY = progress * 500
        bottomNavigationView.alpha = alpha
    }

    open fun onPanelCollapsed() {
        // restore values
        super.setLightStatusbar(lightStatusBar)
        super.setTaskDescriptionColor(taskColor)
        super.setNavigationbarColor(navigationBarColor)
        super.setLightNavigationBar(lightNavigationBar)
    }

    open fun onPanelExpanded() {
        onPaletteColorChanged()
    }

    private fun setupSlidingUpPanel() {
        slidingPanel.viewTreeObserver.addOnGlobalLayoutListener(object :
            ViewTreeObserver.OnGlobalLayoutListener {
            override fun onGlobalLayout() {
                slidingPanel.viewTreeObserver.removeOnGlobalLayoutListener(this)
                if (nowPlayingScreen != Peak) {
                    val params = slidingPanel.layoutParams as ViewGroup.LayoutParams
                    params.height = ViewGroup.LayoutParams.MATCH_PARENT
                    slidingPanel.layoutParams = params
                }
                when (panelState) {
                    STATE_EXPANDED -> onPanelExpanded()
                    STATE_COLLAPSED -> onPanelCollapsed()
                    else -> {
                        // playerFragment!!.onHide()
                    }
                }
            }
        })
    }

    fun getBottomNavigationView(): BottomNavigationBarTinted {
        return bottomNavigationView
    }

    override fun onServiceConnected() {
        super.onServiceConnected()
        if (MusicPlayerRemote.playingQueue.isNotEmpty()) {
            slidingPanel.viewTreeObserver.addOnGlobalLayoutListener(object :
                ViewTreeObserver.OnGlobalLayoutListener {
                override fun onGlobalLayout() {
                    slidingPanel.viewTreeObserver.removeOnGlobalLayoutListener(this)
                    hideBottomBar(false)
                }
            })
        } // don't call hideBottomBar(true) here as it causes a bug with the SlidingUpPanelLayout
    }

    override fun onQueueChanged() {
        super.onQueueChanged()
        hideBottomBar(MusicPlayerRemote.playingQueue.isEmpty())
    }

    override fun onBackPressed() {
        if (!handleBackPress()) super.onBackPressed()
    }

    private fun handleBackPress(): Boolean {
        if (bottomSheetBehavior.peekHeight != 0 && playerFragment!!.onBackPressed()) return true
        if (panelState == STATE_EXPANDED) {
            collapsePanel()
            return true
        }

        return false
    }

    private fun onPaletteColorChanged() {
        if (panelState == STATE_EXPANDED) {
            super.setTaskDescriptionColor(paletteColor)
            val isColorLight = ColorUtil.isColorLight(paletteColor)
            if (PreferenceUtil.isAdaptiveColor && (nowPlayingScreen == Normal || nowPlayingScreen == Flat)) {
                super.setLightNavigationBar(true)
                super.setLightStatusbar(isColorLight)
            } else if (nowPlayingScreen == Card || nowPlayingScreen == Blur || nowPlayingScreen == BlurCard) {
                super.setLightStatusbar(false)
                super.setLightNavigationBar(true)
                super.setNavigationbarColor(Color.BLACK)
            } else if (nowPlayingScreen == Color || nowPlayingScreen == Tiny || nowPlayingScreen == Gradient) {
                super.setNavigationbarColor(paletteColor)
                super.setLightNavigationBar(isColorLight)
                super.setLightStatusbar(isColorLight)
            } else if (nowPlayingScreen == Full) {
                super.setNavigationbarColor(paletteColor)
                super.setLightNavigationBar(isColorLight)
                super.setLightStatusbar(false)
            } else if (nowPlayingScreen == Classic) {
                super.setLightStatusbar(false)
            } else if (nowPlayingScreen == Fit) {
                super.setLightStatusbar(false)
            } else {
                super.setLightStatusbar(
                    ColorUtil.isColorLight(
                        ATHUtil.resolveColor(
                            this,
                            android.R.attr.windowBackground
                        )
                    )
                )
                super.setLightNavigationBar(true)
            }
        }
    }

    override fun setLightStatusbar(enabled: Boolean) {
        lightStatusBar = enabled
        if (panelState == STATE_COLLAPSED) {
            super.setLightStatusbar(enabled)
        }
    }

    override fun setLightNavigationBar(enabled: Boolean) {
        lightNavigationBar = enabled
        if (panelState == STATE_COLLAPSED) {
            super.setLightNavigationBar(enabled)
        }
    }

    override fun setNavigationbarColor(color: Int) {
        navigationBarColor = color
        if (panelState == STATE_COLLAPSED) {
            super.setNavigationbarColor(color)
        }
    }

    override fun setTaskDescriptionColor(color: Int) {
        taskColor = color
        if (panelState == STATE_COLLAPSED) {
            super.setTaskDescriptionColor(color)
        }
    }

    fun updateTabs() {
        bottomNavigationView.menu.clear()
        val currentTabs: List<CategoryInfo> = PreferenceUtil.libraryCategory
        for (tab in currentTabs) {
            if (tab.visible) {
                val menu = tab.category
                bottomNavigationView.menu.add(0, menu.id, 0, menu.stringRes).setIcon(menu.icon)
            }
        }
        if (bottomNavigationView.menu.size() == 1) {
            bottomNavigationView.hide()
        }
    }

    private fun updateColor() {
        libraryViewModel.paletteColor.observe(this, { color ->
            this.paletteColor = color
            onPaletteColorChanged()
        })
    }

    fun setBottomBarVisibility(visible: Int) {
        bottomNavigationView.visibility = visible
        hideBottomBar(MusicPlayerRemote.playingQueue.isEmpty())
    }

    private fun hideBottomBar(hide: Boolean) {
        val heightOfBar = dip(R.dimen.mini_player_height)
        val heightOfBarWithTabs = dip(R.dimen.mini_player_height_expanded)
        val isVisible = bottomNavigationView.isVisible
        if (hide) {
            bottomSheetBehavior.isHideable = true
            bottomSheetBehavior.peekHeight = 0
            ViewCompat.setElevation(slidingPanel, 0f)
            ViewCompat.setElevation(bottomNavigationView, 10f)
            collapsePanel()
        } else {
            if (MusicPlayerRemote.playingQueue.isNotEmpty()) {
                bottomSheetBehavior.isHideable = false
                ViewCompat.setElevation(slidingPanel, 10f)
                ViewCompat.setElevation(bottomNavigationView, 10f)
                if (isVisible) {
                    bottomSheetBehavior.peekHeight = heightOfBarWithTabs
                    bottomNavigationView.translateYAnimate(0f)
                } else {
                    bottomNavigationView.translateYAnimate(150f)
                    bottomSheetBehavior.peekHeight = heightOfBar
                }
            }
        }
    }

    private fun chooseFragmentForTheme() {
        nowPlayingScreen = PreferenceUtil.nowPlayingScreen

        val fragment: Fragment = when (nowPlayingScreen) {
            Blur -> BlurPlayerFragment()
            Adaptive -> AdaptiveFragment()
            Normal -> PlayerFragment()
            Card -> CardFragment()
            BlurCard -> CardBlurFragment()
            Fit -> FitFragment()
            Flat -> FlatPlayerFragment()
            Full -> FullPlayerFragment()
            Plain -> PlainPlayerFragment()
            Simple -> SimplePlayerFragment()
            Material -> MaterialFragment()
            Color -> ColorFragment()
            Gradient -> GradientPlayerFragment()
            Tiny -> TinyPlayerFragment()
            Peak -> PeakPlayerFragment()
            Circle -> CirclePlayerFragment()
            Classic -> ClassicPlayerFragment()
            else -> PlayerFragment()
        } // must implement AbsPlayerFragment
        supportFragmentManager.commit {
            replace(R.id.playerFragmentContainer, fragment)
        }
        supportFragmentManager.executePendingTransactions()
        playerFragment = whichFragment<AbsPlayerFragment>(R.id.playerFragmentContainer)
        miniPlayerFragment = whichFragment<MiniPlayerFragment>(R.id.miniPlayerFragment)
        miniPlayerFragment?.view?.setOnClickListener { expandPanel() }
    }
}
