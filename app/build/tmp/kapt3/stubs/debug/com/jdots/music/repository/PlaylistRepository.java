package com.jdots.music.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH&J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH&J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH&J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0012\u001a\u00020\nH&\u00a8\u0006\u0013"}, d2 = {"Lcom/jdots/music/repository/PlaylistRepository;", "", "deletePlaylist", "", "playlistId", "", "favoritePlaylist", "", "Lcom/jdots/music/model/Playlist;", "playlistName", "", "playlist", "cursor", "Landroid/database/Cursor;", "playlistSongs", "Lcom/jdots/music/model/Song;", "playlists", "searchPlaylist", "query", "app_debug"})
public abstract interface PlaylistRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.jdots.music.model.Playlist playlist(@org.jetbrains.annotations.Nullable()
    android.database.Cursor cursor);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.jdots.music.model.Playlist> searchPlaylist(@org.jetbrains.annotations.NotNull()
    java.lang.String query);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.jdots.music.model.Playlist playlist(@org.jetbrains.annotations.NotNull()
    java.lang.String playlistName);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.jdots.music.model.Playlist> playlists();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.jdots.music.model.Playlist> playlists(@org.jetbrains.annotations.Nullable()
    android.database.Cursor cursor);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.jdots.music.model.Playlist> favoritePlaylist(@org.jetbrains.annotations.NotNull()
    java.lang.String playlistName);
    
    public abstract void deletePlaylist(long playlistId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.jdots.music.model.Playlist playlist(long playlistId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.jdots.music.model.Song> playlistSongs(long playlistId);
}