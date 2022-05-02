package com.jdots.music.db;

import java.lang.System;

@androidx.room.Database(entities = {com.jdots.music.db.PlaylistEntity.class, com.jdots.music.db.SongEntity.class, com.jdots.music.db.HistoryEntity.class, com.jdots.music.db.PlayCountEntity.class, com.jdots.music.db.BlackListStoreEntity.class, com.jdots.music.db.LyricsEntity.class}, version = 22, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lcom/jdots/music/db/RetroDatabase;", "Landroidx/room/RoomDatabase;", "()V", "blackListStore", "Lcom/jdots/music/db/BlackListStoreDao;", "historyDao", "Lcom/jdots/music/db/HistoryDao;", "lyricsDao", "Lcom/jdots/music/db/LyricsDao;", "playCountDao", "Lcom/jdots/music/db/PlayCountDao;", "playlistDao", "Lcom/jdots/music/db/PlaylistDao;", "app_release"})
public abstract class RetroDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.jdots.music.db.PlaylistDao playlistDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.jdots.music.db.BlackListStoreDao blackListStore();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.jdots.music.db.PlayCountDao playCountDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.jdots.music.db.HistoryDao historyDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.jdots.music.db.LyricsDao lyricsDao();
    
    public RetroDatabase() {
        super();
    }
}