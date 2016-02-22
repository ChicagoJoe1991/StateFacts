package com.example.walter.statefacts;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;

public class CaliforniaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_california);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView,
                                    View view,
                                    int position,
                                    long id) {
                if (position == 0) {
                    Intent intent = new Intent(CaliforniaActivity.this, LosAngelesActivity.class);
                    startActivity(intent);
                }
                if(position ==1){
                    Intent intent = new Intent(CaliforniaActivity.this, SanDiegoActivity.class);
                    startActivity(intent);
                }
            }

        };

    }

}
