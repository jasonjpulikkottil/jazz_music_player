package com.jdots.music.activities.tageditor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J(\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0014J\b\u0010\u0018\u001a\u00020\u000fH\u0002J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0014J\b\u0010\u001c\u001a\u00020\u000fH\u0014J\u0012\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0012\u0010 \u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J(\u0010#\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0016J\b\u0010%\u001a\u00020\u000fH\u0014J\b\u0010&\u001a\u00020\u000fH\u0014J\b\u0010\'\u001a\u00020\u000fH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006)"}, d2 = {"Lcom/jdots/music/activities/tageditor/SongTagEditorActivity;", "Lcom/jdots/music/activities/tageditor/AbsTagEditorActivity;", "Landroid/text/TextWatcher;", "()V", "contentViewLayout", "", "getContentViewLayout", "()I", "songRepository", "Lcom/jdots/music/repository/SongRepository;", "getSongRepository", "()Lcom/jdots/music/repository/SongRepository;", "songRepository$delegate", "Lkotlin/Lazy;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "count", "after", "deleteImage", "fillViewsWithFileTags", "getSongPaths", "", "", "loadCurrentImage", "loadImageFromFile", "selectedFile", "Landroid/net/Uri;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onTextChanged", "before", "save", "searchImageOnWeb", "setUpViews", "Companion", "app_debug"})
public final class SongTagEditorActivity extends com.jdots.music.activities.tageditor.AbsTagEditorActivity implements android.text.TextWatcher {
    private final kotlin.Lazy songRepository$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    public static final com.jdots.music.activities.tageditor.SongTagEditorActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getContentViewLayout() {
        return 0;
    }
    
    private final com.jdots.music.repository.SongRepository getSongRepository() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpViews() {
    }
    
    private final void fillViewsWithFileTags() {
    }
    
    @java.lang.Override()
    protected void loadCurrentImage() {
    }
    
    @java.lang.Override()
    protected void searchImageOnWeb() {
    }
    
    @java.lang.Override()
    protected void deleteImage() {
    }
    
    @java.lang.Override()
    protected void save() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.util.List<java.lang.String> getSongPaths() {
        return null;
    }
    
    @java.lang.Override()
    protected void loadImageFromFile(@org.jetbrains.annotations.Nullable()
    android.net.Uri selectedFile) {
    }
    
    @java.lang.Override()
    public void beforeTextChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence s, int start, int count, int after) {
    }
    
    @java.lang.Override()
    public void onTextChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence s, int start, int before, int count) {
    }
    
    @java.lang.Override()
    public void afterTextChanged(@org.jetbrains.annotations.NotNull()
    android.text.Editable s) {
    }
    
    public SongTagEditorActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/jdots/music/activities/tageditor/SongTagEditorActivity$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}