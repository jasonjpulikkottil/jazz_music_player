 
package com.jdots.music.fragments.genres

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.jdots.music.R
import com.jdots.music.adapter.GenreAdapter
import com.jdots.music.fragments.base.AbsRecyclerViewFragment

class GenresFragment : AbsRecyclerViewFragment<GenreAdapter, LinearLayoutManager>() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        libraryViewModel.getGenre().observe(viewLifecycleOwner, Observer {
            if (it.isNotEmpty())
                adapter?.swapDataSet(it)
            else
                adapter?.swapDataSet(listOf())
        })
    }

    override fun createLayoutManager(): LinearLayoutManager {
        return LinearLayoutManager(activity)
    }

    override fun createAdapter(): GenreAdapter {
        val dataSet = if (adapter == null) ArrayList() else adapter!!.dataSet
        return GenreAdapter(requireActivity(), dataSet, R.layout.item_list_no_image)
    }

    override val emptyMessage: Int
        get() = R.string.no_genres

    companion object {
        @JvmField
        val TAG: String = GenresFragment::class.java.simpleName

        @JvmStatic
        fun newInstance(): GenresFragment {
            return GenresFragment()
        }
    }
}
