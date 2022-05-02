package com.jdots.music.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0002J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0002J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\n\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0002J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0002J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u001cH\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001cH\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/jdots/music/repository/RealTopPlayedRepository;", "Lcom/jdots/music/repository/TopPlayedRepository;", "context", "Landroid/content/Context;", "songRepository", "Lcom/jdots/music/repository/RealSongRepository;", "albumRepository", "Lcom/jdots/music/repository/RealAlbumRepository;", "artistRepository", "Lcom/jdots/music/repository/RealArtistRepository;", "(Landroid/content/Context;Lcom/jdots/music/repository/RealSongRepository;Lcom/jdots/music/repository/RealAlbumRepository;Lcom/jdots/music/repository/RealArtistRepository;)V", "makeNotRecentTracksCursorAndClearUpDatabase", "Landroid/database/Cursor;", "makePlayedTracksCursorAndClearUpDatabase", "makeRecentTracksCursorAndClearUpDatabase", "makeRecentTracksCursorAndClearUpDatabaseImpl", "Lcom/jdots/music/repository/SortedLongCursor;", "ignoreCutoffTime", "", "reverseOrder", "makeRecentTracksCursorImpl", "makeSortedCursor", "cursor", "idColumn", "", "makeTopTracksCursorAndClearUpDatabase", "makeTopTracksCursorImpl", "notRecentlyPlayedTracks", "", "Lcom/jdots/music/model/Song;", "recentlyPlayedTracks", "topAlbums", "Lcom/jdots/music/model/Album;", "topArtists", "Lcom/jdots/music/model/Artist;", "topTracks", "app_release"})
public final class RealTopPlayedRepository implements com.jdots.music.repository.TopPlayedRepository {
    private final android.content.Context context = null;
    private final com.jdots.music.repository.RealSongRepository songRepository = null;
    private final com.jdots.music.repository.RealAlbumRepository albumRepository = null;
    private final com.jdots.music.repository.RealArtistRepository artistRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.jdots.music.model.Song> recentlyPlayedTracks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.jdots.music.model.Song> topTracks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.jdots.music.model.Song> notRecentlyPlayedTracks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.jdots.music.model.Album> topAlbums() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.jdots.music.model.Artist> topArtists() {
        return null;
    }
    
    private final android.database.Cursor makeTopTracksCursorAndClearUpDatabase() {
        return null;
    }
    
    private final com.jdots.music.repository.SortedLongCursor makeRecentTracksCursorImpl() {
        return null;
    }
    
    private final com.jdots.music.repository.SortedLongCursor makeTopTracksCursorImpl() {
        return null;
    }
    
    private final com.jdots.music.repository.SortedLongCursor makeSortedCursor(android.database.Cursor cursor, int idColumn) {
        return null;
    }
    
    private final android.database.Cursor makeRecentTracksCursorAndClearUpDatabase() {
        return null;
    }
    
    private final android.database.Cursor makePlayedTracksCursorAndClearUpDatabase() {
        return null;
    }
    
    private final android.database.Cursor makeNotRecentTracksCursorAndClearUpDatabase() {
        return null;
    }
    
    private final com.jdots.music.repository.SortedLongCursor makeRecentTracksCursorAndClearUpDatabaseImpl(boolean ignoreCutoffTime, boolean reverseOrder) {
        return null;
    }
    
    private final com.jdots.music.repository.SortedLongCursor makeRecentTracksCursorImpl(boolean ignoreCutoffTime, boolean reverseOrder) {
        return null;
    }
    
    public RealTopPlayedRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.jdots.music.repository.RealSongRepository songRepository, @org.jetbrains.annotations.NotNull()
    com.jdots.music.repository.RealAlbumRepository albumRepository, @org.jetbrains.annotations.NotNull()
    com.jdots.music.repository.RealArtistRepository artistRepository) {
        super();
    }
}