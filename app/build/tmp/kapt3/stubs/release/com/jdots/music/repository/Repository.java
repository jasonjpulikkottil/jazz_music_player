package com.jdots.music.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010!\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J\u0019\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u001a\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u00120\u0019H&J\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J3\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00122\u0006\u0010\u001f\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010\u00152\b\u0010!\u001a\u0004\u0018\u00010\u0015H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u001a\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00120\u0019H&J\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\b2\u0006\u0010(\u001a\u00020\u0015H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\b2\u0006\u0010,\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\'H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101J\u001f\u00102\u001a\u00020\u00032\f\u00103\u001a\b\u0012\u0004\u0012\u00020\'0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00104J\u001f\u00105\u001a\u00020\u00032\f\u00103\u001a\b\u0012\u0004\u0012\u00020\'0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00104J\u0019\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020+H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108J\u001f\u00109\u001a\u00020\u00032\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00104J\u001f\u0010;\u001a\u00020\u00032\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00104J\u0011\u0010=\u001a\u00020\'H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0011\u0010>\u001a\u00020?H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020<0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0014\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\b0BH&J\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020\'0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001a\u0010L\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0\b0\u00120\u0019H&J\u0011\u0010M\u001a\u00020?H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010O\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010Q\u001a\u00020HH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010RJ\u000e\u0010S\u001a\b\u0012\u0004\u0012\u00020T0\bH&J\u0017\u0010U\u001a\b\u0012\u0004\u0012\u00020?0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ#\u0010V\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\b0\u00120\u0019H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010W\u001a\u00020\u00032\u0006\u00107\u001a\u00020+H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108J\u001f\u0010X\u001a\u00020\u00032\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00104J\u001f\u0010Y\u001a\b\u0012\u0004\u0012\u00020<0\b2\u0006\u0010Z\u001a\u00020<H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010[J\u0014\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0BH&J\u0017\u0010]\u001a\b\u0012\u0004\u0012\u00020+0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010Q\u001a\u00020H2\u0006\u0010^\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010`\u001a\u00020JH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010aJ\u001c\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\b0B2\u0006\u0010b\u001a\u00020\u000eH&J\u0011\u00103\u001a\u00020?H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001a\u0010c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0\b0\u00120\u0019H&J\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0011\u0010e\u001a\u00020?H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0011\u0010g\u001a\u00020?H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010i\u001a\u00020\u00032\u0006\u0010Z\u001a\u00020<H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010[J!\u0010j\u001a\u00020\u00032\u0006\u0010^\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u0015H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010kJ!\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00010m2\b\u0010n\u001a\u0004\u0018\u00010\u0015H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u001f\u0010o\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010n\u001a\u00020\u0015H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u001f\u0010p\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010n\u001a\u00020\u0015H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u001f\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010n\u001a\u00020\u0015H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u001b\u0010r\u001a\u0004\u0018\u00010T2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010s\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00120\u0019H&J\u0011\u0010t\u001a\u00020?H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010u\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0011\u0010v\u001a\u00020?H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010w\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0011\u0010x\u001a\u00020?H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010z\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010{\u001a\u00020\u00032\u0006\u00107\u001a\u00020+H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006|"}, d2 = {"Lcom/jdots/music/repository/Repository;", "", "addSongToHistory", "", "currentSong", "Lcom/jdots/music/model/Song;", "(Lcom/jdots/music/model/Song;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "albumArtists", "", "Lcom/jdots/music/model/Artist;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "albumById", "Lcom/jdots/music/model/Album;", "albumId", "", "albumByIdAsync", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "albumInfo", "Lcom/jdots/music/network/Result;", "Lcom/jdots/music/network/model/LastFmAlbum;", "artist", "", "album", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "albumsFlow", "Lkotlinx/coroutines/flow/Flow;", "allSongs", "artistById", "artistId", "artistInfo", "Lcom/jdots/music/network/model/LastFmArtist;", "name", "lang", "cache", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "artistsFlow", "blackListPaths", "Lcom/jdots/music/db/BlackListStoreEntity;", "checkPlaylistExists", "Lcom/jdots/music/db/PlaylistEntity;", "playlistName", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkSongExistInPlayCount", "Lcom/jdots/music/db/PlayCountEntity;", "songId", "contributor", "Lcom/jdots/music/model/Contributor;", "createPlaylist", "playlistEntity", "(Lcom/jdots/music/db/PlaylistEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePlaylistSongs", "playlists", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteRoomPlaylist", "deleteSongInPlayCount", "playCountEntity", "(Lcom/jdots/music/db/PlayCountEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSongs", "songs", "deleteSongsInPlaylist", "Lcom/jdots/music/db/SongEntity;", "favoritePlaylist", "favoritePlaylistHome", "Lcom/jdots/music/model/Home;", "favoritePlaylistSongs", "favorites", "Landroidx/lifecycle/LiveData;", "fetchAlbums", "fetchArtists", "fetchGenres", "Lcom/jdots/music/model/Genre;", "fetchLegacyPlaylist", "Lcom/jdots/music/model/Playlist;", "fetchPlaylistWithSongs", "Lcom/jdots/music/db/PlaylistWithSongs;", "fetchPlaylists", "genresFlow", "genresHome", "getGenre", "genreId", "getPlaylistSongs", "playlist", "(Lcom/jdots/music/model/Playlist;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "historySong", "Lcom/jdots/music/db/HistoryEntity;", "homeSections", "homeSectionsFlow", "insertSongInPlayCount", "insertSongs", "isFavoriteSong", "songEntity", "(Lcom/jdots/music/db/SongEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observableHistorySongs", "playCountSongs", "playlistId", "playlistSongs", "playlistWithSongs", "(Lcom/jdots/music/db/PlaylistWithSongs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "playListId", "playlistsFlow", "recentAlbums", "recentAlbumsHome", "recentArtists", "recentArtistsHome", "recentSongs", "removeSongFromPlaylist", "renameRoomPlaylist", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "query", "searchAlbums", "searchArtists", "searchSongs", "songPresentInHistory", "songsFlow", "suggestionsHome", "topAlbums", "topAlbumsHome", "topArtists", "topArtistsHome", "topPlayedSongs", "updateHistorySong", "updateSongInPlayCount", "app_release"})
public abstract interface Repository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.jdots.music.network.Result<java.util.List<com.jdots.music.model.Song>>> songsFlow();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.jdots.music.network.Result<java.util.List<com.jdots.music.model.Album>>> albumsFlow();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.jdots.music.network.Result<java.util.List<com.jdots.music.model.Artist>>> artistsFlow();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.jdots.music.network.Result<java.util.List<com.jdots.music.model.Playlist>>> playlistsFlow();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.jdots.music.network.Result<java.util.List<com.jdots.music.model.Genre>>> genresFlow();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.jdots.music.db.HistoryEntity> historySong();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.jdots.music.db.SongEntity>> favorites();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.jdots.music.model.Song>> observableHistorySongs();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.jdots.music.model.Album albumById(long albumId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.jdots.music.db.SongEntity>> playlistSongs(long playListId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchAlbums(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.model.Album>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object albumByIdAsync(long albumId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jdots.music.model.Album> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object allSongs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.jdots.music.model.Song>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchArtists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.model.Artist>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object albumArtists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.model.Artist>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchLegacyPlaylist(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.jdots.music.model.Playlist>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchGenres(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.model.Genre>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object search(@org.jetbrains.annotations.Nullable()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Object>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPlaylistSongs(@org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Playlist playlist, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.jdots.music.model.Song>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getGenre(long genreId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.jdots.music.model.Song>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object artistInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String lang, @org.jetbrains.annotations.Nullable()
    java.lang.String cache, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jdots.music.network.Result<? extends com.jdots.music.network.model.LastFmArtist>> p3);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object albumInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String artist, @org.jetbrains.annotations.NotNull()
    java.lang.String album, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jdots.music.network.Result<? extends com.jdots.music.network.model.LastFmAlbum>> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object artistById(long artistId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jdots.music.model.Artist> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object recentArtists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.model.Artist>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object topArtists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.model.Artist>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object topAlbums(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.model.Album>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object recentAlbums(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.model.Album>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object recentArtistsHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jdots.music.model.Home> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object topArtistsHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jdots.music.model.Home> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object topAlbumsHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jdots.music.model.Home> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object recentAlbumsHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jdots.music.model.Home> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object favoritePlaylistHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jdots.music.model.Home> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object suggestionsHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jdots.music.model.Home> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object genresHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jdots.music.model.Home> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object playlists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jdots.music.model.Home> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object homeSections(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.model.Home>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object homeSectionsFlow(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.jdots.music.network.Result<? extends java.util.List<com.jdots.music.model.Home>>>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object playlist(long playlistId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jdots.music.model.Playlist> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchPlaylistWithSongs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.db.PlaylistWithSongs>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object playlistSongs(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.PlaylistWithSongs playlistWithSongs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.jdots.music.model.Song>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.db.SongEntity> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object checkPlaylistExists(@org.jetbrains.annotations.NotNull()
    java.lang.String playlistName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.db.PlaylistEntity>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createPlaylist(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.PlaylistEntity playlistEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchPlaylists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.db.PlaylistEntity>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteRoomPlaylist(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.db.PlaylistEntity> playlists, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object renameRoomPlaylist(long playlistId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteSongsInPlaylist(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.db.SongEntity> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object removeSongFromPlaylist(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.SongEntity songEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deletePlaylistSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.db.PlaylistEntity> playlists, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object favoritePlaylist(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jdots.music.db.PlaylistEntity> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object isFavoriteSong(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.SongEntity songEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.db.SongEntity>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addSongToHistory(@org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Song currentSong, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object songPresentInHistory(@org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Song currentSong, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jdots.music.db.HistoryEntity> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateHistorySong(@org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Song currentSong, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object favoritePlaylistSongs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.db.SongEntity>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object recentSongs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.jdots.music.model.Song>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object topPlayedSongs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.jdots.music.model.Song>> p0);
    
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
    public abstract java.lang.Object blackListPaths(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.db.BlackListStoreEntity>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.jdots.music.model.Song> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object contributor(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.model.Contributor>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchArtists(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.model.Artist>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchSongs(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.jdots.music.model.Song>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchAlbums(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.model.Album>> p1);
}