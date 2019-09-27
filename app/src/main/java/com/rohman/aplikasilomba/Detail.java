package com.rohman.aplikasilomba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Detail extends AppCompatActivity {

    ImageView detail_img;
    TextView detail_judul;
    TextView detail_des;
    TextView detail_syarat;
    TextView detail_hadiah;


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        detail_img = findViewById(R.id.detail_img);
        detail_judul = findViewById(R.id.detail_judul);
        detail_des = findViewById(R.id.detail_text);
        detail_syarat = findViewById(R.id.detail_syarat);
        detail_hadiah = findViewById(R.id.detail_hadiah);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        String[] lomba = intent.getStringArrayExtra("lomba");

        int img = intent.getIntExtra("imgLomba",R.drawable.lomba1);

        Glide.with(this).load(img).into(detail_img);
        detail_judul.setText(lomba[0]);
        detail_des.setText(lomba[1]);
        detail_syarat.setText(lomba[2]);
        detail_hadiah.setText(lomba[3]);


    }
}
