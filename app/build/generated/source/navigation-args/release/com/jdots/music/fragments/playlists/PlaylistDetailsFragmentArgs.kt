package com.jdots.music.fragments.playlists

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.jdots.music.db.PlaylistWithSongs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class PlaylistDetailsFragmentArgs(
  val extraPlaylist: PlaylistWithSongs
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(PlaylistWithSongs::class.java)) {
      result.putParcelable("extra_playlist", this.extraPlaylist as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(PlaylistWithSongs::class.java)) {
      result.putSerializable("extra_playlist", this.extraPlaylist as Serializable)
    } else {
      throw UnsupportedOperationException(PlaylistWithSongs::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): PlaylistDetailsFragmentArgs {
      bundle.setClassLoader(PlaylistDetailsFragmentArgs::class.java.classLoader)
      val __extraPlaylist : PlaylistWithSongs?
      if (bundle.containsKey("extra_playlist")) {
        if (Parcelable::class.java.isAssignableFrom(PlaylistWithSongs::class.java) ||
            Serializable::class.java.isAssignableFrom(PlaylistWithSongs::class.java)) {
          __extraPlaylist = bundle.get("extra_playlist") as PlaylistWithSongs?
        } else {
          throw UnsupportedOperationException(PlaylistWithSongs::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__extraPlaylist == null) {
          throw IllegalArgumentException("Argument \"extra_playlist\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"extra_playlist\" is missing and does not have an android:defaultValue")
      }
      return PlaylistDetailsFragmentArgs(__extraPlaylist)
    }
  }
}
