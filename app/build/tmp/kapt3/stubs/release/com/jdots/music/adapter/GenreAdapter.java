package com.jdots.music.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\tH\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tH\u0016J\u0014\u0010\u0018\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/jdots/music/adapter/GenreAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/jdots/music/adapter/GenreAdapter$ViewHolder;", "activity", "Landroidx/fragment/app/FragmentActivity;", "dataSet", "", "Lcom/jdots/music/model/Genre;", "mItemLayoutRes", "", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/List;I)V", "getDataSet", "()Ljava/util/List;", "setDataSet", "(Ljava/util/List;)V", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "swapDataSet", "list", "ViewHolder", "app_release"})
public final class GenreAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.jdots.music.adapter.GenreAdapter.ViewHolder> {
    private final androidx.fragment.app.FragmentActivity activity = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.jdots.music.model.Genre> dataSet;
    private final int mItemLayoutRes = 0;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jdots.music.adapter.GenreAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.jdots.music.adapter.GenreAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void swapDataSet(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.model.Genre> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.jdots.music.model.Genre> getDataSet() {
        return null;
    }
    
    public final void setDataSet(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.model.Genre> p0) {
    }
    
    public GenreAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.model.Genre> dataSet, int mItemLayoutRes) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/jdots/music/adapter/GenreAdapter$ViewHolder;", "Lcom/jdots/music/adapter/base/MediaEntryViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/jdots/music/adapter/GenreAdapter;Landroid/view/View;)V", "onClick", "", "v", "app_release"})
    public final class ViewHolder extends com.jdots.music.adapter.base.MediaEntryViewHolder {
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}