
package com.jdots.music.fragments.library

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import code.name.monkey.appthemehelper.common.ATHToolbarActivity.getToolbarBackgroundColor
import code.name.monkey.appthemehelper.util.ToolbarContentTintHelper
import com.jdots.music.R
import com.jdots.music.dialogs.CreatePlaylistDialog
import com.jdots.music.dialogs.ImportPlaylistDialog
import com.jdots.music.extensions.whichFragment
import com.jdots.music.fragments.base.AbsMainActivityFragment
import com.jdots.music.model.CategoryInfo
import com.jdots.music.util.PreferenceUtil
import kotlinx.android.synthetic.main.fragment_library.*

class LibraryFragment : AbsMainActivityFragment(R.layout.fragment_library) {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setHasOptionsMenu(true)
        mainActivity.setBottomBarVisibility(View.VISIBLE)
        mainActivity.setSupportActionBar(toolbar)
        mainActivity.supportActionBar?.title = null
        toolbar.setNavigationOnClickListener {
            findNavController().navigate(
                R.id.searchFragment,
                null,
                navOptions
            )
        }
        setupNavigationController()
        setupTitle()
    }

    private fun setupTitle() {
        appNameText.text = getText(R.string.app_name)
    }

    private fun setupNavigationController() {
        val navHostFragment = whichFragment<NavHostFragment>(R.id.fragment_container)
        val navController = navHostFragment.navController
        val navInflater = navController.navInflater
        val navGraph = navInflater.inflate(R.navigation.library_graph)

        val categoryInfo: CategoryInfo = PreferenceUtil.libraryCategory.first { it.visible }
        if (categoryInfo.visible) {
            navGraph.startDestination = categoryInfo.category.id
        }
        navController.graph = navGraph
        NavigationUI.setupWithNavController(mainActivity.getBottomNavigationView(), navController)
        navController.addOnDestinationChangedListener { _, _, _ ->
            appBarLayout.setExpanded(true, true)
        }
    }

    override fun onPrepareOptionsMenu(menu: Menu) {
        super.onPrepareOptionsMenu(menu)
        ToolbarContentTintHelper.handleOnPrepareOptionsMenu(requireActivity(), toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_main, menu)
        ToolbarContentTintHelper.handleOnCreateOptionsMenu(
            requireContext(),
            toolbar,
            menu,
            getToolbarBackgroundColor(toolbar)
        )
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_settings -> findNavController().navigate(
                R.id.settingsActivity,
                null,
                navOptions
            )
            R.id.action_import_playlist -> ImportPlaylistDialog().show(
                childFragmentManager,
                "ImportPlaylist"
            )
            R.id.action_add_to_playlist -> CreatePlaylistDialog.create(emptyList()).show(
                childFragmentManager,
                "ShowCreatePlaylistDialog"
            )
        }
        return super.onOptionsItemSelected(item)
    }
}
