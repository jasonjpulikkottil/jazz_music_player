package com.jdots.music.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0002J)\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0016H\u0002\u00a2\u0006\u0002\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\u0019\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u001e\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/jdots/music/repository/RealPlaylistRepository;", "Lcom/jdots/music/repository/PlaylistRepository;", "contentResolver", "Landroid/content/ContentResolver;", "(Landroid/content/ContentResolver;)V", "deletePlaylist", "", "playlistId", "", "favoritePlaylist", "", "Lcom/jdots/music/model/Playlist;", "playlistName", "", "getPlaylistFromCursorImpl", "cursor", "Landroid/database/Cursor;", "getPlaylistSongFromCursorImpl", "Lcom/jdots/music/model/PlaylistSong;", "makePlaylistCursor", "selection", "values", "", "(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;", "makePlaylistSongCursor", "playlist", "playlistSongs", "Lcom/jdots/music/model/Song;", "playlists", "searchPlaylist", "query", "app_release"})
public final class RealPlaylistRepository implements com.jdots.music.repository.PlaylistRepository {
    private final android.content.ContentResolver contentResolver = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jdots.music.model.Playlist playlist(@org.jetbrains.annotations.Nullable()
    android.database.Cursor cursor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jdots.music.model.Playlist playlist(@org.jetbrains.annotations.NotNull()
    java.lang.String playlistName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jdots.music.model.Playlist playlist(long playlistId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.jdots.music.model.Playlist> searchPlaylist(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.jdots.music.model.Playlist> playlists() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.jdots.music.model.Playlist> playlists(@org.jetbrains.annotations.Nullable()
    android.database.Cursor cursor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.jdots.music.model.Playlist> favoritePlaylist(@org.jetbrains.annotations.NotNull()
    java.lang.String playlistName) {
        return null;
    }
    
    @java.lang.Override()
    public void deletePlaylist(long playlistId) {
    }
    
    private final com.jdots.music.model.Playlist getPlaylistFromCursorImpl(android.database.Cursor cursor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.jdots.music.model.Song> playlistSongs(long playlistId) {
        return null;
    }
    
    private final com.jdots.music.model.PlaylistSong getPlaylistSongFromCursorImpl(android.database.Cursor cursor, long playlistId) {
        return null;
    }
    
    private final android.database.Cursor makePlaylistCursor(java.lang.String selection, java.lang.String[] values) {
        return null;
    }
    
    private final android.database.Cursor makePlaylistSongCursor(long playlistId) {
        return null;
    }
    
    public RealPlaylistRepository(@org.jetbrains.annotations.NotNull()
    android.content.ContentResolver contentResolver) {
        super();
    }
}