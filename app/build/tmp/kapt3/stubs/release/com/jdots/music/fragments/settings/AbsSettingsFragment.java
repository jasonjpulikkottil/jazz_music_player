package com.jdots.music.fragments.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0000\u00a2\u0006\u0002\b\u0010J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0004\u00a8\u0006\u0011"}, d2 = {"Lcom/jdots/music/fragments/settings/AbsSettingsFragment;", "Lcode/name/monkey/appthemehelper/common/prefs/supportv7/ATEPreferenceFragmentCompat;", "()V", "invalidateSettings", "", "onDisplayPreferenceDialog", "preference", "Landroidx/preference/Preference;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setSummary", "value", "", "setSummary$app_release", "app_release"})
public abstract class AbsSettingsFragment extends code.name.monkey.appthemehelper.common.prefs.supportv7.ATEPreferenceFragmentCompat {
    private java.util.HashMap _$_findViewCache;
    
    public final void setSummary$app_release(@org.jetbrains.annotations.NotNull()
    androidx.preference.Preference preference, @org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
    }
    
    public abstract void invalidateSettings();
    
    protected final void setSummary(@org.jetbrains.annotations.Nullable()
    androidx.preference.Preference preference) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDisplayPreferenceDialog(@org.jetbrains.annotations.Nullable()
    androidx.preference.Preference preference) {
    }
    
    public AbsSettingsFragment() {
        super();
    }
}