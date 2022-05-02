package com.jdots.music.fragments.albums

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

data class AlbumDetailsFragmentArgs(
  val extraAlbumId: Long
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("extra_album_id", this.extraAlbumId)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): AlbumDetailsFragmentArgs {
      bundle.setClassLoader(AlbumDetailsFragmentArgs::class.java.classLoader)
      val __extraAlbumId : Long
      if (bundle.containsKey("extra_album_id")) {
        __extraAlbumId = bundle.getLong("extra_album_id")
      } else {
        throw IllegalArgumentException("Required argument \"extra_album_id\" is missing and does not have an android:defaultValue")
      }
      return AlbumDetailsFragmentArgs(__extraAlbumId)
    }
  }
}
