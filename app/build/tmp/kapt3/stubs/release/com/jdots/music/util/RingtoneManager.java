package com.jdots.music.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/jdots/music/util/RingtoneManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setRingtone", "", "song", "Lcom/jdots/music/model/Song;", "Companion", "app_release"})
public final class RingtoneManager {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    public static final com.jdots.music.util.RingtoneManager.Companion Companion = null;
    
    public final void setRingtone(@org.jetbrains.annotations.NotNull()
    com.jdots.music.model.Song song) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public RingtoneManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\t"}, d2 = {"Lcom/jdots/music/util/RingtoneManager$Companion;", "", "()V", "getDialog", "Landroidx/appcompat/app/AlertDialog;", "context", "Landroid/content/Context;", "requiresDialog", "", "app_release"})
    public static final class Companion {
        
        public final boolean requiresDialog(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.app.AlertDialog getDialog(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}