package com.jdots.music.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013J\u001c\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0016J6\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00162\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0016\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#J\u0010\u0010%\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010&\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\'\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001c\u0010(\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0016J\u0010\u0010)\u001a\u0004\u0018\u00010\u00042\u0006\u0010*\u001a\u00020\u0013J\u0010\u0010+\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010\u0004J\u0016\u0010-\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020#J\u000e\u0010/\u001a\u00020\u001a2\u0006\u00100\u001a\u00020\u0013J\u0014\u00101\u001a\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0016J\u000e\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u00020#J\u001c\u00104\u001a\u00020#2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00162\u0006\u00100\u001a\u00020\u0013J \u00105\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\b\u00106\u001a\u0004\u0018\u00010\u0004J\u0010\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0004J\u0016\u0010:\u001a\u0002082\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010;\u001a\u0002082\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020!J\u0010\u0010=\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0004J\u001c\u0010>\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020?0\u0016J\u0016\u0010@\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r\u00a8\u0006A"}, d2 = {"Lcom/jdots/music/util/MusicUtil;", "Lorg/koin/core/KoinComponent;", "()V", "buildInfoString", "", "string1", "string2", "createAlbumArtDir", "Ljava/io/File;", "createAlbumArtFile", "createShareSongFileIntent", "Landroid/content/Intent;", "song", "Lcom/jdots/music/model/Song;", "context", "Landroid/content/Context;", "deleteAlbumArt", "", "albumId", "", "deleteTracks", "songs", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "safUris", "Landroid/net/Uri;", "callback", "Ljava/lang/Runnable;", "getArtistInfoString", "artist", "Lcom/jdots/music/model/Artist;", "getFavoritesPlaylist", "Lcom/jdots/music/model/Playlist;", "getFixedTrackNumber", "", "trackNumberToFix", "getLyrics", "getMediaStoreAlbumCoverUri", "getOrCreateFavoritesPlaylist", "getPlaylistInfoString", "getReadableDurationString", "songDurationMillis", "getSectionName", "musicMediaTitle", "getSongCountString", "songCount", "getSongFileUri", "songId", "getTotalDuration", "getYearString", "year", "indexOfSongInList", "insertAlbumArt", "path", "isArtistNameUnknown", "", "artistName", "isFavorite", "isFavoritePlaylist", "playlist", "isVariousArtists", "playlistInfoString", "Lcom/jdots/music/db/SongEntity;", "toggleFavorite", "app_debug"})
public final class MusicUtil implements org.koin.core.KoinComponent {
    public static final com.jdots.music.util.MusicUtil INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Intent createShareSongFileIntent(@org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Song song, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String buildInfoString(@org.jetbrains.annotations.Nullable()
    java.lang.String string1, @org.jetbrains.annotations.Nullable()
    java.lang.String string2) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File createAlbumArtFile() {
        return null;
    }
    
    private final java.io.File createAlbumArtDir() {
        return null;
    }
    
    public final void deleteAlbumArt(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long albumId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getArtistInfoString(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Artist artist) {
        return null;
    }
    
    public final int getFixedTrackNumber(int trackNumberToFix) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLyrics(@org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Song song) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getMediaStoreAlbumCoverUri(long albumId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPlaylistInfoString(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.jdots.music.model.Song> songs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String playlistInfoString(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.db.SongEntity> songs) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReadableDurationString(long songDurationMillis) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSectionName(@org.jetbrains.annotations.Nullable()
    java.lang.String musicMediaTitle) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSongCountString(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int songCount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getSongFileUri(long songId) {
        return null;
    }
    
    public final long getTotalDuration(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.jdots.music.model.Song> songs) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getYearString(int year) {
        return null;
    }
    
    public final int indexOfSongInList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.jdots.music.model.Song> songs, long songId) {
        return 0;
    }
    
    public final void insertAlbumArt(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long albumId, @org.jetbrains.annotations.Nullable()
    java.lang.String path) {
    }
    
    public final boolean isArtistNameUnknown(@org.jetbrains.annotations.Nullable()
    java.lang.String artistName) {
        return false;
    }
    
    public final boolean isVariousArtists(@org.jetbrains.annotations.Nullable()
    java.lang.String artistName) {
        return false;
    }
    
    public final boolean isFavorite(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Song song) {
        return false;
    }
    
    public final boolean isFavoritePlaylist(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Playlist playlist) {
        return false;
    }
    
    public final void toggleFavorite(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Song song) {
    }
    
    private final com.jdots.music.model.Playlist getFavoritesPlaylist(android.content.Context context) {
        return null;
    }
    
    private final com.jdots.music.model.Playlist getOrCreateFavoritesPlaylist(android.content.Context context) {
        return null;
    }
    
    public final void deleteTracks(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.jdots.music.model.Song> songs, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends android.net.Uri> safUris, @org.jetbrains.annotations.Nullable()
    java.lang.Runnable callback) {
    }
    
    public final void deleteTracks(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.jdots.music.model.Song> songs) {
    }
    
    private MusicUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}