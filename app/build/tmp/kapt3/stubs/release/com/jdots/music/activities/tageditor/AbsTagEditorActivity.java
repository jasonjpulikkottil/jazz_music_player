package com.jdots.music.activities.tageditor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0013\b&\u0018\u0000 q2\u00020\u0001:\u0001qB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010C\u001a\u00020DH\u0004J\b\u0010E\u001a\u00020DH$J\u0010\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\bH\u0002J\b\u0010I\u001a\u00020DH\u0002J\u000e\u0010J\u001a\b\u0012\u0004\u0012\u00020\b0\"H$J\b\u0010K\u001a\u00020DH\u0002J\b\u0010L\u001a\u00020DH$J\u0012\u0010M\u001a\u00020D2\b\u0010N\u001a\u0004\u0018\u00010OH$J\"\u0010P\u001a\u00020D2\u0006\u0010Q\u001a\u00020\u00142\u0006\u0010R\u001a\u00020\u00142\b\u0010S\u001a\u0004\u0018\u00010TH\u0014J\u0012\u0010U\u001a\u00020D2\b\u0010V\u001a\u0004\u0018\u00010WH\u0014J\u0010\u0010X\u001a\u00020 2\u0006\u0010Y\u001a\u00020ZH\u0016J\b\u0010[\u001a\u00020DH$J\b\u0010\\\u001a\u00020DH$J!\u0010]\u001a\u00020D2\u0012\u0010^\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0_\"\u00020\bH\u0004\u00a2\u0006\u0002\u0010`J\u0010\u0010a\u001a\u00020D2\u0006\u0010b\u001a\u00020\u0014H\u0014J\u001a\u0010c\u001a\u00020D2\b\u0010d\u001a\u0004\u0018\u00010\u00042\u0006\u0010e\u001a\u00020\u0014H\u0004J\b\u0010f\u001a\u00020DH\u0004J\b\u0010g\u001a\u00020DH\u0002J\b\u0010h\u001a\u00020DH\u0002J\b\u0010i\u001a\u00020DH\u0002J\b\u0010j\u001a\u00020DH\u0002J\b\u0010k\u001a\u00020DH\u0002J\u0018\u0010l\u001a\u00020D2\u000e\u0010m\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\"H\u0002J&\u0010n\u001a\u00020D2\u0012\u0010o\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\b062\b\u0010p\u001a\u0004\u0018\u000103H\u0004R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\b8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\b8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\b8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0012\u0010\u0013\u001a\u00020\u0014X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\b8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\nR\u001e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b@BX\u0084\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010#\u001a\u0004\u0018\u00010\b8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010\nR\u000e\u0010%\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010&\u001a\u00020\'8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\u001a\u0010,\u001a\u00020-X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u00104\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u00105\u001a\u0010\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\b\u0018\u000106X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u00108\u001a\u0002098DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b:\u0010;R\u0016\u0010<\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010=\u001a\u0004\u0018\u00010\b8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b>\u0010\nR\u0016\u0010?\u001a\u0004\u0018\u00010\b8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b@\u0010\nR\u0016\u0010A\u001a\u0004\u0018\u00010\b8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\bB\u0010\n\u00a8\u0006r"}, d2 = {"Lcom/jdots/music/activities/tageditor/AbsTagEditorActivity;", "Lcom/jdots/music/activities/base/AbsBaseActivity;", "()V", "albumArt", "Landroid/graphics/Bitmap;", "getAlbumArt", "()Landroid/graphics/Bitmap;", "albumArtist", "", "getAlbumArtist$app_release", "()Ljava/lang/String;", "albumArtistName", "getAlbumArtistName", "albumTitle", "getAlbumTitle", "artistName", "getArtistName", "composer", "getComposer", "contentViewLayout", "", "getContentViewLayout", "()I", "currentSongPath", "genreName", "getGenreName", "<set-?>", "", "id", "getId", "()J", "isInNoImageMode", "", "items", "", "lyrics", "getLyrics", "paletteColorPrimary", "repository", "Lcom/jdots/music/repository/Repository;", "getRepository", "()Lcom/jdots/music/repository/Repository;", "repository$delegate", "Lkotlin/Lazy;", "saveFab", "Lcom/google/android/material/button/MaterialButton;", "getSaveFab", "()Lcom/google/android/material/button/MaterialButton;", "setSaveFab", "(Lcom/google/android/material/button/MaterialButton;)V", "savedArtworkInfo", "Lcom/jdots/music/model/ArtworkInfo;", "savedSongPaths", "savedTags", "", "Lorg/jaudiotagger/tag/FieldKey;", "show", "Landroidx/appcompat/app/AlertDialog;", "getShow", "()Landroidx/appcompat/app/AlertDialog;", "songPaths", "songTitle", "getSongTitle", "songYear", "getSongYear", "trackNumber", "getTrackNumber", "dataChanged", "", "deleteImage", "getAudioFile", "Lorg/jaudiotagger/audio/AudioFile;", "path", "getIntentExtras", "getSongPaths", "hideFab", "loadCurrentImage", "loadImageFromFile", "selectedFile", "Landroid/net/Uri;", "onActivityResult", "requestCode", "resultCode", "intent", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "save", "searchImageOnWeb", "searchWebFor", "keys", "", "([Ljava/lang/String;)V", "setColors", "color", "setImageBitmap", "bitmap", "bgColor", "setNoImageMode", "setUpFab", "setUpImageView", "setUpViews", "showFab", "startImagePicker", "writeTags", "paths", "writeValuesToFiles", "fieldKeyValueMap", "artworkInfo", "Companion", "app_release"})
public abstract class AbsTagEditorActivity extends com.jdots.music.activities.base.AbsBaseActivity {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy repository$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.material.button.MaterialButton saveFab;
    private long id = 0L;
    private int paletteColorPrimary = 0;
    private boolean isInNoImageMode = false;
    private java.util.List<java.lang.String> songPaths;
    private java.util.List<java.lang.String> savedSongPaths;
    private final java.lang.String currentSongPath = null;
    private java.util.Map<org.jaudiotagger.tag.FieldKey, java.lang.String> savedTags;
    private com.jdots.music.model.ArtworkInfo savedArtworkInfo;
    private java.util.List<java.lang.String> items;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_ID = "extra_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_PALETTE = "extra_palette";
    private static final java.lang.String TAG = null;
    private static final int REQUEST_CODE_SELECT_IMAGE = 1000;
    public static final com.jdots.music.activities.tageditor.AbsTagEditorActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.jdots.music.repository.Repository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.button.MaterialButton getSaveFab() {
        return null;
    }
    
