package com.jdots.music.adapter.song;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u00012\f\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0002:\u000201BI\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\u00060\u0014R\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rH\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\rH\u0016J,\u0010\u001e\u001a\u00020\u001b2\n\u0010\u001f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rH\u0016J\u001c\u0010\"\u001a\u00020#2\n\u0010\u001f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\rH\u0016J \u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\r2\u0006\u0010\'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u001bH\u0016J\u0010\u0010)\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020\rH\u0016J\u0018\u0010*\u001a\u00020%2\u0006\u0010&\u001a\u00020\r2\u0006\u0010\'\u001a\u00020\rH\u0016J\u001e\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\n0/H\u0014R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/jdots/music/adapter/song/OrderablePlaylistSongAdapter;", "Lcom/jdots/music/adapter/song/SongAdapter;", "Lcom/h6ah4i/android/widget/advrecyclerview/draggable/DraggableItemAdapter;", "Lcom/jdots/music/adapter/song/OrderablePlaylistSongAdapter$ViewHolder;", "playlist", "Lcom/jdots/music/db/PlaylistEntity;", "activity", "Landroidx/fragment/app/FragmentActivity;", "dataSet", "Ljava/util/ArrayList;", "Lcom/jdots/music/model/Song;", "Lkotlin/collections/ArrayList;", "itemLayoutRes", "", "ICabHolder", "Lcom/jdots/music/interfaces/ICabHolder;", "onMoveItemListener", "Lcom/jdots/music/adapter/song/OrderablePlaylistSongAdapter$OnMoveItemListener;", "(Lcom/jdots/music/db/PlaylistEntity;Landroidx/fragment/app/FragmentActivity;Ljava/util/ArrayList;ILcom/jdots/music/interfaces/ICabHolder;Lcom/jdots/music/adapter/song/OrderablePlaylistSongAdapter$OnMoveItemListener;)V", "createViewHolder", "Lcom/jdots/music/adapter/song/SongAdapter$ViewHolder;", "view", "Landroid/view/View;", "getItemId", "", "position", "onCheckCanDrop", "", "draggingPosition", "dropPosition", "onCheckCanStartDrag", "holder", "x", "y", "onGetItemDraggableRange", "Lcom/h6ah4i/android/widget/advrecyclerview/draggable/ItemDraggableRange;", "onItemDragFinished", "", "fromPosition", "toPosition", "result", "onItemDragStarted", "onMoveItem", "onMultipleItemAction", "menuItem", "Landroid/view/MenuItem;", "selection", "", "OnMoveItemListener", "ViewHolder", "app_debug"})
public final class OrderablePlaylistSongAdapter extends com.jdots.music.adapter.song.SongAdapter implements com.h6ah4i.android.widget.advrecyclerview.draggable.DraggableItemAdapter<com.jdots.music.adapter.song.OrderablePlaylistSongAdapter.ViewHolder> {
    private final com.jdots.music.db.PlaylistEntity playlist = null;
    private final com.jdots.music.adapter.song.OrderablePlaylistSongAdapter.OnMoveItemListener onMoveItemListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.jdots.music.adapter.song.SongAdapter.ViewHolder createViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    protected void onMultipleItemAction(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem menuItem, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.jdots.music.model.Song> selection) {
    }
    
    @java.lang.Override()
    public boolean onCheckCanStartDrag(@org.jetbrains.annotations.NotNull()
    com.jdots.music.adapter.song.OrderablePlaylistSongAdapter.ViewHolder holder, int position, int x, int y) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.h6ah4i.android.widget.advrecyclerview.draggable.ItemDraggableRange onGetItemDraggableRange(@org.jetbrains.annotations.NotNull()
    com.jdots.music.adapter.song.OrderablePlaylistSongAdapter.ViewHolder holder, int position) {
        return null;
    }
    
    @java.lang.Override()
    public void onMoveItem(int fromPosition, int toPosition) {
    }
    
    @java.lang.Override()
    public boolean onCheckCanDrop(int draggingPosition, int dropPosition) {
        return false;
    }
    
    @java.lang.Override()
    public void onItemDragStarted(int position) {
    }
    
    @java.lang.Override()
    public void onItemDragFinished(int fromPosition, int toPosition, boolean result) {
    }
    
    public OrderablePlaylistSongAdapter(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.PlaylistEntity playlist, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.jdots.music.model.Song> dataSet, int itemLayoutRes, @org.jetbrains.annotations.Nullable()
    com.jdots.music.interfaces.ICabHolder ICabHolder, @org.jetbrains.annotations.Nullable()
    com.jdots.music.adapter.song.OrderablePlaylistSongAdapter.OnMoveItemListener onMoveItemListener) {
        super(null, null, 0, null, false);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/jdots/music/adapter/song/OrderablePlaylistSongAdapter$OnMoveItemListener;", "", "onMoveItem", "", "fromPosition", "", "toPosition", "app_debug"})
    public static abstract interface OnMoveItemListener {
        
        public abstract void onMoveItem(int fromPosition, int toPosition);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\bH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\bH\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\b\n\u0000\u0012\u0004\b\t\u0010\nR$\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b8T@TX\u0094\u000e\u00a2\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0019"}, d2 = {"Lcom/jdots/music/adapter/song/OrderablePlaylistSongAdapter$ViewHolder;", "Lcom/jdots/music/adapter/song/SongAdapter$ViewHolder;", "Lcom/jdots/music/adapter/song/SongAdapter;", "Lcom/h6ah4i/android/widget/advrecyclerview/draggable/DraggableItemViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/jdots/music/adapter/song/OrderablePlaylistSongAdapter;Landroid/view/View;)V", "mDragStateFlags", "", "getMDragStateFlags$annotations", "()V", "value", "songMenuRes", "getSongMenuRes", "()I", "setSongMenuRes", "(I)V", "getDragStateFlags", "onSongMenuItemClick", "", "item", "Landroid/view/MenuItem;", "setDragStateFlags", "", "flags", "app_debug"})
    public final class ViewHolder extends com.jdots.music.adapter.song.SongAdapter.ViewHolder implements com.h6ah4i.android.widget.advrecyclerview.draggable.DraggableItemViewHolder {
        private int mDragStateFlags = 0;
        
        @com.h6ah4i.android.widget.advrecyclerview.draggable.annotation.DraggableItemStateFlags()
        @java.lang.Deprecated()
        private static void getMDragStateFlags$annotations() {
        }
        
        @java.lang.Override()
        protected int getSongMenuRes() {
            return 0;
        }
        
        @java.lang.Override()
        protected void setSongMenuRes(int value) {
        }
        
        @java.lang.Override()
        protected boolean onSongMenuItemClick(@org.jetbrains.annotations.NotNull()
        android.view.MenuItem item) {
            return false;
        }
        
        @com.h6ah4i.android.widget.advrecyclerview.draggable.annotation.DraggableItemStateFlags()
        @java.lang.Override()
        public int getDragStateFlags() {
            return 0;
        }
        
        @java.lang.Override()
        public void setDragStateFlags(@com.h6ah4i.android.widget.advrecyclerview.draggable.annotation.DraggableItemStateFlags()
        int flags) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}