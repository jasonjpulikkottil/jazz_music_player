package com.jdots.music.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00132\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0011\u0010 \u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u0017H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0019\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u001f\u0010\'\u001a\u00020\u000e2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u001f\u0010*\u001a\u00020\u000e2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u0019\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u001cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u001f\u0010/\u001a\u00020\u000e2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u001f\u00101\u001a\u00020\u000e2\f\u00100\u001a\b\u0012\u0004\u0012\u0002020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u0019\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u001c\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u0013062\u0006\u00104\u001a\u00020\u0019H\u0016J\u001f\u00107\u001a\b\u0012\u0004\u0012\u0002020\u00132\u0006\u00104\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u001c\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u0013062\u0006\u00109\u001a\u00020\u001eH\u0016J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u0013H\u0016J\u0010\u0010<\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0014H\u0016J\u001f\u0010<\u001a\u00020\u000e2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u0019\u0010>\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0019\u0010?\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u001cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u001f\u0010@\u001a\u00020\u000e2\f\u00100\u001a\b\u0012\u0004\u0012\u0002020\u0013H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u001f\u0010A\u001a\b\u0012\u0004\u0012\u0002020\u00132\u0006\u0010B\u001a\u000202H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010CJ\u0014\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u001306H\u0016J\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u0013H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010H\u001a\u00020\u000e2\u0006\u0010B\u001a\u000202H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010CJ!\u0010I\u001a\u00020\u000e2\u0006\u0010J\u001a\u00020\u001e2\u0006\u0010K\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010LJ\u001b\u0010M\u001a\u0004\u0018\u00010;2\u0006\u0010N\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010O\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010P\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u001cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006Q"}, d2 = {"Lcom/jdots/music/repository/RealRoomRepository;", "Lcom/jdots/music/repository/RoomRepository;", "playlistDao", "Lcom/jdots/music/db/PlaylistDao;", "blackListStoreDao", "Lcom/jdots/music/db/BlackListStoreDao;", "playCountDao", "Lcom/jdots/music/db/PlayCountDao;", "historyDao", "Lcom/jdots/music/db/HistoryDao;", "lyricsDao", "Lcom/jdots/music/db/LyricsDao;", "(Lcom/jdots/music/db/PlaylistDao;Lcom/jdots/music/db/BlackListStoreDao;Lcom/jdots/music/db/PlayCountDao;Lcom/jdots/music/db/HistoryDao;Lcom/jdots/music/db/LyricsDao;)V", "addSongToHistory", "", "currentSong", "Lcom/jdots/music/model/Song;", "(Lcom/jdots/music/model/Song;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "blackListPaths", "", "Lcom/jdots/music/db/BlackListStoreEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkPlaylistExists", "Lcom/jdots/music/db/PlaylistEntity;", "playlistName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkSongExistInPlayCount", "Lcom/jdots/music/db/PlayCountEntity;", "songId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearBlacklist", "createPlaylist", "playlistEntity", "(Lcom/jdots/music/db/PlaylistEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteBlacklistPath", "blackListStoreEntity", "(Lcom/jdots/music/db/BlackListStoreEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePlaylistEntities", "playlistEntities", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePlaylistSongs", "playlists", "deleteSongInPlayCount", "playCountEntity", "(Lcom/jdots/music/db/PlayCountEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSongs", "songs", "deleteSongsInPlaylist", "Lcom/jdots/music/db/SongEntity;", "favoritePlaylist", "favorite", "favoritePlaylistLiveData", "Landroidx/lifecycle/LiveData;", "favoritePlaylistSongs", "getSongs", "playListId", "historySongs", "Lcom/jdots/music/db/HistoryEntity;", "insertBlacklistPath", "blackListStoreEntities", "insertBlacklistPathAsync", "insertSongInPlayCount", "insertSongs", "isFavoriteSong", "songEntity", "(Lcom/jdots/music/db/SongEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observableHistorySongs", "playCountSongs", "playlistWithSongs", "Lcom/jdots/music/db/PlaylistWithSongs;", "removeSongFromPlaylist", "renamePlaylistEntity", "playlistId", "name", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "songPresentInHistory", "song", "updateHistorySong", "updateSongInPlayCount", "app_debug"})
public final class RealRoomRepository implements com.jdots.music.repository.RoomRepository {
    private final com.jdots.music.db.PlaylistDao playlistDao = null;
    private final com.jdots.music.db.BlackListStoreDao blackListStoreDao = null;
    private final com.jdots.music.db.PlayCountDao playCountDao = null;
    private final com.jdots.music.db.HistoryDao historyDao = null;
    private final com.jdots.music.db.LyricsDao lyricsDao = null;
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    @java.lang.Override()
    public java.lang.Object createPlaylist(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.PlaylistEntity playlistEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    @java.lang.Override()
    public java.lang.Object checkPlaylistExists(@org.jetbrains.annotations.NotNull()
    java.lang.String playlistName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.db.PlaylistEntity>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    @java.lang.Override()
    public java.lang.Object playlists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.db.PlaylistEntity>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    @java.lang.Override()
    public java.lang.Object playlistWithSongs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.db.PlaylistWithSongs>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    @java.lang.Override()
    public java.lang.Object insertSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.db.SongEntity> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.jdots.music.db.SongEntity>> getSongs(long playListId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deletePlaylistEntities(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.db.PlaylistEntity> playlistEntities, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object renamePlaylistEntity(long playlistId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteSongsInPlaylist(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.db.SongEntity> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deletePlaylistSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.db.PlaylistEntity> playlists, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object favoritePlaylist(@org.jetbrains.annotations.NotNull()
    java.lang.String favorite, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jdots.music.db.PlaylistEntity> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object isFavoriteSong(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.SongEntity songEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.db.SongEntity>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object removeSongFromPlaylist(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.SongEntity songEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object addSongToHistory(@org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Song currentSong, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object songPresentInHistory(@org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Song song, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jdots.music.db.HistoryEntity> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateHistorySong(@org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Song song, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.jdots.music.db.HistoryEntity>> observableHistorySongs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.jdots.music.db.HistoryEntity> historySongs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.jdots.music.db.SongEntity>> favoritePlaylistLiveData(@org.jetbrains.annotations.NotNull()
    java.lang.String favorite) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object favoritePlaylistSongs(@org.jetbrains.annotations.NotNull()
    java.lang.String favorite, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.db.SongEntity>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertSongInPlayCount(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.PlayCountEntity playCountEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateSongInPlayCount(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.PlayCountEntity playCountEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteSongInPlayCount(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.PlayCountEntity playCountEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object checkSongExistInPlayCount(long songId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.db.PlayCountEntity>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object playCountSongs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.db.PlayCountEntity>> p0) {
        return null;
    }
    
    @java.lang.Override()
    public void insertBlacklistPath(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.BlackListStoreEntity blackListStoreEntity) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertBlacklistPath(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.db.BlackListStoreEntity> blackListStoreEntities, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertBlacklistPathAsync(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.BlackListStoreEntity blackListStoreEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object blackListPaths(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.db.BlackListStoreEntity>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.jdots.music.model.Song> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteBlacklistPath(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.BlackListStoreEntity blackListStoreEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object clearBlacklist(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    public RealRoomRepository(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.PlaylistDao playlistDao, @org.jetbrains.annotations.NotNull()
    com.jdots.music.db.BlackListStoreDao blackListStoreDao, @org.jetbrains.annotations.NotNull()
    com.jdots.music.db.PlayCountDao playCountDao, @org.jetbrains.annotations.NotNull()
    com.jdots.music.db.HistoryDao historyDao, @org.jetbrains.annotations.NotNull()
    com.jdots.music.db.LyricsDao lyricsDao) {
        super();
    }
}