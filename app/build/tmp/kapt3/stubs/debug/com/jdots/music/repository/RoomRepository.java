package com.jdots.music.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\r\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0011\u0010\u0015\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0011H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u001f\u0010$\u001a\u00020\u00032\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u001f\u0010&\u001a\u00020\u00032\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0019\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001c\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0\b0+2\u0006\u0010)\u001a\u00020\u000eH&J\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00020\'0\b2\u0006\u0010)\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001c\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0\b0+2\u0006\u0010.\u001a\u00020\u0013H&J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u0002000\bH&J\u0010\u00101\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\tH&J\u001f\u00101\u001a\u00020\u00032\f\u00102\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0019\u00103\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0019\u00104\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0011H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u001f\u00105\u001a\u00020\u00032\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u001f\u00106\u001a\b\u0012\u0004\u0012\u00020\'0\b2\u0006\u00107\u001a\u00020\'H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108J\u0014\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\b0+H&J\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010=\u001a\u00020\u00032\u0006\u00107\u001a\u00020\'H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108J!\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010AJ\u001b\u0010B\u001a\u0004\u0018\u0001002\u0006\u0010C\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010D\u001a\u00020\u00032\u0006\u0010C\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010E\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0011H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006F"}, d2 = {"Lcom/jdots/music/repository/RoomRepository;", "", "addSongToHistory", "", "currentSong", "Lcom/jdots/music/model/Song;", "(Lcom/jdots/music/model/Song;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "blackListPaths", "", "Lcom/jdots/music/db/BlackListStoreEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkPlaylistExists", "Lcom/jdots/music/db/PlaylistEntity;", "playlistName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkSongExistInPlayCount", "Lcom/jdots/music/db/PlayCountEntity;", "songId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearBlacklist", "createPlaylist", "playlistEntity", "(Lcom/jdots/music/db/PlaylistEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteBlacklistPath", "blackListStoreEntity", "(Lcom/jdots/music/db/BlackListStoreEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePlaylistEntities", "playlistEntities", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePlaylistSongs", "playlists", "deleteSongInPlayCount", "playCountEntity", "(Lcom/jdots/music/db/PlayCountEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSongs", "songs", "deleteSongsInPlaylist", "Lcom/jdots/music/db/SongEntity;", "favoritePlaylist", "favorite", "favoritePlaylistLiveData", "Landroidx/lifecycle/LiveData;", "favoritePlaylistSongs", "getSongs", "playListId", "historySongs", "Lcom/jdots/music/db/HistoryEntity;", "insertBlacklistPath", "blackListStoreEntities", "insertBlacklistPathAsync", "insertSongInPlayCount", "insertSongs", "isFavoriteSong", "songEntity", "(Lcom/jdots/music/db/SongEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observableHistorySongs", "playCountSongs", "playlistWithSongs", "Lcom/jdots/music/db/PlaylistWithSongs;", "removeSongFromPlaylist", "renamePlaylistEntity", "playlistId", "name", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "songPresentInHistory", "song", "updateHistorySong", "updateSongInPlayCount", "app_debug"})
public abstract interface RoomRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.jdots.music.db.HistoryEntity> historySongs();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.jdots.music.db.SongEntity>> favoritePlaylistLiveData(@org.jetbrains.annotations.NotNull()
    java.lang.String favorite);
    
    public abstract void insertBlacklistPath(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.BlackListStoreEntity blackListStoreEntity);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.jdots.music.db.HistoryEntity>> observableHistorySongs();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.jdots.music.db.SongEntity>> getSongs(long playListId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createPlaylist(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.PlaylistEntity playlistEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object checkPlaylistExists(@org.jetbrains.annotations.NotNull()
    java.lang.String playlistName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.db.PlaylistEntity>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object playlists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.db.PlaylistEntity>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object playlistWithSongs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.db.PlaylistWithSongs>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.db.SongEntity> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deletePlaylistEntities(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.db.PlaylistEntity> playlistEntities, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object renamePlaylistEntity(long playlistId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteSongsInPlaylist(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.db.SongEntity> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deletePlaylistSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.db.PlaylistEntity> playlists, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object favoritePlaylist(@org.jetbrains.annotations.NotNull()
    java.lang.String favorite, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jdots.music.db.PlaylistEntity> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object isFavoriteSong(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.SongEntity songEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.db.SongEntity>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object removeSongFromPlaylist(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.SongEntity songEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addSongToHistory(@org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Song currentSong, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object songPresentInHistory(@org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Song song, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jdots.music.db.HistoryEntity> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateHistorySong(@org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Song song, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object favoritePlaylistSongs(@org.jetbrains.annotations.NotNull()
    java.lang.String favorite, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.db.SongEntity>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertSongInPlayCount(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.PlayCountEntity playCountEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateSongInPlayCount(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.PlayCountEntity playCountEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteSongInPlayCount(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.PlayCountEntity playCountEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object checkSongExistInPlayCount(long songId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.db.PlayCountEntity>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object playCountSongs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.db.PlayCountEntity>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertBlacklistPath(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.db.BlackListStoreEntity> blackListStoreEntities, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteBlacklistPath(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.BlackListStoreEntity blackListStoreEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clearBlacklist(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertBlacklistPathAsync(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.BlackListStoreEntity blackListStoreEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object blackListPaths(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.db.BlackListStoreEntity>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.jdots.music.model.Song> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
}