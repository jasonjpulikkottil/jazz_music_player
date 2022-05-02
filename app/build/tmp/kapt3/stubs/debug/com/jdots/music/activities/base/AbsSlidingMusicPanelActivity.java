package com.jdots.music.activities.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\n\b&\u0018\u0000 E2\u00020\u0001:\u0001EB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0006\u0010 \u001a\u00020\u001fJ\b\u0010!\u001a\u00020\"H$J\u0006\u0010#\u001a\u00020\u001fJ\u0006\u0010$\u001a\u00020%J\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\b\u0010\'\u001a\u00020\u000fH\u0002J\u0010\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u000fH\u0002J\b\u0010*\u001a\u00020\u001fH\u0016J\u0012\u0010+\u001a\u00020\u001f2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\b\u0010.\u001a\u00020\u001fH\u0016J\b\u0010/\u001a\u00020\u001fH\u0002J\b\u00100\u001a\u00020\u001fH\u0016J\b\u00101\u001a\u00020\u001fH\u0016J\b\u00102\u001a\u00020\u001fH\u0016J\b\u00103\u001a\u00020\u001fH\u0014J\b\u00104\u001a\u00020\u001fH\u0016J\u000e\u00105\u001a\u00020\u001f2\u0006\u00106\u001a\u00020\u0014J\u0010\u00107\u001a\u00020\u001f2\u0006\u00108\u001a\u00020\u000fH\u0016J\u0010\u00109\u001a\u00020\u001f2\u0006\u00108\u001a\u00020\u000fH\u0016J\u0010\u0010:\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010=\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020\u0014H\u0016J\u0010\u0010?\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020\u0014H\u0016J\b\u0010@\u001a\u00020\u001fH\u0002J\b\u0010A\u001a\u00020\u001fH\u0002J\b\u0010B\u001a\u00020\u001fH\u0002J\u0006\u0010C\u001a\u00020\u001fJ\b\u0010D\u001a\u00020\"H\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u00148BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006F"}, d2 = {"Lcom/jdots/music/activities/base/AbsSlidingMusicPanelActivity;", "Lcom/jdots/music/activities/base/AbsMusicServiceActivity;", "()V", "bottomSheetBehavior", "Lcom/jdots/music/RetroBottomSheetBehavior;", "Landroid/widget/FrameLayout;", "bottomSheetCallbackList", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "libraryViewModel", "Lcom/jdots/music/fragments/LibraryViewModel;", "getLibraryViewModel", "()Lcom/jdots/music/fragments/LibraryViewModel;", "libraryViewModel$delegate", "Lkotlin/Lazy;", "lightNavigationBar", "", "lightStatusBar", "miniPlayerFragment", "Lcom/jdots/music/fragments/MiniPlayerFragment;", "navigationBarColor", "", "nowPlayingScreen", "Lcom/jdots/music/fragments/NowPlayingScreen;", "paletteColor", "panelState", "getPanelState", "()I", "playerFragment", "Lcom/jdots/music/fragments/base/AbsPlayerFragment;", "taskColor", "chooseFragmentForTheme", "", "collapsePanel", "createContentView", "Landroid/view/View;", "expandPanel", "getBottomNavigationView", "Lcom/jdots/music/views/BottomNavigationBarTinted;", "getBottomSheetBehavior", "handleBackPress", "hideBottomBar", "hide", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPaletteColorChanged", "onPanelCollapsed", "onPanelExpanded", "onQueueChanged", "onResume", "onServiceConnected", "setBottomBarVisibility", "visible", "setLightNavigationBar", "enabled", "setLightStatusbar", "setMiniPlayerAlphaProgress", "progress", "", "setNavigationbarColor", "color", "setTaskDescriptionColor", "setupBottomSheet", "setupSlidingUpPanel", "updateColor", "updateTabs", "wrapSlidingMusicPanel", "Companion", "app_debug"})
public abstract class AbsSlidingMusicPanelActivity extends com.jdots.music.activities.base.AbsMusicServiceActivity {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy libraryViewModel$delegate = null;
    private com.jdots.music.RetroBottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior;
    private com.jdots.music.fragments.base.AbsPlayerFragment playerFragment;
    private com.jdots.music.fragments.MiniPlayerFragment miniPlayerFragment;
    private com.jdots.music.fragments.NowPlayingScreen nowPlayingScreen;
    private int navigationBarColor = 0;
    private int taskColor = 0;
    private boolean lightStatusBar = false;
    private boolean lightNavigationBar = false;
    private int paletteColor = android.graphics.Color.WHITE;
    private final com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback bottomSheetCallbackList = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    public static final com.jdots.music.activities.base.AbsSlidingMusicPanelActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected final com.jdots.music.fragments.LibraryViewModel getLibraryViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract android.view.View createContentView();
    
    private final int getPanelState() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jdots.music.RetroBottomSheetBehavior<android.widget.FrameLayout> getBottomSheetBehavior() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupBottomSheet() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"InflateParams"})
    protected final android.view.View wrapSlidingMusicPanel() {
        return null;
    }
    
    public final void collapsePanel() {
    }
    
    public final void expandPanel() {
    }
    
    private final void setMiniPlayerAlphaProgress(float progress) {
    }
    
    public void onPanelCollapsed() {
    }
    
    public void onPanelExpanded() {
    }
    
    private final void setupSlidingUpPanel() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jdots.music.views.BottomNavigationBarTinted getBottomNavigationView() {
        return null;
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    @java.lang.Override()
    public void onQueueChanged() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final boolean handleBackPress() {
        return false;
    }
    
    private final void onPaletteColorChanged() {
    }
    
    @java.lang.Override()
    public void setLightStatusbar(boolean enabled) {
    }
    
    @java.lang.Override()
    public void setLightNavigationBar(boolean enabled) {
    }
    
    @java.lang.Override()
    public void setNavigationbarColor(int color) {
    }
    
    @java.lang.Override()
    public void setTaskDescriptionColor(int color) {
    }
    
    public final void updateTabs() {
    }
    
    private final void updateColor() {
    }
    
    public final void setBottomBarVisibility(int visible) {
    }
    
    private final void hideBottomBar(boolean hide) {
    }
    
    private final void chooseFragmentForTheme() {
    }
    
    public AbsSlidingMusicPanelActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/jdots/music/activities/base/AbsSlidingMusicPanelActivity$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_debug"})
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