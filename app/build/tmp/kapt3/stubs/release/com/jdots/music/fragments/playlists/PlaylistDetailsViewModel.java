package com.jdots.music.fragments.playlists;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\rJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/jdots/music/fragments/playlists/PlaylistDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/jdots/music/interfaces/IMusicServiceEventListener;", "realRepository", "Lcom/jdots/music/repository/RealRepository;", "playlist", "Lcom/jdots/music/db/PlaylistWithSongs;", "(Lcom/jdots/music/repository/RealRepository;Lcom/jdots/music/db/PlaylistWithSongs;)V", "playListSongs", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/jdots/music/model/Song;", "getSongs", "Landroidx/lifecycle/LiveData;", "Lcom/jdots/music/db/SongEntity;", "onMediaStoreChanged", "", "onPlayStateChanged", "onPlayingMetaChanged", "onQueueChanged", "onRepeatModeChanged", "onServiceConnected", "onServiceDisconnected", "onShuffleModeChanged", "app_release"})
public final class PlaylistDetailsViewModel extends androidx.lifecycle.ViewModel implements com.jdots.music.interfaces.IMusicServiceEventListener {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.jdots.music.model.Song>> playListSongs = null;
    private final com.jdots.music.repository.RealRepository realRepository = null;
    private com.jdots.music.db.PlaylistWithSongs playlist;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.jdots.music.db.SongEntity>> getSongs() {
        return null;
    }
    
    @java.lang.Override()
    public void onMediaStoreChanged() {
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    @java.lang.Override()
    public void onServiceDisconnected() {
    }
    
    @java.lang.Override()
    public void onQueueChanged() {
    }
    
    @java.lang.Override()
    public void onPlayingMetaChanged() {
    }
    
    @java.lang.Override()
    public void onPlayStateChanged() {
    }
    
    @java.lang.Override()
    public void onRepeatModeChanged() {
    }
    
    @java.lang.Override()
    public void onShuffleModeChanged() {
    }
    
    public PlaylistDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.jdots.music.repository.RealRepository realRepository, @org.jetbrains.annotations.NotNull()
    com.jdots.music.db.PlaylistWithSongs playlist) {
        super();
    }
}