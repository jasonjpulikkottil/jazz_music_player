package com.jdots.music.fragments.player.full;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0006\u0010\u0010\u001a\u00020\fJ\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\fH\u0016J\b\u0010\u0016\u001a\u00020\fH\u0016J\b\u0010\u0017\u001a\u00020\fH\u0016J\b\u0010\u0018\u001a\u00020\fH\u0016J\b\u0010\u0019\u001a\u00020\fH\u0016J\b\u0010\u001a\u001a\u00020\fH\u0016J\b\u0010\u001b\u001a\u00020\fH\u0016J\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005H\u0016J\u001a\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020!2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\fH\u0002J\b\u0010&\u001a\u00020\fH\u0002J\b\u0010\'\u001a\u00020\fH\u0002J\b\u0010(\u001a\u00020\fH\u0014J\b\u0010)\u001a\u00020\fH\u0002J\b\u0010*\u001a\u00020\fH\u0002J\b\u0010+\u001a\u00020\fH\u0002J\b\u0010,\u001a\u00020\fH\u0002J\b\u0010-\u001a\u00020\fH\u0016J\u0010\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u00020\fH\u0007J\b\u00102\u001a\u00020\fH\u0002J\b\u00103\u001a\u00020\fH\u0002J\b\u00104\u001a\u00020\fH\u0014J\b\u00105\u001a\u00020\fH\u0014J\b\u00106\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lcom/jdots/music/fragments/player/full/FullPlaybackControlsFragment;", "Lcom/jdots/music/fragments/base/AbsPlayerControlsFragment;", "Landroid/widget/PopupMenu$OnMenuItemClickListener;", "()V", "lastDisabledPlaybackControlsColor", "", "lastPlaybackControlsColor", "progressViewUpdateHelper", "Lcom/jdots/music/helper/MusicProgressViewUpdateHelper;", "updateIsFavoriteTask", "Landroid/os/AsyncTask;", "hide", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFavoriteToggled", "onMenuItemClick", "", "item", "Landroid/view/MenuItem;", "onPause", "onPlayStateChanged", "onPlayingMetaChanged", "onRepeatModeChanged", "onResume", "onServiceConnected", "onShuffleModeChanged", "onUpdateProgressViews", "progress", "total", "onViewCreated", "view", "Landroid/view/View;", "setColor", "color", "Lcom/jdots/music/util/color/MediaNotificationProcessor;", "setUpMusicControllers", "setUpPlayPauseFab", "setUpPrevNext", "setUpProgressSlider", "setUpRepeatButton", "setUpShuffleButton", "setupFavourite", "setupMenu", "show", "toggleFavorite", "song", "Lcom/jdots/music/model/Song;", "updateIsFavorite", "updatePlayPauseDrawableState", "updatePrevNextColor", "updateRepeatState", "updateShuffleState", "updateSong", "app_release"})
public final class FullPlaybackControlsFragment extends com.jdots.music.fragments.base.AbsPlayerControlsFragment implements android.widget.PopupMenu.OnMenuItemClickListener {
    private int lastPlaybackControlsColor = 0;
    private int lastDisabledPlaybackControlsColor = 0;
    private com.jdots.music.helper.MusicProgressViewUpdateHelper progressViewUpdateHelper;
    private android.os.AsyncTask<?, ?, ?> updateIsFavoriteTask;
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
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    private final void updateSong() {
    }
    
    @java.lang.Override()
    public void onPlayingMetaChanged() {
    }
    
    @java.lang.Override()
    public void onPlayStateChanged() {
    }
    
    private final void updatePlayPauseDrawableState() {
    }
    
    private final void setUpPlayPauseFab() {
    }
    
    private final void setUpMusicControllers() {
    }
    
    private final void setupMenu() {
    }
    
    @java.lang.Override()
    public boolean onMenuItemClick(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void setUpPrevNext() {
    }
    
    private final void updatePrevNextColor() {
    }
    
    @java.lang.Override()
    protected void setUpProgressSlider() {
    }
    
    @java.lang.Override()
    public void onUpdateProgressViews(int progress, int total) {
    }
    
    @java.lang.Override()
    public void onRepeatModeChanged() {
    }
    
    @java.lang.Override()
    public void onShuffleModeChanged() {
    }
    
    private final void setUpShuffleButton() {
    }
    
    @java.lang.Override()
    protected void updateShuffleState() {
    }
    
    private final void setUpRepeatButton() {
    }
    
    @java.lang.Override()
    protected void updateRepeatState() {
    }
    
    private final void setupFavourite() {
    }
    
    private final void toggleFavorite(com.jdots.music.model.Song song) {
    }
    
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    public final void updateIsFavorite() {
    }
    
    public final void onFavoriteToggled() {
    }
    
    public FullPlaybackControlsFragment() {
        super(0);
    }
}