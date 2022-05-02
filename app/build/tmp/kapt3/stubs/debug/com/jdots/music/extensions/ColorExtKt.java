package com.jdots.music.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0006\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0007\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\b\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\t\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\n\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u000b\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\f\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u000e\u001a\u00020\u0001*\u00020\u000f\u001a\n\u0010\u000e\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0010\u001a\u00020\u0001*\u00020\u0011\u001a\n\u0010\u0010\u001a\u00020\u0001*\u00020\u0012\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\u00122\b\b\u0001\u0010\u0014\u001a\u00020\u0004\u001a\u0012\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0004\u001a\u0012\u0010\u0013\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0004\u001a\u0012\u0010\u0015\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0004\u001a\n\u0010\u0016\u001a\u00020\u0001*\u00020\u0017\u001a\n\u0010\u0018\u001a\u00020\u0004*\u00020\u0019\u001a\n\u0010\u0018\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0018\u001a\u00020\u0004*\u00020\u0007\u001a\u0016\u0010\u001a\u001a\u00020\u0004*\u00020\u00052\b\b\u0001\u0010\u001b\u001a\u00020\u0004H\u0007\u001a\u001e\u0010\u001c\u001a\u00020\u0004*\u00020\u00192\b\b\u0001\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u0004\u001a\u001e\u0010\u001c\u001a\u00020\u0004*\u00020\u00052\b\b\u0001\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u0004\u001a\u001e\u0010\u001c\u001a\u00020\u0004*\u00020\u00072\b\b\u0001\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u0004\u001a\n\u0010\u001f\u001a\u00020\u0004*\u00020\u0004\u001a\n\u0010 \u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010 \u001a\u00020\u0004*\u00020\u0007\u001a\n\u0010!\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010!\u001a\u00020\u0004*\u00020\u0007\u001a\n\u0010\"\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\"\u001a\u00020\u0004*\u00020\u0007\u001a\u001e\u0010#\u001a\u00020$*\u00020$2\u0006\u0010%\u001a\u00020\u00052\b\b\u0001\u0010\u0014\u001a\u00020\u0004H\u0007\u001a\u0016\u0010#\u001a\u00020$*\u00020$2\b\b\u0001\u0010\u0014\u001a\u00020\u0004H\u0007\u00a8\u0006&"}, d2 = {"accentBackgroundColor", "", "Lcom/google/android/material/button/MaterialButton;", "accentColor", "", "Landroid/content/Context;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroidx/fragment/app/Fragment;", "Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "Lcom/google/android/material/progressindicator/ProgressIndicator;", "Lcom/google/android/material/textfield/TextInputEditText;", "Lcom/google/android/material/textfield/TextInputLayout;", "accentOutlineColor", "accentTextColor", "Landroid/widget/Button;", "addAccentColor", "Landroid/widget/CheckBox;", "Landroid/widget/SeekBar;", "applyColor", "color", "applyOutlineColor", "backgroundTintList", "Landroidx/appcompat/widget/Toolbar;", "colorControlNormal", "Landroid/app/Dialog;", "getColorCompat", "colorRes", "resolveColor", "attr", "fallBackColor", "ripAlpha", "surfaceColor", "textColorPrimary", "textColorSecondary", "tint", "Landroid/graphics/drawable/Drawable;", "context", "app_debug"})
public final class ColorExtKt {
    
    public static final int ripAlpha(int $this$ripAlpha) {
        return 0;
    }
    
    public static final int colorControlNormal(@org.jetbrains.annotations.NotNull()
    android.app.Dialog $this$colorControlNormal) {
        return 0;
    }
    
    public static final void backgroundTintList(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar $this$backgroundTintList) {
    }
    
    public static final int accentColor(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$accentColor) {
        return 0;
    }
    
    public static final int accentColor(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$accentColor) {
        return 0;
    }
    
    public static final int surfaceColor(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$surfaceColor) {
        return 0;
    }
    
    public static final int surfaceColor(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$surfaceColor) {
        return 0;
    }
    
    public static final int textColorSecondary(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$textColorSecondary) {
        return 0;
    }
    
    public static final int textColorSecondary(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$textColorSecondary) {
        return 0;
    }
    
    public static final int colorControlNormal(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$colorControlNormal) {
        return 0;
    }
    
    public static final int colorControlNormal(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$colorControlNormal) {
        return 0;
    }
    
    public static final int textColorPrimary(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$textColorPrimary) {
        return 0;
    }
    
    public static final int textColorPrimary(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$textColorPrimary) {
        return 0;
    }
    
    public static final int resolveColor(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$resolveColor, @androidx.annotation.AttrRes()
    int attr, int fallBackColor) {
        return 0;
    }
    
    public static final int resolveColor(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$resolveColor, @androidx.annotation.AttrRes()
    int attr, int fallBackColor) {
        return 0;
    }
    
    public static final int resolveColor(@org.jetbrains.annotations.NotNull()
    android.app.Dialog $this$resolveColor, @androidx.annotation.AttrRes()
    int attr, int fallBackColor) {
        return 0;
    }
    
    public static final void addAccentColor(@org.jetbrains.annotations.NotNull()
    android.widget.CheckBox $this$addAccentColor) {
    }
    
    public static final void addAccentColor(@org.jetbrains.annotations.NotNull()
    android.widget.SeekBar $this$addAccentColor) {
    }
    
    public static final void accentTextColor(@org.jetbrains.annotations.NotNull()
    android.widget.Button $this$accentTextColor) {
    }
    
    public static final void accentTextColor(@org.jetbrains.annotations.NotNull()
    com.google.android.material.button.MaterialButton $this$accentTextColor) {
    }
    
    public static final void accentBackgroundColor(@org.jetbrains.annotations.NotNull()
    com.google.android.material.button.MaterialButton $this$accentBackgroundColor) {
    }
    
    public static final void accentOutlineColor(@org.jetbrains.annotations.NotNull()
    com.google.android.material.button.MaterialButton $this$accentOutlineColor) {
    }
    
    public static final void applyColor(@org.jetbrains.annotations.NotNull()
    android.widget.SeekBar $this$applyColor, @androidx.annotation.ColorInt()
    int color) {
    }
    
    public static final void accentColor(@org.jetbrains.annotations.NotNull()
    com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton $this$accentColor) {
    }
    
    public static final void accentColor(@org.jetbrains.annotations.NotNull()
    com.google.android.material.floatingactionbutton.FloatingActionButton $this$accentColor) {
    }
    
    public static final void applyColor(@org.jetbrains.annotations.NotNull()
    com.google.android.material.button.MaterialButton $this$applyColor, int color) {
    }
    
    public static final void accentColor(@org.jetbrains.annotations.NotNull()
    com.google.android.material.button.MaterialButton $this$accentColor) {
    }
    
    public static final void applyOutlineColor(@org.jetbrains.annotations.NotNull()
    com.google.android.material.button.MaterialButton $this$applyOutlineColor, int color) {
    }
    
    public static final void accentColor(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout $this$accentColor) {
    }
    
    public static final void accentColor(@org.jetbrains.annotations.NotNull()
    com.google.android.material.progressindicator.ProgressIndicator $this$accentColor) {
    }
    
    public static final void applyColor(@org.jetbrains.annotations.NotNull()
    com.google.android.material.progressindicator.ProgressIndicator $this$applyColor, int color) {
    }
    
    public static final void accentColor(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText $this$accentColor) {
    }
    
    public static final int accentColor(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView $this$accentColor) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.CheckResult()
    public static final android.graphics.drawable.Drawable tint(@org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable $this$tint, @androidx.annotation.ColorInt()
    int color) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.CheckResult()
    public static final android.graphics.drawable.Drawable tint(@org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable $this$tint, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.ColorRes()
    int color) {
        return null;
    }
    
    @androidx.annotation.ColorInt()
    public static final int getColorCompat(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getColorCompat, @androidx.annotation.ColorRes()
    int colorRes) {
        return 0;
    }
}