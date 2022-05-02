package com.jdots.music.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u00a8\u0006\u0011"}, d2 = {"Lcom/jdots/music/repository/PlaylistSongsLoader;", "", "()V", "getPlaylistSongFromCursorImpl", "Lcom/jdots/music/model/PlaylistSong;", "cursor", "Landroid/database/Cursor;", "playlistId", "", "getPlaylistSongList", "", "Lcom/jdots/music/model/Song;", "context", "Landroid/content/Context;", "playlist", "Lcom/jdots/music/model/Playlist;", "makePlaylistSongCursor", "app_release"})
public final class PlaylistSongsLoader {
    public static final com.jdots.music.repository.PlaylistSongsLoader INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.jdots.music.model.Song> getPlaylistSongList(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Playlist playlist) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<com.jdots.music.model.Song> getPlaylistSongList(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long playlistId) {
        return null;
    }
    
    private final com.jdots.music.model.PlaylistSong getPlaylistSongFromCursorImpl(android.database.Cursor cursor, long playlistId) {
        return null;
    }
    
    private final android.database.Cursor makePlaylistSongCursor(android.content.Context context, long playlistId) {
        return null;
    }
    
    private PlaylistSongsLoader() {
        super();
    }
}