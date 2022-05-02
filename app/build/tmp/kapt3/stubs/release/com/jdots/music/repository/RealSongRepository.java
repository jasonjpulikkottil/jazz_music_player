package com.jdots.music.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J3\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0002\u00a2\u0006\u0002\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J3\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\r\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u0007H\u0007\u00a2\u0006\u0002\u0010\u0016J\u0012\u0010\u0017\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u001bH\u0016J\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u001b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u001b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u001b2\u0006\u0010\u001e\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/jdots/music/repository/RealSongRepository;", "Lcom/jdots/music/repository/SongRepository;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "addBlacklistSelectionValues", "", "", "selectionValues", "paths", "Ljava/util/ArrayList;", "([Ljava/lang/String;Ljava/util/ArrayList;)[Ljava/lang/String;", "generateBlacklistSelection", "selection", "pathCount", "", "getSongFromCursorImpl", "Lcom/jdots/music/model/Song;", "cursor", "Landroid/database/Cursor;", "makeSongCursor", "sortOrder", "(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "song", "songId", "", "songs", "", "query", "songsByFilePath", "filePath", "app_release"})
public final class RealSongRepository implements com.jdots.music.repository.SongRepository {
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.jdots.music.model.Song> songs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.jdots.music.model.Song> songs(@org.jetbrains.annotations.Nullable()
    android.database.Cursor cursor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jdots.music.model.Song song(@org.jetbrains.annotations.Nullable()
    android.database.Cursor cursor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.jdots.music.model.Song> songs(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jdots.music.model.Song song(long songId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.jdots.music.model.Song> songsByFilePath(@org.jetbrains.annotations.NotNull()
    java.lang.String filePath) {
        return null;
    }
    
    private final com.jdots.music.model.Song getSongFromCursorImpl(android.database.Cursor cursor) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.database.Cursor makeSongCursor(@org.jetbrains.annotations.Nullable()
    java.lang.String selection, @org.jetbrains.annotations.Nullable()
    java.lang.String[] selectionValues, @org.jetbrains.annotations.NotNull()
    java.lang.String sortOrder) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.database.Cursor makeSongCursor(@org.jetbrains.annotations.Nullable()
    java.lang.String selection, @org.jetbrains.annotations.Nullable()
    java.lang.String[] selectionValues) {
        return null;
    }
    
    private final java.lang.String generateBlacklistSelection(java.lang.String selection, int pathCount) {
        return null;
    }
    
    private final java.lang.String[] addBlacklistSelectionValues(java.lang.String[] selectionValues, java.util.ArrayList<java.lang.String> paths) {
        return null;
    }
    
    public RealSongRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}