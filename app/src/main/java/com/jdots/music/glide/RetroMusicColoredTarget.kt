 
package com.jdots.music.glide

import android.graphics.drawable.Drawable
import android.widget.ImageView
import code.name.monkey.appthemehelper.util.ATHUtil
import com.jdots.music.App
import com.jdots.music.R
import com.jdots.music.glide.palette.BitmapPaletteTarget
import com.jdots.music.glide.palette.BitmapPaletteWrapper
import com.jdots.music.util.color.MediaNotificationProcessor
import com.bumptech.glide.request.animation.GlideAnimation

abstract class RetroMusicColoredTarget(view: ImageView) : BitmapPaletteTarget(view) {

    protected val defaultFooterColor: Int
        get() = ATHUtil.resolveColor(getView().context, R.attr.colorControlNormal)

    abstract fun onColorReady(colors: MediaNotificationProcessor)

    override fun onLoadFailed(e: Exception?, errorDrawable: Drawable?) {
        super.onLoadFailed(e, errorDrawable)
        val colors = MediaNotificationProcessor(App.getContext(), errorDrawable)
        onColorReady(colors)
    }

    override fun onResourceReady(
        resource: BitmapPaletteWrapper?,
        glideAnimation: GlideAnimation<in BitmapPaletteWrapper>?
    ) {
        super.onResourceReady(resource, glideAnimation)
        resource?.let { bitmapWrap ->
            MediaNotificationProcessor(App.getContext()).getPaletteAsync({
                onColorReady(it)
            }, bitmapWrap.bitmap)
        }
    }
}
