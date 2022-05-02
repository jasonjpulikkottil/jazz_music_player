package com.jdots.music.fragments.artists

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

data class ArtistDetailsFragmentArgs(
  val extraArtistId: Long
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("extra_artist_id", this.extraArtistId)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): ArtistDetailsFragmentArgs {
      bundle.setClassLoader(ArtistDetailsFragmentArgs::class.java.classLoader)
      val __extraArtistId : Long
      if (bundle.containsKey("extra_artist_id")) {
        __extraArtistId = bundle.getLong("extra_artist_id")
      } else {
        throw IllegalArgumentException("Required argument \"extra_artist_id\" is missing and does not have an android:defaultValue")
      }
      return ArtistDetailsFragmentArgs(__extraArtistId)
    }
  }
}
