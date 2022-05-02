package com.jdots.music.fragments.playlists;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u0002H\u0014J(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0014J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0007H\u0014J\b\u0010\u0018\u001a\u00020\u0007H\u0014J\b\u0010\u0019\u001a\u00020\u0007H\u0014J\b\u0010\u001a\u001a\u00020\u001bH\u0014J\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u001dH\u0016J\u001a\u0010\'\u001a\u00020\f2\u0006\u0010$\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0010\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0007H\u0014J\u0010\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0007H\u0014J\u0010\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u0007H\u0014J\u0010\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\u001bH\u0014J\u0010\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020\u0007H\u0014J\u0010\u00103\u001a\u00020\f2\u0006\u00100\u001a\u00020\u001bH\u0014J\u0010\u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020\u000eH\u0002R\u0014\u0010\u0006\u001a\u00020\u00078TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u00066"}, d2 = {"Lcom/jdots/music/fragments/playlists/PlaylistsFragment;", "Lcom/jdots/music/fragments/base/AbsRecyclerViewCustomGridSizeFragment;", "Lcom/jdots/music/adapter/playlist/PlaylistAdapter;", "Landroidx/recyclerview/widget/GridLayoutManager;", "Lcom/jdots/music/interfaces/IPlaylistClickListener;", "()V", "emptyMessage", "", "getEmptyMessage", "()I", "createAdapter", "createId", "", "menu", "Landroid/view/SubMenu;", "id", "title", "checked", "", "createLayoutManager", "handleSortOrderMenuItem", "item", "Landroid/view/MenuItem;", "loadGridSize", "loadGridSizeLand", "loadLayoutRes", "loadSortOrder", "", "onCreateOptionsMenu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "onPlaylistClick", "playlistWithSongs", "Lcom/jdots/music/db/PlaylistWithSongs;", "view", "Landroid/view/View;", "onPrepareOptionsMenu", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "saveGridSize", "gridColumns", "saveGridSizeLand", "saveLayoutRes", "layoutRes", "saveSortOrder", "sortOrder", "setGridSize", "gridSize", "setSortOrder", "setUpSortOrderMenu", "subMenu", "app_debug"})
public final class PlaylistsFragment extends com.jdots.music.fragments.base.AbsRecyclerViewCustomGridSizeFragment<com.jdots.music.adapter.playlist.PlaylistAdapter, androidx.recyclerview.widget.GridLayoutManager> implements com.jdots.music.interfaces.IPlaylistClickListener {
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected int getEmptyMessage() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected androidx.recyclerview.widget.GridLayoutManager createLayoutManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.jdots.music.adapter.playlist.PlaylistAdapter createAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void setUpSortOrderMenu(android.view.SubMenu subMenu) {
    }
    
    private final boolean handleSortOrderMenuItem(android.view.MenuItem item) {
        return false;
    }
    
    private final void createId(android.view.SubMenu menu, int id, int title, boolean checked) {
    }
    
    @java.lang.Override()
    protected void setGridSize(int gridSize) {
    }
    
    @java.lang.Override()
    protected void setSortOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String sortOrder) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.String loadSortOrder() {
        return null;
    }
    
    @java.lang.Override()
    protected void saveSortOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String sortOrder) {
    }
    
    @java.lang.Override()
    protected int loadGridSize() {
        return 0;
    }
    
    @java.lang.Override()
    protected void saveGridSize(int gridColumns) {
    }
    
    @java.lang.Override()
    protected int loadGridSizeLand() {
        return 0;
    }
    
    @java.lang.Override()
    protected void saveGridSizeLand(int gridColumns) {
    }
    
    @java.lang.Override()
    protected int loadLayoutRes() {
        return 0;
    }
    
    @java.lang.Override()
    protected void saveLayoutRes(int layoutRes) {
    }
    
    @java.lang.Override()
    public void onPlaylistClick(@org.jetbrains.annotations.NotNull()
    com.jdots.music.db.PlaylistWithSongs playlistWithSongs, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public PlaylistsFragment() {
        super();
    }
}