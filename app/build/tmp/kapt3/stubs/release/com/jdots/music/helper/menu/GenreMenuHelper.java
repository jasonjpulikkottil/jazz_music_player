package com.jdots.music.helper.menu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0014"}, d2 = {"Lcom/jdots/music/helper/menu/GenreMenuHelper;", "Lorg/koin/core/KoinComponent;", "()V", "genreRepository", "Lcom/jdots/music/repository/GenreRepository;", "getGenreRepository", "()Lcom/jdots/music/repository/GenreRepository;", "genreRepository$delegate", "Lkotlin/Lazy;", "getGenreSongs", "", "Lcom/jdots/music/model/Song;", "genre", "Lcom/jdots/music/model/Genre;", "handleMenuClick", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "item", "Landroid/view/MenuItem;", "app_release"})
public final class GenreMenuHelper implements org.koin.core.KoinComponent {
    private static final kotlin.Lazy genreRepository$delegate = null;
    public static final com.jdots.music.helper.menu.GenreMenuHelper INSTANCE = null;
    
    private final com.jdots.music.repository.GenreRepository getGenreRepository() {
        return null;
    }
    
    public final boolean handleMenuClick(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Genre genre, @org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final java.util.List<com.jdots.music.model.Song> getGenreSongs(com.jdots.music.model.Genre genre) {
        return null;
    }
    
    private GenreMenuHelper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}