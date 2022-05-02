package com.jdots.music.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\rR\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/jdots/music/service/SongPlayCountHelper;", "", "()V", "<set-?>", "Lcom/jdots/music/model/Song;", "song", "getSong", "()Lcom/jdots/music/model/Song;", "stopWatch", "Lcom/jdots/music/helper/StopWatch;", "notifyPlayStateChanged", "", "isPlaying", "", "notifySongChanged", "shouldBumpPlayCount", "Companion", "app_debug"})
public final class SongPlayCountHelper {
    private final com.jdots.music.helper.StopWatch stopWatch = null;
    @org.jetbrains.annotations.NotNull()
    private com.jdots.music.model.Song song;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    public static final com.jdots.music.service.SongPlayCountHelper.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.jdots.music.model.Song getSong() {
        return null;
    }
    
    public final boolean shouldBumpPlayCount() {
        return false;
    }
    
    public final void notifySongChanged(@org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Song song) {
    }
    
    public final void notifyPlayStateChanged(boolean isPlaying) {
    }
    
    public SongPlayCountHelper() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/jdots/music/service/SongPlayCountHelper$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}