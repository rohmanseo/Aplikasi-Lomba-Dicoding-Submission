package com.rohman.aplikasilomba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;

public class DaftarKategori extends AppCompatActivity {

    TextView tv_daftar;
    TextView result;
    ArrayList<Lomba> listLomba = new ArrayList<>();
    RecyclerView rec_kategori;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_kategori);

        Intent intent = getIntent();
        String kategori = intent.getStringExtra("kategori");
        tv_daftar = findViewById(R.id.tv_daftar_kategori);
        result = findViewById(R.id.result);

        tv_daftar.setText( tv_daftar.getText().toString() + " " + kategori);
        rec_kategori = findViewById(R.id.rec_daftar_kategori);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Lomba> lombas = new ArrayList<>(LombaTerbaruData.getLombaData());

        for (int i=0;i<lombas.size();i++){
            if (lombas.get(i).getTv_kategori().equals(kategori)){
                listLomba.add(lombas.get(i));
            }
        }

        rec_kategori.setLayoutManager(new LinearLayoutManager(this));
        LombaAdapter lombaAdapter = new LombaAdapter(listLomba);
        rec_kategori.setAdapter(lombaAdapter);

        if(listLomba.size()==0){
            result.setText("Tidak ditemukan lomba dengan kategori " + kategori);
        }

    }
}
