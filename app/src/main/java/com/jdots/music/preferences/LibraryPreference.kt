

package com.jdots.music.preferences

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Toast
import androidx.core.graphics.BlendModeColorFilterCompat
import androidx.core.graphics.BlendModeCompat.SRC_IN
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import code.name.monkey.appthemehelper.common.prefs.supportv7.ATEDialogPreference
import com.jdots.music.R
import com.jdots.music.adapter.CategoryInfoAdapter
import com.jdots.music.extensions.colorButtons
import com.jdots.music.extensions.colorControlNormal
import com.jdots.music.extensions.materialDialog
import com.jdots.music.model.CategoryInfo
import com.jdots.music.util.PreferenceUtil

class LibraryPreference @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : ATEDialogPreference(context, attrs, defStyleAttr, defStyleRes) {
    init {
        icon?.colorFilter = BlendModeColorFilterCompat.createBlendModeColorFilterCompat(
            context.colorControlNormal(),
            SRC_IN
        )
    }
}

class LibraryPreferenceDialog : DialogFragment() {

    @SuppressLint("InflateParams")
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val view = LayoutInflater.from(requireContext())
            .inflate(R.layout.preference_dialog_library_categories, null)

        val categoryAdapter = CategoryInfoAdapter()
        categoryAdapter.categoryInfos = PreferenceUtil.libraryCategory
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = categoryAdapter
        categoryAdapter.attachToRecyclerView(recyclerView)


        return materialDialog(R.string.library_categories)
            .setNeutralButton(
                R.string.reset_action
            ) { _, _ ->
                categoryAdapter.categoryInfos = PreferenceUtil.defaultCategories
            }
            .setNegativeButton(android.R.string.cancel, null)
            .setPositiveButton(android.R.string.ok) { _, _ -> updateCategories(categoryAdapter.categoryInfos) }
            .setView(view)
            .create()
            .colorButtons()
    }

    private fun updateCategories(categories: List<CategoryInfo>) {
        if (getSelected(categories) == 0) return
        if (getSelected(categories) > 5) {
            Toast.makeText(context, "Not more than 5 items", Toast.LENGTH_SHORT).show()
            return
        }
        PreferenceUtil.libraryCategory = categories
    }

    private fun getSelected(categories: List<CategoryInfo>): Int {
        var selected = 0
        for (categoryInfo in categories) {
            if (categoryInfo.visible)
                selected++
        }
        return selected
    }

    companion object {
        fun newInstance(): LibraryPreferenceDialog {
            return LibraryPreferenceDialog()
        }
    }
}