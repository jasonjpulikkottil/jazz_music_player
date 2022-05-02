package com.jdots.music.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b%\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001c\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\nJ\u0019\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020$H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00152\u0006\u0010&\u001a\u00020\bJ\u0014\u0010\'\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\u0006\u0010(\u001a\u00020$J\u0019\u0010)\u001a\u00020\r2\u0006\u0010#\u001a\u00020$H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\u00152\u0006\u0010&\u001a\u00020\bJ\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\n2\u0006\u0010 \u001a\u00020!H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,J\u0006\u0010-\u001a\u00020\u001fJ\u0019\u0010.\u001a\u00020$2\u0006\u0010/\u001a\u00020+H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J\u0014\u00101\u001a\u0002022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020+0\nJ\u0014\u00103\u001a\u0002022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020+0\nJ\u0014\u00104\u001a\u00020\u001f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002050\nJ\u0014\u00106\u001a\u0002022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\nJ\u0011\u00107\u001a\u00020+H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108J\u0012\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\n0\u0015J\b\u0010:\u001a\u00020\u001fH\u0002J\b\u0010;\u001a\u00020\u001fH\u0002J\u0012\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\n0\u0015J\b\u0010>\u001a\u00020\u001fH\u0002J\b\u0010?\u001a\u00020\u001fH\u0002J\b\u0010@\u001a\u00020\u001fH\u0002J\b\u0010A\u001a\u00020\u001fH\u0002J\b\u0010B\u001a\u00020\u001fH\u0002J\u000e\u0010C\u001a\u0002022\u0006\u0010D\u001a\u00020EJ\u0012\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0015J\u0012\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\u0015J\u0012\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n0\u0015J\u0012\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\n0\u0015J\u0012\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n0\u0015J\u0012\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\n0\u0015J\u0012\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\n0\u0015J\u0012\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\n0\u0015J\u0006\u0010N\u001a\u000202J\u001f\u0010O\u001a\u00020\u001f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002050\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010PJ\u001f\u0010Q\u001a\b\u0012\u0004\u0012\u0002050\n2\u0006\u0010R\u001a\u000205H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010SJ\b\u0010T\u001a\u000202H\u0002J\u0012\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\n0\u0015J\b\u0010V\u001a\u00020\u001fH\u0016J\b\u0010W\u001a\u00020\u001fH\u0016J\b\u0010X\u001a\u00020\u001fH\u0016J\b\u0010Y\u001a\u00020\u001fH\u0016J\b\u0010Z\u001a\u00020\u001fH\u0016J\b\u0010[\u001a\u00020\u001fH\u0016J\b\u0010\\\u001a\u00020\u001fH\u0016J\b\u0010]\u001a\u00020\u001fH\u0016J\u0012\u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\n0\u0015J\u0012\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\n0\u0015J\u0019\u0010`\u001a\u00020\u001f2\u0006\u0010a\u001a\u000205H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010SJ\u0016\u0010b\u001a\u0002022\u0006\u0010c\u001a\u00020$2\u0006\u0010d\u001a\u00020!J\u0010\u0010e\u001a\u0002022\b\u0010f\u001a\u0004\u0018\u00010!J\u0006\u0010g\u001a\u000202J\u000e\u0010h\u001a\u00020\u001f2\u0006\u0010i\u001a\u00020\bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006j"}, d2 = {"Lcom/jdots/music/fragments/LibraryViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/jdots/music/interfaces/IMusicServiceEventListener;", "repository", "Lcom/jdots/music/repository/RealRepository;", "(Lcom/jdots/music/repository/RealRepository;)V", "_paletteColor", "Landroidx/lifecycle/MutableLiveData;", "", "albums", "", "Lcom/jdots/music/model/Album;", "artists", "Lcom/jdots/music/model/Artist;", "genres", "Lcom/jdots/music/model/Genre;", "home", "Lcom/jdots/music/model/Home;", "legacyPlaylists", "Lcom/jdots/music/model/Playlist;", "paletteColor", "Landroidx/lifecycle/LiveData;", "getPaletteColor", "()Landroidx/lifecycle/LiveData;", "playlists", "Lcom/jdots/music/db/PlaylistWithSongs;", "searchResults", "", "songs", "Lcom/jdots/music/model/Song;", "addToPlaylist", "", "playlistName", "", "albumById", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "type", "artist", "artistId", "artistById", "checkPlaylistExists", "Lcom/jdots/music/db/PlaylistEntity;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearSearchResult", "createPlaylist", "playlistEntity", "(Lcom/jdots/music/db/PlaylistEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteRoomPlaylist", "Lkotlinx/coroutines/Job;", "deleteSongsFromPlaylist", "deleteSongsInPlaylist", "Lcom/jdots/music/db/SongEntity;", "deleteTracks", "favoritePlaylist", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "favorites", "fetchAlbums", "fetchArtists", "fetchContributors", "Lcom/jdots/music/model/Contributor;", "fetchGenres", "fetchHomeSections", "fetchLegacyPlaylist", "fetchPlaylists", "fetchSongs", "forceReload", "reloadType", "Lcom/jdots/music/fragments/ReloadType;", "getAlbums", "getArtists", "getGenre", "getHome", "getLegacyPlaylist", "getPlaylists", "getSearchResult", "getSongs", "importPlaylists", "insertSongs", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFavoriteSong", "song", "(Lcom/jdots/music/db/SongEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLibraryContent", "observableHistorySongs", "onMediaStoreChanged", "onPlayStateChanged", "onPlayingMetaChanged", "onQueueChanged", "onRepeatModeChanged", "onServiceConnected", "onServiceDisconnected", "onShuffleModeChanged", "playCountSongs", "recentSongs", "removeSongFromPlaylist", "songEntity", "renameRoomPlaylist", "playListId", "name", "search", "query", "shuffleSongs", "updateColor", "newColor", "app_release"})
public final class LibraryViewModel extends androidx.lifecycle.ViewModel implements com.jdots.music.interfaces.IMusicServiceEventListener {
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _paletteColor = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.jdots.music.model.Home>> home = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.jdots.music.model.Album>> albums = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.jdots.music.model.Song>> songs = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.jdots.music.model.Artist>> artists = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.jdots.music.db.PlaylistWithSongs>> playlists = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.jdots.music.model.Playlist>> legacyPlaylists = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.jdots.music.model.Genre>> genres = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.Object>> searchResults = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> paletteColor = null;
    private final com.jdots.music.repository.RealRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getPaletteColor() {
        return null;
    }
    
