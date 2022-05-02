 
package com.jdots.music.fragments.home

import android.app.ActivityOptions
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.MenuItem.SHOW_AS_ACTION_IF_ROOM
import android.view.View
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import code.name.monkey.appthemehelper.common.ATHToolbarActivity
import code.name.monkey.appthemehelper.util.ToolbarContentTintHelper
import com.jdots.music.HISTORY_PLAYLIST
import com.jdots.music.LAST_ADDED_PLAYLIST
import com.jdots.music.R
import com.jdots.music.TOP_PLAYED_PLAYLIST
import com.jdots.music.adapter.HomeAdapter
import com.jdots.music.dialogs.CreatePlaylistDialog
import com.jdots.music.dialogs.ImportPlaylistDialog
import com.jdots.music.fragments.base.AbsMainActivityFragment
import com.jdots.music.glide.ProfileBannerGlideRequest
import com.jdots.music.glide.UserProfileGlideRequest
import com.jdots.music.util.NavigationUtil
import com.jdots.music.util.PreferenceUtil
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.abs_playlists.*
import kotlinx.android.synthetic.main.fragment_banner_home.*
import kotlinx.android.synthetic.main.home_content.*

class HomeFragment :
    AbsMainActivityFragment(if (PreferenceUtil.isHomeBanner) R.layout.fragment_banner_home else R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainActivity.setBottomBarVisibility(View.VISIBLE)
        mainActivity.setSupportActionBar(toolbar)
        mainActivity.supportActionBar?.title = null
        setStatusBarColorAuto(view)
        bannerImage?.setOnClickListener {
            val options = ActivityOptions.makeSceneTransitionAnimation(
                mainActivity,
                userImage,
                getString(R.string.transition_user_image)
            )
            NavigationUtil.goToUserInfo(requireActivity(), options)
        }

        lastAdded.setOnClickListener {
            findNavController().navigate(
                R.id.detailListFragment,
                bundleOf("type" to LAST_ADDED_PLAYLIST)
            )
        }

        topPlayed.setOnClickListener {
            findNavController().navigate(
                R.id.detailListFragment,
                bundleOf("type" to TOP_PLAYED_PLAYLIST)
            )
        }

        actionShuffle.setOnClickListener {
            libraryViewModel.shuffleSongs()
        }

        history.setOnClickListener {
            findNavController().navigate(
                R.id.detailListFragment,
                bundleOf("type" to HISTORY_PLAYLIST)
            )
        }

        userImage.setOnClickListener {
            val options = ActivityOptions.makeSceneTransitionAnimation(
                mainActivity,
                userImage,
                getString(R.string.transition_user_image)
            )
            NavigationUtil.goToUserInfo(requireActivity(), options)
        }
        titleWelcome?.text = String.format("%s", PreferenceUtil.userName)

        val homeAdapter = HomeAdapter(mainActivity)
        recyclerView.apply {
            layoutManager = LinearLayoutManager(mainActivity)
            adapter = homeAdapter
        }

        libraryViewModel.getHome().observe(viewLifecycleOwner, Observer {
            homeAdapter.swapData(it)
        })

        loadProfile()
        setupTitle()
    }

    private fun setupTitle() {
        toolbar.setNavigationOnClickListener {
            findNavController().navigate(
                R.id.searchFragment,
                null,
                navOptions
            )
        }
        appNameText.text = getString(R.string.app_name)
    }

    private fun loadProfile() {
        bannerImage?.let {
            ProfileBannerGlideRequest.Builder.from(
                Glide.with(requireContext()),
                ProfileBannerGlideRequest.getBannerModel()
            ).build().into(it)
        }
        UserProfileGlideRequest.Builder.from(
            Glide.with(requireActivity()),
            UserProfileGlideRequest.getUserModel()
        ).build().into(userImage)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_main, menu)
        menu.removeItem(R.id.action_grid_size)
        menu.removeItem(R.id.action_layout_type)
        menu.removeItem(R.id.action_sort_order)
        menu.findItem(R.id.action_settings).setShowAsAction(SHOW_AS_ACTION_IF_ROOM)
        ToolbarContentTintHelper.handleOnCreateOptionsMenu(
            requireContext(),
            toolbar,
            menu,
            ATHToolbarActivity.getToolbarBackgroundColor(toolbar)
        )
    }

    companion object {

        const val TAG: String = "BannerHomeFragment"

        @JvmStatic
        fun newInstance(): HomeFragment {
            return HomeFragment()
        }
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

    override fun onPrepareOptionsMenu(menu: Menu) {
        super.onPrepareOptionsMenu(menu)
        ToolbarContentTintHelper.handleOnPrepareOptionsMenu(requireActivity(), toolbar)
    }
}
