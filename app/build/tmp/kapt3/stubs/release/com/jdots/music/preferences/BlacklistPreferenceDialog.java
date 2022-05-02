package com.jdots.music.preferences;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\fH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/jdots/music/preferences/BlacklistPreferenceDialog;", "Landroidx/fragment/app/DialogFragment;", "Lcom/jdots/music/dialogs/BlacklistFolderChooserDialog$FolderCallback;", "()V", "paths", "Ljava/util/ArrayList;", "", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onFolderSelection", "", "dialog", "Lcom/jdots/music/dialogs/BlacklistFolderChooserDialog;", "folder", "Ljava/io/File;", "refreshBlacklistData", "Companion", "app_release"})
public final class BlacklistPreferenceDialog extends androidx.fragment.app.DialogFragment implements com.jdots.music.dialogs.BlacklistFolderChooserDialog.FolderCallback {
    private java.util.ArrayList<java.lang.String> paths;
    private static android.content.Context mContext;
    private static androidx.fragment.app.FragmentActivity mActivity;
    public static final com.jdots.music.preferences.BlacklistPreferenceDialog.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void refreshBlacklistData() {
    }
    
    @java.lang.Override()
    public void onFolderSelection(@org.jetbrains.annotations.NotNull()
    com.jdots.music.dialogs.BlacklistFolderChooserDialog dialog, @org.jetbrains.annotations.NotNull()
    java.io.File folder) {
    }
    
    public BlacklistPreferenceDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/jdots/music/preferences/BlacklistPreferenceDialog$Companion;", "", "()V", "mActivity", "Landroidx/fragment/app/FragmentActivity;", "mContext", "Landroid/content/Context;", "newInstance", "Lcom/jdots/music/preferences/BlacklistPreferenceDialog;", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.jdots.music.preferences.BlacklistPreferenceDialog newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}