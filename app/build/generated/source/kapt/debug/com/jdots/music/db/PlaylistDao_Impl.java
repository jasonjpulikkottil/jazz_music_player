package com.jdots.music.db;

import android.database.Cursor;
import androidx.collection.LongSparseArray;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PlaylistDao_Impl implements PlaylistDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PlaylistEntity> __insertionAdapterOfPlaylistEntity;

  private final EntityInsertionAdapter<SongEntity> __insertionAdapterOfSongEntity;

  private final EntityDeletionOrUpdateAdapter<PlaylistEntity> __deletionAdapterOfPlaylistEntity;

  private final EntityDeletionOrUpdateAdapter<SongEntity> __deletionAdapterOfSongEntity;

  private final SharedSQLiteStatement __preparedStmtOfRenamePlaylist;

  private final SharedSQLiteStatement __preparedStmtOfDeletePlaylistSongs;

  private final SharedSQLiteStatement __preparedStmtOfDeleteSongFromPlaylist;

  public PlaylistDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPlaylistEntity = new EntityInsertionAdapter<PlaylistEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `PlaylistEntity` (`playlist_id`,`playlist_name`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PlaylistEntity value) {
        stmt.bindLong(1, value.getPlayListId());
        if (value.getPlaylistName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPlaylistName());
        }
      }
    };
    this.__insertionAdapterOfSongEntity = new EntityInsertionAdapter<SongEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `SongEntity` (`song_key`,`playlist_creator_id`,`id`,`title`,`track_number`,`year`,`duration`,`data`,`date_modified`,`album_id`,`album_name`,`artist_id`,`artist_name`,`composer`,`album_artist`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SongEntity value) {
        stmt.bindLong(1, value.getSongPrimaryKey());
        stmt.bindLong(2, value.getPlaylistCreatorId());
        stmt.bindLong(3, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTitle());
        }
        stmt.bindLong(5, value.getTrackNumber());
        stmt.bindLong(6, value.getYear());
        stmt.bindLong(7, value.getDuration());
        if (value.getData() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getData());
        }
        stmt.bindLong(9, value.getDateModified());
        stmt.bindLong(10, value.getAlbumId());
        if (value.getAlbumName() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getAlbumName());
        }
        stmt.bindLong(12, value.getArtistId());
        if (value.getArtistName() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getArtistName());
        }
        if (value.getComposer() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getComposer());
        }
        if (value.getAlbumArtist() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getAlbumArtist());
        }
      }
    };
    this.__deletionAdapterOfPlaylistEntity = new EntityDeletionOrUpdateAdapter<PlaylistEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `PlaylistEntity` WHERE `playlist_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PlaylistEntity value) {
        stmt.bindLong(1, value.getPlayListId());
      }
    };
    this.__deletionAdapterOfSongEntity = new EntityDeletionOrUpdateAdapter<SongEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `SongEntity` WHERE `song_key` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SongEntity value) {
        stmt.bindLong(1, value.getSongPrimaryKey());
      }
    };
    this.__preparedStmtOfRenamePlaylist = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE PlaylistEntity SET playlist_name = ? WHERE playlist_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeletePlaylistSongs = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM SongEntity WHERE playlist_creator_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteSongFromPlaylist = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM SongEntity WHERE playlist_creator_id = ? AND id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object createPlaylist(final PlaylistEntity playlistEntity,
      final Continuation<? super Long> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfPlaylistEntity.insertAndReturnId(playlistEntity);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertSongsToPlaylist(final List<SongEntity> songEntities,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSongEntity.insert(songEntities);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deletePlaylist(final PlaylistEntity playlistEntity,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfPlaylistEntity.handle(playlistEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deletePlaylists(final List<PlaylistEntity> playlistEntities,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfPlaylistEntity.handleMultiple(playlistEntities);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deletePlaylistSongs(final List<SongEntity> songs,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfSongEntity.handleMultiple(songs);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object renamePlaylist(final long playlistId, final String name,
      final Continuation<? super Unit> p2) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfRenamePlaylist.acquire();
        int _argIndex = 1;
        if (name == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, name);
        }
        _argIndex = 2;
        _stmt.bindLong(_argIndex, playlistId);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfRenamePlaylist.release(_stmt);
        }
      }
    }, p2);
  }

  @Override
  public Object deletePlaylistSongs(final long playlistId, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeletePlaylistSongs.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, playlistId);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeletePlaylistSongs.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public Object deleteSongFromPlaylist(final long playlistId, final long songId,
      final Continuation<? super Unit> p2) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteSongFromPlaylist.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, playlistId);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, songId);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteSongFromPlaylist.release(_stmt);
        }
      }
    }, p2);
  }

  @Override
  public List<PlaylistEntity> isPlaylistExists(final String name) {
    final String _sql = "SELECT * FROM PlaylistEntity WHERE playlist_name = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (name == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, name);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfPlayListId = CursorUtil.getColumnIndexOrThrow(_cursor, "playlist_id");
      final int _cursorIndexOfPlaylistName = CursorUtil.getColumnIndexOrThrow(_cursor, "playlist_name");
      final List<PlaylistEntity> _result = new ArrayList<PlaylistEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final PlaylistEntity _item;
        final long _tmpPlayListId;
        _tmpPlayListId = _cursor.getLong(_cursorIndexOfPlayListId);
        final String _tmpPlaylistName;
        _tmpPlaylistName = _cursor.getString(_cursorIndexOfPlaylistName);
        _item = new PlaylistEntity(_tmpPlayListId,_tmpPlaylistName);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Object playlists(final Continuation<? super List<PlaylistEntity>> p0) {
    final String _sql = "SELECT * FROM PlaylistEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<PlaylistEntity>>() {
      @Override
      public List<PlaylistEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPlayListId = CursorUtil.getColumnIndexOrThrow(_cursor, "playlist_id");
          final int _cursorIndexOfPlaylistName = CursorUtil.getColumnIndexOrThrow(_cursor, "playlist_name");
          final List<PlaylistEntity> _result = new ArrayList<PlaylistEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final PlaylistEntity _item;
            final long _tmpPlayListId;
            _tmpPlayListId = _cursor.getLong(_cursorIndexOfPlayListId);
            final String _tmpPlaylistName;
            _tmpPlaylistName = _cursor.getString(_cursorIndexOfPlaylistName);
            _item = new PlaylistEntity(_tmpPlayListId,_tmpPlaylistName);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object playlistsWithSongs(final Continuation<? super List<PlaylistWithSongs>> p0) {
    final String _sql = "SELECT * FROM PlaylistEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, true, new Callable<List<PlaylistWithSongs>>() {
      @Override
      public List<PlaylistWithSongs> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfPlayListId = CursorUtil.getColumnIndexOrThrow(_cursor, "playlist_id");
            final int _cursorIndexOfPlaylistName = CursorUtil.getColumnIndexOrThrow(_cursor, "playlist_name");
            final LongSparseArray<ArrayList<SongEntity>> _collectionSongs = new LongSparseArray<ArrayList<SongEntity>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfPlayListId);
              ArrayList<SongEntity> _tmpSongsCollection = _collectionSongs.get(_tmpKey);
              if (_tmpSongsCollection == null) {
                _tmpSongsCollection = new ArrayList<SongEntity>();
                _collectionSongs.put(_tmpKey, _tmpSongsCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipSongEntityAscomJdotsMusicDbSongEntity(_collectionSongs);
            final List<PlaylistWithSongs> _result = new ArrayList<PlaylistWithSongs>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final PlaylistWithSongs _item;
              final PlaylistEntity _tmpPlaylistEntity;
              if (! (_cursor.isNull(_cursorIndexOfPlayListId) && _cursor.isNull(_cursorIndexOfPlaylistName))) {
                final long _tmpPlayListId;
                _tmpPlayListId = _cursor.getLong(_cursorIndexOfPlayListId);
                final String _tmpPlaylistName;
                _tmpPlaylistName = _cursor.getString(_cursorIndexOfPlaylistName);
                _tmpPlaylistEntity = new PlaylistEntity(_tmpPlayListId,_tmpPlaylistName);
              }  else  {
                _tmpPlaylistEntity = null;
              }
              ArrayList<SongEntity> _tmpSongsCollection_1 = null;
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfPlayListId);
              _tmpSongsCollection_1 = _collectionSongs.get(_tmpKey_1);
              if (_tmpSongsCollection_1 == null) {
                _tmpSongsCollection_1 = new ArrayList<SongEntity>();
              }
              _item = new PlaylistWithSongs(_tmpPlaylistEntity,_tmpSongsCollection_1);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
            _statement.release();
          }
        } finally {
          __db.endTransaction();
        }
      }
    }, p0);
  }

  @Override
  public Object isSongExistsInPlaylist(final long playlistId, final long songId,
      final Continuation<? super List<SongEntity>> p2) {
    final String _sql = "SELECT * FROM SongEntity WHERE playlist_creator_id = ? AND id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, playlistId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, songId);
    return CoroutinesRoom.execute(__db, false, new Callable<List<SongEntity>>() {
      @Override
      public List<SongEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfSongPrimaryKey = CursorUtil.getColumnIndexOrThrow(_cursor, "song_key");
          final int _cursorIndexOfPlaylistCreatorId = CursorUtil.getColumnIndexOrThrow(_cursor, "playlist_creator_id");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfTrackNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "track_number");
          final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
          final int _cursorIndexOfDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "duration");
          final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "data");
          final int _cursorIndexOfDateModified = CursorUtil.getColumnIndexOrThrow(_cursor, "date_modified");
          final int _cursorIndexOfAlbumId = CursorUtil.getColumnIndexOrThrow(_cursor, "album_id");
          final int _cursorIndexOfAlbumName = CursorUtil.getColumnIndexOrThrow(_cursor, "album_name");
          final int _cursorIndexOfArtistId = CursorUtil.getColumnIndexOrThrow(_cursor, "artist_id");
          final int _cursorIndexOfArtistName = CursorUtil.getColumnIndexOrThrow(_cursor, "artist_name");
          final int _cursorIndexOfComposer = CursorUtil.getColumnIndexOrThrow(_cursor, "composer");
          final int _cursorIndexOfAlbumArtist = CursorUtil.getColumnIndexOrThrow(_cursor, "album_artist");
          final List<SongEntity> _result = new ArrayList<SongEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SongEntity _item;
            final long _tmpSongPrimaryKey;
            _tmpSongPrimaryKey = _cursor.getLong(_cursorIndexOfSongPrimaryKey);
            final long _tmpPlaylistCreatorId;
            _tmpPlaylistCreatorId = _cursor.getLong(_cursorIndexOfPlaylistCreatorId);
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final int _tmpTrackNumber;
            _tmpTrackNumber = _cursor.getInt(_cursorIndexOfTrackNumber);
            final int _tmpYear;
            _tmpYear = _cursor.getInt(_cursorIndexOfYear);
            final long _tmpDuration;
            _tmpDuration = _cursor.getLong(_cursorIndexOfDuration);
            final String _tmpData;
            _tmpData = _cursor.getString(_cursorIndexOfData);
            final long _tmpDateModified;
            _tmpDateModified = _cursor.getLong(_cursorIndexOfDateModified);
            final long _tmpAlbumId;
            _tmpAlbumId = _cursor.getLong(_cursorIndexOfAlbumId);
            final String _tmpAlbumName;
            _tmpAlbumName = _cursor.getString(_cursorIndexOfAlbumName);
            final long _tmpArtistId;
            _tmpArtistId = _cursor.getLong(_cursorIndexOfArtistId);
            final String _tmpArtistName;
            _tmpArtistName = _cursor.getString(_cursorIndexOfArtistName);
            final String _tmpComposer;
            _tmpComposer = _cursor.getString(_cursorIndexOfComposer);
            final String _tmpAlbumArtist;
            _tmpAlbumArtist = _cursor.getString(_cursorIndexOfAlbumArtist);
            _item = new SongEntity(_tmpSongPrimaryKey,_tmpPlaylistCreatorId,_tmpId,_tmpTitle,_tmpTrackNumber,_tmpYear,_tmpDuration,_tmpData,_tmpDateModified,_tmpAlbumId,_tmpAlbumName,_tmpArtistId,_tmpArtistName,_tmpComposer,_tmpAlbumArtist);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p2);
  }

  @Override
  public LiveData<List<SongEntity>> songsFromPlaylist(final long playlistId) {
    final String _sql = "SELECT * FROM SongEntity WHERE playlist_creator_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, playlistId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"SongEntity"}, false, new Callable<List<SongEntity>>() {
      @Override
      public List<SongEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfSongPrimaryKey = CursorUtil.getColumnIndexOrThrow(_cursor, "song_key");
          final int _cursorIndexOfPlaylistCreatorId = CursorUtil.getColumnIndexOrThrow(_cursor, "playlist_creator_id");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfTrackNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "track_number");
          final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
          final int _cursorIndexOfDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "duration");
          final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "data");
          final int _cursorIndexOfDateModified = CursorUtil.getColumnIndexOrThrow(_cursor, "date_modified");
          final int _cursorIndexOfAlbumId = CursorUtil.getColumnIndexOrThrow(_cursor, "album_id");
          final int _cursorIndexOfAlbumName = CursorUtil.getColumnIndexOrThrow(_cursor, "album_name");
          final int _cursorIndexOfArtistId = CursorUtil.getColumnIndexOrThrow(_cursor, "artist_id");
          final int _cursorIndexOfArtistName = CursorUtil.getColumnIndexOrThrow(_cursor, "artist_name");
          final int _cursorIndexOfComposer = CursorUtil.getColumnIndexOrThrow(_cursor, "composer");
          final int _cursorIndexOfAlbumArtist = CursorUtil.getColumnIndexOrThrow(_cursor, "album_artist");
          final List<SongEntity> _result = new ArrayList<SongEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SongEntity _item;
            final long _tmpSongPrimaryKey;
            _tmpSongPrimaryKey = _cursor.getLong(_cursorIndexOfSongPrimaryKey);
            final long _tmpPlaylistCreatorId;
            _tmpPlaylistCreatorId = _cursor.getLong(_cursorIndexOfPlaylistCreatorId);
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final int _tmpTrackNumber;
            _tmpTrackNumber = _cursor.getInt(_cursorIndexOfTrackNumber);
            final int _tmpYear;
            _tmpYear = _cursor.getInt(_cursorIndexOfYear);
            final long _tmpDuration;
            _tmpDuration = _cursor.getLong(_cursorIndexOfDuration);
            final String _tmpData;
            _tmpData = _cursor.getString(_cursorIndexOfData);
            final long _tmpDateModified;
            _tmpDateModified = _cursor.getLong(_cursorIndexOfDateModified);
            final long _tmpAlbumId;
            _tmpAlbumId = _cursor.getLong(_cursorIndexOfAlbumId);
            final String _tmpAlbumName;
            _tmpAlbumName = _cursor.getString(_cursorIndexOfAlbumName);
            final long _tmpArtistId;
            _tmpArtistId = _cursor.getLong(_cursorIndexOfArtistId);
            final String _tmpArtistName;
            _tmpArtistName = _cursor.getString(_cursorIndexOfArtistName);
            final String _tmpComposer;
            _tmpComposer = _cursor.getString(_cursorIndexOfComposer);
            final String _tmpAlbumArtist;
            _tmpAlbumArtist = _cursor.getString(_cursorIndexOfAlbumArtist);
            _item = new SongEntity(_tmpSongPrimaryKey,_tmpPlaylistCreatorId,_tmpId,_tmpTitle,_tmpTrackNumber,_tmpYear,_tmpDuration,_tmpData,_tmpDateModified,_tmpAlbumId,_tmpAlbumName,_tmpArtistId,_tmpArtistName,_tmpComposer,_tmpAlbumArtist);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<SongEntity>> favoritesSongsLiveData(final long playlistId) {
    final String _sql = "SELECT * FROM SongEntity WHERE playlist_creator_id= ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, playlistId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"SongEntity"}, false, new Callable<List<SongEntity>>() {
      @Override
      public List<SongEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfSongPrimaryKey = CursorUtil.getColumnIndexOrThrow(_cursor, "song_key");
          final int _cursorIndexOfPlaylistCreatorId = CursorUtil.getColumnIndexOrThrow(_cursor, "playlist_creator_id");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfTrackNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "track_number");
          final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
          final int _cursorIndexOfDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "duration");
          final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "data");
          final int _cursorIndexOfDateModified = CursorUtil.getColumnIndexOrThrow(_cursor, "date_modified");
          final int _cursorIndexOfAlbumId = CursorUtil.getColumnIndexOrThrow(_cursor, "album_id");
          final int _cursorIndexOfAlbumName = CursorUtil.getColumnIndexOrThrow(_cursor, "album_name");
          final int _cursorIndexOfArtistId = CursorUtil.getColumnIndexOrThrow(_cursor, "artist_id");
          final int _cursorIndexOfArtistName = CursorUtil.getColumnIndexOrThrow(_cursor, "artist_name");
          final int _cursorIndexOfComposer = CursorUtil.getColumnIndexOrThrow(_cursor, "composer");
          final int _cursorIndexOfAlbumArtist = CursorUtil.getColumnIndexOrThrow(_cursor, "album_artist");
          final List<SongEntity> _result = new ArrayList<SongEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SongEntity _item;
            final long _tmpSongPrimaryKey;
            _tmpSongPrimaryKey = _cursor.getLong(_cursorIndexOfSongPrimaryKey);
            final long _tmpPlaylistCreatorId;
            _tmpPlaylistCreatorId = _cursor.getLong(_cursorIndexOfPlaylistCreatorId);
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final int _tmpTrackNumber;
            _tmpTrackNumber = _cursor.getInt(_cursorIndexOfTrackNumber);
            final int _tmpYear;
            _tmpYear = _cursor.getInt(_cursorIndexOfYear);
            final long _tmpDuration;
            _tmpDuration = _cursor.getLong(_cursorIndexOfDuration);
            final String _tmpData;
            _tmpData = _cursor.getString(_cursorIndexOfData);
            final long _tmpDateModified;
            _tmpDateModified = _cursor.getLong(_cursorIndexOfDateModified);
            final long _tmpAlbumId;
            _tmpAlbumId = _cursor.getLong(_cursorIndexOfAlbumId);
            final String _tmpAlbumName;
            _tmpAlbumName = _cursor.getString(_cursorIndexOfAlbumName);
            final long _tmpArtistId;
            _tmpArtistId = _cursor.getLong(_cursorIndexOfArtistId);
            final String _tmpArtistName;
            _tmpArtistName = _cursor.getString(_cursorIndexOfArtistName);
            final String _tmpComposer;
            _tmpComposer = _cursor.getString(_cursorIndexOfComposer);
            final String _tmpAlbumArtist;
            _tmpAlbumArtist = _cursor.getString(_cursorIndexOfAlbumArtist);
            _item = new SongEntity(_tmpSongPrimaryKey,_tmpPlaylistCreatorId,_tmpId,_tmpTitle,_tmpTrackNumber,_tmpYear,_tmpDuration,_tmpData,_tmpDateModified,_tmpAlbumId,_tmpAlbumName,_tmpArtistId,_tmpArtistName,_tmpComposer,_tmpAlbumArtist);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public List<SongEntity> favoritesSongs(final long playlistId) {
    final String _sql = "SELECT * FROM SongEntity WHERE playlist_creator_id= ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, playlistId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfSongPrimaryKey = CursorUtil.getColumnIndexOrThrow(_cursor, "song_key");
      final int _cursorIndexOfPlaylistCreatorId = CursorUtil.getColumnIndexOrThrow(_cursor, "playlist_creator_id");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfTrackNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "track_number");
      final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
      final int _cursorIndexOfDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "duration");
      final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "data");
      final int _cursorIndexOfDateModified = CursorUtil.getColumnIndexOrThrow(_cursor, "date_modified");
      final int _cursorIndexOfAlbumId = CursorUtil.getColumnIndexOrThrow(_cursor, "album_id");
      final int _cursorIndexOfAlbumName = CursorUtil.getColumnIndexOrThrow(_cursor, "album_name");
      final int _cursorIndexOfArtistId = CursorUtil.getColumnIndexOrThrow(_cursor, "artist_id");
      final int _cursorIndexOfArtistName = CursorUtil.getColumnIndexOrThrow(_cursor, "artist_name");
      final int _cursorIndexOfComposer = CursorUtil.getColumnIndexOrThrow(_cursor, "composer");
      final int _cursorIndexOfAlbumArtist = CursorUtil.getColumnIndexOrThrow(_cursor, "album_artist");
      final List<SongEntity> _result = new ArrayList<SongEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SongEntity _item;
        final long _tmpSongPrimaryKey;
        _tmpSongPrimaryKey = _cursor.getLong(_cursorIndexOfSongPrimaryKey);
        final long _tmpPlaylistCreatorId;
        _tmpPlaylistCreatorId = _cursor.getLong(_cursorIndexOfPlaylistCreatorId);
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        final int _tmpTrackNumber;
        _tmpTrackNumber = _cursor.getInt(_cursorIndexOfTrackNumber);
        final int _tmpYear;
        _tmpYear = _cursor.getInt(_cursorIndexOfYear);
        final long _tmpDuration;
        _tmpDuration = _cursor.getLong(_cursorIndexOfDuration);
        final String _tmpData;
        _tmpData = _cursor.getString(_cursorIndexOfData);
        final long _tmpDateModified;
        _tmpDateModified = _cursor.getLong(_cursorIndexOfDateModified);
        final long _tmpAlbumId;
        _tmpAlbumId = _cursor.getLong(_cursorIndexOfAlbumId);
        final String _tmpAlbumName;
        _tmpAlbumName = _cursor.getString(_cursorIndexOfAlbumName);
        final long _tmpArtistId;
        _tmpArtistId = _cursor.getLong(_cursorIndexOfArtistId);
        final String _tmpArtistName;
        _tmpArtistName = _cursor.getString(_cursorIndexOfArtistName);
        final String _tmpComposer;
        _tmpComposer = _cursor.getString(_cursorIndexOfComposer);
        final String _tmpAlbumArtist;
        _tmpAlbumArtist = _cursor.getString(_cursorIndexOfAlbumArtist);
        _item = new SongEntity(_tmpSongPrimaryKey,_tmpPlaylistCreatorId,_tmpId,_tmpTitle,_tmpTrackNumber,_tmpYear,_tmpDuration,_tmpData,_tmpDateModified,_tmpAlbumId,_tmpAlbumName,_tmpArtistId,_tmpArtistName,_tmpComposer,_tmpAlbumArtist);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  private void __fetchRelationshipSongEntityAscomJdotsMusicDbSongEntity(final LongSparseArray<ArrayList<SongEntity>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<SongEntity>> _tmpInnerMap = new LongSparseArray<ArrayList<SongEntity>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipSongEntityAscomJdotsMusicDbSongEntity(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<SongEntity>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipSongEntityAscomJdotsMusicDbSongEntity(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `song_key`,`playlist_creator_id`,`id`,`title`,`track_number`,`year`,`duration`,`data`,`date_modified`,`album_id`,`album_name`,`artist_id`,`artist_name`,`composer`,`album_artist` FROM `SongEntity` WHERE `playlist_creator_id` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "playlist_creator_id");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfSongPrimaryKey = CursorUtil.getColumnIndex(_cursor, "song_key");
      final int _cursorIndexOfPlaylistCreatorId = CursorUtil.getColumnIndex(_cursor, "playlist_creator_id");
      final int _cursorIndexOfId = CursorUtil.getColumnIndex(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndex(_cursor, "title");
      final int _cursorIndexOfTrackNumber = CursorUtil.getColumnIndex(_cursor, "track_number");
      final int _cursorIndexOfYear = CursorUtil.getColumnIndex(_cursor, "year");
      final int _cursorIndexOfDuration = CursorUtil.getColumnIndex(_cursor, "duration");
      final int _cursorIndexOfData = CursorUtil.getColumnIndex(_cursor, "data");
      final int _cursorIndexOfDateModified = CursorUtil.getColumnIndex(_cursor, "date_modified");
      final int _cursorIndexOfAlbumId = CursorUtil.getColumnIndex(_cursor, "album_id");
      final int _cursorIndexOfAlbumName = CursorUtil.getColumnIndex(_cursor, "album_name");
      final int _cursorIndexOfArtistId = CursorUtil.getColumnIndex(_cursor, "artist_id");
      final int _cursorIndexOfArtistName = CursorUtil.getColumnIndex(_cursor, "artist_name");
      final int _cursorIndexOfComposer = CursorUtil.getColumnIndex(_cursor, "composer");
      final int _cursorIndexOfAlbumArtist = CursorUtil.getColumnIndex(_cursor, "album_artist");
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        ArrayList<SongEntity> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final SongEntity _item_1;
          final long _tmpSongPrimaryKey;
          if (_cursorIndexOfSongPrimaryKey == -1) {
            _tmpSongPrimaryKey = 0;
          } else {
            _tmpSongPrimaryKey = _cursor.getLong(_cursorIndexOfSongPrimaryKey);
          }
          final long _tmpPlaylistCreatorId;
          if (_cursorIndexOfPlaylistCreatorId == -1) {
            _tmpPlaylistCreatorId = 0;
          } else {
            _tmpPlaylistCreatorId = _cursor.getLong(_cursorIndexOfPlaylistCreatorId);
          }
          final long _tmpId;
          if (_cursorIndexOfId == -1) {
            _tmpId = 0;
          } else {
            _tmpId = _cursor.getLong(_cursorIndexOfId);
          }
          final String _tmpTitle;
          if (_cursorIndexOfTitle == -1) {
            _tmpTitle = null;
          } else {
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
          }
          final int _tmpTrackNumber;
          if (_cursorIndexOfTrackNumber == -1) {
            _tmpTrackNumber = 0;
          } else {
            _tmpTrackNumber = _cursor.getInt(_cursorIndexOfTrackNumber);
          }
          final int _tmpYear;
          if (_cursorIndexOfYear == -1) {
            _tmpYear = 0;
          } else {
            _tmpYear = _cursor.getInt(_cursorIndexOfYear);
          }
          final long _tmpDuration;
          if (_cursorIndexOfDuration == -1) {
            _tmpDuration = 0;
          } else {
            _tmpDuration = _cursor.getLong(_cursorIndexOfDuration);
          }
          final String _tmpData;
          if (_cursorIndexOfData == -1) {
            _tmpData = null;
          } else {
            _tmpData = _cursor.getString(_cursorIndexOfData);
          }
          final long _tmpDateModified;
          if (_cursorIndexOfDateModified == -1) {
            _tmpDateModified = 0;
          } else {
            _tmpDateModified = _cursor.getLong(_cursorIndexOfDateModified);
          }
          final long _tmpAlbumId;
          if (_cursorIndexOfAlbumId == -1) {
            _tmpAlbumId = 0;
          } else {
            _tmpAlbumId = _cursor.getLong(_cursorIndexOfAlbumId);
          }
          final String _tmpAlbumName;
          if (_cursorIndexOfAlbumName == -1) {
            _tmpAlbumName = null;
          } else {
            _tmpAlbumName = _cursor.getString(_cursorIndexOfAlbumName);
          }
          final long _tmpArtistId;
          if (_cursorIndexOfArtistId == -1) {
            _tmpArtistId = 0;
          } else {
            _tmpArtistId = _cursor.getLong(_cursorIndexOfArtistId);
          }
          final String _tmpArtistName;
          if (_cursorIndexOfArtistName == -1) {
            _tmpArtistName = null;
          } else {
            _tmpArtistName = _cursor.getString(_cursorIndexOfArtistName);
          }
          final String _tmpComposer;
          if (_cursorIndexOfComposer == -1) {
            _tmpComposer = null;
          } else {
            _tmpComposer = _cursor.getString(_cursorIndexOfComposer);
          }
          final String _tmpAlbumArtist;
          if (_cursorIndexOfAlbumArtist == -1) {
            _tmpAlbumArtist = null;
          } else {
            _tmpAlbumArtist = _cursor.getString(_cursorIndexOfAlbumArtist);
          }
          _item_1 = new SongEntity(_tmpSongPrimaryKey,_tmpPlaylistCreatorId,_tmpId,_tmpTitle,_tmpTrackNumber,_tmpYear,_tmpDuration,_tmpData,_tmpDateModified,_tmpAlbumId,_tmpAlbumName,_tmpArtistId,_tmpArtistName,_tmpComposer,_tmpAlbumArtist);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
