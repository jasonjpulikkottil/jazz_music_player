package com.jdots.music.db;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
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
public final class BlackListStoreDao_Impl implements BlackListStoreDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<BlackListStoreEntity> __insertionAdapterOfBlackListStoreEntity;

  private final EntityDeletionOrUpdateAdapter<BlackListStoreEntity> __deletionAdapterOfBlackListStoreEntity;

  private final SharedSQLiteStatement __preparedStmtOfClearBlacklist;

  public BlackListStoreDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBlackListStoreEntity = new EntityInsertionAdapter<BlackListStoreEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `BlackListStoreEntity` (`path`) VALUES (?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BlackListStoreEntity value) {
        if (value.getPath() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getPath());
        }
      }
    };
    this.__deletionAdapterOfBlackListStoreEntity = new EntityDeletionOrUpdateAdapter<BlackListStoreEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `BlackListStoreEntity` WHERE `path` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BlackListStoreEntity value) {
        if (value.getPath() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getPath());
        }
      }
    };
    this.__preparedStmtOfClearBlacklist = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM BlackListStoreEntity";
        return _query;
      }
    };
  }

  @Override
  public void insertBlacklistPath(final BlackListStoreEntity blackListStoreEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfBlackListStoreEntity.insert(blackListStoreEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Object insertBlacklistPath(final List<BlackListStoreEntity> blackListStoreEntities,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfBlackListStoreEntity.insert(blackListStoreEntities);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteBlacklistPath(final BlackListStoreEntity blackListStoreEntity,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfBlackListStoreEntity.handle(blackListStoreEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object clearBlacklist(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearBlacklist.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClearBlacklist.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public List<BlackListStoreEntity> blackListPaths() {
    final String _sql = "SELECT * FROM BlackListStoreEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfPath = CursorUtil.getColumnIndexOrThrow(_cursor, "path");
      final List<BlackListStoreEntity> _result = new ArrayList<BlackListStoreEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final BlackListStoreEntity _item;
        final String _tmpPath;
        _tmpPath = _cursor.getString(_cursorIndexOfPath);
        _item = new BlackListStoreEntity(_tmpPath);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
