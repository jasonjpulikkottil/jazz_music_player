package com.jdots.music.model.smartplaylist

import androidx.annotation.DrawableRes
import com.jdots.music.R
import com.jdots.music.model.AbsCustomPlaylist

abstract class AbsSmartPlaylist(
    name: String,
    @DrawableRes val iconRes: Int = R.drawable.ic_queue_music
) : AbsCustomPlaylist(
    id = PlaylistIdGenerator(name, iconRes),
    name = name
)