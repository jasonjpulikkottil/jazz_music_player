package com.jdots.music.interfaces

import android.view.View
import com.jdots.music.db.PlaylistWithSongs

interface IPlaylistClickListener {
    fun onPlaylistClick(playlistWithSongs: PlaylistWithSongs, view: View)
}