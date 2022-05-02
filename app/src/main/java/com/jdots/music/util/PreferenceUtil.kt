package com.jdots.music.util

import android.content.Context
import android.content.SharedPreferences.OnSharedPreferenceChangeListener
import android.net.ConnectivityManager
import android.net.NetworkInfo
import androidx.core.content.ContextCompat
import androidx.core.content.edit
import androidx.preference.PreferenceManager
import androidx.viewpager.widget.ViewPager
import com.jdots.music.ADAPTIVE_COLOR_APP
import com.jdots.music.ALBUM_ARTISTS_ONLY
import com.jdots.music.ALBUM_ART_ON_LOCK_SCREEN
import com.jdots.music.ALBUM_COVER_STYLE
import com.jdots.music.ALBUM_COVER_TRANSFORM
import com.jdots.music.ALBUM_DETAIL_SONG_SORT_ORDER
import com.jdots.music.ALBUM_GRID_SIZE
import com.jdots.music.ALBUM_GRID_SIZE_LAND
import com.jdots.music.ALBUM_GRID_STYLE
import com.jdots.music.ALBUM_SONG_SORT_ORDER
import com.jdots.music.ALBUM_SORT_ORDER
import com.jdots.music.ARTIST_ALBUM_SORT_ORDER
import com.jdots.music.ARTIST_GRID_SIZE
import com.jdots.music.ARTIST_GRID_SIZE_LAND
import com.jdots.music.ARTIST_GRID_STYLE
import com.jdots.music.ARTIST_SONG_SORT_ORDER
import com.jdots.music.ARTIST_SORT_ORDER
import com.jdots.music.AUDIO_DUCKING
import com.jdots.music.AUTO_DOWNLOAD_IMAGES_POLICY
import com.jdots.music.App
import com.jdots.music.BLACK_THEME
import com.jdots.music.BLUETOOTH_PLAYBACK
import com.jdots.music.BLURRED_ALBUM_ART
import com.jdots.music.CAROUSEL_EFFECT
import com.jdots.music.CHOOSE_EQUALIZER
import com.jdots.music.CLASSIC_NOTIFICATION
import com.jdots.music.COLORED_APP_SHORTCUTS
import com.jdots.music.COLORED_NOTIFICATION
import com.jdots.music.DESATURATED_COLOR
import com.jdots.music.EXPAND_NOW_PLAYING_PANEL
import com.jdots.music.EXTRA_SONG_INFO
import com.jdots.music.FILTER_SONG
import com.jdots.music.GAP_LESS_PLAYBACK
import com.jdots.music.GENERAL_THEME
import com.jdots.music.GENRE_SORT_ORDER
import com.jdots.music.HOME_ALBUM_GRID_STYLE
import com.jdots.music.HOME_ARTIST_GRID_STYLE
import com.jdots.music.IGNORE_MEDIA_STORE_ARTWORK
import com.jdots.music.INITIALIZED_BLACKLIST
import com.jdots.music.KEEP_SCREEN_ON
import com.jdots.music.LANGUAGE_NAME
import com.jdots.music.LAST_ADDED_CUTOFF
import com.jdots.music.LAST_CHANGELOG_VERSION
import com.jdots.music.LAST_PAGE
import com.jdots.music.LAST_SLEEP_TIMER_VALUE
import com.jdots.music.LIBRARY_CATEGORIES
import com.jdots.music.LOCK_SCREEN
import com.jdots.music.LYRICS_OPTIONS
import com.jdots.music.NEXT_SLEEP_TIMER_ELAPSED_REALTIME
import com.jdots.music.NOW_PLAYING_SCREEN_ID
import com.jdots.music.PAUSE_ON_ZERO_VOLUME
import com.jdots.music.PLAYLIST_SORT_ORDER
import com.jdots.music.R
import com.jdots.music.RECENTLY_PLAYED_CUTOFF
import com.jdots.music.SAF_SDCARD_URI
import com.jdots.music.SLEEP_TIMER_FINISH_SONG
import com.jdots.music.SONG_GRID_SIZE
import com.jdots.music.SONG_GRID_SIZE_LAND
import com.jdots.music.SONG_GRID_STYLE
import com.jdots.music.SONG_SORT_ORDER
import com.jdots.music.START_DIRECTORY
import com.jdots.music.TAB_TEXT_MODE
import com.jdots.music.TOGGLE_ADD_CONTROLS
import com.jdots.music.TOGGLE_FULL_SCREEN
import com.jdots.music.TOGGLE_HEADSET
import com.jdots.music.TOGGLE_HOME_BANNER
import com.jdots.music.TOGGLE_SHUFFLE
import com.jdots.music.TOGGLE_VOLUME
import com.jdots.music.USER_NAME
import com.jdots.music.extensions.getIntRes
import com.jdots.music.extensions.getStringOrDefault
import com.jdots.music.fragments.AlbumCoverStyle
import com.jdots.music.fragments.NowPlayingScreen
import com.jdots.music.fragments.folder.FoldersFragment
import com.jdots.music.helper.SortOrder.*
import com.jdots.music.model.CategoryInfo
import com.jdots.music.transform.CascadingPageTransformer
import com.jdots.music.transform.DepthTransformation
import com.jdots.music.transform.HingeTransformation
import com.jdots.music.transform.HorizontalFlipTransformation
import com.jdots.music.transform.NormalPageTransformer
import com.jdots.music.transform.VerticalFlipTransformation
import com.jdots.music.transform.VerticalStackTransformer
import com.jdots.music.util.theme.ThemeMode
import com.google.android.material.bottomnavigation.LabelVisibilityMode
import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import com.google.gson.reflect.TypeToken
import java.io.File


