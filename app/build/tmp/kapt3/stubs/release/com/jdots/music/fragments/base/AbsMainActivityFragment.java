package com.jdots.music.fragments.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003H\u0002J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/jdots/music/fragments/base/AbsMainActivityFragment;", "Lcom/jdots/music/fragments/base/AbsMusicServiceFragment;", "layout", "", "(I)V", "libraryViewModel", "Lcom/jdots/music/fragments/LibraryViewModel;", "getLibraryViewModel", "()Lcom/jdots/music/fragments/LibraryViewModel;", "libraryViewModel$delegate", "Lkotlin/Lazy;", "mainActivity", "Lcom/jdots/music/activities/MainActivity;", "getMainActivity", "()Lcom/jdots/music/activities/MainActivity;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "setStatusBarColor", "view", "Landroid/view/View;", "color", "setStatusBarColorAuto", "app_release"})
public abstract class AbsMainActivityFragment extends com.jdots.music.fragments.base.AbsMusicServiceFragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy libraryViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.jdots.music.fragments.LibraryViewModel getLibraryViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jdots.music.activities.MainActivity getMainActivity() {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setStatusBarColor(android.view.View view, int color) {
    }
    
    public final void setStatusBarColorAuto(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public AbsMainActivityFragment(@androidx.annotation.LayoutRes()
    int layout) {
        super(0);
    }
}