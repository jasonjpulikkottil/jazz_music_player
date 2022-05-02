package com.jdots.music.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\u0015H\u00d6\u0001J\u0006\u0010%\u001a\u00020\u0006J\t\u0010&\u001a\u00020\tH\u00d6\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\t8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000bR\u0011\u0010\u0011\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0014\u001a\u00020\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\t8F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u000bR\u0011\u0010\u001c\u001a\u00020\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017\u00a8\u0006("}, d2 = {"Lcom/jdots/music/model/Album;", "", "id", "", "songs", "", "Lcom/jdots/music/model/Song;", "(JLjava/util/List;)V", "albumArtist", "", "getAlbumArtist", "()Ljava/lang/String;", "artistId", "getArtistId", "()J", "artistName", "getArtistName", "dateModified", "getDateModified", "getId", "songCount", "", "getSongCount", "()I", "getSongs", "()Ljava/util/List;", "title", "getTitle", "year", "getYear", "component1", "component2", "copy", "equals", "", "other", "hashCode", "safeGetFirstSong", "toString", "Companion", "app_release"})
public final class Album {
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.jdots.music.model.Song> songs = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.jdots.music.model.Album empty = null;
    public static final com.jdots.music.model.Album.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final long getArtistId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getArtistName() {
        return null;
    }
    
    public final int getYear() {
        return 0;
    }
    
    public final long getDateModified() {
        return 0L;
    }
    
    public final int getSongCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAlbumArtist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jdots.music.model.Song safeGetFirstSong() {
        return null;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.jdots.music.model.Song> getSongs() {
        return null;
    }
    
    public Album(long id, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.jdots.music.model.Song> songs) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.jdots.music.model.Song> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jdots.music.model.Album copy(long id, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.jdots.music.model.Song> songs) {
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
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/jdots/music/model/Album$Companion;", "", "()V", "empty", "Lcom/jdots/music/model/Album;", "getEmpty", "()Lcom/jdots/music/model/Album;", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.jdots.music.model.Album getEmpty() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}