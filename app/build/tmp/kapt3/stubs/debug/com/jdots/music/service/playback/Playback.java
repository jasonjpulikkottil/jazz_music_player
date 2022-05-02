package com.jdots.music.service.playback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u001fJ\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0007H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H&J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0003H&J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0012\u0010\u0019\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH&J\b\u0010\u001d\u001a\u00020\u0007H&J\b\u0010\u001e\u001a\u00020\u000eH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0012\u0010\t\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\b\u00a8\u0006 "}, d2 = {"Lcom/jdots/music/service/playback/Playback;", "", "audioSessionId", "", "getAudioSessionId", "()I", "isInitialized", "", "()Z", "isPlaying", "duration", "pause", "position", "release", "", "seek", "whereto", "setAudioSessionId", "sessionId", "setCallbacks", "callbacks", "Lcom/jdots/music/service/playback/Playback$PlaybackCallbacks;", "setDataSource", "path", "", "setNextDataSource", "setVolume", "vol", "", "start", "stop", "PlaybackCallbacks", "app_debug"})
public abstract interface Playback {
    
    public abstract boolean isInitialized();
    
    public abstract boolean isPlaying();
    
    public abstract int getAudioSessionId();
    
    public abstract boolean setDataSource(@org.jetbrains.annotations.NotNull()
    java.lang.String path);
    
    public abstract void setNextDataSource(@org.jetbrains.annotations.Nullable()
    java.lang.String path);
    
    public abstract void setCallbacks(@org.jetbrains.annotations.NotNull()
    com.jdots.music.service.playback.Playback.PlaybackCallbacks callbacks);
    
    public abstract boolean start();
    
    public abstract void stop();
    
    public abstract void release();
    
    public abstract boolean pause();
    
    public abstract int duration();
    
    public abstract int position();
    
    public abstract int seek(int whereto);
    
    public abstract boolean setVolume(float vol);
    
    public abstract boolean setAudioSessionId(int sessionId);
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/jdots/music/service/playback/Playback$PlaybackCallbacks;", "", "onTrackEnded", "", "onTrackWentToNext", "app_debug"})
    public static abstract interface PlaybackCallbacks {
        
        public abstract void onTrackWentToNext();
        
        public abstract void onTrackEnded();
    }
}