package com.jdots.music.model.smartplaylist

import com.jdots.music.App
import com.jdots.music.R
import com.jdots.music.model.Song
import kotlinx.android.parcel.Parcelize

@Parcelize
class LastAddedPlaylist : AbsSmartPlaylist(
    name = App.getContext().getString(R.string.last_added),
    iconRes = R.drawable.ic_library_add
) {
    override fun songs(): List<Song> {
        return lastAddedRepository.recentSongs()
    }
}