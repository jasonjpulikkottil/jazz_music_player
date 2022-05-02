package com.jdots.music.db;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class HistoryDao_Impl implements HistoryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<HistoryEntity> __insertionAdapterOfHistoryEntity;

  private final EntityDeletionOrUpdateAdapter<HistoryEntity> __updateAdapterOfHistoryEntity;

  public HistoryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHistoryEntity = new EntityInsertionAdapter<HistoryEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `HistoryEntity` (`id`,`title`,`track_number`,`year`,`duration`,`data`,`date_modified`,`album_id`,`album_name`,`artist_id`,`artist_name`,`composer`,`album_artist`,`time_played`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HistoryEntity value) {
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
      }
    };
    this.__updateAdapterOfHistoryEntity = new EntityDeletionOrUpdateAdapter<HistoryEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `HistoryEntity` SET `id` = ?,`title` = ?,`track_number` = ?,`year` = ?,`duration` = ?,`data` = ?,`date_modified` = ?,`album_id` = ?,`album_name` = ?,`artist_id` = ?,`artist_name` = ?,`composer` = ?,`album_artist` = ?,`time_played` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HistoryEntity value) {
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
        stmt.bindLong(15, value.getId());
      }
    };
  }

  @Override
  public Object insertSongInHistory(final HistoryEntity historyEntity,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfHistoryEntity.insert(historyEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object updateHistorySong(final HistoryEntity historyEntity,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfHistoryEntity.handle(historyEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object isSongPresentInHistory(final long songId,
      final Continuation<? super HistoryEntity> p1) {
    final String _sql = "SELECT * FROM HistoryEntity WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, songId);
    return CoroutinesRoom.execute(__db, false, new Callable<HistoryEntity>() {
      @Override
      public HistoryEntity call() throws Exception {
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
          final HistoryEntity _result;
          if(_cursor.moveToFirst()) {
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
            _result = new HistoryEntity(_tmpId,_tmpTitle,_tmpTrackNumber,_tmpYear,_tmpDuration,_tmpData,_tmpDateModified,_tmpAlbumId,_tmpAlbumName,_tmpArtistId,_tmpArtistName,_tmpComposer,_tmpAlbumArtist,_tmpTimePlayed);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  @Override
  public List<HistoryEntity> historySongs() {
    final String _sql = "SELECT * FROM HistoryEntity ORDER BY time_played DESC LIMIT 100";
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
      final List<HistoryEntity> _result = new ArrayList<HistoryEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final HistoryEntity _item;
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
        _item = new HistoryEntity(_tmpId,_tmpTitle,_tmpTrackNumber,_tmpYear,_tmpDuration,_tmpData,_tmpDateModified,_tmpAlbumId,_tmpAlbumName,_tmpArtistId,_tmpArtistName,_tmpComposer,_tmpAlbumArtist,_tmpTimePlayed);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<HistoryEntity>> observableHistorySongs() {
    final String _sql = "SELECT * FROM HistoryEntity ORDER BY time_played DESC LIMIT 100";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"HistoryEntity"}, false, new Callable<List<HistoryEntity>>() {
      @Override
      public List<HistoryEntity> call() throws Exception {
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
          final List<HistoryEntity> _result = new ArrayList<HistoryEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final HistoryEntity _item;
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
            _item = new HistoryEntity(_tmpId,_tmpTitle,_tmpTrackNumber,_tmpYear,_tmpDuration,_tmpData,_tmpDateModified,_tmpAlbumId,_tmpAlbumName,_tmpArtistId,_tmpArtistName,_tmpComposer,_tmpAlbumArtist,_tmpTimePlayed);
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
}
