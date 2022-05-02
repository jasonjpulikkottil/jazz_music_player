package com.jdots.music.fragments.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u00052\u00020\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\r\u0010\u001b\u001a\u00028\u0000H%\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\r\u0010 \u001a\u00028\u0001H$\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000fH\u0002J\b\u0010$\u001a\u00020\u0019H\u0002J\b\u0010%\u001a\u00020\u0019H\u0002J\b\u0010&\u001a\u00020\u0019H\u0004J\b\u0010\'\u001a\u00020\u0019H\u0004J\u0012\u0010(\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0012\u0010+\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0018\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\u001a\u00101\u001a\u00020\u00192\b\u00102\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u00020\u000fH\u0016J\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0016J\u0010\u00109\u001a\u00020\u00192\u0006\u0010-\u001a\u00020.H\u0016J\b\u0010:\u001a\u00020\u0019H\u0016J\b\u0010;\u001a\u00020\u0019H\u0016J\u001a\u0010<\u001a\u00020\u00192\u0006\u0010=\u001a\u00020>2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010?\u001a\u00020\u0019H\u0002J\b\u0010@\u001a\u00020\u0019H\u0002J\b\u0010A\u001a\u00020\u0019H\u0002R\u001e\u0010\b\u001a\u0004\u0018\u00018\u0000X\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u000f8UX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u0004\u0018\u00018\u0001X\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006B"}, d2 = {"Lcom/jdots/music/fragments/base/AbsRecyclerViewFragment;", "A", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "LM", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "Lcom/jdots/music/fragments/base/AbsMainActivityFragment;", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "()V", "adapter", "getAdapter", "()Landroidx/recyclerview/widget/RecyclerView$Adapter;", "setAdapter", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "emptyMessage", "", "getEmptyMessage", "()I", "layoutManager", "getLayoutManager", "()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "setLayoutManager", "(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "checkForPadding", "", "checkIsEmpty", "createAdapter", "createFastScroller", "Lme/zhanghai/android/fastscroll/FastScroller;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "createLayoutManager", "getEmojiByUnicode", "", "unicode", "initAdapter", "initLayoutManager", "invalidateAdapter", "invalidateLayoutManager", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOffsetChanged", "p0", "Lcom/google/android/material/appbar/AppBarLayout;", "i", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onPrepareOptionsMenu", "onQueueChanged", "onServiceConnected", "onViewCreated", "view", "Landroid/view/View;", "setUpRecyclerView", "setUpTransitions", "setupTitle", "app_debug"})
public abstract class AbsRecyclerViewFragment<A extends androidx.recyclerview.widget.RecyclerView.Adapter<?>, LM extends androidx.recyclerview.widget.RecyclerView.LayoutManager> extends com.jdots.music.fragments.base.AbsMainActivityFragment implements com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener {
    @org.jetbrains.annotations.Nullable()
    private A adapter;
    @org.jetbrains.annotations.Nullable()
    private LM layoutManager;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final A getAdapter() {
        return null;
    }
    
    protected final void setAdapter(@org.jetbrains.annotations.Nullable()
    A p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final LM getLayoutManager() {
        return null;
    }
    
    protected final void setLayoutManager(@org.jetbrains.annotations.Nullable()
    LM p0) {
    }
    
    private final void setUpTransitions() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupTitle() {
    }
    
    private final void setUpRecyclerView() {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected me.zhanghai.android.fastscroll.FastScroller createFastScroller(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
        return null;
    }
    
    private final void initAdapter() {
    }
    
    @androidx.annotation.StringRes()
    protected int getEmptyMessage() {
        return 0;
    }
    
    private final java.lang.String getEmojiByUnicode(int unicode) {
        return null;
    }
    
    private final void checkIsEmpty() {
    }
    
    private final void checkForPadding() {
    }
    
    private final void initLayoutManager() {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract LM createLayoutManager();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    protected abstract A createAdapter();
    
    @java.lang.Override()
    public void onOffsetChanged(@org.jetbrains.annotations.Nullable()
    com.google.android.material.appbar.AppBarLayout p0, int i) {
    }
    
    @java.lang.Override()
    public void onQueueChanged() {
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    protected final void invalidateLayoutManager() {
    }
    
    protected final void invalidateAdapter() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView recyclerView() {
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
    
    public AbsRecyclerViewFragment() {
        super(0);
    }
}