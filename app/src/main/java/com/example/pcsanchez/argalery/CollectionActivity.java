package com.example.pcsanchez.argalery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CollectionActivity extends AppCompatActivity {

    ImageButton bBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);
        setSupportActionBar((Toolbar) findViewById(R.id.myToolbar));
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        bBack = findViewById(R.id.back_action);

        bBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CollectionActivity.super.onBackPressed();
            }
        });
    }

}
