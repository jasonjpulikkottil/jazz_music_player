package com.jdots.music.fragments.player.tiny;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016J\u001a\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0002J\b\u0010\u0017\u001a\u00020\u0007H\u0014J\b\u0010\u0018\u001a\u00020\u0007H\u0002J\b\u0010\u0019\u001a\u00020\u0007H\u0002J\b\u0010\u001a\u001a\u00020\u0007H\u0014J\b\u0010\u001b\u001a\u00020\u0007H\u0014J\b\u0010\u001c\u001a\u00020\u0007H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/jdots/music/fragments/player/tiny/TinyPlaybackControlsFragment;", "Lcom/jdots/music/fragments/base/AbsPlayerControlsFragment;", "()V", "lastDisabledPlaybackControlsColor", "", "lastPlaybackControlsColor", "hide", "", "onRepeatModeChanged", "onServiceConnected", "onShuffleModeChanged", "onUpdateProgressViews", "progress", "total", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setColor", "color", "Lcom/jdots/music/util/color/MediaNotificationProcessor;", "setUpMusicControllers", "setUpProgressSlider", "setUpRepeatButton", "setUpShuffleButton", "show", "updateRepeatState", "updateShuffleState", "app_debug"})
public final class TinyPlaybackControlsFragment extends com.jdots.music.fragments.base.AbsPlayerControlsFragment {
    private int lastPlaybackControlsColor = 0;
    private int lastDisabledPlaybackControlsColor = 0;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void show() {
    }
    
    @java.lang.Override()
    protected void hide() {
    }
    
    @java.lang.Override()
    protected void setUpProgressSlider() {
    }
    
    @java.lang.Override()
    public void setColor(@org.jetbrains.annotations.NotNull()
    com.jdots.music.util.color.MediaNotificationProcessor color) {
    }
    
    @java.lang.Override()
    public void onUpdateProgressViews(int progress, int total) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpMusicControllers() {
    }
    
    private final void setUpShuffleButton() {
    }
    
    private final void setUpRepeatButton() {
    }
    
    @java.lang.Override()
    protected void updateShuffleState() {
    }
    
    @java.lang.Override()
    protected void updateRepeatState() {
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    @java.lang.Override()
    public void onRepeatModeChanged() {
    }
    
    @java.lang.Override()
    public void onShuffleModeChanged() {
    }
    
    public TinyPlaybackControlsFragment() {
        super(0);
    }
}