package com.jdots.music.helper.menu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lcom/jdots/music/helper/menu/PlaylistMenuHelper;", "Lorg/koin/core/KoinComponent;", "()V", "handleMenuClick", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "playlistWithSongs", "Lcom/jdots/music/db/PlaylistWithSongs;", "item", "Landroid/view/MenuItem;", "app_release"})
public final class PlaylistMenuHelper implements org.koin.core.KoinComponent {
    public static final com.jdots.music.helper.menu.PlaylistMenuHelper INSTANCE = null;
    
    public final boolean handleMenuClick(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    com.jdots.music.db.PlaylistWithSongs playlistWithSongs, @org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private PlaylistMenuHelper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}