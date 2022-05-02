package com.jdots.music.model.smartplaylist

import com.jdots.music.App
import com.jdots.music.R
import com.jdots.music.model.Song
import kotlinx.android.parcel.Parcelize

@Parcelize
class ShuffleAllPlaylist : AbsSmartPlaylist(
    name = App.getContext().getString(R.string.action_shuffle_all),
    iconRes = R.drawable.ic_shuffle
) {
    override fun songs(): List<Song> {
        return songRepository.songs()
    }
}