package com.jdots.music.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\"\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\t0\u000fj\b\u0012\u0004\u0012\u00020\t`\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\n\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\fH\u0002J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/jdots/music/repository/RealGenreRepository;", "Lcom/jdots/music/repository/GenreRepository;", "contentResolver", "Landroid/content/ContentResolver;", "songRepository", "Lcom/jdots/music/repository/RealSongRepository;", "(Landroid/content/ContentResolver;Lcom/jdots/music/repository/RealSongRepository;)V", "genres", "", "Lcom/jdots/music/model/Genre;", "getGenreFromCursor", "cursor", "Landroid/database/Cursor;", "getGenreFromCursorWithOutSongs", "getGenresFromCursor", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getGenresFromCursorForSearch", "getSongsWithNoGenre", "Lcom/jdots/music/model/Song;", "hasSongsWithNoGenre", "", "makeAllSongsWithGenreCursor", "makeGenreCursor", "makeGenreSongCursor", "genreId", "", "songs", "app_release"})
public final class RealGenreRepository implements com.jdots.music.repository.GenreRepository {
    private final android.content.ContentResolver contentResolver = null;
    private final com.jdots.music.repository.RealSongRepository songRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.jdots.music.model.Genre> genres() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.jdots.music.model.Song> songs(long genreId) {
        return null;
    }
    
    private final com.jdots.music.model.Genre getGenreFromCursor(android.database.Cursor cursor) {
        return null;
    }
    
    private final com.jdots.music.model.Genre getGenreFromCursorWithOutSongs(android.database.Cursor cursor) {
        return null;
    }
    
    private final java.util.List<com.jdots.music.model.Song> getSongsWithNoGenre() {
        return null;
    }
    
    private final boolean hasSongsWithNoGenre() {
        return false;
    }
    
    private final android.database.Cursor makeAllSongsWithGenreCursor() {
        return null;
    }
    
    private final android.database.Cursor makeGenreSongCursor(long genreId) {
        return null;
    }
    
    private final java.util.ArrayList<com.jdots.music.model.Genre> getGenresFromCursor(android.database.Cursor cursor) {
        return null;
    }
    
    private final java.util.List<com.jdots.music.model.Genre> getGenresFromCursorForSearch(android.database.Cursor cursor) {
        return null;
    }
    
    private final android.database.Cursor makeGenreCursor() {
        return null;
    }
    
    public RealGenreRepository(@org.jetbrains.annotations.NotNull()
    android.content.ContentResolver contentResolver, @org.jetbrains.annotations.NotNull()
    com.jdots.music.repository.RealSongRepository songRepository) {
        super();
    }
}