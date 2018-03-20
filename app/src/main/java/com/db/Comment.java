package com.db;

import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by androiddevelopment on 20.3.18..
 */
@DatabaseTable (tableName = Comment.TABLE_NAME_COMMENT)
public class Comment {
    public static final String TABLE_NAME_COMMENT ="comment";
    public static final String FIELD_NAME_ID     = "_id";
    public static final String FIELD_NAME_NAME   = "name";
    public static final String FIELD_NAME_DESCRIPTION  = "description";
    public static final String FIELD_NAME_THE_AUTHOR   = "the_author";
    public static final String FIELD_NAME_DATE   = "date";

    public Comment() {
    }


    public static String getTableNameComment() {
        return TABLE_NAME_COMMENT;
    }

    public static String getFieldNameId() {
        return FIELD_NAME_ID;
    }

    public static String getFieldNameName() {
        return FIELD_NAME_NAME;
    }

    public static String getFieldNameDescription() {
        return FIELD_NAME_DESCRIPTION;
    }

    public static String getFieldNameTheAuthor() {
        return FIELD_NAME_THE_AUTHOR;
    }

    public static String getFieldNameDate() {
        return FIELD_NAME_DATE;
    }

    @Override
    public String toString() {
        return "Comment{}";
    }
}
