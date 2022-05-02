package com.jdots.music.adapter.song;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 92\u00020\u00012\f\u0012\b\u0012\u00060\u0003R\u00020\u00000\u00022\f\u0012\b\u0012\u00060\u0003R\u00020\u00000\u00042\u00020\u0005:\u00039:;B+\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0002\u0010\u000eJ\u0014\u0010\u0010\u001a\u00060\u0011R\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u001c\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\n2\n\u0010\u001b\u001a\u00060\u0011R\u00020\u0001H\u0014J\u001c\u0010\u001c\u001a\u00020\u00192\n\u0010\u001b\u001a\u00060\u0011R\u00020\u00012\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\fH\u0016J,\u0010!\u001a\u00020\u001e2\n\u0010\u001b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fH\u0016J\u001e\u0010$\u001a\u0004\u0018\u00010%2\n\u0010\u001b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\fH\u0016J,\u0010&\u001a\u00020\f2\n\u0010\u001b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fH\u0016J \u0010\'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u001eH\u0016J\u0010\u0010+\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0018\u0010,\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\fH\u0016J$\u0010-\u001a\u00020\u00192\n\u0010\u001b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010*\u001a\u00020\fH\u0016J&\u0010.\u001a\u0004\u0018\u00010/2\n\u0010\u001b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010*\u001a\u00020\fH\u0016J\u001c\u00100\u001a\u00020\u00192\n\u0010\u001b\u001a\u00060\u0003R\u00020\u00002\u0006\u00101\u001a\u00020\fH\u0016J\u001c\u00102\u001a\u00020\u00192\n\u0010\u001b\u001a\u00060\u0011R\u00020\u00012\u0006\u00103\u001a\u000204H\u0002J\u000e\u00105\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u00106\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\nJ\u001c\u00107\u001a\u00020\u00192\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n082\u0006\u0010\u0015\u001a\u00020\fR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lcom/jdots/music/adapter/song/PlayingQueueAdapter;", "Lcom/jdots/music/adapter/song/SongAdapter;", "Lcom/h6ah4i/android/widget/advrecyclerview/draggable/DraggableItemAdapter;", "Lcom/jdots/music/adapter/song/PlayingQueueAdapter$ViewHolder;", "Lcom/h6ah4i/android/widget/advrecyclerview/swipeable/SwipeableItemAdapter;", "Lme/zhanghai/android/fastscroll/PopupTextProvider;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "dataSet", "", "Lcom/jdots/music/model/Song;", "current", "", "itemLayoutRes", "(Landroidx/appcompat/app/AppCompatActivity;Ljava/util/List;II)V", "songToRemove", "createViewHolder", "Lcom/jdots/music/adapter/song/SongAdapter$ViewHolder;", "view", "Landroid/view/View;", "getItemViewType", "position", "getPopupText", "", "loadAlbumCover", "", "song", "holder", "onBindViewHolder", "onCheckCanDrop", "", "draggingPosition", "dropPosition", "onCheckCanStartDrag", "x", "y", "onGetItemDraggableRange", "Lcom/h6ah4i/android/widget/advrecyclerview/draggable/ItemDraggableRange;", "onGetSwipeReactionType", "onItemDragFinished", "fromPosition", "toPosition", "result", "onItemDragStarted", "onMoveItem", "onSetSwipeBackground", "onSwipeItem", "Lcom/h6ah4i/android/widget/advrecyclerview/swipeable/action/SwipeResultAction;", "onSwipeItemStarted", "p1", "setAlpha", "alpha", "", "setCurrent", "setSongToRemove", "swapDataSet", "", "Companion", "SwipedResultActionRemoveItem", "ViewHolder", "app_release"})
public final class PlayingQueueAdapter extends com.jdots.music.adapter.song.SongAdapter implements com.h6ah4i.android.widget.advrecyclerview.draggable.DraggableItemAdapter<com.jdots.music.adapter.song.PlayingQueueAdapter.ViewHolder>, com.h6ah4i.android.widget.advrecyclerview.swipeable.SwipeableItemAdapter<com.jdots.music.adapter.song.PlayingQueueAdapter.ViewHolder>, me.zhanghai.android.fastscroll.PopupTextProvider {
    private com.jdots.music.model.Song songToRemove;
    private int current;
    private static final int HISTORY = 0;
    private static final int CURRENT = 1;
    private static final int UP_NEXT = 2;
    public static final com.jdots.music.adapter.song.PlayingQueueAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.jdots.music.adapter.song.SongAdapter.ViewHolder createViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.jdots.music.adapter.song.SongAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    protected void loadAlbumCover(@org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Song song, @org.jetbrains.annotations.NotNull()
    com.jdots.music.adapter.song.SongAdapter.ViewHolder holder) {
    }
    
