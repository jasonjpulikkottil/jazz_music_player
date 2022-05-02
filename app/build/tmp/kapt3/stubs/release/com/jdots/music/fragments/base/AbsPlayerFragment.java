package com.jdots.music.fragments.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 &2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001&B\u000f\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0004J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u000fH&J\u001a\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH&J\u0012\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\"H\u0014J\b\u0010#\u001a\u00020\u0006H&J\u0006\u0010$\u001a\u00020\u000fJ\b\u0010%\u001a\u00020\u000fH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/jdots/music/fragments/base/AbsPlayerFragment;", "Lcom/jdots/music/fragments/base/AbsMainActivityFragment;", "Landroidx/appcompat/widget/Toolbar$OnMenuItemClickListener;", "Lcom/jdots/music/interfaces/IPaletteColorHolder;", "Lcom/jdots/music/fragments/player/PlayerAlbumCoverFragment$Callbacks;", "layout", "", "(I)V", "playerAlbumCoverFragment", "Lcom/jdots/music/fragments/player/PlayerAlbumCoverFragment;", "getUpNextAndQueueTime", "", "onBackPressed", "", "onHide", "", "onMenuItemClick", "item", "Landroid/view/MenuItem;", "onPlayingMetaChanged", "onServiceConnected", "onShow", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "playerToolbar", "Landroidx/appcompat/widget/Toolbar;", "setLyrics", "l", "Lcom/jdots/music/model/lyrics/Lyrics;", "toggleFavorite", "song", "Lcom/jdots/music/model/Song;", "toolbarIconColor", "updateIsFavorite", "updateLyrics", "Companion", "app_release"})
public abstract class AbsPlayerFragment extends com.jdots.music.fragments.base.AbsMainActivityFragment implements androidx.appcompat.widget.Toolbar.OnMenuItemClickListener, com.jdots.music.interfaces.IPaletteColorHolder, com.jdots.music.fragments.player.PlayerAlbumCoverFragment.Callbacks {
    private com.jdots.music.fragments.player.PlayerAlbumCoverFragment playerAlbumCoverFragment;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    public static final long VISIBILITY_ANIM_DURATION = 300L;
    public static final com.jdots.music.fragments.base.AbsPlayerFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public boolean onMenuItemClick(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract androidx.appcompat.widget.Toolbar playerToolbar();
    
    public abstract void onShow();
    
    public abstract void onHide();
    
    public abstract boolean onBackPressed();
    
    public abstract int toolbarIconColor();
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    @java.lang.Override()
    public void onPlayingMetaChanged() {
    }
    
    protected void toggleFavorite(@org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Song song) {
    }
    
    public final void updateIsFavorite() {
    }
    
    private final void updateLyrics() {
    }
    
    public void setLyrics(@org.jetbrains.annotations.Nullable()
    com.jdots.music.model.lyrics.Lyrics l) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.String getUpNextAndQueueTime() {
        return null;
    }
    
    public AbsPlayerFragment(@androidx.annotation.LayoutRes()
    int layout) {
        super(0);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/jdots/music/fragments/base/AbsPlayerFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "VISIBILITY_ANIM_DURATION", "", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}