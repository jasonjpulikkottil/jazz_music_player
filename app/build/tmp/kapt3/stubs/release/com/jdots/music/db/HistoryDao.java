package com.jdots.music.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000eH\'J\u0019\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/jdots/music/db/HistoryDao;", "", "historySongs", "", "Lcom/jdots/music/db/HistoryEntity;", "insertSongInHistory", "", "historyEntity", "(Lcom/jdots/music/db/HistoryEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSongPresentInHistory", "songId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observableHistorySongs", "Landroidx/lifecycle/LiveData;", "updateHistorySong", "Companion", "app_release"})
public abstract interface HistoryDao {
    public static final com.jdots.music.db.HistoryDao.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertSongInHistory(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.HistoryEntity historyEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM HistoryEntity WHERE id = :songId LIMIT 1")
    public abstract java.lang.Object isSongPresentInHistory(long songId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jdots.music.db.HistoryEntity> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object updateHistorySong(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.HistoryEntity historyEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM HistoryEntity ORDER BY time_played DESC LIMIT 100")
    public abstract java.util.List<com.jdots.music.db.HistoryEntity> historySongs();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM HistoryEntity ORDER BY time_played DESC LIMIT 100")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.jdots.music.db.HistoryEntity>> observableHistorySongs();
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/jdots/music/db/HistoryDao$Companion;", "", "()V", "HISTORY_LIMIT", "", "app_release"})
    public static final class Companion {
        private static final int HISTORY_LIMIT = 100;
        
        private Companion() {
            super();
        }
    }
}