    private final kotlinx.coroutines.Job loadLibraryContent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<java.lang.Object>> getSearchResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.jdots.music.model.Song>> getSongs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.jdots.music.model.Album>> getAlbums() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.jdots.music.model.Artist>> getArtists() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.jdots.music.db.PlaylistWithSongs>> getPlaylists() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.jdots.music.model.Playlist>> getLegacyPlaylist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.jdots.music.model.Genre>> getGenre() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.jdots.music.model.Home>> getHome() {
        return null;
    }
    
    private final void fetchSongs() {
    }
    
    private final void fetchAlbums() {
    }
    
    private final void fetchArtists() {
    }
    
    private final void fetchPlaylists() {
    }
    
    private final void fetchLegacyPlaylist() {
    }
    
    private final void fetchGenres() {
    }
    
    private final void fetchHomeSections() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job search(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job forceReload(@org.jetbrains.annotations.NotNull()
    com.jdots.music.fragments.ReloadType reloadType) {
        return null;
    }
    
    public final void updateColor(int newColor) {
    }
    
    @java.lang.Override()
    public void onMediaStoreChanged() {
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    @java.lang.Override()
    public void onServiceDisconnected() {
    }
    
    @java.lang.Override()
    public void onQueueChanged() {
    }
    
    @java.lang.Override()
    public void onPlayingMetaChanged() {
    }
    
    @java.lang.Override()
    public void onPlayStateChanged() {
    }
    
    @java.lang.Override()
    public void onRepeatModeChanged() {
    }
    
    @java.lang.Override()
    public void onShuffleModeChanged() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job shuffleSongs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job renameRoomPlaylist(long playListId, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    public final void deleteSongsInPlaylist(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.db.SongEntity> songs) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteSongsFromPlaylist(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.db.PlaylistEntity> playlists) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteRoomPlaylist(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.db.PlaylistEntity> playlists) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object albumById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jdots.music.model.Album> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object artistById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jdots.music.model.Artist> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object favoritePlaylist(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jdots.music.db.PlaylistEntity> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object isFavoriteSong(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.SongEntity song, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.jdots.music.db.SongEntity>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertSongs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.db.SongEntity> songs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object removeSongFromPlaylist(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.SongEntity songEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job importPlaylists() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteTracks(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.jdots.music.model.Song> songs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.jdots.music.model.Song>> recentSongs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.jdots.music.model.Song>> playCountSongs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.jdots.music.model.Artist>> artists(int type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.jdots.music.model.Album>> albums(int type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.jdots.music.model.Artist> artist(long artistId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.jdots.music.model.Contributor>> fetchContributors() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.jdots.music.model.Song>> observableHistorySongs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.jdots.music.db.SongEntity>> favorites() {
        return null;
    }
    
    public final void clearSearchResult() {
    }
    
    public final void addToPlaylist(@org.jetbrains.annotations.NotNull()
    java.lang.String playlistName, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.jdots.music.model.Song> songs) {
    }
    
    public LibraryViewModel(@org.jetbrains.annotations.NotNull()
    com.jdots.music.repository.RealRepository repository) {
        super();
    }
}