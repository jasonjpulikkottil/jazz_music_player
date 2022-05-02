package com.jdots.music.fragments.genres;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0014H\u0002J\u0014\u0010\'\u001a\u00020\u00142\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/jdots/music/fragments/genres/GenreDetailsFragment;", "Lcom/jdots/music/fragments/base/AbsMainActivityFragment;", "()V", "arguments", "Lcom/jdots/music/fragments/genres/GenreDetailsFragmentArgs;", "getArguments", "()Lcom/jdots/music/fragments/genres/GenreDetailsFragmentArgs;", "arguments$delegate", "Landroidx/navigation/NavArgsLazy;", "detailsViewModel", "Lcom/jdots/music/fragments/genres/GenreDetailsViewModel;", "getDetailsViewModel", "()Lcom/jdots/music/fragments/genres/GenreDetailsViewModel;", "detailsViewModel$delegate", "Lkotlin/Lazy;", "genre", "Lcom/jdots/music/model/Genre;", "songAdapter", "Lcom/jdots/music/adapter/song/SongAdapter;", "checkForPadding", "", "checkIsEmpty", "getEmojiByUnicode", "", "unicode", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "setupRecyclerView", "songs", "", "Lcom/jdots/music/model/Song;", "app_release"})
public final class GenreDetailsFragment extends com.jdots.music.fragments.base.AbsMainActivityFragment {
    private final androidx.navigation.NavArgsLazy arguments$delegate = null;
    private final kotlin.Lazy detailsViewModel$delegate = null;
    private com.jdots.music.model.Genre genre;
    private com.jdots.music.adapter.song.SongAdapter songAdapter;
    private java.util.HashMap _$_findViewCache;
    
    private final com.jdots.music.fragments.genres.GenreDetailsFragmentArgs getArguments() {
        return null;
    }
    
    private final com.jdots.music.fragments.genres.GenreDetailsViewModel getDetailsViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupRecyclerView() {
    }
    
    public final void songs(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.jdots.music.model.Song> songs) {
    }
    
    private final java.lang.String getEmojiByUnicode(int unicode) {
        return null;
    }
    
    private final void checkIsEmpty() {
    }
    
    private final void checkForPadding() {
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
    
    public GenreDetailsFragment() {
        super(0);
    }
}