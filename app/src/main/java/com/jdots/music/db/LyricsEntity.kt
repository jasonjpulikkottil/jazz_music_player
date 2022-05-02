 
package com.jdots.music.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class LyricsEntity(
    @PrimaryKey val songId: Int,
    val lyrics: String
)
