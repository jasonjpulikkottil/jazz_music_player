 

package com.jdots.music.model

import androidx.annotation.StringRes
import com.jdots.music.HomeSection

data class Home(
    val arrayList: List<Any>,
    @HomeSection
    val homeSection: Int,
    @StringRes
    val titleRes: Int
)