object PreferenceUtil {
    private val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(App.getContext())

    val defaultCategories = listOf(
        CategoryInfo(CategoryInfo.Category.Home, true),
        CategoryInfo(CategoryInfo.Category.Songs, true),
        CategoryInfo(CategoryInfo.Category.Albums, true),
        CategoryInfo(CategoryInfo.Category.Artists, true),
        CategoryInfo(CategoryInfo.Category.Playlists, true),
        CategoryInfo(CategoryInfo.Category.Genres, false),
        CategoryInfo(CategoryInfo.Category.Folder, false)
    )

    var libraryCategory: List<CategoryInfo>
        get() {
            val gson = Gson()
            val collectionType = object : TypeToken<List<CategoryInfo>>() {}.type

            val data = sharedPreferences.getStringOrDefault(
                LIBRARY_CATEGORIES,
                gson.toJson(defaultCategories, collectionType)
            )
            return try {
                Gson().fromJson(data, collectionType)
            } catch (e: JsonSyntaxException) {
                e.printStackTrace()
                return defaultCategories
            }
        }
        set(value) {
            val collectionType = object : TypeToken<List<CategoryInfo?>?>() {}.type
            sharedPreferences.edit {
                putString(LIBRARY_CATEGORIES, Gson().toJson(value, collectionType))
            }
        }

    fun registerOnSharedPreferenceChangedListener(
        listener: OnSharedPreferenceChangeListener
    ) = sharedPreferences.registerOnSharedPreferenceChangeListener(listener)


    fun unregisterOnSharedPreferenceChangedListener(
        changeListener: OnSharedPreferenceChangeListener
    ) = sharedPreferences.unregisterOnSharedPreferenceChangeListener(changeListener)


    val baseTheme get() = sharedPreferences.getStringOrDefault(GENERAL_THEME, "auto")

    fun getGeneralThemeValue(isSystemDark: Boolean): ThemeMode {
        val themeMode: String =
            sharedPreferences.getStringOrDefault(GENERAL_THEME, "auto")
        return if (isBlackMode && isSystemDark) {
            ThemeMode.BLACK
        } else {
            if (isBlackMode && themeMode == "dark") {
                ThemeMode.BLACK
            } else {
                when (themeMode) {
                    "light" -> ThemeMode.LIGHT
                    "dark" -> ThemeMode.DARK
                    "auto" -> ThemeMode.AUTO
                    else -> ThemeMode.AUTO
                }
            }
        }
    }

    val languageCode: String get() = sharedPreferences.getString(LANGUAGE_NAME, "auto") ?: "auto"

    var userName
        get() = sharedPreferences.getString(
            USER_NAME,
            App.getContext().getString(R.string.user_name)
        )
        set(value) = sharedPreferences.edit {
            putString(USER_NAME, value)
        }

    var safSdCardUri
        get() = sharedPreferences.getStringOrDefault(SAF_SDCARD_URI, "")
        set(value) = sharedPreferences.edit {
            putString(SAF_SDCARD_URI, value)
        }


