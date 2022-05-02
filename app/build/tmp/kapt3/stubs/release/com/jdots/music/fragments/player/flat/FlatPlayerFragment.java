package com.jdots.music.fragments.player.flat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\rH\u0016J\b\u0010\u0015\u001a\u00020\rH\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016J\u001a\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\rH\u0002J\b\u0010\u001f\u001a\u00020\rH\u0002J\u0010\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\"H\u0014J\b\u0010#\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/jdots/music/fragments/player/flat/FlatPlayerFragment;", "Lcom/jdots/music/fragments/base/AbsPlayerFragment;", "()V", "controlsFragment", "Lcom/jdots/music/fragments/player/flat/FlatPlaybackControlsFragment;", "lastColor", "", "paletteColor", "getPaletteColor", "()I", "valueAnimator", "Landroid/animation/ValueAnimator;", "colorize", "", "i", "onBackPressed", "", "onColorChanged", "color", "Lcom/jdots/music/util/color/MediaNotificationProcessor;", "onFavoriteToggled", "onHide", "onShow", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "playerToolbar", "Landroidx/appcompat/widget/Toolbar;", "setUpPlayerToolbar", "setUpSubFragments", "toggleFavorite", "song", "Lcom/jdots/music/model/Song;", "toolbarIconColor", "app_release"})
public final class FlatPlayerFragment extends com.jdots.music.fragments.base.AbsPlayerFragment {
    private android.animation.ValueAnimator valueAnimator;
    private com.jdots.music.fragments.player.flat.FlatPlaybackControlsFragment controlsFragment;
    private int lastColor = 0;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.appcompat.widget.Toolbar playerToolbar() {
        return null;
    }
    
    @java.lang.Override()
    public int getPaletteColor() {
        return 0;
    }
    
    private final void setUpSubFragments() {
    }
    
    private final void setUpPlayerToolbar() {
    }
    
    private final void colorize(int i) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onShow() {
    }
    
    @java.lang.Override()
    public void onHide() {
    }
    
    @java.lang.Override()
    public boolean onBackPressed() {
        return false;
    }
    
    @java.lang.Override()
    public int toolbarIconColor() {
        return 0;
    }
    
    @java.lang.Override()
    public void onColorChanged(@org.jetbrains.annotations.NotNull()
    com.jdots.music.util.color.MediaNotificationProcessor color) {
    }
    
    @java.lang.Override()
    public void onFavoriteToggled() {
    }
    
    @java.lang.Override()
    protected void toggleFavorite(@org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Song song) {
    }
    
    public FlatPlayerFragment() {
        super(0);
    }
}