 
package com.jdots.music.fragments.base

import android.os.Bundle
import android.view.*
import androidx.annotation.NonNull
import androidx.annotation.StringRes
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import code.name.monkey.appthemehelper.common.ATHToolbarActivity
import code.name.monkey.appthemehelper.util.ToolbarContentTintHelper
import com.jdots.music.R
import com.jdots.music.dialogs.CreatePlaylistDialog
import com.jdots.music.dialogs.ImportPlaylistDialog
import com.jdots.music.helper.MusicPlayerRemote
import com.jdots.music.util.DensityUtil
import com.jdots.music.util.ThemedFastScroller.create
import com.jdots.music.views.ScrollingViewOnApplyWindowInsetsListener
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.transition.Hold
import kotlinx.android.synthetic.main.fragment_main_recycler.*
import me.zhanghai.android.fastscroll.FastScroller
import me.zhanghai.android.fastscroll.FastScrollerBuilder

abstract class AbsRecyclerViewFragment<A : RecyclerView.Adapter<*>, LM : RecyclerView.LayoutManager> :
    AbsMainActivityFragment(R.layout.fragment_main_recycler),
    AppBarLayout.OnOffsetChangedListener {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setHasOptionsMenu(true)
    }

    protected var adapter: A? = null
    protected var layoutManager: LM? = null

    private fun setUpTransitions() {
        exitTransition = Hold()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setUpTransitions()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainActivity.setBottomBarVisibility(View.VISIBLE)
        mainActivity.setSupportActionBar(toolbar)
        mainActivity.supportActionBar?.title = null
        initLayoutManager()
        initAdapter()
        setUpRecyclerView()
        setupTitle()
    }

    private fun setupTitle() {
        toolbar.setNavigationOnClickListener {
            findNavController().navigate(
                R.id.searchFragment,
                null,
                navOptions
            )
        }
        appNameText.text = getString(R.string.app_name)
    }

    private fun setUpRecyclerView() {
        recyclerView.apply {
            layoutManager = this@AbsRecyclerViewFragment.layoutManager
            adapter = this@AbsRecyclerViewFragment.adapter
            val fastScroller = create(this)
            setOnApplyWindowInsetsListener(
                ScrollingViewOnApplyWindowInsetsListener(
                    recyclerView,
                    fastScroller
                )
            )
        }
        checkForPadding()
    }

    protected open fun createFastScroller(recyclerView: RecyclerView): FastScroller {
        return FastScrollerBuilder(recyclerView).useMd2Style().build()
    }

    private fun initAdapter() {
        adapter = createAdapter()
        adapter?.registerAdapterDataObserver(object : RecyclerView.AdapterDataObserver() {
            override fun onChanged() {
                super.onChanged()
                checkIsEmpty()
                checkForPadding()
            }
        })
    }

    protected open val emptyMessage: Int
        @StringRes get() = R.string.empty

    private fun getEmojiByUnicode(unicode: Int): String {
        return String(Character.toChars(unicode))
    }

    private fun checkIsEmpty() {
        emptyText.setText(emptyMessage)
        empty.visibility = if (adapter!!.itemCount == 0) View.VISIBLE else View.GONE
    }

    private fun checkForPadding() {
        val itemCount: Int = adapter?.itemCount ?: 0
        val params = container.layoutParams as ViewGroup.MarginLayoutParams
        if (itemCount > 0 && MusicPlayerRemote.playingQueue.isNotEmpty()) {
            val height = DensityUtil.dip2px(requireContext(), 104f)
            params.bottomMargin = height
        } else {
            val height = DensityUtil.dip2px(requireContext(), 52f)
            params.bottomMargin = height
        }
    }

    private fun initLayoutManager() {
        layoutManager = createLayoutManager()
    }

    protected abstract fun createLayoutManager(): LM

    @NonNull
    protected abstract fun createAdapter(): A

    override fun onOffsetChanged(p0: AppBarLayout?, i: Int) {
        container.setPadding(
            container.paddingLeft,
            container.paddingTop,
            container.paddingRight,
            i
        )
    }

    override fun onQueueChanged() {
        super.onQueueChanged()
        checkForPadding()
    }

    override fun onServiceConnected() {
        super.onServiceConnected()
        checkForPadding()
    }

    protected fun invalidateLayoutManager() {
        initLayoutManager()
        recyclerView.layoutManager = layoutManager
    }

    protected fun invalidateAdapter() {
        initAdapter()
        checkIsEmpty()
        recyclerView.adapter = adapter
    }

    fun recyclerView(): RecyclerView {
        return recyclerView
    }

    override fun onPrepareOptionsMenu(menu: Menu) {
        super.onPrepareOptionsMenu(menu)
        ToolbarContentTintHelper.handleOnPrepareOptionsMenu(requireActivity(), toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_main, menu)
        ToolbarContentTintHelper.handleOnCreateOptionsMenu(
            requireContext(),
            toolbar,
            menu,
            ATHToolbarActivity.getToolbarBackgroundColor(toolbar)
        )
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_settings -> findNavController().navigate(
                R.id.settingsActivity,
                null,
                navOptions
            )
            R.id.action_import_playlist -> ImportPlaylistDialog().show(
                childFragmentManager,
                "ImportPlaylist"
            )
            R.id.action_add_to_playlist -> CreatePlaylistDialog.create(emptyList()).show(
                childFragmentManager,
                "ShowCreatePlaylistDialog"
            )
        }
        return super.onOptionsItemSelected(item)
    }
}
