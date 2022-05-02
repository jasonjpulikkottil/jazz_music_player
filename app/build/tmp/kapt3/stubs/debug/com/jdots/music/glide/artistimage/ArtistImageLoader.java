package com.jdots.music.glide.artistimage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\u0002\u0010\u000bJ&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/jdots/music/glide/artistimage/ArtistImageLoader;", "Lcom/bumptech/glide/load/model/stream/StreamModelLoader;", "Lcom/jdots/music/glide/artistimage/ArtistImage;", "context", "Landroid/content/Context;", "deezerService", "Lcom/jdots/music/network/DeezerService;", "urlLoader", "Lcom/bumptech/glide/load/model/ModelLoader;", "Lcom/bumptech/glide/load/model/GlideUrl;", "Ljava/io/InputStream;", "(Landroid/content/Context;Lcom/jdots/music/network/DeezerService;Lcom/bumptech/glide/load/model/ModelLoader;)V", "getContext", "()Landroid/content/Context;", "getResourceFetcher", "Lcom/bumptech/glide/load/data/DataFetcher;", "model", "width", "", "height", "app_debug"})
public final class ArtistImageLoader implements com.bumptech.glide.load.model.stream.StreamModelLoader<com.jdots.music.glide.artistimage.ArtistImage> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final com.jdots.music.network.DeezerService deezerService = null;
    private final com.bumptech.glide.load.model.ModelLoader<com.bumptech.glide.load.model.GlideUrl, java.io.InputStream> urlLoader = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.bumptech.glide.load.data.DataFetcher<java.io.InputStream> getResourceFetcher(@org.jetbrains.annotations.NotNull()
    com.jdots.music.glide.artistimage.ArtistImage model, int width, int height) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public ArtistImageLoader(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.jdots.music.network.DeezerService deezerService, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.load.model.ModelLoader<com.bumptech.glide.load.model.GlideUrl, java.io.InputStream> urlLoader) {
        super();
    }
}