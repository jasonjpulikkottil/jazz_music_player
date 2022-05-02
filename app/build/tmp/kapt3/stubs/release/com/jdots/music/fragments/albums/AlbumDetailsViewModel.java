package com.jdots.music.fragments.albums;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0002J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000e2\u0006\u0010\u0012\u001a\u00020\nJ\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\u0006\u0010\u0015\u001a\u00020\u0006J\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00170\u000e2\u0006\u0010\u0018\u001a\u00020\u0014J\b\u0010\u0019\u001a\u00020\fH\u0016J\b\u0010\u001a\u001a\u00020\fH\u0016J\b\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010\u001c\u001a\u00020\fH\u0016J\b\u0010\u001d\u001a\u00020\fH\u0016J\b\u0010\u001e\u001a\u00020\fH\u0016J\b\u0010\u001f\u001a\u00020\fH\u0016J\b\u0010 \u001a\u00020\fH\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/jdots/music/fragments/albums/AlbumDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/jdots/music/interfaces/IMusicServiceEventListener;", "repository", "Lcom/jdots/music/repository/RealRepository;", "albumId", "", "(Lcom/jdots/music/repository/RealRepository;J)V", "albumDetails", "Landroidx/lifecycle/MutableLiveData;", "Lcom/jdots/music/model/Album;", "fetchAlbum", "", "getAlbum", "Landroidx/lifecycle/LiveData;", "getAlbumInfo", "Lcom/jdots/music/network/Result;", "Lcom/jdots/music/network/model/LastFmAlbum;", "album", "getArtist", "Lcom/jdots/music/model/Artist;", "artistId", "getMoreAlbums", "", "artist", "onMediaStoreChanged", "onPlayStateChanged", "onPlayingMetaChanged", "onQueueChanged", "onRepeatModeChanged", "onServiceConnected", "onServiceDisconnected", "onShuffleModeChanged", "app_release"})
public final class AlbumDetailsViewModel extends androidx.lifecycle.ViewModel implements com.jdots.music.interfaces.IMusicServiceEventListener {
    private final androidx.lifecycle.MutableLiveData<com.jdots.music.model.Album> albumDetails = null;
    private final com.jdots.music.repository.RealRepository repository = null;
    private final long albumId = 0L;
    
    private final void fetchAlbum() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.jdots.music.model.Album> getAlbum() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.jdots.music.model.Artist> getArtist(long artistId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.jdots.music.network.Result<com.jdots.music.network.model.LastFmAlbum>> getAlbumInfo(@org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Album album) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.jdots.music.model.Album>> getMoreAlbums(@org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Artist artist) {
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
    
    public AlbumDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.jdots.music.repository.RealRepository repository, long albumId) {
        super();
    }
}