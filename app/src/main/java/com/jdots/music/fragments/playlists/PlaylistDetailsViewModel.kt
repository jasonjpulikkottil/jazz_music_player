
package com.jdots.music.fragments.playlists

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jdots.music.db.PlaylistWithSongs
import com.jdots.music.db.SongEntity
import com.jdots.music.interfaces.IMusicServiceEventListener
import com.jdots.music.model.Song
import com.jdots.music.repository.RealRepository

class PlaylistDetailsViewModel(
    private val realRepository: RealRepository,
    private var playlist: PlaylistWithSongs
) : ViewModel(), IMusicServiceEventListener {

    private val playListSongs = MutableLiveData<List<Song>>()

    fun getSongs(): LiveData<List<SongEntity>> =
        realRepository.playlistSongs(playlist.playlistEntity.playListId)

    override fun onMediaStoreChanged() {}
    override fun onServiceConnected() {}
    override fun onServiceDisconnected() {}
    override fun onQueueChanged() {}
    override fun onPlayingMetaChanged() {}
    override fun onPlayStateChanged() {}
    override fun onRepeatModeChanged() {}
    override fun onShuffleModeChanged() {}
}
