package com.example.androiddevelopment.informativnaagencija;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.db.Comment;
import com.db.DataBaseHelper;
import com.db.News;

import java.lang.reflect.Array;


/**
 * Created by androiddevelopment on 20.3.18..
 */

public class DetailActivity extends Activity {

    ArrayAdapter adapter;
    private DataBaseHelper dataBaseHelper;

    public static final String EXTRA_NO = "contactNo";
    public static int MY_PERMISSIONS_REQUEST_CALL = 123;

    private News news = null;
    private Comment comment = null;
    private ListView listView = null;




    }




