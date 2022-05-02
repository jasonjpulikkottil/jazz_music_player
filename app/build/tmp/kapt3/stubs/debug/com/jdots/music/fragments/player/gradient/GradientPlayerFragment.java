package com.jdots.music.fragments.player.gradient;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020#2\u0006\u0010\'\u001a\u00020(H\u0016J\u0012\u0010)\u001a\u00020#2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020#H\u0016J\b\u0010-\u001a\u00020#H\u0016J\b\u0010.\u001a\u00020#H\u0016JR\u0010/\u001a\u00020#2\b\u00100\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u00020\t2\u0006\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020\t2\u0006\u00106\u001a\u00020\t2\u0006\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\t2\u0006\u00109\u001a\u00020\tH\u0016J\b\u0010:\u001a\u00020#H\u0016J\b\u0010;\u001a\u00020#H\u0016J\b\u0010<\u001a\u00020#H\u0016J\b\u0010=\u001a\u00020#H\u0016J\b\u0010>\u001a\u00020#H\u0016J\b\u0010?\u001a\u00020#H\u0016J\b\u0010@\u001a\u00020#H\u0016J\b\u0010A\u001a\u00020#H\u0016J\b\u0010B\u001a\u00020#H\u0016J\u0018\u0010C\u001a\u00020#2\u0006\u0010D\u001a\u00020\t2\u0006\u0010E\u001a\u00020\tH\u0016J\u001a\u0010F\u001a\u00020#2\u0006\u0010G\u001a\u0002012\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\n\u0010H\u001a\u0004\u0018\u00010IH\u0016J\b\u0010J\u001a\u00020#H\u0002J\b\u0010K\u001a\u00020#H\u0002J\b\u0010L\u001a\u00020#H\u0002J\b\u0010M\u001a\u00020#H\u0002J\u0006\u0010N\u001a\u00020#J\b\u0010O\u001a\u00020#H\u0002J\b\u0010P\u001a\u00020#H\u0002J\b\u0010Q\u001a\u00020#H\u0002J\b\u0010R\u001a\u00020#H\u0002J\b\u0010S\u001a\u00020#H\u0002J\b\u0010T\u001a\u00020#H\u0002J\b\u0010U\u001a\u00020#H\u0003J\u0010\u0010V\u001a\u00020#2\u0006\u0010W\u001a\u00020XH\u0014J\b\u0010Y\u001a\u00020\tH\u0016J\b\u0010Z\u001a\u00020#H\u0002J\b\u0010[\u001a\u00020#H\u0002J\b\u0010\\\u001a\u00020#H\u0002J\b\u0010]\u001a\u00020#H\u0002J\b\u0010^\u001a\u00020#H\u0002J\b\u0010_\u001a\u00020#H\u0002J\u0006\u0010`\u001a\u00020#J\u0006\u0010a\u001a\u00020#J\b\u0010b\u001a\u00020#H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006c"}, d2 = {"Lcom/jdots/music/fragments/player/gradient/GradientPlayerFragment;", "Lcom/jdots/music/fragments/base/AbsPlayerFragment;", "Lcom/jdots/music/helper/MusicProgressViewUpdateHelper$Callback;", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/widget/PopupMenu$OnMenuItemClickListener;", "()V", "bottomSheetCallbackList", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "lastColor", "", "lastDisabledPlaybackControlsColor", "lastPlaybackControlsColor", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "paletteColor", "getPaletteColor", "()I", "playingQueueAdapter", "Lcom/jdots/music/adapter/song/PlayingQueueAdapter;", "progressViewUpdateHelper", "Lcom/jdots/music/helper/MusicProgressViewUpdateHelper;", "recyclerViewDragDropManager", "Lcom/h6ah4i/android/widget/advrecyclerview/draggable/RecyclerViewDragDropManager;", "recyclerViewSwipeManager", "Lcom/h6ah4i/android/widget/advrecyclerview/swipeable/RecyclerViewSwipeManager;", "recyclerViewTouchActionGuardManager", "Lcom/h6ah4i/android/widget/advrecyclerview/touchguard/RecyclerViewTouchActionGuardManager;", "volumeFragment", "Lcom/jdots/music/fragments/VolumeFragment;", "wrappedAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "getQueuePanel", "Lcom/jdots/music/RetroBottomSheetBehavior;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "hideVolumeIfAvailable", "", "onBackPressed", "", "onColorChanged", "color", "Lcom/jdots/music/util/color/MediaNotificationProcessor;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onFavoriteToggled", "onHide", "onLayoutChange", "v", "Landroid/view/View;", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "onPause", "onPlayStateChanged", "onPlayingMetaChanged", "onQueueChanged", "onRepeatModeChanged", "onResume", "onServiceConnected", "onShow", "onShuffleModeChanged", "onUpdateProgressViews", "progress", "total", "onViewCreated", "view", "playerToolbar", "Landroidx/appcompat/widget/Toolbar;", "resetToCurrentPosition", "setUpMusicControllers", "setUpPlayPauseFab", "setUpPrevNext", "setUpProgressSlider", "setUpRepeatButton", "setUpShuffleButton", "setupFavourite", "setupMenu", "setupPanel", "setupRecyclerView", "setupSheet", "toggleFavorite", "song", "Lcom/jdots/music/model/Song;", "toolbarIconColor", "updateIsFavoriteIcon", "updateLabel", "updatePlayPauseDrawableState", "updatePrevNextColor", "updateQueue", "updateQueuePosition", "updateRepeatState", "updateShuffleState", "updateSong", "app_debug"})
public final class GradientPlayerFragment extends com.jdots.music.fragments.base.AbsPlayerFragment implements com.jdots.music.helper.MusicProgressViewUpdateHelper.Callback, android.view.View.OnLayoutChangeListener, android.widget.PopupMenu.OnMenuItemClickListener {
    private int lastColor = 0;
    private int lastPlaybackControlsColor = 0;
    private int lastDisabledPlaybackControlsColor = 0;
    private com.jdots.music.helper.MusicProgressViewUpdateHelper progressViewUpdateHelper;
    private com.jdots.music.fragments.VolumeFragment volumeFragment;
    private androidx.recyclerview.widget.RecyclerView.Adapter<?> wrappedAdapter;
    private com.h6ah4i.android.widget.advrecyclerview.draggable.RecyclerViewDragDropManager recyclerViewDragDropManager;
    private com.h6ah4i.android.widget.advrecyclerview.swipeable.RecyclerViewSwipeManager recyclerViewSwipeManager;
    private com.h6ah4i.android.widget.advrecyclerview.touchguard.RecyclerViewTouchActionGuardManager recyclerViewTouchActionGuardManager;
    private com.jdots.music.adapter.song.PlayingQueueAdapter playingQueueAdapter;
    private androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
    private final com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback bottomSheetCallbackList = null;
    private java.util.HashMap _$_findViewCache;
    
