package com.jdots.music.fragments.playlists;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0012\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0014H\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u001a\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010&\u001a\u00020\u0014H\u0002J\b\u0010\'\u001a\u00020\u0014H\u0002J\b\u0010(\u001a\u00020\u0014H\u0002J\u0014\u0010)\u001a\u00020\u00142\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006,"}, d2 = {"Lcom/jdots/music/fragments/playlists/PlaylistDetailsFragment;", "Lcom/jdots/music/fragments/base/AbsMainActivityFragment;", "()V", "arguments", "Lcom/jdots/music/fragments/playlists/PlaylistDetailsFragmentArgs;", "getArguments", "()Lcom/jdots/music/fragments/playlists/PlaylistDetailsFragmentArgs;", "arguments$delegate", "Landroidx/navigation/NavArgsLazy;", "playlist", "Lcom/jdots/music/db/PlaylistWithSongs;", "playlistSongAdapter", "Lcom/jdots/music/adapter/song/PlaylistSongAdapter;", "viewModel", "Lcom/jdots/music/fragments/playlists/PlaylistDetailsViewModel;", "getViewModel", "()Lcom/jdots/music/fragments/playlists/PlaylistDetailsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "checkForPadding", "", "checkIsEmpty", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDestroy", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "Landroid/view/View;", "setUpRecyclerView", "setUpTransitions", "showEmptyView", "songs", "", "Lcom/jdots/music/model/Song;", "app_release"})
public final class PlaylistDetailsFragment extends com.jdots.music.fragments.base.AbsMainActivityFragment {
    private final androidx.navigation.NavArgsLazy arguments$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.jdots.music.db.PlaylistWithSongs playlist;
    private com.jdots.music.adapter.song.PlaylistSongAdapter playlistSongAdapter;
    private java.util.HashMap _$_findViewCache;
    
    private final com.jdots.music.fragments.playlists.PlaylistDetailsFragmentArgs getArguments() {
        return null;
    }
    
    private final com.jdots.music.fragments.playlists.PlaylistDetailsViewModel getViewModel() {
        return null;
    }
    
    private final void setUpTransitions() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpRecyclerView() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void checkForPadding() {
    }
    
    private final void checkIsEmpty() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void showEmptyView() {
    }
    
    public final void songs(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.jdots.music.model.Song> songs) {
    }
    
    public PlaylistDetailsFragment() {
        super(0);
    }
}