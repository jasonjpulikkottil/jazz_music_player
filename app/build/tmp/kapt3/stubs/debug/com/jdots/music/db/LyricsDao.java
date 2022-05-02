package com.jdots.music.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/jdots/music/db/LyricsDao;", "", "deleteLyrics", "", "lyricsEntity", "Lcom/jdots/music/db/LyricsEntity;", "insertLyrics", "lyricsWithSongId", "songId", "", "updateLyrics", "app_debug"})
public abstract interface LyricsDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM LyricsEntity WHERE songId =:songId LIMIT 1")
    public abstract com.jdots.music.db.LyricsEntity lyricsWithSongId(int songId);
    
    @androidx.room.Insert()
    public abstract void insertLyrics(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.LyricsEntity lyricsEntity);
    
    @androidx.room.Delete()
    public abstract void deleteLyrics(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.LyricsEntity lyricsEntity);
    
    @androidx.room.Update()
    public abstract void updateLyrics(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.LyricsEntity lyricsEntity);
}