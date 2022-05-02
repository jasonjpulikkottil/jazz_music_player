package com.jdots.music.fragments.player.full;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0015H\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\b\u0010 \u001a\u00020\u0015H\u0016J\b\u0010!\u001a\u00020\u0015H\u0016J\b\u0010\"\u001a\u00020\u0015H\u0016J\b\u0010#\u001a\u00020\u0015H\u0016J\u0018\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0016J\u001a\u0010\'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020-H\u0016J\u0012\u0010.\u001a\u00020\u00152\b\u0010/\u001a\u0004\u0018\u00010\tH\u0016J\b\u00100\u001a\u00020\u0015H\u0002J\b\u00101\u001a\u00020\u0015H\u0002J\b\u00102\u001a\u00020\u0015H\u0002J\u0010\u00103\u001a\u00020\u00152\u0006\u00104\u001a\u000205H\u0014J\b\u00106\u001a\u00020\u0007H\u0016J\b\u00107\u001a\u00020\u0015H\u0002J\b\u00108\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lcom/jdots/music/fragments/player/full/FullPlayerFragment;", "Lcom/jdots/music/fragments/base/AbsPlayerFragment;", "Lcom/jdots/music/helper/MusicProgressViewUpdateHelper$Callback;", "()V", "controlsFragment", "Lcom/jdots/music/fragments/player/full/FullPlaybackControlsFragment;", "lastColor", "", "lyrics", "Lcom/jdots/music/model/lyrics/Lyrics;", "lyricsLayout", "Landroid/widget/FrameLayout;", "lyricsLine1", "Landroid/widget/TextView;", "lyricsLine2", "paletteColor", "getPaletteColor", "()I", "progressViewUpdateHelper", "Lcom/jdots/music/helper/MusicProgressViewUpdateHelper;", "hideLyricsLayout", "", "isLyricsLayoutBound", "", "isLyricsLayoutVisible", "onBackPressed", "onColorChanged", "color", "Lcom/jdots/music/util/color/MediaNotificationProcessor;", "onDestroyView", "onFavoriteToggled", "onHide", "onPlayingMetaChanged", "onQueueChanged", "onServiceConnected", "onShow", "onUpdateProgressViews", "progress", "total", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "playerToolbar", "Landroidx/appcompat/widget/Toolbar;", "setLyrics", "l", "setUpPlayerToolbar", "setUpSubFragments", "setupArtist", "toggleFavorite", "song", "Lcom/jdots/music/model/Song;", "toolbarIconColor", "updateArtistImage", "updateLabel", "app_debug"})
public final class FullPlayerFragment extends com.jdots.music.fragments.base.AbsPlayerFragment implements com.jdots.music.helper.MusicProgressViewUpdateHelper.Callback {
    private android.widget.FrameLayout lyricsLayout;
    private android.widget.TextView lyricsLine1;
    private android.widget.TextView lyricsLine2;
    private com.jdots.music.model.lyrics.Lyrics lyrics;
    private com.jdots.music.helper.MusicProgressViewUpdateHelper progressViewUpdateHelper;
    private int lastColor = 0;
    private com.jdots.music.fragments.player.full.FullPlaybackControlsFragment controlsFragment;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onUpdateProgressViews(int progress, int total) {
    }
    
    private final boolean isLyricsLayoutVisible() {
        return false;
    }
    
    private final boolean isLyricsLayoutBound() {
        return false;
    }
    
    private final void hideLyricsLayout() {
    }
    
    @java.lang.Override()
    public void setLyrics(@org.jetbrains.annotations.Nullable()
    com.jdots.music.model.lyrics.Lyrics l) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.appcompat.widget.Toolbar playerToolbar() {
        return null;
    }
    
    @java.lang.Override()
    public int getPaletteColor() {
        return 0;
    }
    
    private final void setUpPlayerToolbar() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupArtist() {
    }
    
    private final void setUpSubFragments() {
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
    public void onColorChanged(@org.jetbrains.annotations.NotNull()
    com.jdots.music.util.color.MediaNotificationProcessor color) {
    }
    
    @java.lang.Override()
    public void onFavoriteToggled() {
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
    public void onDestroyView() {
    }
    
    private final void updateArtistImage() {
    }
    
    @java.lang.Override()
    public void onQueueChanged() {
    }
    
    private final void updateLabel() {
    }
    
    public FullPlayerFragment() {
        super(0);
    }
}