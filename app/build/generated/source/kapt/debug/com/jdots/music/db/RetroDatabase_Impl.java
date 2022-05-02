package com.jdots.music.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RetroDatabase_Impl extends RetroDatabase {
  private volatile PlaylistDao _playlistDao;

  private volatile BlackListStoreDao _blackListStoreDao;

  private volatile PlayCountDao _playCountDao;

  private volatile HistoryDao _historyDao;

  private volatile LyricsDao _lyricsDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(22) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `PlaylistEntity` (`playlist_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `playlist_name` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `SongEntity` (`song_key` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `playlist_creator_id` INTEGER NOT NULL, `id` INTEGER NOT NULL, `title` TEXT NOT NULL, `track_number` INTEGER NOT NULL, `year` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `data` TEXT NOT NULL, `date_modified` INTEGER NOT NULL, `album_id` INTEGER NOT NULL, `album_name` TEXT NOT NULL, `artist_id` INTEGER NOT NULL, `artist_name` TEXT NOT NULL, `composer` TEXT, `album_artist` TEXT)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_SongEntity_playlist_creator_id_id` ON `SongEntity` (`playlist_creator_id`, `id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `HistoryEntity` (`id` INTEGER NOT NULL, `title` TEXT NOT NULL, `track_number` INTEGER NOT NULL, `year` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `data` TEXT NOT NULL, `date_modified` INTEGER NOT NULL, `album_id` INTEGER NOT NULL, `album_name` TEXT NOT NULL, `artist_id` INTEGER NOT NULL, `artist_name` TEXT NOT NULL, `composer` TEXT, `album_artist` TEXT, `time_played` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `PlayCountEntity` (`id` INTEGER NOT NULL, `title` TEXT NOT NULL, `track_number` INTEGER NOT NULL, `year` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `data` TEXT NOT NULL, `date_modified` INTEGER NOT NULL, `album_id` INTEGER NOT NULL, `album_name` TEXT NOT NULL, `artist_id` INTEGER NOT NULL, `artist_name` TEXT NOT NULL, `composer` TEXT, `album_artist` TEXT, `time_played` INTEGER NOT NULL, `play_count` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `BlackListStoreEntity` (`path` TEXT NOT NULL, PRIMARY KEY(`path`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `LyricsEntity` (`songId` INTEGER NOT NULL, `lyrics` TEXT NOT NULL, PRIMARY KEY(`songId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3f16babc4d4594b33839b33057bdb2c1')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `PlaylistEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `SongEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `HistoryEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `PlayCountEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `BlackListStoreEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `LyricsEntity`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsPlaylistEntity = new HashMap<String, TableInfo.Column>(2);
        _columnsPlaylistEntity.put("playlist_id", new TableInfo.Column("playlist_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlaylistEntity.put("playlist_name", new TableInfo.Column("playlist_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPlaylistEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPlaylistEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPlaylistEntity = new TableInfo("PlaylistEntity", _columnsPlaylistEntity, _foreignKeysPlaylistEntity, _indicesPlaylistEntity);
        final TableInfo _existingPlaylistEntity = TableInfo.read(_db, "PlaylistEntity");
        if (! _infoPlaylistEntity.equals(_existingPlaylistEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "PlaylistEntity(com.jdots.music.db.PlaylistEntity).\n"
                  + " Expected:\n" + _infoPlaylistEntity + "\n"
                  + " Found:\n" + _existingPlaylistEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsSongEntity = new HashMap<String, TableInfo.Column>(15);
        _columnsSongEntity.put("song_key", new TableInfo.Column("song_key", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSongEntity.put("playlist_creator_id", new TableInfo.Column("playlist_creator_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSongEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSongEntity.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSongEntity.put("track_number", new TableInfo.Column("track_number", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSongEntity.put("year", new TableInfo.Column("year", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSongEntity.put("duration", new TableInfo.Column("duration", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSongEntity.put("data", new TableInfo.Column("data", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSongEntity.put("date_modified", new TableInfo.Column("date_modified", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSongEntity.put("album_id", new TableInfo.Column("album_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSongEntity.put("album_name", new TableInfo.Column("album_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSongEntity.put("artist_id", new TableInfo.Column("artist_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSongEntity.put("artist_name", new TableInfo.Column("artist_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSongEntity.put("composer", new TableInfo.Column("composer", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSongEntity.put("album_artist", new TableInfo.Column("album_artist", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSongEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSongEntity = new HashSet<TableInfo.Index>(1);
        _indicesSongEntity.add(new TableInfo.Index("index_SongEntity_playlist_creator_id_id", true, Arrays.asList("playlist_creator_id","id")));
        final TableInfo _infoSongEntity = new TableInfo("SongEntity", _columnsSongEntity, _foreignKeysSongEntity, _indicesSongEntity);
        final TableInfo _existingSongEntity = TableInfo.read(_db, "SongEntity");
        if (! _infoSongEntity.equals(_existingSongEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "SongEntity(com.jdots.music.db.SongEntity).\n"
                  + " Expected:\n" + _infoSongEntity + "\n"
                  + " Found:\n" + _existingSongEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsHistoryEntity = new HashMap<String, TableInfo.Column>(14);
        _columnsHistoryEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntity.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntity.put("track_number", new TableInfo.Column("track_number", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntity.put("year", new TableInfo.Column("year", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntity.put("duration", new TableInfo.Column("duration", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntity.put("data", new TableInfo.Column("data", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntity.put("date_modified", new TableInfo.Column("date_modified", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntity.put("album_id", new TableInfo.Column("album_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntity.put("album_name", new TableInfo.Column("album_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntity.put("artist_id", new TableInfo.Column("artist_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntity.put("artist_name", new TableInfo.Column("artist_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntity.put("composer", new TableInfo.Column("composer", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntity.put("album_artist", new TableInfo.Column("album_artist", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntity.put("time_played", new TableInfo.Column("time_played", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHistoryEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHistoryEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoHistoryEntity = new TableInfo("HistoryEntity", _columnsHistoryEntity, _foreignKeysHistoryEntity, _indicesHistoryEntity);
        final TableInfo _existingHistoryEntity = TableInfo.read(_db, "HistoryEntity");
        if (! _infoHistoryEntity.equals(_existingHistoryEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "HistoryEntity(com.jdots.music.db.HistoryEntity).\n"
                  + " Expected:\n" + _infoHistoryEntity + "\n"
                  + " Found:\n" + _existingHistoryEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsPlayCountEntity = new HashMap<String, TableInfo.Column>(15);
        _columnsPlayCountEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlayCountEntity.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlayCountEntity.put("track_number", new TableInfo.Column("track_number", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlayCountEntity.put("year", new TableInfo.Column("year", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlayCountEntity.put("duration", new TableInfo.Column("duration", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlayCountEntity.put("data", new TableInfo.Column("data", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlayCountEntity.put("date_modified", new TableInfo.Column("date_modified", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlayCountEntity.put("album_id", new TableInfo.Column("album_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlayCountEntity.put("album_name", new TableInfo.Column("album_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlayCountEntity.put("artist_id", new TableInfo.Column("artist_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlayCountEntity.put("artist_name", new TableInfo.Column("artist_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlayCountEntity.put("composer", new TableInfo.Column("composer", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlayCountEntity.put("album_artist", new TableInfo.Column("album_artist", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlayCountEntity.put("time_played", new TableInfo.Column("time_played", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlayCountEntity.put("play_count", new TableInfo.Column("play_count", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPlayCountEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPlayCountEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPlayCountEntity = new TableInfo("PlayCountEntity", _columnsPlayCountEntity, _foreignKeysPlayCountEntity, _indicesPlayCountEntity);
        final TableInfo _existingPlayCountEntity = TableInfo.read(_db, "PlayCountEntity");
        if (! _infoPlayCountEntity.equals(_existingPlayCountEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "PlayCountEntity(com.jdots.music.db.PlayCountEntity).\n"
                  + " Expected:\n" + _infoPlayCountEntity + "\n"
                  + " Found:\n" + _existingPlayCountEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsBlackListStoreEntity = new HashMap<String, TableInfo.Column>(1);
        _columnsBlackListStoreEntity.put("path", new TableInfo.Column("path", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBlackListStoreEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesBlackListStoreEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoBlackListStoreEntity = new TableInfo("BlackListStoreEntity", _columnsBlackListStoreEntity, _foreignKeysBlackListStoreEntity, _indicesBlackListStoreEntity);
        final TableInfo _existingBlackListStoreEntity = TableInfo.read(_db, "BlackListStoreEntity");
        if (! _infoBlackListStoreEntity.equals(_existingBlackListStoreEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "BlackListStoreEntity(com.jdots.music.db.BlackListStoreEntity).\n"
                  + " Expected:\n" + _infoBlackListStoreEntity + "\n"
                  + " Found:\n" + _existingBlackListStoreEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsLyricsEntity = new HashMap<String, TableInfo.Column>(2);
        _columnsLyricsEntity.put("songId", new TableInfo.Column("songId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLyricsEntity.put("lyrics", new TableInfo.Column("lyrics", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLyricsEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLyricsEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLyricsEntity = new TableInfo("LyricsEntity", _columnsLyricsEntity, _foreignKeysLyricsEntity, _indicesLyricsEntity);
        final TableInfo _existingLyricsEntity = TableInfo.read(_db, "LyricsEntity");
        if (! _infoLyricsEntity.equals(_existingLyricsEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "LyricsEntity(com.jdots.music.db.LyricsEntity).\n"
                  + " Expected:\n" + _infoLyricsEntity + "\n"
                  + " Found:\n" + _existingLyricsEntity);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "3f16babc4d4594b33839b33057bdb2c1", "8d1f03f0cf4c959b1096e1e5871b8d65");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "PlaylistEntity","SongEntity","HistoryEntity","PlayCountEntity","BlackListStoreEntity","LyricsEntity");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `PlaylistEntity`");
      _db.execSQL("DELETE FROM `SongEntity`");
      _db.execSQL("DELETE FROM `HistoryEntity`");
      _db.execSQL("DELETE FROM `PlayCountEntity`");
      _db.execSQL("DELETE FROM `BlackListStoreEntity`");
      _db.execSQL("DELETE FROM `LyricsEntity`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public PlaylistDao playlistDao() {
    if (_playlistDao != null) {
      return _playlistDao;
    } else {
      synchronized(this) {
        if(_playlistDao == null) {
          _playlistDao = new PlaylistDao_Impl(this);
        }
        return _playlistDao;
      }
    }
  }

  @Override
  public BlackListStoreDao blackListStore() {
    if (_blackListStoreDao != null) {
      return _blackListStoreDao;
    } else {
      synchronized(this) {
        if(_blackListStoreDao == null) {
          _blackListStoreDao = new BlackListStoreDao_Impl(this);
        }
        return _blackListStoreDao;
      }
    }
  }

  @Override
  public PlayCountDao playCountDao() {
    if (_playCountDao != null) {
      return _playCountDao;
    } else {
      synchronized(this) {
        if(_playCountDao == null) {
          _playCountDao = new PlayCountDao_Impl(this);
        }
        return _playCountDao;
      }
    }
  }

  @Override
  public HistoryDao historyDao() {
    if (_historyDao != null) {
      return _historyDao;
    } else {
      synchronized(this) {
        if(_historyDao == null) {
          _historyDao = new HistoryDao_Impl(this);
        }
        return _historyDao;
      }
    }
  }

  @Override
  public LyricsDao lyricsDao() {
    if (_lyricsDao != null) {
      return _lyricsDao;
    } else {
      synchronized(this) {
        if(_lyricsDao == null) {
          _lyricsDao = new LyricsDao_Impl(this);
        }
        return _lyricsDao;
      }
    }
  }
}
