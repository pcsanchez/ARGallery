package com.example.pcsanchez.argalery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class CollectionActivity extends AppCompatActivity {

    List<Painting> lstPaint;

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

        lstPaint = new ArrayList<>();
        lstPaint.add(new Painting("Mona Lisa",9000.90,40.0,40.0,"Lienzo","random desc",R.drawable.monalisa,"Desconocido"));
        lstPaint.add(new Painting("The Starry Night",9000.90,40.0,40.0,"Lienzo","random desc",R.drawable.starrynight,"Desconocido"));
        lstPaint.add(new Painting("Dogs Playing Poker",9000.90,40.0,40.0,"Lienzo","random desc",R.drawable.dogspoker,"Desconocido"));
        lstPaint.add(new Painting("Dogs Playing Poker",9000.90,40.0,40.0,"Lienzo","random desc",R.drawable.dogspoker,"Desconocido"));
        lstPaint.add(new Painting("Mona Lisa",9000.90,40.0,40.0,"Lienzo","random desc",R.drawable.monalisa,"Desconocido"));
        lstPaint.add(new Painting("The Starry Night",9000.90,40.0,40.0,"Lienzo","random desc",R.drawable.starrynight,"Desconocido"));
        lstPaint.add(new Painting("Dogs Playing Poker",9000.90,40.0,40.0,"Lienzo","random desc",R.drawable.dogspoker,"Desconocido"));
        lstPaint.add(new Painting("Dogs Playing Poker",9000.90,40.0,40.0,"Lienzo","random desc",R.drawable.dogspoker,"Desconocido"));
        lstPaint.add(new Painting("Mona Lisa",9000.90,40.0,40.0,"Lienzo","random desc",R.drawable.monalisa,"Desconocido"));
        lstPaint.add(new Painting("The Starry Night",9000.90,40.0,40.0,"Lienzo","random desc",R.drawable.starrynight,"Desconocido"));
        lstPaint.add(new Painting("Dogs Playing Poker",9000.90,40.0,40.0,"Lienzo","random desc",R.drawable.dogspoker,"Desconocido"));
        lstPaint.add(new Painting("Dogs Playing Poker",9000.90,40.0,40.0,"Lienzo","random desc",R.drawable.dogspoker,"Desconocido"));
        lstPaint.add(new Painting("Mona Lisa",9000.90,40.0,40.0,"Lienzo","random desc",R.drawable.monalisa,"Desconocido"));
        lstPaint.add(new Painting("The Starry Night",9000.90,40.0,40.0,"Lienzo","random desc",R.drawable.starrynight,"Desconocido"));
        lstPaint.add(new Painting("Dogs Playing Poker",9000.90,40.0,40.0,"Lienzo","random desc",R.drawable.dogspoker,"Desconocido"));
        lstPaint.add(new Painting("Dogs Playing Poker",9000.90,40.0,40.0,"Lienzo","random desc",R.drawable.dogspoker,"Desconocido"));



        RecyclerView myrv = findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstPaint);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }

}
