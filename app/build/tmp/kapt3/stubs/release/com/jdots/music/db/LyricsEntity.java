package com.jdots.music.db;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/jdots/music/db/LyricsEntity;", "", "songId", "", "lyrics", "", "(ILjava/lang/String;)V", "getLyrics", "()Ljava/lang/String;", "getSongId", "()I", "app_release"})
public final class LyricsEntity {
    @androidx.room.PrimaryKey()
    private final int songId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String lyrics = null;
    
    public final int getSongId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLyrics() {
        return null;
    }
    
    public LyricsEntity(int songId, @org.jetbrains.annotations.NotNull()
    java.lang.String lyrics) {
        super();
    }
}