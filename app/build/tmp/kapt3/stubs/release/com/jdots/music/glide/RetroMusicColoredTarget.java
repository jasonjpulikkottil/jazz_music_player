package com.jdots.music.glide;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\"\u0010\r\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J$\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0010\u0010\u0016\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0015\u0018\u00010\u0017H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lcom/jdots/music/glide/RetroMusicColoredTarget;", "Lcom/jdots/music/glide/palette/BitmapPaletteTarget;", "view", "Landroid/widget/ImageView;", "(Landroid/widget/ImageView;)V", "defaultFooterColor", "", "getDefaultFooterColor", "()I", "onColorReady", "", "colors", "Lcom/jdots/music/util/color/MediaNotificationProcessor;", "onLoadFailed", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorDrawable", "Landroid/graphics/drawable/Drawable;", "onResourceReady", "resource", "Lcom/jdots/music/glide/palette/BitmapPaletteWrapper;", "glideAnimation", "Lcom/bumptech/glide/request/animation/GlideAnimation;", "app_release"})
public abstract class RetroMusicColoredTarget extends com.jdots.music.glide.palette.BitmapPaletteTarget {
    
    protected final int getDefaultFooterColor() {
        return 0;
    }
    
    public abstract void onColorReady(@org.jetbrains.annotations.NotNull()
    com.jdots.music.util.color.MediaNotificationProcessor colors);
    
    @java.lang.Override()
    public void onLoadFailed(@org.jetbrains.annotations.Nullable()
    java.lang.Exception e, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable errorDrawable) {
    }
    
    @java.lang.Override()
    public void onResourceReady(@org.jetbrains.annotations.Nullable()
    com.jdots.music.glide.palette.BitmapPaletteWrapper resource, @org.jetbrains.annotations.Nullable()
    com.bumptech.glide.request.animation.GlideAnimation<? super com.jdots.music.glide.palette.BitmapPaletteWrapper> glideAnimation) {
    }
    
    public RetroMusicColoredTarget(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view) {
        super(null);
    }
}