    val selectedEqualizer
        get() = sharedPreferences.getStringOrDefault(
            CHOOSE_EQUALIZER,
            "system"
        )

    val autoDownloadImagesPolicy
        get() = sharedPreferences.getStringOrDefault(
            AUTO_DOWNLOAD_IMAGES_POLICY,
            "only_wifi"
        )

    var albumArtistsOnly
        get() = sharedPreferences.getBoolean(
            ALBUM_ARTISTS_ONLY,
            false
        )
        set(value) = sharedPreferences.edit { putBoolean(ALBUM_ARTISTS_ONLY, value) }

    var albumDetailSongSortOrder
        get() = sharedPreferences.getStringOrDefault(
            ALBUM_DETAIL_SONG_SORT_ORDER,
            AlbumSongSortOrder.SONG_TRACK_LIST
        )
        set(value) = sharedPreferences.edit { putString(ALBUM_DETAIL_SONG_SORT_ORDER, value) }

    var songSortOrder
        get() = sharedPreferences.getStringOrDefault(
            SONG_SORT_ORDER,
            SongSortOrder.SONG_A_Z
        )
        set(value) = sharedPreferences.edit {
            putString(SONG_SORT_ORDER, value)
        }

    var albumSortOrder
        get() = sharedPreferences.getStringOrDefault(
            ALBUM_SORT_ORDER,
            AlbumSortOrder.ALBUM_A_Z
        )
        set(value) = sharedPreferences.edit {
            putString(ALBUM_SORT_ORDER, value)
        }


    var artistSortOrder
        get() = sharedPreferences.getStringOrDefault(
            ARTIST_SORT_ORDER,
            ArtistSortOrder.ARTIST_A_Z
        )
        set(value) = sharedPreferences.edit {
            putString(ARTIST_SORT_ORDER, value)
        }

    val albumSongSortOrder
        get() = sharedPreferences.getStringOrDefault(
            ALBUM_SONG_SORT_ORDER,
            AlbumSongSortOrder.SONG_TRACK_LIST
        )

    val artistSongSortOrder
        get() = sharedPreferences.getStringOrDefault(
            ARTIST_SONG_SORT_ORDER,
            AlbumSongSortOrder.SONG_TRACK_LIST
        )

    val artistAlbumSortOrder
        get() = sharedPreferences.getStringOrDefault(
            ARTIST_ALBUM_SORT_ORDER,
            ArtistAlbumSortOrder.ALBUM_A_Z
        )

    var playlistSortOrder
        get() = sharedPreferences.getStringOrDefault(
            PLAYLIST_SORT_ORDER,
            PlaylistSortOrder.PLAYLIST_A_Z
        )
        set(value) = sharedPreferences.edit {
            putString(PLAYLIST_SORT_ORDER, value)
        }

    val genreSortOrder
        get() = sharedPreferences.getStringOrDefault(
            GENRE_SORT_ORDER,
            GenreSortOrder.GENRE_A_Z
        )

    val isIgnoreMediaStoreArtwork
        get() = sharedPreferences.getBoolean(
            IGNORE_MEDIA_STORE_ARTWORK,
            false
        )

    val isVolumeVisibilityMode
        get() = sharedPreferences.getBoolean(
            TOGGLE_VOLUME, false
        )

    var isInitializedBlacklist
        get() = sharedPreferences.getBoolean(
            INITIALIZED_BLACKLIST, false
        )
        set(value) = sharedPreferences.edit {
            putBoolean(INITIALIZED_BLACKLIST, value)
        }

    private val isBlackMode
        get() = sharedPreferences.getBoolean(
            BLACK_THEME, false
        )

    val isExtraControls
        get() = sharedPreferences.getBoolean(
            TOGGLE_ADD_CONTROLS, false
        )

    val isHomeBanner
        get() = sharedPreferences.getBoolean(
            TOGGLE_HOME_BANNER, false
        )
    var isClassicNotification
        get() = sharedPreferences.getBoolean(CLASSIC_NOTIFICATION, false)
        set(value) = sharedPreferences.edit { putBoolean(CLASSIC_NOTIFICATION, value) }

    val isScreenOnEnabled get() = sharedPreferences.getBoolean(KEEP_SCREEN_ON, false)

    val isShuffleModeOn get() = sharedPreferences.getBoolean(TOGGLE_SHUFFLE, false)

    val isSongInfo get() = sharedPreferences.getBoolean(EXTRA_SONG_INFO, false)

