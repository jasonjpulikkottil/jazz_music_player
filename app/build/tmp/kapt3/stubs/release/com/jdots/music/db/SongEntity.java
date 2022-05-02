package com.jdots.music.db;

import java.lang.System;

@androidx.room.Entity(indices = {@androidx.room.Index(unique = true, value = {"playlist_creator_id", "id"})})
@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0014J\t\u0010\'\u001a\u00020\tH\u00d6\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\tH\u00d6\u0001R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\u0011\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010%\u00a8\u0006-"}, d2 = {"Lcom/jdots/music/db/SongEntity;", "Landroid/os/Parcelable;", "songPrimaryKey", "", "playlistCreatorId", "id", "title", "", "trackNumber", "", "year", "duration", "data", "dateModified", "albumId", "albumName", "artistId", "artistName", "composer", "albumArtist", "(JJJLjava/lang/String;IIJLjava/lang/String;JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlbumArtist", "()Ljava/lang/String;", "getAlbumId", "()J", "getAlbumName", "getArtistId", "getArtistName", "getComposer", "getData", "getDateModified", "getDuration", "getId", "getPlaylistCreatorId", "getSongPrimaryKey", "getTitle", "getTrackNumber", "()I", "getYear", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"})
public final class SongEntity implements android.os.Parcelable {
    @androidx.room.ColumnInfo(name = "song_key")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final long songPrimaryKey = 0L;
    @androidx.room.ColumnInfo(name = "playlist_creator_id")
    private final long playlistCreatorId = 0L;
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    @androidx.room.ColumnInfo(name = "track_number")
    private final int trackNumber = 0;
    private final int year = 0;
    private final long duration = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String data = null;
    @androidx.room.ColumnInfo(name = "date_modified")
    private final long dateModified = 0L;
    @androidx.room.ColumnInfo(name = "album_id")
    private final long albumId = 0L;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "album_name")
    private final java.lang.String albumName = null;
    @androidx.room.ColumnInfo(name = "artist_id")
    private final long artistId = 0L;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "artist_name")
    private final java.lang.String artistName = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String composer = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "album_artist")
    private final java.lang.String albumArtist = null;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    public final long getSongPrimaryKey() {
        return 0L;
    }
    
    public final long getPlaylistCreatorId() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final int getTrackNumber() {
        return 0;
    }
    
    public final int getYear() {
        return 0;
    }
    
    public final long getDuration() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getData() {
        return null;
    }
    
    public final long getDateModified() {
        return 0L;
    }
    
    public final long getAlbumId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAlbumName() {
        return null;
    }
    
    public final long getArtistId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getArtistName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getComposer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAlbumArtist() {
        return null;
    }
    
    public SongEntity(long songPrimaryKey, long playlistCreatorId, long id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int trackNumber, int year, long duration, @org.jetbrains.annotations.NotNull()
    java.lang.String data, long dateModified, long albumId, @org.jetbrains.annotations.NotNull()
    java.lang.String albumName, long artistId, @org.jetbrains.annotations.NotNull()
    java.lang.String artistName, @org.jetbrains.annotations.Nullable()
    java.lang.String composer, @org.jetbrains.annotations.Nullable()
    java.lang.String albumArtist) {
        super();
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