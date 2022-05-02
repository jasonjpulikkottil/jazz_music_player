package com.jdots.music.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\tH\u00d6\u0001J\u0006\u0010 \u001a\u00020\u0006J\t\u0010!\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\r\u00a8\u0006#"}, d2 = {"Lcom/jdots/music/model/Artist;", "", "id", "", "albums", "", "Lcom/jdots/music/model/Album;", "(JLjava/util/List;)V", "albumCount", "", "getAlbumCount", "()I", "getAlbums", "()Ljava/util/List;", "getId", "()J", "name", "", "getName", "()Ljava/lang/String;", "songCount", "getSongCount", "songs", "Lcom/jdots/music/model/Song;", "getSongs", "component1", "component2", "copy", "equals", "", "other", "hashCode", "safeGetFirstAlbum", "toString", "Companion", "app_debug"})
public final class Artist {
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.jdots.music.model.Album> albums = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UNKNOWN_ARTIST_DISPLAY_NAME = "Unknown Artist";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String VARIOUS_ARTISTS_DISPLAY_NAME = "Various Artists";
    public static final long VARIOUS_ARTISTS_ID = -2L;
    @org.jetbrains.annotations.NotNull()
    private static final com.jdots.music.model.Artist empty = null;
    public static final com.jdots.music.model.Artist.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final int getSongCount() {
        return 0;
    }
    
    public final int getAlbumCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.jdots.music.model.Song> getSongs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jdots.music.model.Album safeGetFirstAlbum() {
        return null;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.jdots.music.model.Album> getAlbums() {
        return null;
    }
    
    public Artist(long id, @org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.model.Album> albums) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.jdots.music.model.Album> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jdots.music.model.Artist copy(long id, @org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.model.Album> albums) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/jdots/music/model/Artist$Companion;", "", "()V", "UNKNOWN_ARTIST_DISPLAY_NAME", "", "VARIOUS_ARTISTS_DISPLAY_NAME", "VARIOUS_ARTISTS_ID", "", "empty", "Lcom/jdots/music/model/Artist;", "getEmpty", "()Lcom/jdots/music/model/Artist;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.jdots.music.model.Artist getEmpty() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}