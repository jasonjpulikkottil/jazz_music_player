package com.jdots.music.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\tH\u0002\u00a8\u0006\u0018"}, d2 = {"Lcom/jdots/music/activities/SettingsActivity;", "Lcom/jdots/music/activities/base/AbsBaseActivity;", "Lcom/afollestad/materialdialogs/color/ColorChooserDialog$ColorCallback;", "()V", "getStringFromDestination", "", "currentDestination", "Landroidx/navigation/NavDestination;", "onColorChooserDismissed", "", "dialog", "Lcom/afollestad/materialdialogs/color/ColorChooserDialog;", "onColorSelection", "selectedColor", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onSupportNavigateUp", "setupToolbar", "app_debug"})
public final class SettingsActivity extends com.jdots.music.activities.base.AbsBaseActivity implements com.afollestad.materialdialogs.color.ColorChooserDialog.ColorCallback {
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupToolbar() {
    }
    
    private final java.lang.String getStringFromDestination(androidx.navigation.NavDestination currentDestination) {
        return null;
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    @java.lang.Override()
    public void onColorSelection(@org.jetbrains.annotations.NotNull()
    com.afollestad.materialdialogs.color.ColorChooserDialog dialog, int selectedColor) {
    }
    
    @java.lang.Override()
    public void onColorChooserDismissed(@org.jetbrains.annotations.NotNull()
    com.afollestad.materialdialogs.color.ColorChooserDialog dialog) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public SettingsActivity() {
        super();
    }
}