 
package com.jdots.music.adapter.album

import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.jdots.music.glide.AlbumGlideRequest
import com.jdots.music.glide.RetroMusicColoredTarget
import com.jdots.music.helper.HorizontalAdapterHelper
import com.jdots.music.interfaces.IAlbumClickListener
import com.jdots.music.interfaces.ICabHolder
import com.jdots.music.model.Album
import com.jdots.music.util.MusicUtil
import com.jdots.music.util.color.MediaNotificationProcessor
import com.bumptech.glide.Glide

class HorizontalAlbumAdapter(
    activity: FragmentActivity,
    dataSet: List<Album>,
    ICabHolder: ICabHolder?,
    albumClickListener: IAlbumClickListener
) : AlbumAdapter(
    activity, dataSet, HorizontalAdapterHelper.LAYOUT_RES, ICabHolder, albumClickListener
) {

    override fun createViewHolder(view: View, viewType: Int): ViewHolder {
        val params = view.layoutParams as ViewGroup.MarginLayoutParams
        HorizontalAdapterHelper.applyMarginToLayoutParams(activity, params, viewType)
        return ViewHolder(view)
    }

    override fun setColors(color: MediaNotificationProcessor, holder: ViewHolder) {
        // holder.title?.setTextColor(ATHUtil.resolveColor(activity, android.R.attr.textColorPrimary))
        // holder.text?.setTextColor(ATHUtil.resolveColor(activity, android.R.attr.textColorSecondary))
    }

    override fun loadAlbumCover(album: Album, holder: ViewHolder) {
        if (holder.image == null) return
        AlbumGlideRequest.Builder.from(Glide.with(activity), album.safeGetFirstSong())
            .checkIgnoreMediaStore()
            .generatePalette(activity)
            .build()
            .into(object : RetroMusicColoredTarget(holder.image!!) {
                override fun onColorReady(colors: MediaNotificationProcessor) {
                    setColors(colors, holder)
                }
            })
    }

    override fun getAlbumText(album: Album): String? {
        return MusicUtil.getYearString(album.year)
    }

    override fun getItemViewType(position: Int): Int {
        return HorizontalAdapterHelper.getItemViewType(position, itemCount)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    companion object {
        val TAG: String = AlbumAdapter::class.java.simpleName
    }
}
