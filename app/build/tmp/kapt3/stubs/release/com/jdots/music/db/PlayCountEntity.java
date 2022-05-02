package com.jdots.music.db;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\"\b\u0007\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0014R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u001e\u0010\u0013\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\"R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\"\u00a8\u0006)"}, d2 = {"Lcom/jdots/music/db/PlayCountEntity;", "", "id", "", "title", "", "trackNumber", "", "year", "duration", "data", "dateModified", "albumId", "albumName", "artistId", "artistName", "composer", "albumArtist", "timePlayed", "playCount", "(JLjava/lang/String;IIJLjava/lang/String;JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V", "getAlbumArtist", "()Ljava/lang/String;", "getAlbumId", "()J", "getAlbumName", "getArtistId", "getArtistName", "getComposer", "getData", "getDateModified", "getDuration", "getId", "getPlayCount", "()I", "setPlayCount", "(I)V", "getTimePlayed", "getTitle", "getTrackNumber", "getYear", "app_release"})
public final class PlayCountEntity {
    @androidx.room.PrimaryKey()
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
    @androidx.room.ColumnInfo(name = "time_played")
    private final long timePlayed = 0L;
    @androidx.room.ColumnInfo(name = "play_count")
    private int playCount;
    
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
    
    public final long getTimePlayed() {
        return 0L;
    }
    
    public final int getPlayCount() {
        return 0;
    }
    
    public final void setPlayCount(int p0) {
    }
    
    public PlayCountEntity(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int trackNumber, int year, long duration, @org.jetbrains.annotations.NotNull()
    java.lang.String data, long dateModified, long albumId, @org.jetbrains.annotations.NotNull()
    java.lang.String albumName, long artistId, @org.jetbrains.annotations.NotNull()
    java.lang.String artistName, @org.jetbrains.annotations.Nullable()
    java.lang.String composer, @org.jetbrains.annotations.Nullable()
    java.lang.String albumArtist, long timePlayed, int playCount) {
        super();
    }
}