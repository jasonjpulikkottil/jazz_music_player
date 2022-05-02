package com.jdots.music.fragments.player.circle;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010$\u001a\u00020\u0013H\u0016J\b\u0010%\u001a\u00020\u0013H\u0016J\b\u0010&\u001a\u00020\u0013H\u0016J\b\u0010\'\u001a\u00020\u0013H\u0016J\b\u0010(\u001a\u00020\u0013H\u0016J\b\u0010)\u001a\u00020\u0013H\u0016J\"\u0010*\u001a\u00020\u00132\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u0017H\u0016J\b\u0010/\u001a\u00020\u0013H\u0016J\b\u00100\u001a\u00020\u0013H\u0016J\b\u00101\u001a\u00020\u0013H\u0016J\u0012\u00102\u001a\u00020\u00132\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0012\u00103\u001a\u00020\u00132\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0018\u00104\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\r2\u0006\u00105\u001a\u00020\rH\u0016J\u001a\u00106\u001a\u00020\u00132\u0006\u00107\u001a\u00020\u001f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\n\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010:\u001a\u00020\u0013H\u0002J\b\u0010;\u001a\u00020\u0013H\u0002J\b\u0010<\u001a\u00020\u0013H\u0002J\u0006\u0010=\u001a\u00020\u0013J\b\u0010>\u001a\u00020\u0013H\u0002J\b\u0010?\u001a\u00020\rH\u0016J\b\u0010@\u001a\u00020\u0013H\u0002J\b\u0010A\u001a\u00020\u0013H\u0002J\b\u0010B\u001a\u00020\u0013H\u0002R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006C"}, d2 = {"Lcom/jdots/music/fragments/player/circle/CirclePlayerFragment;", "Lcom/jdots/music/fragments/base/AbsPlayerFragment;", "Lcom/jdots/music/helper/MusicProgressViewUpdateHelper$Callback;", "Lcom/jdots/music/volume/OnAudioVolumeChangedListener;", "Lcom/jdots/music/views/SeekArc$OnSeekArcChangeListener;", "()V", "audioManager", "Landroid/media/AudioManager;", "getAudioManager", "()Landroid/media/AudioManager;", "audioVolumeObserver", "Lcom/jdots/music/volume/AudioVolumeObserver;", "paletteColor", "", "getPaletteColor", "()I", "progressViewUpdateHelper", "Lcom/jdots/music/helper/MusicProgressViewUpdateHelper;", "onAudioVolumeChanged", "", "currentVolume", "maxVolume", "onBackPressed", "", "onColorChanged", "color", "Lcom/jdots/music/util/color/MediaNotificationProcessor;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onFavoriteToggled", "onHide", "onPause", "onPlayStateChanged", "onPlayingMetaChanged", "onProgressChanged", "seekArc", "Lcom/jdots/music/views/SeekArc;", "progress", "fromUser", "onResume", "onServiceConnected", "onShow", "onStartTrackingTouch", "onStopTrackingTouch", "onUpdateProgressViews", "total", "onViewCreated", "view", "playerToolbar", "Landroidx/appcompat/widget/Toolbar;", "setUpPlayPauseFab", "setUpPlayerToolbar", "setUpPrevNext", "setUpProgressSlider", "setupViews", "toolbarIconColor", "updatePlayPauseDrawableState", "updatePrevNextColor", "updateSong", "app_debug"})
public final class CirclePlayerFragment extends com.jdots.music.fragments.base.AbsPlayerFragment implements com.jdots.music.helper.MusicProgressViewUpdateHelper.Callback, com.jdots.music.volume.OnAudioVolumeChangedListener, com.jdots.music.views.SeekArc.OnSeekArcChangeListener {
    private com.jdots.music.helper.MusicProgressViewUpdateHelper progressViewUpdateHelper;
    private com.jdots.music.volume.AudioVolumeObserver audioVolumeObserver;
    private java.util.HashMap _$_findViewCache;
    
    private final android.media.AudioManager getAudioManager() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpPlayerToolbar() {
    }
    
    private final void setupViews() {
    }
    
    private final void setUpPrevNext() {
    }
    
    private final void updatePrevNextColor() {
    }
    
    private final void setUpPlayPauseFab() {
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
    public void onFavoriteToggled() {
    }
    
    @java.lang.Override()
    public void onPlayStateChanged() {
    }
    
    @java.lang.Override()
    public void onPlayingMetaChanged() {
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    private final void updateSong() {
    }
    
    private final void updatePlayPauseDrawableState() {
    }
    
    @java.lang.Override()
    public void onAudioVolumeChanged(int currentVolume, int maxVolume) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onProgressChanged(@org.jetbrains.annotations.Nullable()
    com.jdots.music.views.SeekArc seekArc, int progress, boolean fromUser) {
    }
    
    @java.lang.Override()
    public void onStartTrackingTouch(@org.jetbrains.annotations.Nullable()
    com.jdots.music.views.SeekArc seekArc) {
    }
    
    @java.lang.Override()
    public void onStopTrackingTouch(@org.jetbrains.annotations.Nullable()
    com.jdots.music.views.SeekArc seekArc) {
    }
    
    public final void setUpProgressSlider() {
    }
    
    @java.lang.Override()
    public void onUpdateProgressViews(int progress, int total) {
    }
    
    public CirclePlayerFragment() {
        super(0);
    }
}