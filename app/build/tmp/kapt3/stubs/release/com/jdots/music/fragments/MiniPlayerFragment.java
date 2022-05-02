package com.jdots.music.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u001a\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0018\u001a\u00020\bH\u0002J\b\u0010\u0019\u001a\u00020\bH\u0002J\b\u0010\u001a\u001a\u00020\bH\u0004J\u000e\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0015J\b\u0010\u001d\u001a\u00020\bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/jdots/music/fragments/MiniPlayerFragment;", "Lcom/jdots/music/fragments/base/AbsMusicServiceFragment;", "Lcom/jdots/music/helper/MusicProgressViewUpdateHelper$Callback;", "Landroid/view/View$OnClickListener;", "()V", "progressViewUpdateHelper", "Lcom/jdots/music/helper/MusicProgressViewUpdateHelper;", "onClick", "", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onPlayStateChanged", "onPlayingMetaChanged", "onResume", "onServiceConnected", "onUpdateProgressViews", "progress", "", "total", "onViewCreated", "setUpMiniPlayer", "setUpPlayPauseButton", "updatePlayPauseDrawableState", "updateProgressBar", "paletteColor", "updateSongTitle", "FlingPlayBackController", "app_release"})
public class MiniPlayerFragment extends com.jdots.music.fragments.base.AbsMusicServiceFragment implements com.jdots.music.helper.MusicProgressViewUpdateHelper.Callback, android.view.View.OnClickListener {
    private com.jdots.music.helper.MusicProgressViewUpdateHelper progressViewUpdateHelper;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpMiniPlayer() {
    }
    
    private final void setUpPlayPauseButton() {
    }
    
    private final void updateSongTitle() {
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
    
    @java.lang.Override()
    public void onUpdateProgressViews(int progress, int total) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    protected final void updatePlayPauseDrawableState() {
    }
    
    public final void updateProgressBar(int paletteColor) {
    }
    
    public MiniPlayerFragment() {
        super(0);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/jdots/music/fragments/MiniPlayerFragment$FlingPlayBackController;", "Landroid/view/View$OnTouchListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "flingPlayBackController", "Landroid/view/GestureDetector;", "onTouch", "", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "app_release"})
    public static final class FlingPlayBackController implements android.view.View.OnTouchListener {
        private android.view.GestureDetector flingPlayBackController;
        
        @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
        @java.lang.Override()
        public boolean onTouch(@org.jetbrains.annotations.NotNull()
        android.view.View v, @org.jetbrains.annotations.NotNull()
        android.view.MotionEvent event) {
            return false;
        }
        
        public FlingPlayBackController(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
    }
}