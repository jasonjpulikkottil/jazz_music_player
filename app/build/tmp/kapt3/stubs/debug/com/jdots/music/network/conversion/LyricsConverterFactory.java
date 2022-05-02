package com.jdots.music.network.conversion;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002JM\u0010\u0003\u001a\u000e\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0002\u0010\u000eJ=\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0002\b\u0003\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0002\u0010\u0012\u00a8\u0006\u0014"}, d2 = {"Lcom/jdots/music/network/conversion/LyricsConverterFactory;", "Lretrofit2/Converter$Factory;", "()V", "requestBodyConverter", "Lretrofit2/Converter;", "Lokhttp3/RequestBody;", "type", "Ljava/lang/reflect/Type;", "parameterAnnotations", "", "", "methodAnnotations", "retrofit", "Lretrofit2/Retrofit;", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;", "responseBodyConverter", "Lokhttp3/ResponseBody;", "annotations", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;", "Companion", "app_debug"})
public final class LyricsConverterFactory extends retrofit2.Converter.Factory {
    private static final okhttp3.MediaType MEDIA_TYPE = null;
    public static final com.jdots.music.network.conversion.LyricsConverterFactory.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public retrofit2.Converter<okhttp3.ResponseBody, ?> responseBodyConverter(@org.jetbrains.annotations.Nullable()
    java.lang.reflect.Type type, @org.jetbrains.annotations.Nullable()
    java.lang.annotation.Annotation[] annotations, @org.jetbrains.annotations.Nullable()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public retrofit2.Converter<?, okhttp3.RequestBody> requestBodyConverter(@org.jetbrains.annotations.Nullable()
    java.lang.reflect.Type type, @org.jetbrains.annotations.Nullable()
    java.lang.annotation.Annotation[] parameterAnnotations, @org.jetbrains.annotations.Nullable()
    java.lang.annotation.Annotation[] methodAnnotations, @org.jetbrains.annotations.Nullable()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    public LyricsConverterFactory() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/jdots/music/network/conversion/LyricsConverterFactory$Companion;", "", "()V", "MEDIA_TYPE", "Lokhttp3/MediaType;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}