    val isPauseOnZeroVolume get() = sharedPreferences.getBoolean(PAUSE_ON_ZERO_VOLUME, false)

    var isSleepTimerFinishMusic
        get() = sharedPreferences.getBoolean(
            SLEEP_TIMER_FINISH_SONG, false
        )
        set(value) = sharedPreferences.edit {
            putBoolean(SLEEP_TIMER_FINISH_SONG, value)
        }

    val isExpandPanel get() = sharedPreferences.getBoolean(EXPAND_NOW_PLAYING_PANEL, false)

    val isHeadsetPlugged
        get() = sharedPreferences.getBoolean(
            TOGGLE_HEADSET, false
        )

    val isAlbumArtOnLockScreen
        get() = sharedPreferences.getBoolean(
            ALBUM_ART_ON_LOCK_SCREEN, false
        )

    val isAudioDucking
        get() = sharedPreferences.getBoolean(
            AUDIO_DUCKING, true
        )

    val isBluetoothSpeaker
        get() = sharedPreferences.getBoolean(
            BLUETOOTH_PLAYBACK, false
        )

    val isBlurredAlbumArt
        get() = sharedPreferences.getBoolean(
            BLURRED_ALBUM_ART, false
        )

    val isCarouselEffect
        get() = sharedPreferences.getBoolean(
            CAROUSEL_EFFECT, false
        )

    var isColoredAppShortcuts
        get() = sharedPreferences.getBoolean(
            COLORED_APP_SHORTCUTS, true
        )
        set(value) = sharedPreferences.edit {
            putBoolean(COLORED_APP_SHORTCUTS, value)
        }

    var isColoredNotification
        get() = sharedPreferences.getBoolean(
            COLORED_NOTIFICATION, true
        )
        set(value) = sharedPreferences.edit {
            putBoolean(COLORED_NOTIFICATION, value)
        }

    var isDesaturatedColor
        get() = sharedPreferences.getBoolean(
            DESATURATED_COLOR, false
        )
        set(value) = sharedPreferences.edit {
            putBoolean(DESATURATED_COLOR, value)
        }

    val isGapLessPlayback
        get() = sharedPreferences.getBoolean(
            GAP_LESS_PLAYBACK, false
        )

    val isAdaptiveColor
        get() = sharedPreferences.getBoolean(
            ADAPTIVE_COLOR_APP, false
        )

    val isFullScreenMode
        get() = sharedPreferences.getBoolean(
            TOGGLE_FULL_SCREEN, false
        )

    val isLockScreen get() = sharedPreferences.getBoolean(LOCK_SCREEN, false)

    fun isAllowedToDownloadMetadata(): Boolean {
        return when (autoDownloadImagesPolicy) {
            "always" -> true
            "only_wifi" -> {
                val connectivityManager = ContextCompat.getSystemService(
                    App.getContext(),
                    ConnectivityManager::class.java
                )
                var netInfo: NetworkInfo? = null
                if (connectivityManager != null) {
                    netInfo = connectivityManager.activeNetworkInfo
                }
                netInfo != null && netInfo.type == ConnectivityManager.TYPE_WIFI && netInfo.isConnectedOrConnecting
            }
            "never" -> false
            else -> false
        }
    }


    var lyricsOption
        get() = sharedPreferences.getInt(LYRICS_OPTIONS, 1)
        set(value) = sharedPreferences.edit {
            putInt(LYRICS_OPTIONS, value)
        }

    var songGridStyle
        get() = sharedPreferences.getInt(SONG_GRID_STYLE, R.layout.item_grid)
        set(value) = sharedPreferences.edit {
            putInt(SONG_GRID_STYLE, value)
        }

    var albumGridStyle
        get() = sharedPreferences.getInt(ALBUM_GRID_STYLE, R.layout.item_grid)
        set(value) = sharedPreferences.edit {
            putInt(ALBUM_GRID_STYLE, value)
        }

    var artistGridStyle
        get() = sharedPreferences.getInt(ARTIST_GRID_STYLE, R.layout.item_grid_circle)
        set(value) = sharedPreferences.edit {
            putInt(ARTIST_GRID_STYLE, value)
        }

    val filterLength get() = sharedPreferences.getInt(FILTER_SONG, 20)

    var lastVersion
        get() = sharedPreferences.getInt(LAST_CHANGELOG_VERSION, 0)
        set(value) = sharedPreferences.edit {
            putInt(LAST_CHANGELOG_VERSION, value)
        }

