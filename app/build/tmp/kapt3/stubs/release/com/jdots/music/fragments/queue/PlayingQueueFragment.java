package com.jdots.music.fragments.queue;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0002H\u0014J\b\u0010\u0012\u001a\u00020\u0003H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\u001a\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0014H\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\b\u0010 \u001a\u00020\u0014H\u0002J\b\u0010!\u001a\u00020\u0014H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/jdots/music/fragments/queue/PlayingQueueFragment;", "Lcom/jdots/music/fragments/base/AbsRecyclerViewFragment;", "Lcom/jdots/music/adapter/song/PlayingQueueAdapter;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "()V", "emptyMessage", "", "getEmptyMessage", "()I", "recyclerViewDragDropManager", "Lcom/h6ah4i/android/widget/advrecyclerview/draggable/RecyclerViewDragDropManager;", "recyclerViewSwipeManager", "Lcom/h6ah4i/android/widget/advrecyclerview/swipeable/RecyclerViewSwipeManager;", "recyclerViewTouchActionGuardManager", "Lcom/h6ah4i/android/widget/advrecyclerview/touchguard/RecyclerViewTouchActionGuardManager;", "wrappedAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "createAdapter", "createLayoutManager", "onDestroyView", "", "onPause", "onPlayingMetaChanged", "onQueueChanged", "onServiceConnected", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "resetToCurrentPosition", "setupRecyclerView", "updateQueue", "updateQueuePosition", "Companion", "app_release"})
public final class PlayingQueueFragment extends com.jdots.music.fragments.base.AbsRecyclerViewFragment<com.jdots.music.adapter.song.PlayingQueueAdapter, androidx.recyclerview.widget.LinearLayoutManager> {
    private androidx.recyclerview.widget.RecyclerView.Adapter<?> wrappedAdapter;
    private com.h6ah4i.android.widget.advrecyclerview.draggable.RecyclerViewDragDropManager recyclerViewDragDropManager;
    private com.h6ah4i.android.widget.advrecyclerview.swipeable.RecyclerViewSwipeManager recyclerViewSwipeManager;
    private com.h6ah4i.android.widget.advrecyclerview.touchguard.RecyclerViewTouchActionGuardManager recyclerViewTouchActionGuardManager;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = null;
    public static final com.jdots.music.fragments.queue.PlayingQueueFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupRecyclerView() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected androidx.recyclerview.widget.LinearLayoutManager createLayoutManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.jdots.music.adapter.song.PlayingQueueAdapter createAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void onServiceConnected() {
    }
    
    @java.lang.Override()
    public void onQueueChanged() {
    }
    
    @java.lang.Override()
    public void onPlayingMetaChanged() {
    }
    
    private final void updateQueuePosition() {
    }
    
    private final void updateQueue() {
    }
    
    private final void resetToCurrentPosition() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    protected int getEmptyMessage() {
        return 0;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public PlayingQueueFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.jdots.music.fragments.queue.PlayingQueueFragment newInstance() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/jdots/music/fragments/queue/PlayingQueueFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Lcom/jdots/music/fragments/queue/PlayingQueueFragment;", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.jdots.music.fragments.queue.PlayingQueueFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}