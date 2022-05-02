package com.jdots.music.adapter.playlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tH\u0016J\u0014\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/jdots/music/adapter/playlist/LegacyPlaylistAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/jdots/music/adapter/playlist/LegacyPlaylistAdapter$ViewHolder;", "activity", "Landroidx/fragment/app/FragmentActivity;", "list", "", "Lcom/jdots/music/model/Playlist;", "layoutRes", "", "playlistClickListener", "Lcom/jdots/music/adapter/playlist/LegacyPlaylistAdapter$PlaylistClickListener;", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/List;ILcom/jdots/music/adapter/playlist/LegacyPlaylistAdapter$PlaylistClickListener;)V", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "swapData", "PlaylistClickListener", "ViewHolder", "app_release"})
public final class LegacyPlaylistAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.jdots.music.adapter.playlist.LegacyPlaylistAdapter.ViewHolder> {
    private final androidx.fragment.app.FragmentActivity activity = null;
    private java.util.List<? extends com.jdots.music.model.Playlist> list;
    private final int layoutRes = 0;
    private final com.jdots.music.adapter.playlist.LegacyPlaylistAdapter.PlaylistClickListener playlistClickListener = null;
    
    public final void swapData(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.jdots.music.model.Playlist> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jdots.music.adapter.playlist.LegacyPlaylistAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.jdots.music.adapter.playlist.LegacyPlaylistAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public LegacyPlaylistAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.jdots.music.model.Playlist> list, int layoutRes, @org.jetbrains.annotations.NotNull()
    com.jdots.music.adapter.playlist.LegacyPlaylistAdapter.PlaylistClickListener playlistClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/jdots/music/adapter/playlist/LegacyPlaylistAdapter$ViewHolder;", "Lcom/jdots/music/adapter/base/MediaEntryViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "app_release"})
    public static final class ViewHolder extends com.jdots.music.adapter.base.MediaEntryViewHolder {
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/jdots/music/adapter/playlist/LegacyPlaylistAdapter$PlaylistClickListener;", "", "onPlaylistClick", "", "playlist", "Lcom/jdots/music/model/Playlist;", "app_release"})
    public static abstract interface PlaylistClickListener {
        
        public abstract void onPlaylistClick(@org.jetbrains.annotations.NotNull()
        com.jdots.music.model.Playlist playlist);
    }
}