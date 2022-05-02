package com.jdots.music.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H&\u00a8\u0006\t"}, d2 = {"Lcom/jdots/music/repository/LastAddedRepository;", "", "recentAlbums", "", "Lcom/jdots/music/model/Album;", "recentArtists", "Lcom/jdots/music/model/Artist;", "recentSongs", "Lcom/jdots/music/model/Song;", "app_debug"})
public abstract interface LastAddedRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.jdots.music.model.Song> recentSongs();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.jdots.music.model.Album> recentAlbums();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.jdots.music.model.Artist> recentArtists();
}