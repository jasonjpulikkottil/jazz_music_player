
package com.jdots.music.activities

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.WindowManager
import androidx.core.view.ViewCompat
import code.name.monkey.appthemehelper.ThemeStore
import code.name.monkey.appthemehelper.util.ToolbarContentTintHelper
import com.jdots.music.R
import com.jdots.music.activities.base.AbsMusicServiceActivity
import com.jdots.music.extensions.surfaceColor
import com.jdots.music.helper.MusicPlayerRemote
import com.jdots.music.helper.MusicProgressViewUpdateHelper
import com.jdots.music.lyrics.LrcView
import com.jdots.music.model.Song
import com.jdots.music.util.LyricUtil
import com.jdots.music.util.RetroUtil
import com.google.android.material.color.MaterialColors
import com.google.android.material.transition.platform.MaterialContainerTransform
import kotlinx.android.synthetic.main.activity_lyrics.*

class LyricsActivity : AbsMusicServiceActivity(), MusicProgressViewUpdateHelper.Callback {
    private lateinit var updateHelper: MusicProgressViewUpdateHelper

    private lateinit var song: Song

    private val googleSearchLrcUrl: String
        get() {
            var baseUrl = "http://www.google.com/search?"
            var query = song.title + "+" + song.artistName
            query = "q=" + query.replace(" ", "+") + " .lrc"
            baseUrl += query
            return baseUrl
        }

    private fun buildContainerTransform(): MaterialContainerTransform {
        val transform = MaterialContainerTransform()
        transform.setAllContainerColors(
            MaterialColors.getColor(findViewById(R.id.container), R.attr.colorSurface)
        )
        transform.addTarget(R.id.container)
        transform.duration = 300
        return transform
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lyrics)
        ViewCompat.setTransitionName(container, "lyrics")
        setStatusbarColorAuto()
        setTaskDescriptionColorAuto()
        setNavigationbarColorAuto()

        setupWakelock()

        toolbar.setBackgroundColor(surfaceColor())
        ToolbarContentTintHelper.colorBackButton(toolbar)
        setSupportActionBar(toolbar)

        updateHelper = MusicProgressViewUpdateHelper(this, 500, 1000)
        setupLyricsView()
    }

    private fun setupLyricsView() {
        lyricsView.apply {
            setCurrentColor(ThemeStore.accentColor(context))
            setTimeTextColor(ThemeStore.accentColor(context))
            setTimelineColor(ThemeStore.accentColor(context))
            setTimelineTextColor(ThemeStore.accentColor(context))
            setDraggable(true, LrcView.OnPlayClickListener {
                MusicPlayerRemote.seekTo(it.toInt())
                return@OnPlayClickListener true
            })
        }
    }

    override fun onResume() {
        super.onResume()
        updateHelper.start()
    }

    override fun onPause() {
        super.onPause()
        updateHelper.stop()
    }

    override fun onUpdateProgressViews(progress: Int, total: Int) {
        lyricsView.updateTime(progress.toLong())
    }

    private fun loadLRCLyrics() {
        lyricsView.setLabel("Empty")
        val song = MusicPlayerRemote.currentSong
        if (LyricUtil.isLrcOriginalFileExist(song.data)) {
            lyricsView.loadLrc(LyricUtil.getLocalLyricOriginalFile(song.data))
        } else if (LyricUtil.isLrcFileExist(song.title, song.artistName)) {
            lyricsView.loadLrc(LyricUtil.getLocalLyricFile(song.title, song.artistName))
        }
    }

    override fun onPlayingMetaChanged() {
        super.onPlayingMetaChanged()
        updateTitleSong()
        loadLRCLyrics()
    }

    override fun onServiceConnected() {
        super.onServiceConnected()
        updateTitleSong()
        loadLRCLyrics()
    }

    private fun updateTitleSong() {
        song = MusicPlayerRemote.currentSong
        toolbar.title = song.title
        toolbar.subtitle = song.artistName
    }

    private fun setupWakelock() {
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_search, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
            return true
        }
        if (item.itemId == R.id.action_search) {
            RetroUtil.openUrl(this, googleSearchLrcUrl)
        }
        return super.onOptionsItemSelected(item)
    }
}
