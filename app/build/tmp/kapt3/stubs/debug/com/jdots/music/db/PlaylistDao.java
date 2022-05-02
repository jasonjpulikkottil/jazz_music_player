package com.jdots.music.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ!\u0010\u0012\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\u0003H\'J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00172\u0006\u0010\n\u001a\u00020\u0003H\'J\u001f\u0010\u0018\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u001b\u001a\u00020\u001cH\'J\'\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ!\u0010\"\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u001c\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00172\u0006\u0010\n\u001a\u00020\u0003H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006%"}, d2 = {"Lcom/jdots/music/db/PlaylistDao;", "", "createPlaylist", "", "playlistEntity", "Lcom/jdots/music/db/PlaylistEntity;", "(Lcom/jdots/music/db/PlaylistEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePlaylist", "", "deletePlaylistSongs", "playlistId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "songs", "", "Lcom/jdots/music/db/SongEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePlaylists", "playlistEntities", "deleteSongFromPlaylist", "songId", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "favoritesSongs", "favoritesSongsLiveData", "Landroidx/lifecycle/LiveData;", "insertSongsToPlaylist", "songEntities", "isPlaylistExists", "name", "", "isSongExistsInPlaylist", "playlists", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "playlistsWithSongs", "Lcom/jdots/music/db/PlaylistWithSongs;", "renamePlaylist", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "songsFromPlaylist", "app_debug"})
public abstract interface PlaylistDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object createPlaylist(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.PlaylistEntity playlistEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "UPDATE PlaylistEntity SET playlist_name = :name WHERE playlist_id = :playlistId")
    public abstract java.lang.Object renamePlaylist(long playlistId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM PlaylistEntity WHERE playlist_name = :name")
    public abstract java.util.List<com.jdots.music.db.PlaylistEntity> isPlaylistExists(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM PlaylistEntity")
    public abstract java.lang.Object playlists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.db.PlaylistEntity>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM SongEntity WHERE playlist_creator_id = :playlistId")
    public abstract java.lang.Object deletePlaylistSongs(long playlistId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM SongEntity WHERE playlist_creator_id = :playlistId AND id = :songId")
    public abstract java.lang.Object deleteSongFromPlaylist(long playlistId, long songId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM PlaylistEntity")
    @androidx.room.Transaction()
    public abstract java.lang.Object playlistsWithSongs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.db.PlaylistWithSongs>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertSongsToPlaylist(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.db.SongEntity> songEntities, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM SongEntity WHERE playlist_creator_id = :playlistId AND id = :songId")
    public abstract java.lang.Object isSongExistsInPlaylist(long playlistId, long songId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.db.SongEntity>> p2);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM SongEntity WHERE playlist_creator_id = :playlistId")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.jdots.music.db.SongEntity>> songsFromPlaylist(long playlistId);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deletePlaylist(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.PlaylistEntity playlistEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deletePlaylists(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.db.PlaylistEntity> playlistEntities, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deletePlaylistSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.db.SongEntity> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM SongEntity WHERE playlist_creator_id= :playlistId")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.jdots.music.db.SongEntity>> favoritesSongsLiveData(long playlistId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM SongEntity WHERE playlist_creator_id= :playlistId")
    public abstract java.util.List<com.jdots.music.db.SongEntity> favoritesSongs(long playlistId);
}