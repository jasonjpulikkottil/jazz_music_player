package com.jdots.music.model.smartplaylist

import com.jdots.music.App
import com.jdots.music.R
import com.jdots.music.model.Song
import kotlinx.android.parcel.Parcelize

@Parcelize
class TopTracksPlaylist : AbsSmartPlaylist(
    name = App.getContext().getString(R.string.my_top_tracks),
    iconRes = R.drawable.ic_trending_up
) {
    override fun songs(): List<Song> {
        return topPlayedRepository.topTracks()
    }
}