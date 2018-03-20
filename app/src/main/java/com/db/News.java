package com.db;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by androiddevelopment on 20.3.18..
 */
@DatabaseTable (tableName = News.TABLE_NAME_NEWS)
public class News {

    public static final String TABLE_NAME_NEWS ="news";
    public static final String FIELD_NAME_ID     = "_id";

    public static final String FIELD_NAME_NAME   = "name";
    public static final String FIELD_NAME_DESCRIPTION  = "description";
    public static final String FIELD_NAME_IMAGE = "image";
    public static final String FIELD_NAME_THE_AUTHOR   = "the_author";
    public static final String FIELD_NAME_DATE   = "date";
    public static final String FIELD_NAME_LIKE = "like";
    public static final String FIELD_NAME_UNLIKE = "unlike";
    public static final String FIELD_NAME_COMMENT = "comment";

    public News() {
    }

    public static String getTableNameNews() {
        return TABLE_NAME_NEWS;
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

    public static String getFieldNameImage() {
        return FIELD_NAME_IMAGE;
    }

    public static String getFieldNameTheAuthor() {
        return FIELD_NAME_THE_AUTHOR;
    }

    public static String getFieldNameDate() {
        return FIELD_NAME_DATE;
    }

    public static String getFieldNameLike() {
        return FIELD_NAME_LIKE;
    }

    public static String getFieldNameUnlike() {
        return FIELD_NAME_UNLIKE;
    }

    public static String getFieldNameComment() {
        return FIELD_NAME_COMMENT;
    }

    @Override
    public String toString() {
        return "News{}";
    }
}
