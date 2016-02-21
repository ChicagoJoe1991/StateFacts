package com.example.walter.statefacts;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdapterView.OnItemClickListener itemClickListenter = new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> listView,
                                    // the individual itemView; part of the listView
                                    View itemView,
                                    //the position of the item clicked, starts at position zero
                                    int position,
                                    long id) {
                if(position==0) {
                    Intent intent = new Intent(MainActivity.this, CityActivity.class);
                    startActivity(intent);
                }
            }
        };
        //grab the reference for the ListView
        ListView listView = (ListView) findViewById(R.id.stateslistview);
        //add the listener to the ListView
        listView.setOnItemClickListener(itemClickListenter);

    }

}