    public final void swapDataSet(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.jdots.music.model.Song> dataSet, int position) {
    }
    
    public final void setCurrent(int current) {
    }
    
    private final void setAlpha(com.jdots.music.adapter.song.SongAdapter.ViewHolder holder, float alpha) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getPopupText(int position) {
        return null;
    }
    
    @java.lang.Override()
    public boolean onCheckCanStartDrag(@org.jetbrains.annotations.NotNull()
    com.jdots.music.adapter.song.PlayingQueueAdapter.ViewHolder holder, int position, int x, int y) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.h6ah4i.android.widget.advrecyclerview.draggable.ItemDraggableRange onGetItemDraggableRange(@org.jetbrains.annotations.NotNull()
    com.jdots.music.adapter.song.PlayingQueueAdapter.ViewHolder holder, int position) {
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
    
    public final void setSongToRemove(@org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Song song) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.h6ah4i.android.widget.advrecyclerview.swipeable.action.SwipeResultAction onSwipeItem(@org.jetbrains.annotations.NotNull()
    com.jdots.music.adapter.song.PlayingQueueAdapter.ViewHolder holder, int position, int result) {
        return null;
    }
    
    @java.lang.Override()
    public int onGetSwipeReactionType(@org.jetbrains.annotations.NotNull()
    com.jdots.music.adapter.song.PlayingQueueAdapter.ViewHolder holder, int position, int x, int y) {
        return 0;
    }
    
    @java.lang.Override()
    public void onSwipeItemStarted(@org.jetbrains.annotations.NotNull()
    com.jdots.music.adapter.song.PlayingQueueAdapter.ViewHolder holder, int p1) {
    }
    
    @java.lang.Override()
    public void onSetSwipeBackground(@org.jetbrains.annotations.NotNull()
    com.jdots.music.adapter.song.PlayingQueueAdapter.ViewHolder holder, int position, int result) {
    }
    
    public PlayingQueueAdapter(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.List<com.jdots.music.model.Song> dataSet, int current, int itemLayoutRes) {
        super(null, null, 0, null, false);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0007H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\b\n\u0000\u0012\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00078T@TX\u0094\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lcom/jdots/music/adapter/song/PlayingQueueAdapter$ViewHolder;", "Lcom/jdots/music/adapter/song/SongAdapter$ViewHolder;", "Lcom/jdots/music/adapter/song/SongAdapter;", "itemView", "Landroid/view/View;", "(Lcom/jdots/music/adapter/song/PlayingQueueAdapter;Landroid/view/View;)V", "mDragStateFlags", "", "getMDragStateFlags$annotations", "()V", "value", "songMenuRes", "getSongMenuRes", "()I", "setSongMenuRes", "(I)V", "getDragStateFlags", "getSwipeableContainerView", "onSongMenuItemClick", "", "item", "Landroid/view/MenuItem;", "setDragStateFlags", "", "flags", "app_release"})
    public final class ViewHolder extends com.jdots.music.adapter.song.SongAdapter.ViewHolder {
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
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.view.View getSwipeableContainerView() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/jdots/music/adapter/song/PlayingQueueAdapter$SwipedResultActionRemoveItem;", "Lcom/h6ah4i/android/widget/advrecyclerview/swipeable/action/SwipeResultActionRemoveItem;", "adapter", "Lcom/jdots/music/adapter/song/PlayingQueueAdapter;", "position", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Lcom/jdots/music/adapter/song/PlayingQueueAdapter;ILandroidx/fragment/app/FragmentActivity;)V", "isPlaying", "", "songProgressMillis", "songToRemove", "Lcom/jdots/music/model/Song;", "onPerformAction", "", "onSlideAnimationEnd", "app_release"})
    public static final class SwipedResultActionRemoveItem extends com.h6ah4i.android.widget.advrecyclerview.swipeable.action.SwipeResultActionRemoveItem {
        private com.jdots.music.model.Song songToRemove;
        private final boolean isPlaying = false;
        private final int songProgressMillis = 0;
        private final com.jdots.music.adapter.song.PlayingQueueAdapter adapter = null;
        private final int position = 0;
        private final androidx.fragment.app.FragmentActivity activity = null;
        
        @java.lang.Override()
        protected void onPerformAction() {
        }
        
        @java.lang.Override()
        protected void onSlideAnimationEnd() {
        }
        
        public SwipedResultActionRemoveItem(@org.jetbrains.annotations.NotNull()
        com.jdots.music.adapter.song.PlayingQueueAdapter adapter, int position, @org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentActivity activity) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/jdots/music/adapter/song/PlayingQueueAdapter$Companion;", "", "()V", "CURRENT", "", "HISTORY", "UP_NEXT", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}