 
package com.jdots.music.appshortcuts

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.jdots.music.appshortcuts.shortcuttype.LastAddedShortcutType
import com.jdots.music.appshortcuts.shortcuttype.ShuffleAllShortcutType
import com.jdots.music.appshortcuts.shortcuttype.TopTracksShortcutType
import com.jdots.music.extensions.extraNotNull
import com.jdots.music.model.Playlist
import com.jdots.music.model.smartplaylist.LastAddedPlaylist
import com.jdots.music.model.smartplaylist.ShuffleAllPlaylist
import com.jdots.music.model.smartplaylist.TopTracksPlaylist
import com.jdots.music.service.MusicService
import com.jdots.music.service.MusicService.*

class AppShortcutLauncherActivity : Activity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        when (extraNotNull(KEY_SHORTCUT_TYPE, SHORTCUT_TYPE_NONE).value) {
            SHORTCUT_TYPE_SHUFFLE_ALL -> {
                startServiceWithPlaylist(
                    SHUFFLE_MODE_SHUFFLE, ShuffleAllPlaylist()
                )
                DynamicShortcutManager.reportShortcutUsed(this, ShuffleAllShortcutType.id)
            }
            SHORTCUT_TYPE_TOP_TRACKS -> {
                startServiceWithPlaylist(
                    SHUFFLE_MODE_NONE, TopTracksPlaylist()
                )
                DynamicShortcutManager.reportShortcutUsed(this, TopTracksShortcutType.id)
            }
            SHORTCUT_TYPE_LAST_ADDED -> {
                startServiceWithPlaylist(
                    SHUFFLE_MODE_NONE, LastAddedPlaylist()
                )
                DynamicShortcutManager.reportShortcutUsed(this, LastAddedShortcutType.id)
            }
        }
        finish()
    }

    private fun startServiceWithPlaylist(shuffleMode: Int, playlist: Playlist) {
        val intent = Intent(this, MusicService::class.java)
        intent.action = ACTION_PLAY_PLAYLIST

        val bundle = Bundle()
        bundle.putParcelable(INTENT_EXTRA_PLAYLIST, playlist)
        bundle.putInt(INTENT_EXTRA_SHUFFLE_MODE, shuffleMode)

        intent.putExtras(bundle)

        startService(intent)
    }

    companion object {
        const val KEY_SHORTCUT_TYPE = "io.jdots.muntashirakon.Music.appshortcuts.ShortcutType"
        const val SHORTCUT_TYPE_SHUFFLE_ALL = 0L
        const val SHORTCUT_TYPE_TOP_TRACKS = 1L
        const val SHORTCUT_TYPE_LAST_ADDED = 2L
        const val SHORTCUT_TYPE_NONE = 4L
    }
}
