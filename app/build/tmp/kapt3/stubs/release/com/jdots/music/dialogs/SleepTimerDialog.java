package com.jdots.music.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00060\u000eR\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/jdots/music/dialogs/SleepTimerDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "dialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "seekArcProgress", "", "seekBar", "Landroid/widget/SeekBar;", "shouldFinishLastSong", "Landroid/widget/CheckBox;", "timerDisplay", "Landroid/widget/TextView;", "timerUpdater", "Lcom/jdots/music/dialogs/SleepTimerDialog$TimerUpdater;", "makeTimerIntent", "Landroid/content/Intent;", "makeTimerPendingIntent", "Landroid/app/PendingIntent;", "flag", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "updateCancelButton", "", "updateTimeDisplayTime", "TimerUpdater", "app_release"})
public final class SleepTimerDialog extends androidx.fragment.app.DialogFragment {
    private int seekArcProgress = 0;
    private com.jdots.music.dialogs.SleepTimerDialog.TimerUpdater timerUpdater;
    private com.afollestad.materialdialogs.MaterialDialog dialog;
    private android.widget.CheckBox shouldFinishLastSong;
    private android.widget.SeekBar seekBar;
    private android.widget.TextView timerDisplay;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"InflateParams"})
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void updateTimeDisplayTime() {
    }
    
    private final android.app.PendingIntent makeTimerPendingIntent(int flag) {
        return null;
    }
    
    private final android.content.Intent makeTimerIntent() {
        return null;
    }
    
    private final void updateCancelButton() {
    }
    
    public SleepTimerDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/jdots/music/dialogs/SleepTimerDialog$TimerUpdater;", "Landroid/os/CountDownTimer;", "(Lcom/jdots/music/dialogs/SleepTimerDialog;)V", "onFinish", "", "onTick", "millisUntilFinished", "", "app_release"})
    final class TimerUpdater extends android.os.CountDownTimer {
        
        @java.lang.Override()
        public void onTick(long millisUntilFinished) {
        }
        
        @java.lang.Override()
        public void onFinish() {
        }
        
        public TimerUpdater() {
            super(0L, 0L);
        }
    }
}