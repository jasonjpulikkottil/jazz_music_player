package com.jdots.music.fragments.genres

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.jdots.music.model.Genre
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class GenreDetailsFragmentArgs(
  val extraGenre: Genre
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Genre::class.java)) {
      result.putParcelable("extra_genre", this.extraGenre as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Genre::class.java)) {
      result.putSerializable("extra_genre", this.extraGenre as Serializable)
    } else {
      throw UnsupportedOperationException(Genre::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): GenreDetailsFragmentArgs {
      bundle.setClassLoader(GenreDetailsFragmentArgs::class.java.classLoader)
      val __extraGenre : Genre?
      if (bundle.containsKey("extra_genre")) {
        if (Parcelable::class.java.isAssignableFrom(Genre::class.java) ||
            Serializable::class.java.isAssignableFrom(Genre::class.java)) {
          __extraGenre = bundle.get("extra_genre") as Genre?
        } else {
          throw UnsupportedOperationException(Genre::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__extraGenre == null) {
          throw IllegalArgumentException("Argument \"extra_genre\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"extra_genre\" is missing and does not have an android:defaultValue")
      }
      return GenreDetailsFragmentArgs(__extraGenre)
    }
  }
}
