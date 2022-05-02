package com.jdots.music.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/jdots/music/repository/GenreRepository;", "", "genres", "", "Lcom/jdots/music/model/Genre;", "songs", "Lcom/jdots/music/model/Song;", "genreId", "", "app_release"})
public abstract interface GenreRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.jdots.music.model.Genre> genres();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.jdots.music.model.Song> songs(long genreId);
}