package com.jdots.music.glide.artistimage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u001fH\u0016J\u0014\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010$\u001a\u0004\u0018\u00010%H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011\u00a8\u0006&"}, d2 = {"Lcom/jdots/music/glide/artistimage/ArtistImageFetcher;", "Lcom/bumptech/glide/load/data/DataFetcher;", "Ljava/io/InputStream;", "context", "Landroid/content/Context;", "deezerService", "Lcom/jdots/music/network/DeezerService;", "model", "Lcom/jdots/music/glide/artistimage/ArtistImage;", "urlLoader", "Lcom/bumptech/glide/load/model/ModelLoader;", "Lcom/bumptech/glide/load/model/GlideUrl;", "width", "", "height", "(Landroid/content/Context;Lcom/jdots/music/network/DeezerService;Lcom/jdots/music/glide/artistimage/ArtistImage;Lcom/bumptech/glide/load/model/ModelLoader;II)V", "getHeight", "()I", "isCancelled", "", "getModel", "()Lcom/jdots/music/glide/artistimage/ArtistImage;", "urlFetcher", "getUrlLoader", "()Lcom/bumptech/glide/load/model/ModelLoader;", "getWidth", "cancel", "", "cleanup", "getFallbackAlbumImage", "getHighestQuality", "", "imageUrl", "Lcom/jdots/music/model/Data;", "getId", "loadData", "priority", "Lcom/bumptech/glide/Priority;", "app_release"})
public final class ArtistImageFetcher implements com.bumptech.glide.load.data.DataFetcher<java.io.InputStream> {
    private com.bumptech.glide.load.data.DataFetcher<java.io.InputStream> urlFetcher;
    private boolean isCancelled = false;
    private final android.content.Context context = null;
    private final com.jdots.music.network.DeezerService deezerService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.jdots.music.glide.artistimage.ArtistImage model = null;
    @org.jetbrains.annotations.NotNull()
    private final com.bumptech.glide.load.model.ModelLoader<com.bumptech.glide.load.model.GlideUrl, java.io.InputStream> urlLoader = null;
    private final int width = 0;
    private final int height = 0;
    
    @java.lang.Override()
    public void cleanup() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getId() {
        return null;
    }
    
    @java.lang.Override()
    public void cancel() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.io.InputStream loadData(@org.jetbrains.annotations.Nullable()
    com.bumptech.glide.Priority priority) {
        return null;
    }
    
    private final java.io.InputStream getFallbackAlbumImage() {
        return null;
    }
    
    private final java.lang.String getHighestQuality(com.jdots.music.model.Data imageUrl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jdots.music.glide.artistimage.ArtistImage getModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bumptech.glide.load.model.ModelLoader<com.bumptech.glide.load.model.GlideUrl, java.io.InputStream> getUrlLoader() {
        return null;
    }
    
    public final int getWidth() {
        return 0;
    }
    
    public final int getHeight() {
        return 0;
    }
    
    public ArtistImageFetcher(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.jdots.music.network.DeezerService deezerService, @org.jetbrains.annotations.NotNull()
    com.jdots.music.glide.artistimage.ArtistImage model, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.load.model.ModelLoader<com.bumptech.glide.load.model.GlideUrl, java.io.InputStream> urlLoader, int width, int height) {
        super();
    }
}