package com.jdots.music.adapter.song;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0010R\u00020\u00012\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u001c\u0010\u0012\u001a\u00060\u0010R\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0016J\u0016\u0010\u0016\u001a\u00020\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0016\u00a8\u0006\u0019"}, d2 = {"Lcom/jdots/music/adapter/song/SimpleSongAdapter;", "Lcom/jdots/music/adapter/song/SongAdapter;", "context", "Landroidx/fragment/app/FragmentActivity;", "songs", "Ljava/util/ArrayList;", "Lcom/jdots/music/model/Song;", "layoutRes", "", "ICabHolder", "Lcom/jdots/music/interfaces/ICabHolder;", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/ArrayList;ILcom/jdots/music/interfaces/ICabHolder;)V", "getItemCount", "onBindViewHolder", "", "holder", "Lcom/jdots/music/adapter/song/SongAdapter$ViewHolder;", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "swapDataSet", "dataSet", "", "app_debug"})
public final class SimpleSongAdapter extends com.jdots.music.adapter.song.SongAdapter {
    
    @java.lang.Override()
    public void swapDataSet(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.jdots.music.model.Song> dataSet) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jdots.music.adapter.song.SongAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.jdots.music.adapter.song.SongAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public SimpleSongAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.jdots.music.model.Song> songs, int layoutRes, @org.jetbrains.annotations.Nullable()
    com.jdots.music.interfaces.ICabHolder ICabHolder) {
        super(null, null, 0, null, false);
    }
}