    public final void setSaveFab(@org.jetbrains.annotations.NotNull()
    com.google.android.material.button.MaterialButton p0) {
    }
    
    protected final long getId() {
        return 0L;
    }
    
    protected abstract int getContentViewLayout();
    
    protected abstract void loadImageFromFile(@org.jetbrains.annotations.Nullable()
    android.net.Uri selectedFile);
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.appcompat.app.AlertDialog getShow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAlbumArtist$app_release() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.String getSongTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.String getComposer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.String getAlbumTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.String getArtistName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.String getAlbumArtistName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.String getGenreName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.String getSongYear() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.String getTrackNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.String getLyrics() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final android.graphics.Bitmap getAlbumArt() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpViews() {
    }
    
    private final void setUpImageView() {
    }
    
    private final void startImagePicker() {
    }
    
    protected abstract void loadCurrentImage();
    
    protected abstract void searchImageOnWeb();
    
    protected abstract void deleteImage();
    
    private final void setUpFab() {
    }
    
    protected abstract void save();
    
    private final void getIntentExtras() {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract java.util.List<java.lang.String> getSongPaths();
    
    protected final void searchWebFor(@org.jetbrains.annotations.NotNull()
    java.lang.String... keys) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    protected final void setNoImageMode() {
    }
    
    protected final void dataChanged() {
    }
    
    private final void showFab() {
    }
    
    private final void hideFab() {
    }
    
    protected final void setImageBitmap(@org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap bitmap, int bgColor) {
    }
    
    protected void setColors(int color) {
    }
    
    protected final void writeValuesToFiles(@org.jetbrains.annotations.NotNull()
    java.util.Map<org.jaudiotagger.tag.FieldKey, java.lang.String> fieldKeyValueMap, @org.jetbrains.annotations.Nullable()
    com.jdots.music.model.ArtworkInfo artworkInfo) {
    }
    
    private final void writeTags(java.util.List<java.lang.String> paths) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    private final org.jaudiotagger.audio.AudioFile getAudioFile(java.lang.String path) {
        return null;
    }
    
    public AbsTagEditorActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \t*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/jdots/music/activities/tageditor/AbsTagEditorActivity$Companion;", "", "()V", "EXTRA_ID", "", "EXTRA_PALETTE", "REQUEST_CODE_SELECT_IMAGE", "", "TAG", "kotlin.jvm.PlatformType", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}