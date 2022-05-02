
package com.jdots.music.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.FragmentActivity
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.jdots.music.EXTRA_GENRE
import com.jdots.music.R
import com.jdots.music.adapter.base.MediaEntryViewHolder
import com.jdots.music.model.Genre
import java.util.*


class GenreAdapter(
    private val activity: FragmentActivity,
    var dataSet: List<Genre>,
    private val mItemLayoutRes: Int
) : RecyclerView.Adapter<GenreAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(activity).inflate(mItemLayoutRes, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val genre = dataSet[position]
        holder.title?.text = genre.name
        holder.text?.text = String.format(
            Locale.getDefault(),
            "%d %s",
            genre.songCount,
            if (genre.songCount > 1) activity.getString(R.string.songs) else activity.getString(R.string.song)
        )
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    fun swapDataSet(list: List<Genre>) {
        dataSet = list
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View) : MediaEntryViewHolder(itemView) {
        override fun onClick(v: View?) {
            activity.findNavController(R.id.fragment_container).navigate(
                R.id.genreDetailsFragment,
                bundleOf(EXTRA_GENRE to dataSet[layoutPosition])
            )
        }
    }
}
