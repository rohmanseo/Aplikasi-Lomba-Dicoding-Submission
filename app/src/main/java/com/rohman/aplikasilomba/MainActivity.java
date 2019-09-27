package com.rohman.aplikasilomba;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ScrollView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    RecyclerView rvLombaTerbaru;
    RecyclerView rvKategori;
    ArrayList<Lomba> listLomba = new ArrayList<>();
    ArrayList<Kategori> listKategori = new ArrayList<>();
    BottomNavigationView bottomNavigationView;
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvLombaTerbaru = findViewById(R.id.rv_lomba_terbaru);
        bottomNavigationView = findViewById(R.id.btn_nav_view);
        scrollView = findViewById(R.id.scolview_layout);

        rvLombaTerbaru.setHasFixedSize(true);
        rvLombaTerbaru.setNestedScrollingEnabled(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        rvKategori = findViewById(R.id.rv_kategori);
        rvKategori.setHasFixedSize(true);
        rvKategori.setNestedScrollingEnabled(false);

        listKategori.addAll(KategoriData.getKategoriLombaImg());

        listLomba.addAll(LombaTerbaruData.getLombaData());
        showLombaTerbaru();
        showKategori();

    }

    private void showKategori() {
        rvKategori.setLayoutManager(new GridLayoutManager(this, 4));
        KategoriAdapter kategoriAdapter = new KategoriAdapter(listKategori);
        rvKategori.setAdapter(kategoriAdapter);
    }

    private void showLombaTerbaru() {
        rvLombaTerbaru.setLayoutManager(new LinearLayoutManager(this));
        LombaAdapter lombaAdapter = new LombaAdapter(listLomba);
        rvLombaTerbaru.setAdapter(lombaAdapter);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.nav_home:
                scrollView.smoothScrollTo(0,0);
                break;
            case R.id.nav_profile:
                intent = new Intent(MainActivity.this,Profile.class);
                startActivity(intent);
                break;
        }
        return false;
    }
}
