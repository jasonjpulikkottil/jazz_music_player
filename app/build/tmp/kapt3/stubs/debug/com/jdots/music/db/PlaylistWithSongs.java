package com.jdots.music.db;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lcom/jdots/music/db/PlaylistWithSongs;", "Landroid/os/Parcelable;", "playlistEntity", "Lcom/jdots/music/db/PlaylistEntity;", "songs", "", "Lcom/jdots/music/db/SongEntity;", "(Lcom/jdots/music/db/PlaylistEntity;Ljava/util/List;)V", "getPlaylistEntity", "()Lcom/jdots/music/db/PlaylistEntity;", "getSongs", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class PlaylistWithSongs implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private final com.jdots.music.db.PlaylistEntity playlistEntity = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Relation(parentColumn = "playlist_id", entityColumn = "playlist_creator_id")
    private final java.util.List<com.jdots.music.db.SongEntity> songs = null;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.jdots.music.db.PlaylistEntity getPlaylistEntity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.jdots.music.db.SongEntity> getSongs() {
        return null;
    }
    
    public PlaylistWithSongs(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.PlaylistEntity playlistEntity, @org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.db.SongEntity> songs) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jdots.music.db.PlaylistEntity component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.jdots.music.db.SongEntity> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jdots.music.db.PlaylistWithSongs copy(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.PlaylistEntity playlistEntity, @org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.db.SongEntity> songs) {
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
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}