package com.jdots.music.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0002J\u0016\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/jdots/music/dialogs/AddToPlaylistDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "libraryViewModel", "Lcom/jdots/music/fragments/LibraryViewModel;", "getLibraryViewModel", "()Lcom/jdots/music/fragments/LibraryViewModel;", "libraryViewModel$delegate", "Lkotlin/Lazy;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "playlistAdapter", "Landroid/widget/ArrayAdapter;", "", "playlists", "", "showCreateDialog", "", "songs", "Lcom/jdots/music/model/Song;", "Companion", "app_release"})
public final class AddToPlaylistDialog extends androidx.fragment.app.DialogFragment {
    private final kotlin.Lazy libraryViewModel$delegate = null;
    public static final com.jdots.music.dialogs.AddToPlaylistDialog.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.jdots.music.fragments.LibraryViewModel getLibraryViewModel() {
        return null;
    }
    
    private final android.widget.ArrayAdapter<java.lang.String> playlistAdapter(java.util.List<java.lang.String> playlists) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void showCreateDialog(java.util.List<? extends com.jdots.music.model.Song> songs) {
    }
    
    public AddToPlaylistDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\"\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/jdots/music/dialogs/AddToPlaylistDialog$Companion;", "", "()V", "create", "Lcom/jdots/music/dialogs/AddToPlaylistDialog;", "playlistEntities", "", "Lcom/jdots/music/db/PlaylistEntity;", "song", "Lcom/jdots/music/model/Song;", "songs", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.jdots.music.dialogs.AddToPlaylistDialog create(@org.jetbrains.annotations.NotNull()
        java.util.List<com.jdots.music.db.PlaylistEntity> playlistEntities, @org.jetbrains.annotations.NotNull()
        com.jdots.music.model.Song song) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.jdots.music.dialogs.AddToPlaylistDialog create(@org.jetbrains.annotations.NotNull()
        java.util.List<com.jdots.music.db.PlaylistEntity> playlistEntities, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.jdots.music.model.Song> songs) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}