    private final void setupFavourite() {
    }
    
    private final void setupMenu() {
    }
    
    private final void setupPanel() {
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
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final void setupSheet() {
    }
    
    private final com.jdots.music.RetroBottomSheetBehavior<androidx.constraintlayout.widget.ConstraintLayout> getQueuePanel() {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.appcompat.widget.Toolbar playerToolbar() {
        return null;
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
    public int getPaletteColor() {
        return 0;
    }
    
    @java.lang.Override()
    public void onColorChanged(@org.jetbrains.annotations.NotNull()
    com.jdots.music.util.color.MediaNotificationProcessor color) {
    }
    
    @java.lang.Override()
    protected void toggleFavorite(@org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Song song) {
    }
    
    @java.lang.Override()
    public void onFavoriteToggled() {
    }
    
    private final void updateIsFavoriteIcon() {
    }
    
    private final void hideVolumeIfAvailable() {
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    @java.lang.Override()
    public void onPlayStateChanged() {
    }
    
    @java.lang.Override()
    public void onRepeatModeChanged() {
    }
    
    @java.lang.Override()
    public void onShuffleModeChanged() {
    }
    
    @java.lang.Override()
    public void onPlayingMetaChanged() {
    }
    
    @java.lang.Override()
    public void onQueueChanged() {
    }
    
    private final void updateSong() {
    }
    
    private final void setUpMusicControllers() {
    }
    
    private final void updatePlayPauseDrawableState() {
    }
    
    private final void setUpPlayPauseFab() {
    }
    
    private final void setUpPrevNext() {
    }
    
    private final void updatePrevNextColor() {
    }
    
    private final void setUpShuffleButton() {
    }
    
    public final void updateShuffleState() {
    }
    
    private final void setUpRepeatButton() {
    }
    
    public final void updateRepeatState() {
    }
    
    private final void updateLabel() {
    }
    
    @java.lang.Override()
    public void onLayoutChange(@org.jetbrains.annotations.Nullable()
    android.view.View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
    }
    
    private final void setupRecyclerView() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void updateQueuePosition() {
    }
    
    private final void updateQueue() {
    }
    
    private final void resetToCurrentPosition() {
    }
    
    public final void setUpProgressSlider() {
    }
    
    @java.lang.Override()
    public void onUpdateProgressViews(int progress, int total) {
    }
    
    public GradientPlayerFragment() {
        super(0);
    }
}