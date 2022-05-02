package com.jdots.music.fragments.player.classic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020&H\u0016J\u0010\u0010\'\u001a\u00020$2\u0006\u0010(\u001a\u00020)H\u0016J\u0012\u0010*\u001a\u00020$2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020$H\u0016J\b\u0010.\u001a\u00020$H\u0016J\b\u0010/\u001a\u00020$H\u0016JR\u00100\u001a\u00020$2\b\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\b2\u0006\u00105\u001a\u00020\b2\u0006\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\b2\u0006\u00108\u001a\u00020\b2\u0006\u00109\u001a\u00020\b2\u0006\u0010:\u001a\u00020\bH\u0016J\b\u0010;\u001a\u00020$H\u0016J\b\u0010<\u001a\u00020$H\u0016J\b\u0010=\u001a\u00020$H\u0016J\b\u0010>\u001a\u00020$H\u0016J\b\u0010?\u001a\u00020$H\u0016J\b\u0010@\u001a\u00020$H\u0016J\b\u0010A\u001a\u00020$H\u0016J\b\u0010B\u001a\u00020$H\u0016J\b\u0010C\u001a\u00020$H\u0016J\u0018\u0010D\u001a\u00020$2\u0006\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\bH\u0016J\u001a\u0010G\u001a\u00020$2\u0006\u0010H\u001a\u0002022\b\u0010+\u001a\u0004\u0018\u00010,H\u0017J\n\u0010I\u001a\u0004\u0018\u00010JH\u0016J\b\u0010K\u001a\u00020$H\u0002J\b\u0010L\u001a\u00020$H\u0002J\b\u0010M\u001a\u00020$H\u0002J\b\u0010N\u001a\u00020$H\u0002J\b\u0010O\u001a\u00020$H\u0002J\u0006\u0010P\u001a\u00020$J\b\u0010Q\u001a\u00020$H\u0002J\b\u0010R\u001a\u00020$H\u0002J\b\u0010S\u001a\u00020$H\u0002J\b\u0010T\u001a\u00020$H\u0002J\u0010\u0010U\u001a\u00020$2\u0006\u0010V\u001a\u00020WH\u0014J\b\u0010X\u001a\u00020\bH\u0016J\b\u0010Y\u001a\u00020$H\u0002J\b\u0010Z\u001a\u00020$H\u0002J\b\u0010[\u001a\u00020$H\u0002J\b\u0010\\\u001a\u00020$H\u0002J\u0006\u0010]\u001a\u00020$J\u0006\u0010^\u001a\u00020$J\b\u0010_\u001a\u00020$H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006`"}, d2 = {"Lcom/jdots/music/fragments/player/classic/ClassicPlayerFragment;", "Lcom/jdots/music/fragments/base/AbsPlayerFragment;", "Landroid/view/View$OnLayoutChangeListener;", "Lcom/jdots/music/helper/MusicProgressViewUpdateHelper$Callback;", "()V", "bottomSheetCallbackList", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "lastColor", "", "lastDisabledPlaybackControlsColor", "lastPlaybackControlsColor", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "paletteColor", "getPaletteColor", "()I", "playingQueueAdapter", "Lcom/jdots/music/adapter/song/PlayingQueueAdapter;", "progressViewUpdateHelper", "Lcom/jdots/music/helper/MusicProgressViewUpdateHelper;", "recyclerViewDragDropManager", "Lcom/h6ah4i/android/widget/advrecyclerview/draggable/RecyclerViewDragDropManager;", "recyclerViewSwipeManager", "Lcom/h6ah4i/android/widget/advrecyclerview/swipeable/RecyclerViewSwipeManager;", "recyclerViewTouchActionGuardManager", "Lcom/h6ah4i/android/widget/advrecyclerview/touchguard/RecyclerViewTouchActionGuardManager;", "shapeDrawable", "Lcom/google/android/material/shape/MaterialShapeDrawable;", "volumeFragment", "Lcom/jdots/music/fragments/VolumeFragment;", "wrappedAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "getQueuePanel", "Lcom/jdots/music/RetroBottomSheetBehavior;", "Lcom/google/android/material/card/MaterialCardView;", "hideVolumeIfAvailable", "", "onBackPressed", "", "onColorChanged", "color", "Lcom/jdots/music/util/color/MediaNotificationProcessor;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onFavoriteToggled", "onHide", "onLayoutChange", "v", "Landroid/view/View;", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "onPause", "onPlayStateChanged", "onPlayingMetaChanged", "onQueueChanged", "onRepeatModeChanged", "onResume", "onServiceConnected", "onShow", "onShuffleModeChanged", "onUpdateProgressViews", "progress", "total", "onViewCreated", "view", "playerToolbar", "Landroidx/appcompat/widget/Toolbar;", "resetToCurrentPosition", "setUpMusicControllers", "setUpPlayPauseFab", "setUpPlayerToolbar", "setUpPrevNext", "setUpProgressSlider", "setUpRepeatButton", "setUpShuffleButton", "setupPanel", "setupRecyclerView", "toggleFavorite", "song", "Lcom/jdots/music/model/Song;", "toolbarIconColor", "updatePlayPauseDrawableState", "updatePrevNextColor", "updateQueue", "updateQueuePosition", "updateRepeatState", "updateShuffleState", "updateSong", "app_debug"})
public final class ClassicPlayerFragment extends com.jdots.music.fragments.base.AbsPlayerFragment implements android.view.View.OnLayoutChangeListener, com.jdots.music.helper.MusicProgressViewUpdateHelper.Callback {
    private int lastColor = 0;
    private int lastPlaybackControlsColor = 0;
    private int lastDisabledPlaybackControlsColor = 0;
    private com.jdots.music.helper.MusicProgressViewUpdateHelper progressViewUpdateHelper;
    private com.jdots.music.fragments.VolumeFragment volumeFragment;
    private com.google.android.material.shape.MaterialShapeDrawable shapeDrawable;
    private androidx.recyclerview.widget.RecyclerView.Adapter<?> wrappedAdapter;
    private com.h6ah4i.android.widget.advrecyclerview.draggable.RecyclerViewDragDropManager recyclerViewDragDropManager;
    private com.h6ah4i.android.widget.advrecyclerview.swipeable.RecyclerViewSwipeManager recyclerViewSwipeManager;
    private com.h6ah4i.android.widget.advrecyclerview.touchguard.RecyclerViewTouchActionGuardManager recyclerViewTouchActionGuardManager;
    private com.jdots.music.adapter.song.PlayingQueueAdapter playingQueueAdapter;
    private androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
    private final com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback bottomSheetCallbackList = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void hideVolumeIfAvailable() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void updateSong() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
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
    
    @java.lang.Override()
    public void onUpdateProgressViews(int progress, int total) {
    }
    
    private final void updateQueuePosition() {
    }
    
    private final void updateQueue() {
    }
    
    private final void resetToCurrentPosition() {
    }
    
    private final com.jdots.music.RetroBottomSheetBehavior<com.google.android.material.card.MaterialCardView> getQueuePanel() {
        return null;
    }
    
    private final void setupPanel() {
    }
    
    private final void setUpPlayerToolbar() {
    }
    
    private final void setupRecyclerView() {
    }
    
    public final void setUpProgressSlider() {
    }
    
    private final void setUpPlayPauseFab() {
    }
    
    private final void updatePlayPauseDrawableState() {
    }
    
    private final void setUpMusicControllers() {
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
    
    @java.lang.Override()
    public void onLayoutChange(@org.jetbrains.annotations.Nullable()
    android.view.View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
    }
    
    public ClassicPlayerFragment() {
        super(0);
    }
}