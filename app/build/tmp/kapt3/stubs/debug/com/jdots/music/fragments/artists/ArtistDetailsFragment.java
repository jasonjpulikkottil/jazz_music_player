package com.jdots.music.fragments.artists;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001;B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001c\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u00192\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0012\u0010&\u001a\u00020\u001d2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0018\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0016J\u0012\u0010.\u001a\u00020\u001d2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0018\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0016J\u0010\u00104\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u00020\u001dH\u0002J\b\u00109\u001a\u00020\u001dH\u0002J\u000e\u0010:\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lcom/jdots/music/fragments/artists/ArtistDetailsFragment;", "Lcom/jdots/music/fragments/base/AbsMainActivityFragment;", "Lcom/jdots/music/interfaces/IAlbumClickListener;", "()V", "albumAdapter", "Lcom/jdots/music/adapter/album/HorizontalAlbumAdapter;", "arguments", "Lcom/jdots/music/fragments/artists/ArtistDetailsFragmentArgs;", "getArguments", "()Lcom/jdots/music/fragments/artists/ArtistDetailsFragmentArgs;", "arguments$delegate", "Landroidx/navigation/NavArgsLazy;", "artist", "Lcom/jdots/music/model/Artist;", "biography", "Landroid/text/Spanned;", "detailsViewModel", "Lcom/jdots/music/fragments/artists/ArtistDetailsViewModel;", "getDetailsViewModel", "()Lcom/jdots/music/fragments/artists/ArtistDetailsViewModel;", "detailsViewModel$delegate", "Lkotlin/Lazy;", "forceDownload", "", "lang", "", "songAdapter", "Lcom/jdots/music/adapter/song/SimpleSongAdapter;", "artistInfo", "", "lastFmArtist", "Lcom/jdots/music/network/model/LastFmArtist;", "handleSortOrderMenuItem", "item", "Landroid/view/MenuItem;", "loadArtistImage", "loadBiography", "name", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAlbumClick", "albumId", "", "view", "Landroid/view/View;", "onCreate", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "setColors", "color", "", "setUpTransitions", "setupRecyclerView", "showArtist", "Companion", "app_debug"})
public final class ArtistDetailsFragment extends com.jdots.music.fragments.base.AbsMainActivityFragment implements com.jdots.music.interfaces.IAlbumClickListener {
    private final androidx.navigation.NavArgsLazy arguments$delegate = null;
    private final kotlin.Lazy detailsViewModel$delegate = null;
    private com.jdots.music.model.Artist artist;
    private com.jdots.music.adapter.song.SimpleSongAdapter songAdapter;
    private com.jdots.music.adapter.album.HorizontalAlbumAdapter albumAdapter;
    private boolean forceDownload = false;
    private java.lang.String lang;
    private android.text.Spanned biography;
    public static final int REQUEST_CODE_SELECT_IMAGE = 9002;
    public static final com.jdots.music.fragments.artists.ArtistDetailsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.jdots.music.fragments.artists.ArtistDetailsFragmentArgs getArguments() {
        return null;
    }
    
    private final com.jdots.music.fragments.artists.ArtistDetailsViewModel getDetailsViewModel() {
        return null;
    }
    
    private final void setUpTransitions() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupRecyclerView() {
    }
    
    public final void showArtist(@org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Artist artist) {
    }
    
    private final void loadBiography(java.lang.String name, java.lang.String lang) {
    }
    
    private final void artistInfo(com.jdots.music.network.model.LastFmArtist lastFmArtist) {
    }
    
    private final void loadArtistImage(com.jdots.music.model.Artist artist) {
    }
    
    private final void setColors(int color) {
    }
    
    @java.lang.Override()
    public void onAlbumClick(long albumId, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final boolean handleSortOrderMenuItem(android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    public ArtistDetailsFragment() {
        super(0);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/jdots/music/fragments/artists/ArtistDetailsFragment$Companion;", "", "()V", "REQUEST_CODE_SELECT_IMAGE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}