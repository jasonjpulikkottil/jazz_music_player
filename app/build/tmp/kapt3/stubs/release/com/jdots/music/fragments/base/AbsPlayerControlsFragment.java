package com.jdots.music.fragments.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u000f\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH$J\b\u0010\u000e\u001a\u00020\rH\u0002J\u001a\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\rH$J\b\u0010\u0018\u001a\u00020\rH$J\u000e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u001a\u001a\u00020\rH$J\b\u0010\u001b\u001a\u00020\rH$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lcom/jdots/music/fragments/base/AbsPlayerControlsFragment;", "Lcom/jdots/music/fragments/base/AbsMusicServiceFragment;", "Lcom/jdots/music/helper/MusicProgressViewUpdateHelper$Callback;", "layout", "", "(I)V", "volumeFragment", "Lcom/jdots/music/fragments/VolumeFragment;", "getVolumeFragment", "()Lcom/jdots/music/fragments/VolumeFragment;", "setVolumeFragment", "(Lcom/jdots/music/fragments/VolumeFragment;)V", "hide", "", "hideVolumeIfAvailable", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setColor", "color", "Lcom/jdots/music/util/color/MediaNotificationProcessor;", "setUpProgressSlider", "show", "showBonceAnimation", "updateRepeatState", "updateShuffleState", "Companion", "app_release"})
public abstract class AbsPlayerControlsFragment extends com.jdots.music.fragments.base.AbsMusicServiceFragment implements com.jdots.music.helper.MusicProgressViewUpdateHelper.Callback {
    @org.jetbrains.annotations.Nullable()
    private com.jdots.music.fragments.VolumeFragment volumeFragment;
    public static final long SLIDER_ANIMATION_TIME = 400L;
    public static final com.jdots.music.fragments.base.AbsPlayerControlsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    protected abstract void show();
    
    protected abstract void hide();
    
    protected abstract void updateShuffleState();
    
    protected abstract void updateRepeatState();
    
    protected abstract void setUpProgressSlider();
    
    public abstract void setColor(@org.jetbrains.annotations.NotNull()
    com.jdots.music.util.color.MediaNotificationProcessor color);
    
    public final void showBonceAnimation(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final com.jdots.music.fragments.VolumeFragment getVolumeFragment() {
        return null;
    }
    
    protected final void setVolumeFragment(@org.jetbrains.annotations.Nullable()
    com.jdots.music.fragments.VolumeFragment p0) {
    }
    
    private final void hideVolumeIfAvailable() {
    }
    
    public AbsPlayerControlsFragment(@androidx.annotation.LayoutRes()
    int layout) {
        super(0);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/jdots/music/fragments/base/AbsPlayerControlsFragment$Companion;", "", "()V", "SLIDER_ANIMATION_TIME", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}