package com.jdots.music.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lcom/jdots/music/repository/TopPlayedRepository;", "", "notRecentlyPlayedTracks", "", "Lcom/jdots/music/model/Song;", "recentlyPlayedTracks", "topAlbums", "Lcom/jdots/music/model/Album;", "topArtists", "Lcom/jdots/music/model/Artist;", "topTracks", "app_release"})
public abstract interface TopPlayedRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.jdots.music.model.Song> recentlyPlayedTracks();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.jdots.music.model.Song> topTracks();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.jdots.music.model.Song> notRecentlyPlayedTracks();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.jdots.music.model.Album> topAlbums();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.jdots.music.model.Artist> topArtists();
}