    var lastSleepTimerValue
        get() = sharedPreferences.getInt(
            LAST_SLEEP_TIMER_VALUE,
            30
        )
        set(value) = sharedPreferences.edit {
            putInt(LAST_SLEEP_TIMER_VALUE, value)
        }

    var lastPage
        get() = sharedPreferences.getInt(LAST_PAGE, R.id.action_song)
        set(value) = sharedPreferences.edit {
            putInt(LAST_PAGE, value)
        }

    var nextSleepTimerElapsedRealTime
        get() = sharedPreferences.getInt(
            NEXT_SLEEP_TIMER_ELAPSED_REALTIME,
            -1
        )
        set(value) = sharedPreferences.edit {
            putInt(NEXT_SLEEP_TIMER_ELAPSED_REALTIME, value)
        }

    fun themeResFromPrefValue(themePrefValue: String): Int {
        return when (themePrefValue) {
            "light" -> R.style.Theme_RetroMusic_Light
            "dark" -> R.style.Theme_RetroMusic
            else -> R.style.Theme_RetroMusic
        }
    }

    val homeArtistGridStyle: Int
        get() {
            val position = sharedPreferences.getStringOrDefault(
                HOME_ARTIST_GRID_STYLE, "0"
            ).toInt()
            val typedArray =
                App.getContext().resources.obtainTypedArray(R.array.pref_home_grid_style_layout)
            val layoutRes = typedArray.getResourceId(position, 0)
            typedArray.recycle()
            return if (layoutRes == 0) {
                R.layout.item_artist
            } else layoutRes
        }

    val homeAlbumGridStyle: Int
        get() {
            val position = sharedPreferences.getStringOrDefault(HOME_ALBUM_GRID_STYLE, "4").toInt()
            val typedArray =
                App.getContext().resources.obtainTypedArray(R.array.pref_home_grid_style_layout)
            val layoutRes = typedArray.getResourceId(position, 0)
            typedArray.recycle()
            return if (layoutRes == 0) {
                R.layout.item_artist
            } else layoutRes
        }

    val tabTitleMode: Int
        get() {
            return when (sharedPreferences.getStringOrDefault(
                TAB_TEXT_MODE, "0"
            ).toInt()) {
                1 -> LabelVisibilityMode.LABEL_VISIBILITY_LABELED
                0 -> LabelVisibilityMode.LABEL_VISIBILITY_AUTO
                2 -> LabelVisibilityMode.LABEL_VISIBILITY_SELECTED
                3 -> LabelVisibilityMode.LABEL_VISIBILITY_UNLABELED
                else -> LabelVisibilityMode.LABEL_VISIBILITY_LABELED
            }
        }


    var songGridSize
        get() = sharedPreferences.getInt(
            SONG_GRID_SIZE,
            App.getContext().getIntRes(R.integer.default_list_columns)
        )
        set(value) = sharedPreferences.edit {
            putInt(SONG_GRID_SIZE, value)
        }

    var songGridSizeLand
        get() = sharedPreferences.getInt(
            SONG_GRID_SIZE_LAND,
            App.getContext().getIntRes(R.integer.default_grid_columns_land)
        )
        set(value) = sharedPreferences.edit {
            putInt(SONG_GRID_SIZE_LAND, value)
        }


    var albumGridSize: Int
        get() = sharedPreferences.getInt(
            ALBUM_GRID_SIZE,
            App.getContext().getIntRes(R.integer.default_grid_columns)
        )
        set(value) = sharedPreferences.edit {
            putInt(ALBUM_GRID_SIZE, value)
        }


    var albumGridSizeLand
        get() = sharedPreferences.getInt(
            ALBUM_GRID_SIZE_LAND,
            App.getContext().getIntRes(R.integer.default_grid_columns_land)
        )
        set(value) = sharedPreferences.edit {
            putInt(ALBUM_GRID_SIZE_LAND, value)
        }


    var artistGridSize
        get() = sharedPreferences.getInt(
            ARTIST_GRID_SIZE,
            App.getContext().getIntRes(R.integer.default_grid_columns)
        )
        set(value) = sharedPreferences.edit {
            putInt(ARTIST_GRID_SIZE, value)
        }


