package com.jdots.music.fragments.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u0018H\u0016J\b\u0010\u001d\u001a\u00020\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\b\u0010\u001f\u001a\u00020\u0018H\u0016J\b\u0010 \u001a\u00020\u0018H\u0016J\b\u0010!\u001a\u00020\u0018H\u0016J\b\u0010\"\u001a\u00020\u0018H\u0016J\b\u0010#\u001a\u00020\u0018H\u0016J\b\u0010$\u001a\u00020\u0018H\u0016J\u001a\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\"\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006*"}, d2 = {"Lcom/jdots/music/fragments/base/AbsMusicServiceFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/jdots/music/interfaces/IMusicServiceEventListener;", "layout", "", "(I)V", "navOptions", "Landroidx/navigation/NavOptions;", "getNavOptions", "()Landroidx/navigation/NavOptions;", "navOptions$delegate", "Lkotlin/Lazy;", "<set-?>", "Lcom/jdots/music/activities/base/AbsMusicServiceActivity;", "serviceActivity", "getServiceActivity", "()Lcom/jdots/music/activities/base/AbsMusicServiceActivity;", "getMimeType", "", "url", "getSongInfo", "song", "Lcom/jdots/music/model/Song;", "onAttach", "", "context", "Landroid/content/Context;", "onDestroyView", "onDetach", "onMediaStoreChanged", "onPlayStateChanged", "onPlayingMetaChanged", "onQueueChanged", "onRepeatModeChanged", "onServiceConnected", "onServiceDisconnected", "onShuffleModeChanged", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_release"})
public class AbsMusicServiceFragment extends androidx.fragment.app.Fragment implements com.jdots.music.interfaces.IMusicServiceEventListener {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy navOptions$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.jdots.music.activities.base.AbsMusicServiceActivity serviceActivity;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.navigation.NavOptions getNavOptions() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.jdots.music.activities.base.AbsMusicServiceActivity getServiceActivity() {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onDetach() {
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
    public void onPlayingMetaChanged() {
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    @java.lang.Override()
    public void onServiceDisconnected() {
    }
    
    @java.lang.Override()
    public void onQueueChanged() {
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
    public void onMediaStoreChanged() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSongInfo(@org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Song song) {
        return null;
    }
    
    private final java.lang.String getMimeType(java.lang.String url) {
        return null;
    }
    
    public AbsMusicServiceFragment(@androidx.annotation.LayoutRes()
    int layout) {
        super();
    }
}