package com.jdots.music;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB\'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\rJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0016H\u0002R\u0014\u0010\u000e\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lcom/jdots/music/PeekingLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "orientation", "", "reverseLayout", "", "(Landroid/content/Context;IZ)V", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "horizontalSpace", "getHorizontalSpace", "()I", "ratio", "", "verticalSpace", "getVerticalSpace", "generateDefaultLayoutParams", "Landroidx/recyclerview/widget/RecyclerView$LayoutParams;", "generateLayoutParams", "c", "lp", "Landroid/view/ViewGroup$LayoutParams;", "scaledLayoutParams", "layoutParams", "app_debug"})
public final class PeekingLinearLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
    private final float ratio = 0.8F;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(@org.jetbrains.annotations.Nullable()
    android.view.ViewGroup.LayoutParams lp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(@org.jetbrains.annotations.Nullable()
    android.content.Context c, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        return null;
    }
    
    private final androidx.recyclerview.widget.RecyclerView.LayoutParams scaledLayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
        return null;
    }
    
    private final int getHorizontalSpace() {
        return 0;
    }
    
    private final int getVerticalSpace() {
        return 0;
    }
    
    public PeekingLinearLayoutManager(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @androidx.recyclerview.widget.RecyclerView.Orientation()
    int orientation, boolean reverseLayout) {
        super(null);
    }
    
    public PeekingLinearLayoutManager(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @androidx.recyclerview.widget.RecyclerView.Orientation()
    int orientation) {
        super(null);
    }
    
    public PeekingLinearLayoutManager(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
    
    public PeekingLinearLayoutManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(null);
    }
}