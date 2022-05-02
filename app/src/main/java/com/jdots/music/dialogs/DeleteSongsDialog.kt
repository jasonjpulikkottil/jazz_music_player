 
package com.jdots.music.dialogs

import android.app.Dialog
import android.os.Bundle
import androidx.core.text.HtmlCompat
import androidx.fragment.app.DialogFragment
import com.jdots.music.EXTRA_SONG
import com.jdots.music.R
import com.jdots.music.extensions.colorButtons
import com.jdots.music.extensions.extraNotNull
import com.jdots.music.extensions.materialDialog
import com.jdots.music.fragments.LibraryViewModel
import com.jdots.music.helper.MusicPlayerRemote
import com.jdots.music.model.Song
import com.jdots.music.util.MusicUtil
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class DeleteSongsDialog : DialogFragment() {
    private val libraryViewModel by sharedViewModel<LibraryViewModel>()

    companion object {
        fun create(song: Song): DeleteSongsDialog {
            val list = ArrayList<Song>()
            list.add(song)
            return create(list)
        }

        fun create(songs: List<Song>): DeleteSongsDialog {
            val dialog = DeleteSongsDialog()
            val args = Bundle()
            args.putParcelableArrayList(EXTRA_SONG, ArrayList(songs))
            dialog.arguments = args
            return dialog
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val songs = extraNotNull<List<Song>>(EXTRA_SONG).value
        val pair = if (songs.size > 1) {
            Pair(
                R.string.delete_songs_title,
                HtmlCompat.fromHtml(
                    String.format(getString(R.string.delete_x_songs), songs.size),
                    HtmlCompat.FROM_HTML_MODE_LEGACY
                )
            )
        } else {
            Pair(
                R.string.delete_song_title,
                HtmlCompat.fromHtml(
                    String.format(getString(R.string.delete_song_x), songs[0].title),
                    HtmlCompat.FROM_HTML_MODE_LEGACY
                )
            )
        }

        return materialDialog(pair.first)
            .setMessage(pair.second)
            .setCancelable(false)
            .setPositiveButton(R.string.action_delete) { _, _ ->
                if (songs.isNotEmpty() and (songs.size == 1) and MusicPlayerRemote.isPlaying(songs.first())) {
                    MusicPlayerRemote.playNextSong()
                }
                MusicUtil.deleteTracks(requireActivity(), songs)
                libraryViewModel.deleteTracks(songs)
            }
            .create()
            .colorButtons()
    }
}
