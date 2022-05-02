package com.jdots.music.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/jdots/music/repository/RealAlbumRepository;", "Lcom/jdots/music/repository/AlbumRepository;", "songRepository", "Lcom/jdots/music/repository/RealSongRepository;", "(Lcom/jdots/music/repository/RealSongRepository;)V", "album", "Lcom/jdots/music/model/Album;", "albumId", "", "albums", "", "query", "", "getSongLoaderSortOrder", "sortAlbumSongs", "splitIntoAlbums", "songs", "Lcom/jdots/music/model/Song;", "app_debug"})
public final class RealAlbumRepository implements com.jdots.music.repository.AlbumRepository {
    private final com.jdots.music.repository.RealSongRepository songRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.jdots.music.model.Album> albums() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.jdots.music.model.Album> albums(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jdots.music.model.Album album(long albumId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.jdots.music.model.Album> splitIntoAlbums(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.jdots.music.model.Song> songs) {
        return null;
    }
    
    private final com.jdots.music.model.Album sortAlbumSongs(com.jdots.music.model.Album album) {
        return null;
    }
    
    private final java.lang.String getSongLoaderSortOrder() {
        return null;
    }
    
    public RealAlbumRepository(@org.jetbrains.annotations.NotNull()
    com.jdots.music.repository.RealSongRepository songRepository) {
        super();
    }
}