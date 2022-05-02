 
package com.jdots.music.fragments.artists

import android.content.Intent
import android.os.Bundle
import android.text.Spanned
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.core.os.bundleOf
import androidx.core.text.HtmlCompat
import androidx.core.view.ViewCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import code.name.monkey.appthemehelper.util.ATHUtil
import com.jdots.music.EXTRA_ALBUM_ID
import com.jdots.music.R
import com.jdots.music.adapter.album.HorizontalAlbumAdapter
import com.jdots.music.adapter.song.SimpleSongAdapter
import com.jdots.music.dialogs.AddToPlaylistDialog
import com.jdots.music.extensions.applyColor
import com.jdots.music.extensions.applyOutlineColor
import com.jdots.music.extensions.show
import com.jdots.music.extensions.showToast
import com.jdots.music.fragments.base.AbsMainActivityFragment
import com.jdots.music.glide.ArtistGlideRequest
import com.jdots.music.glide.SingleColorTarget
import com.jdots.music.helper.MusicPlayerRemote
import com.jdots.music.interfaces.IAlbumClickListener
import com.jdots.music.model.Artist
import com.jdots.music.network.Result
import com.jdots.music.network.model.LastFmArtist
import com.jdots.music.repository.RealRepository
import com.jdots.music.util.CustomArtistImageUtil
import com.jdots.music.util.MusicUtil
import com.jdots.music.util.RetroUtil
import com.bumptech.glide.Glide
import com.google.android.material.transition.MaterialContainerTransform
import kotlinx.android.synthetic.main.fragment_artist_content.*
import kotlinx.android.synthetic.main.fragment_artist_details.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.android.ext.android.get
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf
import java.util.*
import kotlin.collections.ArrayList

