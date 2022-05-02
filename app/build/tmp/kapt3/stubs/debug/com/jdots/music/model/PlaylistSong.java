package com.jdots.music.model;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0014J\u0013\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0096\u0002J\b\u0010+\u001a\u00020\u0007H\u0016J\u0019\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0007H\u00d6\u0001R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\r\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0014\u0010\u000e\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0014\u0010\u000f\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010%\u00a8\u00061"}, d2 = {"Lcom/jdots/music/model/PlaylistSong;", "Lcom/jdots/music/model/Song;", "id", "", "title", "", "trackNumber", "", "year", "duration", "data", "dateModified", "albumId", "albumName", "artistId", "artistName", "playlistId", "idInPlayList", "composer", "albumArtist", "(JLjava/lang/String;IIJLjava/lang/String;JJLjava/lang/String;JLjava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V", "getAlbumArtist", "()Ljava/lang/String;", "getAlbumId", "()J", "getAlbumName", "getArtistId", "getArtistName", "getComposer", "getData", "getDateModified", "getDuration", "getId", "getIdInPlayList", "getPlaylistId", "getTitle", "getTrackNumber", "()I", "getYear", "equals", "", "other", "", "hashCode", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class PlaylistSong extends com.jdots.music.model.Song {
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    private final int trackNumber = 0;
    private final int year = 0;
    private final long duration = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String data = null;
    private final long dateModified = 0L;
    private final long albumId = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String albumName = null;
    private final long artistId = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String artistName = null;
    private final long playlistId = 0L;
    private final long idInPlayList = 0L;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String composer = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String albumArtist = null;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTitle() {
        return null;
    }
    
    @java.lang.Override()
    public int getTrackNumber() {
        return 0;
    }
    
    @java.lang.Override()
    public int getYear() {
        return 0;
    }
    
    @java.lang.Override()
    public long getDuration() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getData() {
        return null;
    }
    
    @java.lang.Override()
    public long getDateModified() {
        return 0L;
    }
    
    @java.lang.Override()
    public long getAlbumId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getAlbumName() {
        return null;
    }
    
    @java.lang.Override()
    public long getArtistId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getArtistName() {
        return null;
    }
    
    public final long getPlaylistId() {
        return 0L;
    }
    
    public final long getIdInPlayList() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getComposer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getAlbumArtist() {
        return null;
    }
    
    public PlaylistSong(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int trackNumber, int year, long duration, @org.jetbrains.annotations.NotNull()
    java.lang.String data, long dateModified, long albumId, @org.jetbrains.annotations.NotNull()
    java.lang.String albumName, long artistId, @org.jetbrains.annotations.NotNull()
    java.lang.String artistName, long playlistId, long idInPlayList, @org.jetbrains.annotations.Nullable()
    java.lang.String composer, @org.jetbrains.annotations.Nullable()
    java.lang.String albumArtist) {
        super(0L, null, 0, 0, 0L, null, 0L, 0L, null, 0L, null, null, null);
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