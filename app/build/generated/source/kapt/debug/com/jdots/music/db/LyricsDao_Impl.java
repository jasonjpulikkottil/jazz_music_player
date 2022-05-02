package com.jdots.music.db;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

@SuppressWarnings({"unchecked", "deprecation"})
public final class LyricsDao_Impl implements LyricsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<LyricsEntity> __insertionAdapterOfLyricsEntity;

  private final EntityDeletionOrUpdateAdapter<LyricsEntity> __deletionAdapterOfLyricsEntity;

  private final EntityDeletionOrUpdateAdapter<LyricsEntity> __updateAdapterOfLyricsEntity;

  public LyricsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLyricsEntity = new EntityInsertionAdapter<LyricsEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `LyricsEntity` (`songId`,`lyrics`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LyricsEntity value) {
        stmt.bindLong(1, value.getSongId());
        if (value.getLyrics() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getLyrics());
        }
      }
    };
    this.__deletionAdapterOfLyricsEntity = new EntityDeletionOrUpdateAdapter<LyricsEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `LyricsEntity` WHERE `songId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LyricsEntity value) {
        stmt.bindLong(1, value.getSongId());
      }
    };
    this.__updateAdapterOfLyricsEntity = new EntityDeletionOrUpdateAdapter<LyricsEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `LyricsEntity` SET `songId` = ?,`lyrics` = ? WHERE `songId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LyricsEntity value) {
        stmt.bindLong(1, value.getSongId());
        if (value.getLyrics() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getLyrics());
        }
        stmt.bindLong(3, value.getSongId());
      }
    };
  }

  @Override
  public void insertLyrics(final LyricsEntity lyricsEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfLyricsEntity.insert(lyricsEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteLyrics(final LyricsEntity lyricsEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfLyricsEntity.handle(lyricsEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateLyrics(final LyricsEntity lyricsEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfLyricsEntity.handle(lyricsEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LyricsEntity lyricsWithSongId(final int songId) {
    final String _sql = "SELECT * FROM LyricsEntity WHERE songId =? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, songId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfSongId = CursorUtil.getColumnIndexOrThrow(_cursor, "songId");
      final int _cursorIndexOfLyrics = CursorUtil.getColumnIndexOrThrow(_cursor, "lyrics");
      final LyricsEntity _result;
      if(_cursor.moveToFirst()) {
        final int _tmpSongId;
        _tmpSongId = _cursor.getInt(_cursorIndexOfSongId);
        final String _tmpLyrics;
        _tmpLyrics = _cursor.getString(_cursorIndexOfLyrics);
        _result = new LyricsEntity(_tmpSongId,_tmpLyrics);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
