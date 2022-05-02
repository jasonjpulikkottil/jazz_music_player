package com.jdots.music.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/jdots/music/repository/RealSearchRepository;", "", "songRepository", "Lcom/jdots/music/repository/SongRepository;", "albumRepository", "Lcom/jdots/music/repository/AlbumRepository;", "artistRepository", "Lcom/jdots/music/repository/ArtistRepository;", "roomRepository", "Lcom/jdots/music/repository/RoomRepository;", "genreRepository", "Lcom/jdots/music/repository/GenreRepository;", "(Lcom/jdots/music/repository/SongRepository;Lcom/jdots/music/repository/AlbumRepository;Lcom/jdots/music/repository/ArtistRepository;Lcom/jdots/music/repository/RoomRepository;Lcom/jdots/music/repository/GenreRepository;)V", "searchAll", "", "context", "Landroid/content/Context;", "query", "", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class RealSearchRepository {
    private final com.jdots.music.repository.SongRepository songRepository = null;
    private final com.jdots.music.repository.AlbumRepository albumRepository = null;
    private final com.jdots.music.repository.ArtistRepository artistRepository = null;
    private final com.jdots.music.repository.RoomRepository roomRepository = null;
    private final com.jdots.music.repository.GenreRepository genreRepository = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object searchAll(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Object>> p2) {
        return null;
    }
    
    public RealSearchRepository(@org.jetbrains.annotations.NotNull()
    com.jdots.music.repository.SongRepository songRepository, @org.jetbrains.annotations.NotNull()
    com.jdots.music.repository.AlbumRepository albumRepository, @org.jetbrains.annotations.NotNull()
    com.jdots.music.repository.ArtistRepository artistRepository, @org.jetbrains.annotations.NotNull()
    com.jdots.music.repository.RoomRepository roomRepository, @org.jetbrains.annotations.NotNull()
    com.jdots.music.repository.GenreRepository genreRepository) {
        super();
    }
}