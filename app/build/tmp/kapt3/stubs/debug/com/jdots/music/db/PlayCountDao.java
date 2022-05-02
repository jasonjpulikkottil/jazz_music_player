package com.jdots.music.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\'J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\'J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0006H\'J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\'\u00a8\u0006\u0010"}, d2 = {"Lcom/jdots/music/db/PlayCountDao;", "", "checkSongExistInPlayCount", "", "Lcom/jdots/music/db/PlayCountEntity;", "songId", "", "deleteSong", "", "deleteSongInPlayCount", "playCountEntity", "insertSongInPlayCount", "playCountSongs", "updateQuantity", "id", "updateSongInPlayCount", "app_debug"})
public abstract interface PlayCountDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertSongInPlayCount(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.PlayCountEntity playCountEntity);
    
    @androidx.room.Update()
    public abstract void updateSongInPlayCount(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.PlayCountEntity playCountEntity);
    
    @androidx.room.Delete()
    public abstract void deleteSongInPlayCount(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.PlayCountEntity playCountEntity);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM PlayCountEntity WHERE id =:songId")
    public abstract java.util.List<com.jdots.music.db.PlayCountEntity> checkSongExistInPlayCount(long songId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM PlayCountEntity ORDER BY play_count DESC")
    public abstract java.util.List<com.jdots.music.db.PlayCountEntity> playCountSongs();
    
    @androidx.room.Query(value = "DELETE FROM SongEntity WHERE id =:songId")
    public abstract void deleteSong(long songId);
    
    @androidx.room.Query(value = "UPDATE PlayCountEntity SET play_count = play_count + 1 WHERE id = :id")
    public abstract void updateQuantity(long id);
}