    var artistGridSizeLand
        get() = sharedPreferences.getInt(
            ARTIST_GRID_SIZE_LAND,
            App.getContext().getIntRes(R.integer.default_grid_columns_land)
        )
        set(value) = sharedPreferences.edit {
            putInt(ALBUM_GRID_SIZE_LAND, value)
        }


    var albumCoverStyle: AlbumCoverStyle
        get() {
            val id: Int = sharedPreferences.getInt(ALBUM_COVER_STYLE, 0)
            for (albumCoverStyle in AlbumCoverStyle.values()) {
                if (albumCoverStyle.id == id) {
                    return albumCoverStyle
                }
            }
            return AlbumCoverStyle.Card
        }
        set(value) = sharedPreferences.edit { putInt(ALBUM_COVER_STYLE, value.id) }


    var nowPlayingScreen: NowPlayingScreen
        get() {
            val id: Int = sharedPreferences.getInt(NOW_PLAYING_SCREEN_ID, 0)
            for (nowPlayingScreen in NowPlayingScreen.values()) {
                if (nowPlayingScreen.id == id) {
                    return nowPlayingScreen
                }
            }
            return NowPlayingScreen.Adaptive
        }
        set(value) = sharedPreferences.edit {
            putInt(NOW_PLAYING_SCREEN_ID, value.id)
        }

    val albumCoverTransform: ViewPager.PageTransformer
        get() {
            val style = sharedPreferences.getStringOrDefault(
                ALBUM_COVER_TRANSFORM,
                "0"
            ).toInt()
            return when (style) {
                0 -> NormalPageTransformer()
                1 -> CascadingPageTransformer()
                2 -> DepthTransformation()
                3 -> HorizontalFlipTransformation()
                4 -> VerticalFlipTransformation()
                5 -> HingeTransformation()
                6 -> VerticalStackTransformer()
                else -> NormalPageTransformer()
            }
        }

    var startDirectory: File
        get() {
            val folderPath = FoldersFragment.getDefaultStartDirectory().path
            val filePath: String = sharedPreferences.getStringOrDefault(START_DIRECTORY, folderPath)
            return File(filePath)
        }
        set(value) = sharedPreferences.edit {
            putString(
                START_DIRECTORY,
                FileUtil.safeGetCanonicalPath(value)
            )
        }

    fun getRecentlyPlayedCutoffTimeMillis(): Long {
        return getCutoffTimeMillis(RECENTLY_PLAYED_CUTOFF)
    }

    fun getRecentlyPlayedCutoffText(context: Context): String? {
        return getCutoffText(RECENTLY_PLAYED_CUTOFF, context)
    }

    private fun getCutoffText(
        cutoff: String,
        context: Context
    ): String? {
        return when (sharedPreferences.getString(cutoff, "")) {
            "today" -> context.getString(R.string.today)
            "this_week" -> context.getString(R.string.this_week)
            "past_seven_days" -> context.getString(R.string.past_seven_days)
            "past_three_months" -> context.getString(R.string.past_three_months)
            "this_year" -> context.getString(R.string.this_year)
            "this_month" -> context.getString(R.string.this_month)
            else -> context.getString(R.string.this_month)
        }
    }

    private fun getCutoffTimeMillis(cutoff: String): Long {
        val calendarUtil = CalendarUtil()
        val interval: Long
        interval = when (sharedPreferences.getString(cutoff, "")) {
            "today" -> calendarUtil.elapsedToday
            "this_week" -> calendarUtil.elapsedWeek
            "past_seven_days" -> calendarUtil.getElapsedDays(7)
            "past_three_months" -> calendarUtil.getElapsedMonths(3)
            "this_year" -> calendarUtil.elapsedYear
            "this_month" -> calendarUtil.elapsedMonth
            else -> calendarUtil.elapsedMonth
        }
        return System.currentTimeMillis() - interval
    }

    val lastAddedCutoff: Long
        get() {
            val calendarUtil = CalendarUtil()
            val interval =
                when (sharedPreferences.getStringOrDefault(LAST_ADDED_CUTOFF, "this_month")) {
                    "today" -> calendarUtil.elapsedToday
                    "this_week" -> calendarUtil.elapsedWeek
                    "past_three_months" -> calendarUtil.getElapsedMonths(3)
                    "this_year" -> calendarUtil.elapsedYear
                    "this_month" -> calendarUtil.elapsedMonth
                    else -> calendarUtil.elapsedMonth
                }
            return (System.currentTimeMillis() - interval) / 1000
        }

}
