package com.jdots.music;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\bT\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\'\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010)\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010-\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010.\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010/\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00100\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00101\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00102\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00103\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00104\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00105\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00106\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00107\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00108\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00109\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010:\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010;\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010<\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010=\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010>\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010?\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010@\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010A\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010B\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010C\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010D\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010E\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010F\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010G\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010H\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010I\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010J\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010K\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010L\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010M\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010N\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010O\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010P\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010Q\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010R\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010S\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010T\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006U"}, d2 = {"ACCENT_COLOR", "", "ADAPTIVE_COLOR_APP", "ALBUM_ARTISTS_ONLY", "ALBUM_ART_ON_LOCK_SCREEN", "ALBUM_COVER_STYLE", "ALBUM_COVER_TRANSFORM", "ALBUM_DETAIL_SONG_SORT_ORDER", "ALBUM_GRID_SIZE", "ALBUM_GRID_SIZE_LAND", "ALBUM_GRID_STYLE", "ALBUM_SONG_SORT_ORDER", "ALBUM_SORT_ORDER", "ARTIST_ALBUM_SORT_ORDER", "ARTIST_GRID_SIZE", "ARTIST_GRID_SIZE_LAND", "ARTIST_GRID_STYLE", "ARTIST_SONG_SORT_ORDER", "ARTIST_SORT_ORDER", "AUDIO_DUCKING", "AUTO_DOWNLOAD_IMAGES_POLICY", "BANNER_IMAGE_PATH", "BLACK_THEME", "BLUETOOTH_PLAYBACK", "BLURRED_ALBUM_ART", "CAROUSEL_EFFECT", "CHOOSE_EQUALIZER", "CIRCULAR_ALBUM_ART", "CLASSIC_NOTIFICATION", "COLORED_APP_SHORTCUTS", "COLORED_NOTIFICATION", "DESATURATED_COLOR", "EQUALIZER", "EXPAND_NOW_PLAYING_PANEL", "EXTRA_ALBUM_ID", "EXTRA_ARTIST_ID", "EXTRA_GENRE", "EXTRA_PLAYLIST", "EXTRA_PLAYLISTS", "EXTRA_PLAYLIST_ID", "EXTRA_SONG", "EXTRA_SONG_INFO", "FILTER_SONG", "GAP_LESS_PLAYBACK", "GENERAL_THEME", "GENRE_SORT_ORDER", "HOME_ALBUM_GRID_STYLE", "HOME_ARTIST_GRID_STYLE", "IGNORE_MEDIA_STORE_ARTWORK", "INITIALIZED_BLACKLIST", "KEEP_SCREEN_ON", "LANGUAGE_NAME", "LAST_ADDED_CUTOFF", "LAST_CHANGELOG_VERSION", "LAST_PAGE", "LAST_SLEEP_TIMER_VALUE", "LIBRARY_CATEGORIES", "LOCK_SCREEN", "LYRICS_OPTIONS", "NEW_BLUR_AMOUNT", "NEXT_SLEEP_TIMER_ELAPSED_REALTIME", "NOW_PLAYING_SCREEN_ID", "PAUSE_ON_ZERO_VOLUME", "PLAYLIST_SORT_ORDER", "PROFILE_IMAGE_PATH", "RECENTLY_PLAYED_CUTOFF", "ROUND_CORNERS", "SAF_SDCARD_URI", "SHOULD_COLOR_APP_SHORTCUTS", "SLEEP_TIMER_FINISH_SONG", "SONG_GRID_SIZE", "SONG_GRID_SIZE_LAND", "SONG_GRID_STYLE", "SONG_SORT_ORDER", "START_DIRECTORY", "TAB_TEXT_MODE", "TOGGLE_ADD_CONTROLS", "TOGGLE_FULL_SCREEN", "TOGGLE_GENRE", "TOGGLE_HEADSET", "TOGGLE_HOME_BANNER", "TOGGLE_SEPARATE_LINE", "TOGGLE_SHUFFLE", "TOGGLE_VOLUME", "USER_NAME", "app_release"})
public final class ConstantsKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_GENRE = "extra_genre";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_PLAYLIST = "extra_playlist";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_PLAYLIST_ID = "extra_playlist_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_ALBUM_ID = "extra_album_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_ARTIST_ID = "extra_artist_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SONG = "extra_songs";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_PLAYLISTS = "extra_playlists";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LIBRARY_CATEGORIES = "library_categories";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SONG_INFO = "extra_song_info";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DESATURATED_COLOR = "desaturated_color";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BLACK_THEME = "black_theme";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEEP_SCREEN_ON = "keep_screen_on";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOGGLE_HOME_BANNER = "toggle_home_banner";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOW_PLAYING_SCREEN_ID = "now_playing_screen_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CAROUSEL_EFFECT = "carousel_effect";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COLORED_NOTIFICATION = "colored_notification";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLASSIC_NOTIFICATION = "classic_notification";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GAP_LESS_PLAYBACK = "gap_less_playback";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ALBUM_ART_ON_LOCK_SCREEN = "album_art_on_lock_screen";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BLURRED_ALBUM_ART = "blurred_album_art";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NEW_BLUR_AMOUNT = "new_blur_amount";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOGGLE_HEADSET = "toggle_headset";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GENERAL_THEME = "general_theme";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACCENT_COLOR = "accent_color";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHOULD_COLOR_APP_SHORTCUTS = "should_color_app_shortcuts";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CIRCULAR_ALBUM_ART = "circular_album_art";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_NAME = "user_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOGGLE_FULL_SCREEN = "toggle_full_screen";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOGGLE_VOLUME = "toggle_volume";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ROUND_CORNERS = "corner_window";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOGGLE_GENRE = "toggle_genre";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PROFILE_IMAGE_PATH = "profile_image_path";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BANNER_IMAGE_PATH = "banner_image_path";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ADAPTIVE_COLOR_APP = "adaptive_color_app";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOGGLE_SEPARATE_LINE = "toggle_separate_line";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HOME_ARTIST_GRID_STYLE = "home_artist_grid_style";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HOME_ALBUM_GRID_STYLE = "home_album_grid_style";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOGGLE_ADD_CONTROLS = "toggle_add_controls";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ALBUM_COVER_STYLE = "album_cover_style_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ALBUM_COVER_TRANSFORM = "album_cover_transform";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAB_TEXT_MODE = "tab_text_mode";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LANGUAGE_NAME = "language_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SLEEP_TIMER_FINISH_SONG = "sleep_timer_finish_song";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ALBUM_GRID_STYLE = "album_grid_style_home";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARTIST_GRID_STYLE = "artist_grid_style_home";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SAF_SDCARD_URI = "saf_sdcard_uri";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SONG_SORT_ORDER = "song_sort_order";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SONG_GRID_SIZE = "song_grid_size";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GENRE_SORT_ORDER = "genre_sort_order";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LAST_PAGE = "last_start_page";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BLUETOOTH_PLAYBACK = "bluetooth_playback";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INITIALIZED_BLACKLIST = "initialized_blacklist";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARTIST_SORT_ORDER = "artist_sort_order";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARTIST_ALBUM_SORT_ORDER = "artist_album_sort_order";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ALBUM_SORT_ORDER = "album_sort_order";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLAYLIST_SORT_ORDER = "playlist_sort_order";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ALBUM_SONG_SORT_ORDER = "album_song_sort_order";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARTIST_SONG_SORT_ORDER = "artist_song_sort_order";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ALBUM_GRID_SIZE = "album_grid_size";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ALBUM_GRID_SIZE_LAND = "album_grid_size_land";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SONG_GRID_SIZE_LAND = "song_grid_size_land";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARTIST_GRID_SIZE = "artist_grid_size";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARTIST_GRID_SIZE_LAND = "artist_grid_size_land";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COLORED_APP_SHORTCUTS = "colored_app_shortcuts";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AUDIO_DUCKING = "audio_ducking";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LAST_ADDED_CUTOFF = "last_added_interval";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LAST_SLEEP_TIMER_VALUE = "last_sleep_timer_value";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NEXT_SLEEP_TIMER_ELAPSED_REALTIME = "next_sleep_timer_elapsed_real_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IGNORE_MEDIA_STORE_ARTWORK = "ignore_media_store_artwork";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LAST_CHANGELOG_VERSION = "last_changelog_version";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AUTO_DOWNLOAD_IMAGES_POLICY = "auto_download_images_policy";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String START_DIRECTORY = "start_directory";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RECENTLY_PLAYED_CUTOFF = "recently_played_interval";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOCK_SCREEN = "lock_screen";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ALBUM_ARTISTS_ONLY = "album_artists_only";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ALBUM_DETAIL_SONG_SORT_ORDER = "album_detail_song_sort_order";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LYRICS_OPTIONS = "lyrics_tab_position";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHOOSE_EQUALIZER = "choose_equalizer";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EQUALIZER = "equalizer";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOGGLE_SHUFFLE = "toggle_shuffle";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SONG_GRID_STYLE = "song_grid_style";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PAUSE_ON_ZERO_VOLUME = "pause_on_zero_volume";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FILTER_SONG = "filter_song";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXPAND_NOW_PLAYING_PANEL = "expand_now_playing_panel";
}