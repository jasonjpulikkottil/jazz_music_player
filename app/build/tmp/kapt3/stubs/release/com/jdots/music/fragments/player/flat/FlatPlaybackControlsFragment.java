package com.jdots.music.fragments.player.flat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0016J\u001a\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\nH\u0002J\b\u0010\u001f\u001a\u00020\nH\u0002J\b\u0010 \u001a\u00020\nH\u0014J\b\u0010!\u001a\u00020\nH\u0002J\b\u0010\"\u001a\u00020\nH\u0002J\b\u0010#\u001a\u00020\nH\u0016J\b\u0010$\u001a\u00020\nH\u0002J\b\u0010%\u001a\u00020\nH\u0014J\b\u0010&\u001a\u00020\nH\u0014J\b\u0010\'\u001a\u00020\nH\u0002J\u0010\u0010(\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/jdots/music/fragments/player/flat/FlatPlaybackControlsFragment;", "Lcom/jdots/music/fragments/base/AbsPlayerControlsFragment;", "Lcom/jdots/music/helper/MusicProgressViewUpdateHelper$Callback;", "()V", "lastDisabledPlaybackControlsColor", "", "lastPlaybackControlsColor", "progressViewUpdateHelper", "Lcom/jdots/music/helper/MusicProgressViewUpdateHelper;", "hide", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onPlayStateChanged", "onPlayingMetaChanged", "onRepeatModeChanged", "onResume", "onServiceConnected", "onShuffleModeChanged", "onUpdateProgressViews", "progress", "total", "onViewCreated", "view", "Landroid/view/View;", "setColor", "color", "Lcom/jdots/music/util/color/MediaNotificationProcessor;", "setUpMusicControllers", "setUpPlayPauseFab", "setUpProgressSlider", "setUpRepeatButton", "setUpShuffleButton", "show", "updatePlayPauseDrawableState", "updateRepeatState", "updateShuffleState", "updateSong", "updateTextColors", "app_release"})
public final class FlatPlaybackControlsFragment extends com.jdots.music.fragments.base.AbsPlayerControlsFragment implements com.jdots.music.helper.MusicProgressViewUpdateHelper.Callback {
    private int lastPlaybackControlsColor = 0;
    private int lastDisabledPlaybackControlsColor = 0;
    private com.jdots.music.helper.MusicProgressViewUpdateHelper progressViewUpdateHelper;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void show() {
    }
    
    @java.lang.Override()
    public void hide() {
    }
    
    @java.lang.Override()
    public void setColor(@org.jetbrains.annotations.NotNull()
    com.jdots.music.util.color.MediaNotificationProcessor color) {
    }
    
    private final void updateTextColors(int color) {
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    @java.lang.Override()
    public void onPlayingMetaChanged() {
    }
    
    @java.lang.Override()
    public void onPlayStateChanged() {
    }
    
    private final void setUpPlayPauseFab() {
    }
    
    private final void updatePlayPauseDrawableState() {
    }
    
    private final void setUpMusicControllers() {
    }
    
    private final void updateSong() {
    }
    
    @java.lang.Override()
    public void onRepeatModeChanged() {
    }
    
    @java.lang.Override()
    public void onShuffleModeChanged() {
    }
    
    private final void setUpRepeatButton() {
    }
    
    @java.lang.Override()
    protected void updateRepeatState() {
    }
    
    private final void setUpShuffleButton() {
    }
    
    @java.lang.Override()
    protected void updateShuffleState() {
    }
    
    @java.lang.Override()
    protected void setUpProgressSlider() {
    }
    
    @java.lang.Override()
    public void onUpdateProgressViews(int progress, int total) {
    }
    
    public FlatPlaybackControlsFragment() {
        super(0);
    }
}