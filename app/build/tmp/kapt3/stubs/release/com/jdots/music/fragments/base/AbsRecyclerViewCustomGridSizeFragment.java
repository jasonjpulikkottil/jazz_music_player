package com.jdots.music.fragments.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\bH\u0002J\u0006\u0010\u0019\u001a\u00020\bJ\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013J\u0006\u0010\u001b\u001a\u00020\bJ\b\u0010\u001c\u001a\u00020\bH$J\b\u0010\u001d\u001a\u00020\bH$J\b\u0010\u001e\u001a\u00020\bH$J\b\u0010\u001f\u001a\u00020\u0013H$J\u0012\u0010 \u001a\u00020\u00152\b\b\u0001\u0010\u0018\u001a\u00020\bH\u0004J\u001a\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020\bH$J\u0010\u0010(\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020\bH$J\u0010\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\bH$J\u0010\u0010+\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H$J\u000e\u0010,\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010-\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\bJ\u000e\u0010.\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010/\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH$J\u0010\u00100\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H$R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0011\u0010\r\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/jdots/music/fragments/base/AbsRecyclerViewCustomGridSizeFragment;", "A", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "LM", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "Lcom/jdots/music/fragments/base/AbsRecyclerViewFragment;", "()V", "currentLayoutRes", "", "gridSize", "isLandscape", "", "()Z", "maxGridSize", "getMaxGridSize", "()I", "maxGridSizeForList", "getMaxGridSizeForList", "sortOrder", "", "applyRecyclerViewPaddingForLayoutRes", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "res", "getGridSize", "getSortOrder", "itemLayoutRes", "loadGridSize", "loadGridSizeLand", "loadLayoutRes", "loadSortOrder", "notifyLayoutResChanged", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "saveGridSize", "gridColumns", "saveGridSizeLand", "saveLayoutRes", "layoutRes", "saveSortOrder", "setAndSaveGridSize", "setAndSaveLayoutRes", "setAndSaveSortOrder", "setGridSize", "setSortOrder", "app_release"})
public abstract class AbsRecyclerViewCustomGridSizeFragment<A extends androidx.recyclerview.widget.RecyclerView.Adapter<?>, LM extends androidx.recyclerview.widget.RecyclerView.LayoutManager> extends com.jdots.music.fragments.base.AbsRecyclerViewFragment<A, LM> {
    private int gridSize = 0;
    private java.lang.String sortOrder;
    private int currentLayoutRes = 0;
    private java.util.HashMap _$_findViewCache;
    
    private final boolean isLandscape() {
        return false;
    }
    
    public final int getMaxGridSize() {
        return 0;
    }
    
    public final int itemLayoutRes() {
        return 0;
    }
    
    public final void setAndSaveLayoutRes(int layoutRes) {
    }
    
    private final int getMaxGridSizeForList() {
        return 0;
    }
    
    public final int getGridSize() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSortOrder() {
        return null;
    }
    
    public final void setAndSaveSortOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String sortOrder) {
    }
    
    public final void setAndSaveGridSize(int gridSize) {
    }
    
    protected final void notifyLayoutResChanged(@androidx.annotation.LayoutRes()
    int res) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void applyRecyclerViewPaddingForLayoutRes(androidx.recyclerview.widget.RecyclerView recyclerView, int res) {
    }
    
    protected abstract void setGridSize(int gridSize);
    
    protected abstract void setSortOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String sortOrder);
    
    @org.jetbrains.annotations.NotNull()
    protected abstract java.lang.String loadSortOrder();
    
    protected abstract void saveSortOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String sortOrder);
    
    protected abstract int loadGridSize();
    
    protected abstract void saveGridSize(int gridColumns);
    
    protected abstract int loadGridSizeLand();
    
    protected abstract void saveGridSizeLand(int gridColumns);
    
    protected abstract int loadLayoutRes();
    
    protected abstract void saveLayoutRes(int layoutRes);
    
    public AbsRecyclerViewCustomGridSizeFragment() {
        super();
    }
}