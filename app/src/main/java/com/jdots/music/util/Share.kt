 

package com.jdots.music.util

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.core.app.ActivityCompat

 

object Share {
    fun shareStoryToSocial(context: Context, uri: Uri) {
        val feedIntent = Intent(Intent.ACTION_SEND)
        feedIntent.type = "image/*"
        feedIntent.putExtra(Intent.EXTRA_STREAM, uri)
        ActivityCompat.startActivity(context, feedIntent, null)
    }
}