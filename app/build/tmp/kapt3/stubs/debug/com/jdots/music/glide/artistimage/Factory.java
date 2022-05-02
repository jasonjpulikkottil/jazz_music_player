package com.jdots.music.glide.artistimage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J(\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/jdots/music/glide/artistimage/Factory;", "Lcom/bumptech/glide/load/model/ModelLoaderFactory;", "Lcom/jdots/music/glide/artistimage/ArtistImage;", "Ljava/io/InputStream;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "deezerService", "Lcom/jdots/music/network/DeezerService;", "okHttpFactory", "Lcom/bumptech/glide/integration/okhttp3/OkHttpUrlLoader$Factory;", "build", "Lcom/bumptech/glide/load/model/ModelLoader;", "factories", "Lcom/bumptech/glide/load/model/GenericLoaderFactory;", "createLogInterceptor", "Lokhttp3/Interceptor;", "teardown", "", "Companion", "app_debug"})
public final class Factory implements com.bumptech.glide.load.model.ModelLoaderFactory<com.jdots.music.glide.artistimage.ArtistImage, java.io.InputStream> {
    private com.jdots.music.network.DeezerService deezerService;
    private com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader.Factory okHttpFactory;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private static final long TIMEOUT = 700L;
    public static final com.jdots.music.glide.artistimage.Factory.Companion Companion = null;
    
    private final okhttp3.Interceptor createLogInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.bumptech.glide.load.model.ModelLoader<com.jdots.music.glide.artistimage.ArtistImage, java.io.InputStream> build(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    com.bumptech.glide.load.model.GenericLoaderFactory factories) {
        return null;
    }
    
    @java.lang.Override()
    public void teardown() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public Factory(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/jdots/music/glide/artistimage/Factory$Companion;", "", "()V", "TIMEOUT", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}