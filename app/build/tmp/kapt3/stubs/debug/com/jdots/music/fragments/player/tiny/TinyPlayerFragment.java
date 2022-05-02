package com.jdots.music.fragments.player.tiny;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0016J\b\u0010\u0018\u001a\u00020\u0011H\u0016J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\b\u0010\u001d\u001a\u00020\u0011H\u0016J\u0018\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0016J\u001a\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0011H\u0002J\b\u0010\'\u001a\u00020\u0011H\u0002J\u0010\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020*H\u0014J\b\u0010+\u001a\u00020\u0007H\u0016J\b\u0010,\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/jdots/music/fragments/player/tiny/TinyPlayerFragment;", "Lcom/jdots/music/fragments/base/AbsPlayerFragment;", "Lcom/jdots/music/helper/MusicProgressViewUpdateHelper$Callback;", "()V", "controlsFragment", "Lcom/jdots/music/fragments/player/tiny/TinyPlaybackControlsFragment;", "lastColor", "", "paletteColor", "getPaletteColor", "()I", "progressViewUpdateHelper", "Lcom/jdots/music/helper/MusicProgressViewUpdateHelper;", "toolbarColor", "onBackPressed", "", "onColorChanged", "", "color", "Lcom/jdots/music/util/color/MediaNotificationProcessor;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFavoriteToggled", "onHide", "onPause", "onPlayingMetaChanged", "onResume", "onServiceConnected", "onShow", "onUpdateProgressViews", "progress", "total", "onViewCreated", "view", "Landroid/view/View;", "playerToolbar", "Landroidx/appcompat/widget/Toolbar;", "setUpPlayerToolbar", "setUpSubFragments", "toggleFavorite", "song", "Lcom/jdots/music/model/Song;", "toolbarIconColor", "updateSong", "app_debug"})
public final class TinyPlayerFragment extends com.jdots.music.fragments.base.AbsPlayerFragment implements com.jdots.music.helper.MusicProgressViewUpdateHelper.Callback {
    private int lastColor = 0;
    private int toolbarColor = 0;
    private com.jdots.music.fragments.player.tiny.TinyPlaybackControlsFragment controlsFragment;
    private com.jdots.music.helper.MusicProgressViewUpdateHelper progressViewUpdateHelper;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
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
    public void onFavoriteToggled() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    private final void updateSong() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpSubFragments() {
    }
    
    private final void setUpPlayerToolbar() {
    }
    
    @java.lang.Override()
    protected void toggleFavorite(@org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Song song) {
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    @java.lang.Override()
    public void onPlayingMetaChanged() {
    }
    
    @java.lang.Override()
    public void onUpdateProgressViews(int progress, int total) {
    }
    
    public TinyPlayerFragment() {
        super(0);
    }
}