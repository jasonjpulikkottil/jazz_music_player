package com.jdots.music.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H&R\u001b\u0010\b\u001a\u00020\t8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001b"}, d2 = {"Lcom/jdots/music/model/AbsCustomPlaylist;", "Lcom/jdots/music/model/Playlist;", "Lorg/koin/core/KoinComponent;", "id", "", "name", "", "(JLjava/lang/String;)V", "lastAddedRepository", "Lcom/jdots/music/repository/LastAddedRepository;", "getLastAddedRepository", "()Lcom/jdots/music/repository/LastAddedRepository;", "lastAddedRepository$delegate", "Lkotlin/Lazy;", "songRepository", "Lcom/jdots/music/repository/SongRepository;", "getSongRepository", "()Lcom/jdots/music/repository/SongRepository;", "songRepository$delegate", "topPlayedRepository", "Lcom/jdots/music/repository/TopPlayedRepository;", "getTopPlayedRepository", "()Lcom/jdots/music/repository/TopPlayedRepository;", "topPlayedRepository$delegate", "songs", "", "Lcom/jdots/music/model/Song;", "app_debug"})
public abstract class AbsCustomPlaylist extends com.jdots.music.model.Playlist implements org.koin.core.KoinComponent {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy songRepository$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy topPlayedRepository$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy lastAddedRepository$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.jdots.music.model.Song> songs();
    
    @org.jetbrains.annotations.NotNull()
    protected final com.jdots.music.repository.SongRepository getSongRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.jdots.music.repository.TopPlayedRepository getTopPlayedRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.jdots.music.repository.LastAddedRepository getLastAddedRepository() {
        return null;
    }
    
    public AbsCustomPlaylist(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        super(0L, null);
    }
}