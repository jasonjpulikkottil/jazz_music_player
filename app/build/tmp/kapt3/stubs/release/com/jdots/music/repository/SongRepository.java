package com.jdots.music.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tH&J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\r\u001a\u00020\u000bH&\u00a8\u0006\u000e"}, d2 = {"Lcom/jdots/music/repository/SongRepository;", "", "song", "Lcom/jdots/music/model/Song;", "cursor", "Landroid/database/Cursor;", "songId", "", "songs", "", "query", "", "songsByFilePath", "filePath", "app_release"})
public abstract interface SongRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.jdots.music.model.Song> songs();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.jdots.music.model.Song> songs(@org.jetbrains.annotations.Nullable()
    android.database.Cursor cursor);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.jdots.music.model.Song> songs(@org.jetbrains.annotations.NotNull()
    java.lang.String query);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.jdots.music.model.Song> songsByFilePath(@org.jetbrains.annotations.NotNull()
    java.lang.String filePath);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.jdots.music.model.Song song(@org.jetbrains.annotations.Nullable()
    android.database.Cursor cursor);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.jdots.music.model.Song song(long songId);
}