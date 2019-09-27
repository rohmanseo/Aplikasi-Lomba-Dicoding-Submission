package com.rohman.aplikasilomba;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Profile extends AppCompatActivity {

    RecyclerView rv_disimpan;
    ArrayList<Lomba> listLombaDisimpan = new ArrayList<>();

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listLombaDisimpan.addAll(LombaDisimpanData.getLombaData());

        rv_disimpan = findViewById(R.id.rv_disimpan);
        rv_disimpan.setNestedScrollingEnabled(false);
        rv_disimpan.setHasFixedSize(true);
        rv_disimpan.setLayoutManager(new LinearLayoutManager(Profile.this));
        LombaAdapter lombaAdapter = new LombaAdapter(listLombaDisimpan);
        rv_disimpan.setAdapter(lombaAdapter);
    }
}