class ArtistDetailsFragment : AbsMainActivityFragment(R.layout.fragment_artist_details),
    IAlbumClickListener {
    private val arguments by navArgs<ArtistDetailsFragmentArgs>()
    private val detailsViewModel: ArtistDetailsViewModel by viewModel {
        parametersOf(arguments.extraArtistId)
    }
    private lateinit var artist: Artist
    private lateinit var songAdapter: SimpleSongAdapter
    private lateinit var albumAdapter: HorizontalAlbumAdapter
    private var forceDownload: Boolean = false
    private var lang: String? = null
    private var biography: Spanned? = null

    private fun setUpTransitions() {
        val transform = MaterialContainerTransform()
        transform.setAllContainerColors(ATHUtil.resolveColor(requireContext(), R.attr.colorSurface))
        sharedElementEnterTransition = transform
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setUpTransitions()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setHasOptionsMenu(true)
        mainActivity.setBottomBarVisibility(View.GONE)
        mainActivity.addMusicServiceEventListener(detailsViewModel)
        mainActivity.setSupportActionBar(toolbar)
        toolbar.title = null
        ViewCompat.setTransitionName(container, "artist")
        postponeEnterTransition()
        detailsViewModel.getArtist().observe(viewLifecycleOwner, Observer {
            startPostponedEnterTransition()
            showArtist(it)
        })
        setupRecyclerView()

        playAction.apply {
            setOnClickListener { MusicPlayerRemote.openQueue(artist.songs, 0, true) }
        }
        shuffleAction.apply {
            setOnClickListener { MusicPlayerRemote.openAndShuffleQueue(artist.songs, true) }
        }

        biographyText.setOnClickListener {
            if (biographyText.maxLines == 4) {
                biographyText.maxLines = Integer.MAX_VALUE
            } else {
                biographyText.maxLines = 4
            }
        }
    }

    private fun setupRecyclerView() {
        albumAdapter = HorizontalAlbumAdapter(requireActivity(), ArrayList(), null, this)
        albumRecyclerView.apply {
            itemAnimator = DefaultItemAnimator()
            layoutManager = GridLayoutManager(this.context, 1, GridLayoutManager.HORIZONTAL, false)
            adapter = albumAdapter
        }
        songAdapter = SimpleSongAdapter(requireActivity(), ArrayList(), R.layout.item_song, null)
        recyclerView.apply {
            itemAnimator = DefaultItemAnimator()
            layoutManager = LinearLayoutManager(this.context)
            adapter = songAdapter
        }
    }

    fun showArtist(artist: Artist) {
        this.artist = artist
        loadArtistImage(artist)
        if (RetroUtil.isAllowedToDownloadMetadata(requireContext())) {
            loadBiography(artist.name)
        }
        artistTitle.text = artist.name
        text.text = String.format(
            "%s • %s",
            MusicUtil.getArtistInfoString(requireContext(), artist),
            MusicUtil.getReadableDurationString(MusicUtil.getTotalDuration(artist.songs))
        )
        val songText =
            resources.getQuantityString(
                R.plurals.albumSongs,
                artist.songCount,
                artist.songCount
            )
        val albumText =
            resources.getQuantityString(
                R.plurals.albums,
                artist.songCount,
                artist.songCount
            )
        songTitle.text = songText
        albumTitle.text = albumText
        songAdapter.swapDataSet(artist.songs.sortedBy { it.trackNumber })
        artist.albums?.let { albumAdapter.swapDataSet(it) }
    }

    private fun loadBiography(
        name: String,
        lang: String? = Locale.getDefault().language
    ) {
        biography = null
        this.lang = lang
        detailsViewModel.getArtistInfo(name, lang, null)
            .observe(viewLifecycleOwner, Observer { result ->
                when (result) {
                    is Result.Loading -> println("Loading")
                    is Result.Error -> println("Error")
                    is Result.Success -> artistInfo(result.data)
                }
            })
    }

    private fun artistInfo(lastFmArtist: LastFmArtist?) {
        if (lastFmArtist != null && lastFmArtist.artist != null) {
            val bioContent = lastFmArtist.artist.bio.content
            if (bioContent != null && bioContent.trim { it <= ' ' }.isNotEmpty()) {
                biographyText.visibility = View.VISIBLE
                biographyTitle.visibility = View.VISIBLE
                biography = HtmlCompat.fromHtml(bioContent, HtmlCompat.FROM_HTML_MODE_LEGACY)
                biographyText.text = biography
                if (lastFmArtist.artist.stats.listeners.isNotEmpty()) {
                    listeners.show()
                    listenersLabel.show()
                    scrobbles.show()
                    scrobblesLabel.show()
                    listeners.text =
                        RetroUtil.formatValue(lastFmArtist.artist.stats.listeners.toFloat())
                    scrobbles.text =
                        RetroUtil.formatValue(lastFmArtist.artist.stats.playcount.toFloat())
                }
            }
        }

        // If the "lang" parameter is set and no biography is given, retry with default language
        if (biography == null && lang != null) {
            loadBiography(artist.name, null)
        }
    }

    private fun loadArtistImage(artist: Artist) {
        ArtistGlideRequest.Builder.from(Glide.with(requireContext()), artist)
            .generatePalette(requireContext()).build()
            .dontAnimate()
            .into(object : SingleColorTarget(image) {
                override fun onColorReady(color: Int) {
                    setColors(color)
                }
            })
    }

    private fun setColors(color: Int) {
        shuffleAction.applyColor(color)
        playAction.applyOutlineColor(color)
    }

    override fun onAlbumClick(albumId: Long, view: View) {
        findNavController().navigate(
            R.id.albumDetailsFragment,
            bundleOf(EXTRA_ALBUM_ID to albumId),
            null,
            FragmentNavigatorExtras(
                view to "album"
            )
        )
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return handleSortOrderMenuItem(item)
    }

    private fun handleSortOrderMenuItem(item: MenuItem): Boolean {
        val songs = artist.songs
        when (item.itemId) {
            android.R.id.home -> findNavController().navigateUp()
            R.id.action_play_next -> {
                MusicPlayerRemote.playNext(songs)
                return true
            }
            R.id.action_add_to_current_playing -> {
                MusicPlayerRemote.enqueue(songs)
                return true
            }
            R.id.action_add_to_playlist -> {
                lifecycleScope.launch(Dispatchers.IO) {
                    val playlists = get<RealRepository>().fetchPlaylists()
                    withContext(Dispatchers.Main) {
                        AddToPlaylistDialog.create(playlists, songs)
                            .show(childFragmentManager, "ADD_PLAYLIST")
                    }
                }
                return true
            }
            R.id.action_set_artist_image -> {
                val intent = Intent(Intent.ACTION_GET_CONTENT)
                intent.type = "image/*"
                startActivityForResult(
                    Intent.createChooser(intent, getString(R.string.pick_from_local_storage)),
                    REQUEST_CODE_SELECT_IMAGE
                )
                return true
            }
            R.id.action_reset_artist_image -> {
                showToast(resources.getString(R.string.updating))
                CustomArtistImageUtil.getInstance(requireContext()).resetCustomArtistImage(artist)
                forceDownload = true
                return true
            }
        }
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_artist_detail, menu)
    }

    companion object {
        const val REQUEST_CODE_SELECT_IMAGE = 9002
    }
}
