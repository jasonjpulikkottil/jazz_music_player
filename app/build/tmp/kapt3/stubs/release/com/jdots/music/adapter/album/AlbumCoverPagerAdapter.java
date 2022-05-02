package com.jdots.music.adapter.album;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000bR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/jdots/music/adapter/album/AlbumCoverPagerAdapter;", "Lcom/jdots/music/misc/CustomFragmentStatePagerAdapter;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "dataSet", "", "Lcom/jdots/music/model/Song;", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V", "currentColorReceiver", "Lcom/jdots/music/adapter/album/AlbumCoverPagerAdapter$AlbumCoverFragment$ColorReceiver;", "currentColorReceiverPosition", "", "getCount", "getItem", "Landroidx/fragment/app/Fragment;", "position", "instantiateItem", "", "container", "Landroid/view/ViewGroup;", "receiveColor", "", "colorReceiver", "AlbumCoverFragment", "Companion", "app_release"})
public final class AlbumCoverPagerAdapter extends com.jdots.music.misc.CustomFragmentStatePagerAdapter {
    private com.jdots.music.adapter.album.AlbumCoverPagerAdapter.AlbumCoverFragment.ColorReceiver currentColorReceiver;
    private int currentColorReceiverPosition = -1;
    private final java.util.List<com.jdots.music.model.Song> dataSet = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    public static final com.jdots.music.adapter.album.AlbumCoverPagerAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.fragment.app.Fragment getItem(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Object instantiateItem(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container, int position) {
        return null;
    }
    
    /**
     * Only the latest passed [AlbumCoverFragment.ColorReceiver] is guaranteed to receive a
     * response
     */
    public final void receiveColor(@org.jetbrains.annotations.NotNull()
    com.jdots.music.adapter.album.AlbumCoverPagerAdapter.AlbumCoverFragment.ColorReceiver colorReceiver, int position) {
    }
    
    public AlbumCoverPagerAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.jdots.music.model.Song> dataSet) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 #2\u00020\u0001:\u0002\"#B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\u001a\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001d\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0000\u00a2\u0006\u0002\b\u001fJ\u0010\u0010 \u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010!\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/jdots/music/adapter/album/AlbumCoverPagerAdapter$AlbumCoverFragment;", "Landroidx/fragment/app/Fragment;", "()V", "albumCover", "Landroid/widget/ImageView;", "color", "Lcom/jdots/music/util/color/MediaNotificationProcessor;", "colorReceiver", "Lcom/jdots/music/adapter/album/AlbumCoverPagerAdapter$AlbumCoverFragment$ColorReceiver;", "isColorReady", "", "request", "", "song", "Lcom/jdots/music/model/Song;", "getLayoutWithPlayerTheme", "loadAlbumCover", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "receiveColor", "receiveColor$app_release", "setColor", "showLyricsDialog", "ColorReceiver", "Companion", "app_release"})
    public static final class AlbumCoverFragment extends androidx.fragment.app.Fragment {
        private android.widget.ImageView albumCover;
        private boolean isColorReady = false;
        private com.jdots.music.util.color.MediaNotificationProcessor color;
        private com.jdots.music.model.Song song;
        private com.jdots.music.adapter.album.AlbumCoverPagerAdapter.AlbumCoverFragment.ColorReceiver colorReceiver;
        private int request = 0;
        private static final java.lang.String SONG_ARG = "song";
        public static final com.jdots.music.adapter.album.AlbumCoverPagerAdapter.AlbumCoverFragment.Companion Companion = null;
        private java.util.HashMap _$_findViewCache;
        
        @java.lang.Override()
        public void onCreate(@org.jetbrains.annotations.Nullable()
        android.os.Bundle savedInstanceState) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
        android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
        android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
        android.os.Bundle savedInstanceState) {
            return null;
        }
        
        private final void showLyricsDialog() {
        }
        
        private final int getLayoutWithPlayerTheme() {
            return 0;
        }
        
        @java.lang.Override()
        public void onViewCreated(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.Nullable()
        android.os.Bundle savedInstanceState) {
        }
        
        @java.lang.Override()
        public void onDestroyView() {
        }
        
        private final void loadAlbumCover() {
        }
        
        private final void setColor(com.jdots.music.util.color.MediaNotificationProcessor color) {
        }
        
        public final void receiveColor$app_release(@org.jetbrains.annotations.NotNull()
        com.jdots.music.adapter.album.AlbumCoverPagerAdapter.AlbumCoverFragment.ColorReceiver colorReceiver, int request) {
        }
        
        public AlbumCoverFragment() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/jdots/music/adapter/album/AlbumCoverPagerAdapter$AlbumCoverFragment$ColorReceiver;", "", "onColorReady", "", "color", "Lcom/jdots/music/util/color/MediaNotificationProcessor;", "request", "", "app_release"})
        public static abstract interface ColorReceiver {
            
            public abstract void onColorReady(@org.jetbrains.annotations.NotNull()
            com.jdots.music.util.color.MediaNotificationProcessor color, int request);
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/jdots/music/adapter/album/AlbumCoverPagerAdapter$AlbumCoverFragment$Companion;", "", "()V", "SONG_ARG", "", "newInstance", "Lcom/jdots/music/adapter/album/AlbumCoverPagerAdapter$AlbumCoverFragment;", "song", "Lcom/jdots/music/model/Song;", "app_release"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.jdots.music.adapter.album.AlbumCoverPagerAdapter.AlbumCoverFragment newInstance(@org.jetbrains.annotations.NotNull()
            com.jdots.music.model.Song song) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/jdots/music/adapter/album/AlbumCoverPagerAdapter$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}