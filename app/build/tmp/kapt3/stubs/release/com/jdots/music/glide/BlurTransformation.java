package com.jdots.music.glide;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u0018\u0019B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J*\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\rH\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/jdots/music/glide/BlurTransformation;", "Lcom/bumptech/glide/load/resource/bitmap/BitmapTransformation;", "builder", "Lcom/jdots/music/glide/BlurTransformation$Builder;", "(Lcom/jdots/music/glide/BlurTransformation$Builder;)V", "bitmapPool", "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;", "(Lcom/jdots/music/glide/BlurTransformation$Builder;Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;)V", "blurRadius", "", "context", "Landroid/content/Context;", "sampling", "", "getId", "", "init", "", "transform", "Landroid/graphics/Bitmap;", "pool", "toTransform", "outWidth", "outHeight", "Builder", "Companion", "app_release"})
public final class BlurTransformation extends com.bumptech.glide.load.resource.bitmap.BitmapTransformation {
    private android.content.Context context;
    private float blurRadius = 0.0F;
    private int sampling = 0;
    private static final float DEFAULT_BLUR_RADIUS = 5.0F;
    public static final com.jdots.music.glide.BlurTransformation.Companion Companion = null;
    
    private final void init(com.jdots.music.glide.BlurTransformation.Builder builder) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected android.graphics.Bitmap transform(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool pool, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap toTransform, int outWidth, int outHeight) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getId() {
        return null;
    }
    
    private BlurTransformation(com.jdots.music.glide.BlurTransformation.Builder builder) {
        super(null);
    }
    
    private BlurTransformation(com.jdots.music.glide.BlurTransformation.Builder builder, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0017"}, d2 = {"Lcom/jdots/music/glide/BlurTransformation$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bitmapPool", "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;", "blurRadius", "", "getBlurRadius", "()F", "setBlurRadius", "(F)V", "getContext", "()Landroid/content/Context;", "sampling", "", "getSampling", "()I", "setSampling", "(I)V", "build", "Lcom/jdots/music/glide/BlurTransformation;", "app_release"})
    public static final class Builder {
        private com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;
        private float blurRadius;
        private int sampling = 0;
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        
        public final float getBlurRadius() {
            return 0.0F;
        }
        
        public final void setBlurRadius(float p0) {
        }
        
        public final int getSampling() {
            return 0;
        }
        
        public final void setSampling(int p0) {
        }
        
        /**
         * @param blurRadius The radius to use. Must be between 0 and 25. Default is 5.
         * @return the same Builder
         */
        @org.jetbrains.annotations.NotNull()
        public final com.jdots.music.glide.BlurTransformation.Builder blurRadius(@androidx.annotation.FloatRange(from = 0.0, to = 25.0)
        float blurRadius) {
            return null;
        }
        
        /**
         * @param sampling The inSampleSize to use. Must be a power of 2, or 1 for no down sampling or 0 for auto detect sampling. Default is 0.
         * @return the same Builder
         */
        @org.jetbrains.annotations.NotNull()
        public final com.jdots.music.glide.BlurTransformation.Builder sampling(int sampling) {
            return null;
        }
        
        /**
         * @param bitmapPool The BitmapPool to use.
         * @return the same Builder
         */
        @org.jetbrains.annotations.NotNull()
        public final com.jdots.music.glide.BlurTransformation.Builder bitmapPool(@org.jetbrains.annotations.NotNull()
        com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.jdots.music.glide.BlurTransformation build() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        public Builder(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/jdots/music/glide/BlurTransformation$Companion;", "", "()V", "DEFAULT_BLUR_RADIUS", "", "getDEFAULT_BLUR_RADIUS", "()F", "app_release"})
    public static final class Companion {
        
        public final float getDEFAULT_BLUR_RADIUS() {
            return 0.0F;
        }
        
        private Companion() {
            super();
        }
    }
}