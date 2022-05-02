package com.jdots.music.fragments.genres;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eJ\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000eJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/jdots/music/fragments/genres/GenreDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/jdots/music/interfaces/IMusicServiceEventListener;", "realRepository", "Lcom/jdots/music/repository/RealRepository;", "genre", "Lcom/jdots/music/model/Genre;", "(Lcom/jdots/music/repository/RealRepository;Lcom/jdots/music/model/Genre;)V", "_genre", "Landroidx/lifecycle/MutableLiveData;", "_playListSongs", "", "Lcom/jdots/music/model/Song;", "getGenre", "Landroidx/lifecycle/LiveData;", "getSongs", "loadGenreSongs", "Lkotlinx/coroutines/Job;", "onMediaStoreChanged", "", "onPlayStateChanged", "onPlayingMetaChanged", "onQueueChanged", "onRepeatModeChanged", "onServiceConnected", "onServiceDisconnected", "onShuffleModeChanged", "app_release"})
public final class GenreDetailsViewModel extends androidx.lifecycle.ViewModel implements com.jdots.music.interfaces.IMusicServiceEventListener {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.jdots.music.model.Song>> _playListSongs = null;
    private final androidx.lifecycle.MutableLiveData<com.jdots.music.model.Genre> _genre = null;
    private final com.jdots.music.repository.RealRepository realRepository = null;
    private final com.jdots.music.model.Genre genre = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.jdots.music.model.Song>> getSongs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.jdots.music.model.Genre> getGenre() {
        return null;
    }
    
    private final kotlinx.coroutines.Job loadGenreSongs(com.jdots.music.model.Genre genre) {
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
    
    public GenreDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.jdots.music.repository.RealRepository realRepository, @org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Genre genre) {
        super();
    }
}