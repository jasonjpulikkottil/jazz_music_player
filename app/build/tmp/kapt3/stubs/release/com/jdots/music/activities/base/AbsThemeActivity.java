package com.jdots.music.activities.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u0007H\u0002J\u0006\u0010\u000b\u001a\u00020\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0014J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\rH\u0016J\b\u0010\u001a\u001a\u00020\u0007H\u0002J\b\u0010\u001b\u001a\u00020\u0007H\u0016J\u0006\u0010\u001c\u001a\u00020\u0007J\u0006\u0010\u001d\u001a\u00020\u0007J\b\u0010\u001e\u001a\u00020\u0007H\u0002J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\rH\u0016J\u0010\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\rH\u0016J\u000e\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0014J\u0010\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0014H\u0016J\u0006\u0010&\u001a\u00020\u0007J\u000e\u0010\'\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0014J\u0006\u0010(\u001a\u00020\u0007J\u0012\u0010)\u001a\u00020\u00072\b\b\u0001\u0010%\u001a\u00020\u0014H\u0016J\u0006\u0010*\u001a\u00020\u0007J\b\u0010+\u001a\u00020\u0007H\u0002J\b\u0010,\u001a\u00020\u0007H\u0002J\b\u0010-\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/jdots/music/activities/base/AbsThemeActivity;", "Lcode/name/monkey/appthemehelper/common/ATHToolbarActivity;", "Ljava/lang/Runnable;", "()V", "handler", "Landroid/os/Handler;", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "exitFullscreen", "hideStatusBar", "fullscreen", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onKeyDown", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onStop", "onWindowFocusChanged", "hasFocus", "registerSystemUiVisibility", "run", "setDrawUnderNavigationBar", "setDrawUnderStatusBar", "setImmersiveFullscreen", "setLightNavigationBar", "enabled", "setLightStatusbar", "setLightStatusbarAuto", "bgColor", "setNavigationbarColor", "color", "setNavigationbarColorAuto", "setStatusbarColor", "setStatusbarColorAuto", "setTaskDescriptionColor", "setTaskDescriptionColorAuto", "toggleScreenOn", "unregisterSystemUiVisibility", "updateTheme", "app_release"})
public abstract class AbsThemeActivity extends code.name.monkey.appthemehelper.common.ATHToolbarActivity implements java.lang.Runnable {
    private final android.os.Handler handler = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void updateTheme() {
    }
    
    private final void toggleScreenOn() {
    }
    
    @java.lang.Override()
    public void onWindowFocusChanged(boolean hasFocus) {
    }
    
    public final void hideStatusBar() {
    }
    
    private final void hideStatusBar(boolean fullscreen) {
    }
    
    public final void setDrawUnderStatusBar() {
    }
    
    public final void setDrawUnderNavigationBar() {
    }
    
    /**
     * This will set the color of the view with the id "status_bar" on KitKat and Lollipop. On
     * Lollipop if no such view is found it will set the statusbar color using the native method.
     *
     * @param color the new statusbar color (will be shifted down on Lollipop and above)
     */
    public final void setStatusbarColor(int color) {
    }
    
    public final void setStatusbarColorAuto() {
    }
    
    public void setTaskDescriptionColor(@androidx.annotation.ColorInt()
    int color) {
    }
    
    public final void setTaskDescriptionColorAuto() {
    }
    
    public void setNavigationbarColor(int color) {
    }
    
    public final void setNavigationbarColorAuto() {
    }
    
    public void setLightStatusbar(boolean enabled) {
    }
    
    public final void setLightStatusbarAuto(int bgColor) {
    }
    
    public void setLightNavigationBar(boolean enabled) {
    }
    
    private final void registerSystemUiVisibility() {
    }
    
    private final void unregisterSystemUiVisibility() {
    }
    
    private final void setImmersiveFullscreen() {
    }
    
    private final void exitFullscreen() {
    }
    
    @java.lang.Override()
    public void run() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public boolean onKeyDown(int keyCode, @org.jetbrains.annotations.NotNull()
    android.view.KeyEvent event) {
        return false;
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.Nullable()
    android.content.Context newBase) {
    }
    
    public AbsThemeActivity() {
        super();
    }
}