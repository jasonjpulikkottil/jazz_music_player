package com.jdots.music;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0018"}, d2 = {"Lcom/jdots/music/Constants;", "", "()V", "APP_INSTAGRAM_LINK", "", "APP_TELEGRAM_LINK", "APP_TWITTER_LINK", "AUDIO_SCROBBLER_URL", "FAQ_LINK", "GITHUB_PROJECT", "IS_MUSIC", "NUMBER_OF_TOP_TRACKS", "", "PINTEREST", "RATE_ON_GOOGLE_PLAY", "TELEGRAM_CHANGE_LOG", "TRANSLATE", "USER_BANNER", "USER_PROFILE", "baseProjection", "", "getBaseProjection", "()[Ljava/lang/String;", "[Ljava/lang/String;", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RATE_ON_GOOGLE_PLAY = "https://play.google.com/store/apps/details?id=code.name.monkey.retromusic";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TRANSLATE = "https://github.com/h4h13/RetroMusicPlayer";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GITHUB_PROJECT = "https://github.com/MuntashirAkon/Metro";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TELEGRAM_CHANGE_LOG = "https://t.me/retromusiclog";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_PROFILE = "profile.jpg";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_BANNER = "banner.jpg";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APP_INSTAGRAM_LINK = "https://www.instagram.com/retromusicapp/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APP_TELEGRAM_LINK = "https://t.me/retromusicapp/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APP_TWITTER_LINK = "https://twitter.com/retromusicapp";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FAQ_LINK = "https://github.com/h4h13/RetroMusicPlayer/blob/master/FAQ.md";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PINTEREST = "https://in.pinterest.com/retromusicapp/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AUDIO_SCROBBLER_URL = "https://ws.audioscrobbler.com/2.0/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IS_MUSIC = "is_music=1 AND title != \'\'";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] baseProjection = {"_id", "title", "track", "year", "duration", "_data", "date_modified", "album_id", "album", "artist_id", "artist", "composer", "album_artist"};
    public static final int NUMBER_OF_TOP_TRACKS = 99;
    public static final com.jdots.music.Constants INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getBaseProjection() {
        return null;
    }
    
    private Constants() {
        super();
    }
}