package com.jdots.music.fragments.player;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0002#$B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\tH\u0016J \u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tH\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\tH\u0016J\b\u0010\u0017\u001a\u00020\u000bH\u0016J\b\u0010\u0018\u001a\u00020\u000bH\u0016J\b\u0010\u0019\u001a\u00020\u000bH\u0016J\u001a\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0006\u0010\u001f\u001a\u00020\u000bJ\u000e\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0005J\b\u0010\"\u001a\u00020\u000bH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/jdots/music/fragments/player/PlayerAlbumCoverFragment;", "Lcom/jdots/music/fragments/base/AbsMusicServiceFragment;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "()V", "callbacks", "Lcom/jdots/music/fragments/player/PlayerAlbumCoverFragment$Callbacks;", "colorReceiver", "Lcom/jdots/music/adapter/album/AlbumCoverPagerAdapter$AlbumCoverFragment$ColorReceiver;", "currentPosition", "", "notifyColorChange", "", "color", "Lcom/jdots/music/util/color/MediaNotificationProcessor;", "onDestroyView", "onPageScrollStateChanged", "state", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "onPlayingMetaChanged", "onQueueChanged", "onServiceConnected", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "removeSlideEffect", "setCallbacks", "listener", "updatePlayingQueue", "Callbacks", "Companion", "app_release"})
public final class PlayerAlbumCoverFragment extends com.jdots.music.fragments.base.AbsMusicServiceFragment implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {
    private com.jdots.music.fragments.player.PlayerAlbumCoverFragment.Callbacks callbacks;
    private int currentPosition = 0;
    private final com.jdots.music.adapter.album.AlbumCoverPagerAdapter.AlbumCoverFragment.ColorReceiver colorReceiver = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    public static final com.jdots.music.fragments.player.PlayerAlbumCoverFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final void removeSlideEffect() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    @java.lang.Override()
    public void onPlayingMetaChanged() {
    }
    
    @java.lang.Override()
    public void onQueueChanged() {
    }
    
    private final void updatePlayingQueue() {
    }
    
    @java.lang.Override()
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }
    
    @java.lang.Override()
    public void onPageSelected(int position) {
    }
    
    @java.lang.Override()
    public void onPageScrollStateChanged(int state) {
    }
    
    private final void notifyColorChange(com.jdots.music.util.color.MediaNotificationProcessor color) {
    }
    
    public final void setCallbacks(@org.jetbrains.annotations.NotNull()
    com.jdots.music.fragments.player.PlayerAlbumCoverFragment.Callbacks listener) {
    }
    
    public PlayerAlbumCoverFragment() {
        super(0);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/jdots/music/fragments/player/PlayerAlbumCoverFragment$Callbacks;", "", "onColorChanged", "", "color", "Lcom/jdots/music/util/color/MediaNotificationProcessor;", "onFavoriteToggled", "app_release"})
    public static abstract interface Callbacks {
        
        public abstract void onColorChanged(@org.jetbrains.annotations.NotNull()
        com.jdots.music.util.color.MediaNotificationProcessor color);
        
        public abstract void onFavoriteToggled();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/jdots/music/fragments/player/PlayerAlbumCoverFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_release"})
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