package com.jdots.music.db;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PlayCountDao_Impl implements PlayCountDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PlayCountEntity> __insertionAdapterOfPlayCountEntity;

  private final EntityDeletionOrUpdateAdapter<PlayCountEntity> __deletionAdapterOfPlayCountEntity;

  private final EntityDeletionOrUpdateAdapter<PlayCountEntity> __updateAdapterOfPlayCountEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteSong;

  private final SharedSQLiteStatement __preparedStmtOfUpdateQuantity;

  public PlayCountDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPlayCountEntity = new EntityInsertionAdapter<PlayCountEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `PlayCountEntity` (`id`,`title`,`track_number`,`year`,`duration`,`data`,`date_modified`,`album_id`,`album_name`,`artist_id`,`artist_name`,`composer`,`album_artist`,`time_played`,`play_count`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PlayCountEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        stmt.bindLong(3, value.getTrackNumber());
        stmt.bindLong(4, value.getYear());
        stmt.bindLong(5, value.getDuration());
        if (value.getData() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getData());
        }
        stmt.bindLong(7, value.getDateModified());
        stmt.bindLong(8, value.getAlbumId());
        if (value.getAlbumName() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getAlbumName());
        }
        stmt.bindLong(10, value.getArtistId());
        if (value.getArtistName() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getArtistName());
        }
        if (value.getComposer() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getComposer());
        }
        if (value.getAlbumArtist() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getAlbumArtist());
        }
        stmt.bindLong(14, value.getTimePlayed());
        stmt.bindLong(15, value.getPlayCount());
      }
    };
    this.__deletionAdapterOfPlayCountEntity = new EntityDeletionOrUpdateAdapter<PlayCountEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `PlayCountEntity` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PlayCountEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfPlayCountEntity = new EntityDeletionOrUpdateAdapter<PlayCountEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `PlayCountEntity` SET `id` = ?,`title` = ?,`track_number` = ?,`year` = ?,`duration` = ?,`data` = ?,`date_modified` = ?,`album_id` = ?,`album_name` = ?,`artist_id` = ?,`artist_name` = ?,`composer` = ?,`album_artist` = ?,`time_played` = ?,`play_count` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PlayCountEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        stmt.bindLong(3, value.getTrackNumber());
        stmt.bindLong(4, value.getYear());
        stmt.bindLong(5, value.getDuration());
        if (value.getData() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getData());
        }
        stmt.bindLong(7, value.getDateModified());
        stmt.bindLong(8, value.getAlbumId());
        if (value.getAlbumName() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getAlbumName());
        }
        stmt.bindLong(10, value.getArtistId());
        if (value.getArtistName() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getArtistName());
        }
        if (value.getComposer() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getComposer());
        }
        if (value.getAlbumArtist() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getAlbumArtist());
        }
        stmt.bindLong(14, value.getTimePlayed());
        stmt.bindLong(15, value.getPlayCount());
        stmt.bindLong(16, value.getId());
      }
    };
    this.__preparedStmtOfDeleteSong = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM SongEntity WHERE id =?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateQuantity = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE PlayCountEntity SET play_count = play_count + 1 WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public void insertSongInPlayCount(final PlayCountEntity playCountEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPlayCountEntity.insert(playCountEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteSongInPlayCount(final PlayCountEntity playCountEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfPlayCountEntity.handle(playCountEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateSongInPlayCount(final PlayCountEntity playCountEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfPlayCountEntity.handle(playCountEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteSong(final long songId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteSong.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, songId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteSong.release(_stmt);
    }
  }

  @Override
  public void updateQuantity(final long id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateQuantity.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateQuantity.release(_stmt);
    }
  }

  @Override
  public List<PlayCountEntity> checkSongExistInPlayCount(final long songId) {
    final String _sql = "SELECT * FROM PlayCountEntity WHERE id =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, songId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
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
      final int _cursorIndexOfTimePlayed = CursorUtil.getColumnIndexOrThrow(_cursor, "time_played");
      final int _cursorIndexOfPlayCount = CursorUtil.getColumnIndexOrThrow(_cursor, "play_count");
      final List<PlayCountEntity> _result = new ArrayList<PlayCountEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final PlayCountEntity _item;
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
        final long _tmpTimePlayed;
        _tmpTimePlayed = _cursor.getLong(_cursorIndexOfTimePlayed);
        final int _tmpPlayCount;
        _tmpPlayCount = _cursor.getInt(_cursorIndexOfPlayCount);
        _item = new PlayCountEntity(_tmpId,_tmpTitle,_tmpTrackNumber,_tmpYear,_tmpDuration,_tmpData,_tmpDateModified,_tmpAlbumId,_tmpAlbumName,_tmpArtistId,_tmpArtistName,_tmpComposer,_tmpAlbumArtist,_tmpTimePlayed,_tmpPlayCount);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<PlayCountEntity> playCountSongs() {
    final String _sql = "SELECT * FROM PlayCountEntity ORDER BY play_count DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
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
      final int _cursorIndexOfTimePlayed = CursorUtil.getColumnIndexOrThrow(_cursor, "time_played");
      final int _cursorIndexOfPlayCount = CursorUtil.getColumnIndexOrThrow(_cursor, "play_count");
      final List<PlayCountEntity> _result = new ArrayList<PlayCountEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final PlayCountEntity _item;
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
        final long _tmpTimePlayed;
        _tmpTimePlayed = _cursor.getLong(_cursorIndexOfTimePlayed);
        final int _tmpPlayCount;
        _tmpPlayCount = _cursor.getInt(_cursorIndexOfPlayCount);
        _item = new PlayCountEntity(_tmpId,_tmpTitle,_tmpTrackNumber,_tmpYear,_tmpDuration,_tmpData,_tmpDateModified,_tmpAlbumId,_tmpAlbumName,_tmpArtistId,_tmpArtistName,_tmpComposer,_tmpAlbumArtist,_tmpTimePlayed,_tmpPlayCount);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
