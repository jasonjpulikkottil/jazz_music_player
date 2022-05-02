package com.jdots.music.fragments

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

data class DetailListFragmentArgs(
  val type: Int
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("type", this.type)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): DetailListFragmentArgs {
      bundle.setClassLoader(DetailListFragmentArgs::class.java.classLoader)
      val __type : Int
      if (bundle.containsKey("type")) {
        __type = bundle.getInt("type")
      } else {
        throw IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue")
      }
      return DetailListFragmentArgs(__type)
    }
  }
}
