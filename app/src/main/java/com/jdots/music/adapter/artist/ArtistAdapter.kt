
package com.jdots.music.adapter.artist

import android.content.res.ColorStateList
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.fragment.app.FragmentActivity
import com.jdots.music.R
import com.jdots.music.adapter.base.AbsMultiSelectAdapter
import com.jdots.music.adapter.base.MediaEntryViewHolder
import com.jdots.music.extensions.hide
import com.jdots.music.glide.ArtistGlideRequest
import com.jdots.music.glide.RetroMusicColoredTarget
import com.jdots.music.helper.menu.SongsMenuHelper
import com.jdots.music.interfaces.IArtistClickListener
import com.jdots.music.interfaces.ICabHolder
import com.jdots.music.model.Artist
import com.jdots.music.model.Song
import com.jdots.music.util.MusicUtil
import com.jdots.music.util.color.MediaNotificationProcessor
import com.bumptech.glide.Glide
import java.util.*
import me.zhanghai.android.fastscroll.PopupTextProvider

class ArtistAdapter(
    val activity: FragmentActivity,
    var dataSet: List<Artist>,
    var itemLayoutRes: Int,
    val ICabHolder: ICabHolder?,
    val IArtistClickListener: IArtistClickListener
) : AbsMultiSelectAdapter<ArtistAdapter.ViewHolder, Artist>(
    activity, ICabHolder, R.menu.menu_media_selection
), PopupTextProvider {

    init {
        this.setHasStableIds(true)
    }

    fun swapDataSet(dataSet: List<Artist>) {
        this.dataSet = dataSet
        notifyDataSetChanged()
    }

    override fun getItemId(position: Int): Long {
        return dataSet[position].id
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            try {
                LayoutInflater.from(activity).inflate(itemLayoutRes, parent, false)
            } catch (e: Resources.NotFoundException) {
                LayoutInflater.from(activity).inflate(R.layout.item_grid_circle, parent, false)
            }
        return createViewHolder(view)
    }

    private fun createViewHolder(view: View): ViewHolder {
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val artist = dataSet[position]
        val isChecked = isChecked(artist)
        holder.itemView.isActivated = isChecked
        holder.title?.text = artist.name
        holder.text?.hide()
        loadArtistImage(artist, holder)
    }

    fun setColors(processor: MediaNotificationProcessor, holder: ViewHolder) {
        holder.mask?.backgroundTintList = ColorStateList.valueOf(processor.primaryTextColor)
        if (holder.paletteColorContainer != null) {
            holder.paletteColorContainer?.setBackgroundColor(processor.backgroundColor)
            holder.title?.setTextColor(processor.primaryTextColor)
        }
        holder.imageContainerCard?.setCardBackgroundColor(processor.backgroundColor)
    }

    private fun loadArtistImage(artist: Artist, holder: ViewHolder) {
        if (holder.image == null) {
            return
        }
        ArtistGlideRequest.Builder.from(Glide.with(activity), artist)
            .generatePalette(activity)
            .build()
            .into(object : RetroMusicColoredTarget(holder.image!!) {
                override fun onColorReady(colors: MediaNotificationProcessor) {
                    setColors(colors, holder)
                }
            })
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun getIdentifier(position: Int): Artist? {
        return dataSet[position]
    }

    override fun getName(artist: Artist): String {
        return artist.name
    }

    override fun onMultipleItemAction(
        menuItem: MenuItem,
        selection: List<Artist>
    ) {
        SongsMenuHelper.handleMenuClick(activity, getSongList(selection), menuItem.itemId)
    }

    private fun getSongList(artists: List<Artist>): List<Song> {
        val songs = ArrayList<Song>()
        for (artist in artists) {
            songs.addAll(artist.songs) // maybe async in future?
        }
        return songs
    }

    override fun getPopupText(position: Int): String {
        return getSectionName(position)
    }

    private fun getSectionName(position: Int): String {
        return MusicUtil.getSectionName(dataSet[position].name)
    }

    inner class ViewHolder(itemView: View) : MediaEntryViewHolder(itemView) {

        init {
            menu?.visibility = View.GONE
        }

        override fun onClick(v: View?) {
            super.onClick(v)
            if (isInQuickSelectMode) {
                toggleChecked(layoutPosition)
            } else {
                image?.let {
                    ViewCompat.setTransitionName(itemView, "album")
                    IArtistClickListener.onArtist(dataSet[layoutPosition].id, itemView)
                }
            }
        }

        override fun onLongClick(v: View?): Boolean {
            toggleChecked(layoutPosition)
            return super.onLongClick(v)
        }
    }
}
