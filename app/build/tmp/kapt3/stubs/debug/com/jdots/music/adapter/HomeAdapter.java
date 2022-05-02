package com.jdots.music.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0006+,-./0B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tJ\u0014\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\tJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\u0018\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u0014H\u0016J\u0014\u0010)\u001a\u00020\u001c2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/jdots/music/adapter/HomeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/jdots/music/interfaces/IArtistClickListener;", "Lcom/jdots/music/interfaces/IAlbumClickListener;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "list", "", "Lcom/jdots/music/model/Home;", "albumAdapter", "Lcom/jdots/music/adapter/album/AlbumAdapter;", "albums", "Lcom/jdots/music/model/Album;", "artistsAdapter", "Lcom/jdots/music/adapter/artist/ArtistAdapter;", "artists", "Lcom/jdots/music/model/Artist;", "getItemCount", "", "getItemViewType", "position", "gridLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "onAlbumClick", "", "albumId", "", "view", "Landroid/view/View;", "onArtist", "artistId", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "swapData", "sections", "AbsHomeViewItem", "AlbumViewHolder", "ArtistViewHolder", "GenreViewHolder", "PlaylistViewHolder", "SuggestionsViewHolder", "app_debug"})
public final class HomeAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> implements com.jdots.music.interfaces.IArtistClickListener, com.jdots.music.interfaces.IAlbumClickListener {
    private java.util.List<com.jdots.music.model.Home> list;
    private final androidx.appcompat.app.AppCompatActivity activity = null;
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void swapData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.model.Home> sections) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jdots.music.adapter.artist.ArtistAdapter artistsAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.model.Artist> artists) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jdots.music.adapter.album.AlbumAdapter albumAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.model.Album> albums) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.GridLayoutManager gridLayoutManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager() {
        return null;
    }
    
    @java.lang.Override()
    public void onArtist(long artistId, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void onAlbumClick(long albumId, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public HomeAdapter(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/jdots/music/adapter/HomeAdapter$AlbumViewHolder;", "Lcom/jdots/music/adapter/HomeAdapter$AbsHomeViewItem;", "view", "Landroid/view/View;", "(Lcom/jdots/music/adapter/HomeAdapter;Landroid/view/View;)V", "bindView", "", "home", "Lcom/jdots/music/model/Home;", "app_debug"})
    final class AlbumViewHolder extends com.jdots.music.adapter.HomeAdapter.AbsHomeViewItem {
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        com.jdots.music.model.Home home) {
        }
        
        public AlbumViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/jdots/music/adapter/HomeAdapter$ArtistViewHolder;", "Lcom/jdots/music/adapter/HomeAdapter$AbsHomeViewItem;", "view", "Landroid/view/View;", "(Lcom/jdots/music/adapter/HomeAdapter;Landroid/view/View;)V", "bindView", "", "home", "Lcom/jdots/music/model/Home;", "app_debug"})
    final class ArtistViewHolder extends com.jdots.music.adapter.HomeAdapter.AbsHomeViewItem {
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        com.jdots.music.model.Home home) {
        }
        
        public ArtistViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/jdots/music/adapter/HomeAdapter$SuggestionsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/jdots/music/adapter/HomeAdapter;Landroid/view/View;)V", "images", "", "", "bindView", "", "home", "Lcom/jdots/music/model/Home;", "app_debug"})
    final class SuggestionsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final java.util.List<java.lang.Integer> images = null;
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        com.jdots.music.model.Home home) {
        }
        
        public SuggestionsViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/jdots/music/adapter/HomeAdapter$PlaylistViewHolder;", "Lcom/jdots/music/adapter/HomeAdapter$AbsHomeViewItem;", "view", "Landroid/view/View;", "(Lcom/jdots/music/adapter/HomeAdapter;Landroid/view/View;)V", "bindView", "", "home", "Lcom/jdots/music/model/Home;", "app_debug"})
    final class PlaylistViewHolder extends com.jdots.music.adapter.HomeAdapter.AbsHomeViewItem {
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        com.jdots.music.model.Home home) {
        }
        
        public PlaylistViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/jdots/music/adapter/HomeAdapter$GenreViewHolder;", "Lcom/jdots/music/adapter/HomeAdapter$AbsHomeViewItem;", "itemView", "Landroid/view/View;", "(Lcom/jdots/music/adapter/HomeAdapter;Landroid/view/View;)V", "bind", "", "home", "Lcom/jdots/music/model/Home;", "app_debug"})
    final class GenreViewHolder extends com.jdots.music.adapter.HomeAdapter.AbsHomeViewItem {
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.jdots.music.model.Home home) {
        }
        
        public GenreViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/jdots/music/adapter/HomeAdapter$AbsHomeViewItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "arrow", "Landroid/widget/ImageView;", "getArrow", "()Landroid/widget/ImageView;", "clickableArea", "Landroid/view/ViewGroup;", "getClickableArea", "()Landroid/view/ViewGroup;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "title", "Landroidx/appcompat/widget/AppCompatTextView;", "getTitle", "()Landroidx/appcompat/widget/AppCompatTextView;", "app_debug"})
    public static class AbsHomeViewItem extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final androidx.recyclerview.widget.RecyclerView recyclerView = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.appcompat.widget.AppCompatTextView title = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView arrow = null;
        @org.jetbrains.annotations.NotNull()
        private final android.view.ViewGroup clickableArea = null;
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getArrow() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.ViewGroup getClickableArea() {
            return null;
        }
        
        public AbsHomeViewItem(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}