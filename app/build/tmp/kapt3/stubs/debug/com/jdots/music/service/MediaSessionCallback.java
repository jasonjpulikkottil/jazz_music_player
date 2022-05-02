package com.jdots.music.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001a\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\bH\u0016J\b\u0010\u0018\u001a\u00020\bH\u0016J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\rH\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016J\b\u0010\u001c\u001a\u00020\bH\u0016J\b\u0010\u001d\u001a\u00020\bH\u0016J(\u0010\u001e\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/jdots/music/service/MediaSessionCallback;", "Landroid/support/v4/media/session/MediaSessionCompat$Callback;", "context", "Landroid/content/Context;", "musicService", "Lcom/jdots/music/service/MusicService;", "(Landroid/content/Context;Lcom/jdots/music/service/MusicService;)V", "checkAndStartPlaying", "", "songs", "Ljava/util/ArrayList;", "Lcom/jdots/music/model/Song;", "itemId", "", "onCustomAction", "action", "", "extras", "Landroid/os/Bundle;", "onMediaButtonEvent", "", "mediaButtonIntent", "Landroid/content/Intent;", "onPause", "onPlay", "onSeekTo", "pos", "onSkipToNext", "onSkipToPrevious", "onStop", "openQueue", "index", "", "startPlaying", "app_debug"})
public final class MediaSessionCallback extends android.support.v4.media.session.MediaSessionCompat.Callback {
    private final android.content.Context context = null;
    private final com.jdots.music.service.MusicService musicService = null;
    
    @java.lang.Override()
    public void onPlay() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onSkipToNext() {
    }
    
    @java.lang.Override()
    public void onSkipToPrevious() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onSeekTo(long pos) {
    }
    
    @java.lang.Override()
    public boolean onMediaButtonEvent(@org.jetbrains.annotations.NotNull()
    android.content.Intent mediaButtonIntent) {
        return false;
    }
    
    @java.lang.Override()
    public void onCustomAction(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.Nullable()
    android.os.Bundle extras) {
    }
    
    private final void checkAndStartPlaying(java.util.ArrayList<com.jdots.music.model.Song> songs, long itemId) {
    }
    
    private final void openQueue(java.util.ArrayList<com.jdots.music.model.Song> songs, int index, boolean startPlaying) {
    }
    
    public MediaSessionCallback(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.jdots.music.service.MusicService musicService) {
        super();
    }
}