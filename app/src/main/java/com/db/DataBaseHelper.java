package com.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

/**
 * Created by androiddevelopment on 20.3.18..
 */

public class DataBaseHelper  extends OrmLiteSqliteOpenHelper {

    public static String DATABASE_NAME = "myNews.db";
    public static int DATABASE_VERSION = 2;

    private Dao<News, Integer> mNewsDao = null;
    private Dao<Comment, Integer> mNCommentDao = null;


    public DataBaseHelper(Context context) {
        super(context,
                DATABASE_NAME,
                null,
                DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, News.class);
            TableUtils.createTable(connectionSource, Comment.class);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void onUpgrade(SQLiteDatabase db, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            TableUtils.dropTable(connectionSource, News.class, true);
            TableUtils.dropTable(connectionSource, Comment.class, true);
            onCreate(db, connectionSource);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Dao<News, Integer> getContactDao() throws SQLException {
        if (mNewsDao == null) {
            mNewsDao = getDao(News.class);
        }

        return mNewsDao;
    }

    public Dao<Comment, Integer> getNumberDao() throws SQLException {
        if (mNCommentDao == null) {
            mNCommentDao = getDao(Comment.class);
        }

        return mNCommentDao;
    }
    @Override
    public void close() {
        mNewsDao = null;
        mNCommentDao = null;

        super.close();
    }
}