package com.jdots.music.adapter.playlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 22\u0012\u0012\b\u0012\u00060\u0002R\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0001:\u000223B5\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\tH\u0014J\b\u0010\u0016\u001a\u00020\tH\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\tH\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003H\u0014J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003H\u0002J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001eH\u0002J\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0002J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00072\u0006\u0010\u001b\u001a\u00020\u0003H\u0002J\u001c\u0010$\u001a\u00020%2\n\u0010&\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\tH\u0016J\u001c\u0010\'\u001a\u00060\u0002R\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\tH\u0016J\u001e\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0014J$\u0010/\u001a\u00020%2\u0006\u0010\u0004\u001a\u00020\u00052\n\u00100\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0003H\u0002J\u0014\u00101\u001a\u00020%2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/jdots/music/adapter/playlist/PlaylistAdapter;", "Lcom/jdots/music/adapter/base/AbsMultiSelectAdapter;", "Lcom/jdots/music/adapter/playlist/PlaylistAdapter$ViewHolder;", "Lcom/jdots/music/db/PlaylistWithSongs;", "activity", "Landroidx/fragment/app/FragmentActivity;", "dataSet", "", "itemLayoutRes", "", "ICabHolder", "Lcom/jdots/music/interfaces/ICabHolder;", "listener", "Lcom/jdots/music/interfaces/IPlaylistClickListener;", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/List;ILcom/jdots/music/interfaces/ICabHolder;Lcom/jdots/music/interfaces/IPlaylistClickListener;)V", "createViewHolder", "view", "Landroid/view/View;", "getIconRes", "Landroid/graphics/drawable/Drawable;", "getIdentifier", "position", "getItemCount", "getItemId", "", "getName", "", "playlist", "getPlaylistText", "getPlaylistTitle", "Lcom/jdots/music/db/PlaylistEntity;", "getSongList", "Lcom/jdots/music/model/Song;", "playlists", "getSongs", "Lcom/jdots/music/db/SongEntity;", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onMultipleItemAction", "menuItem", "Landroid/view/MenuItem;", "selection", "playlistBitmapLoader", "viewHolder", "swapDataSet", "Companion", "ViewHolder", "app_debug"})
public final class PlaylistAdapter extends com.jdots.music.adapter.base.AbsMultiSelectAdapter<com.jdots.music.adapter.playlist.PlaylistAdapter.ViewHolder, com.jdots.music.db.PlaylistWithSongs> {
    private final androidx.fragment.app.FragmentActivity activity = null;
    private java.util.List<com.jdots.music.db.PlaylistWithSongs> dataSet;
    private int itemLayoutRes;
    private final com.jdots.music.interfaces.IPlaylistClickListener listener = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    public static final com.jdots.music.adapter.playlist.PlaylistAdapter.Companion Companion = null;
    
    public final void swapDataSet(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.db.PlaylistWithSongs> dataSet) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jdots.music.adapter.playlist.PlaylistAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jdots.music.adapter.playlist.PlaylistAdapter.ViewHolder createViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    private final java.lang.String getPlaylistTitle(com.jdots.music.db.PlaylistEntity playlist) {
        return null;
    }
    
    private final java.lang.String getPlaylistText(com.jdots.music.db.PlaylistWithSongs playlist) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.jdots.music.adapter.playlist.PlaylistAdapter.ViewHolder holder, int position) {
    }
    
    private final android.graphics.drawable.Drawable getIconRes() {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected com.jdots.music.db.PlaylistWithSongs getIdentifier(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.String getName(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.PlaylistWithSongs playlist) {
        return null;
    }
    
    @java.lang.Override()
    protected void onMultipleItemAction(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem menuItem, @org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.db.PlaylistWithSongs> selection) {
    }
    
    private final java.util.List<com.jdots.music.model.Song> getSongList(java.util.List<com.jdots.music.db.PlaylistWithSongs> playlists) {
        return null;
    }
    
    private final java.util.List<com.jdots.music.db.SongEntity> getSongs(com.jdots.music.db.PlaylistWithSongs playlist) {
        return null;
    }
    
    private final void playlistBitmapLoader(androidx.fragment.app.FragmentActivity activity, com.jdots.music.adapter.playlist.PlaylistAdapter.ViewHolder viewHolder, com.jdots.music.db.PlaylistWithSongs playlist) {
    }
    
    public PlaylistAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.db.PlaylistWithSongs> dataSet, int itemLayoutRes, @org.jetbrains.annotations.Nullable()
    com.jdots.music.interfaces.ICabHolder ICabHolder, @org.jetbrains.annotations.NotNull()
    com.jdots.music.interfaces.IPlaylistClickListener listener) {
        super(null, null, 0);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\b\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016\u00a8\u0006\n"}, d2 = {"Lcom/jdots/music/adapter/playlist/PlaylistAdapter$ViewHolder;", "Lcom/jdots/music/adapter/base/MediaEntryViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/jdots/music/adapter/playlist/PlaylistAdapter;Landroid/view/View;)V", "onClick", "", "v", "onLongClick", "", "app_debug"})
    public final class ViewHolder extends com.jdots.music.adapter.base.MediaEntryViewHolder {
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
        }
        
        @java.lang.Override()
        public boolean onLongClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
            return false;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/jdots/music/adapter/playlist/PlaylistAdapter$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_debug"})
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