package com.example.androiddevelopment.informativnaagencija;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.db.News;

import java.util.List;

public class MainActivity extends AppCompatActivity {



    private ListView listView = null;
    private List<News> contact = null;
    private DrawerLayout mDrawerLayout;

    static final int REQUEST_IMAGE_CAPTURE = 1;
    private static final int SELECT_PICTURE = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_action_name);

    }

    AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {

        public void onItemClick(AdapterView<?> listView,
                                View v,
                                int position,
                                long id)

        {
            Intent intent = new Intent(MainActivity.this,
                    DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_NO, contact.get(position).getClass());
            startActivity(intent);
        }


    };







}
