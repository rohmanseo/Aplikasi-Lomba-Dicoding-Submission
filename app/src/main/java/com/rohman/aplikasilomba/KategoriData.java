package com.rohman.aplikasilomba;

import java.util.ArrayList;

class KategoriData {

    private static int[] kategoriLombaImg = {
            R.drawable.kategori1,
            R.drawable.kategori2,
            R.drawable.kategori3,
            R.drawable.kategori4,
            R.drawable.kategori5,
            R.drawable.kategori6,
            R.drawable.kategori7,
            R.drawable.kategori8
    };
    private static String[] kategoriLombaText = {
            "Menulis", "Video", "Foto", "Melukis", "Pidato", "Debat", "Bisnis", "Olahraga"
    };

    static ArrayList<Kategori> getKategoriLombaImg() {
        ArrayList<Kategori> listKategori = new ArrayList<>();
        for (int i = 0; i < kategoriLombaImg.length; i++) {
            Kategori kategori = new Kategori();
            kategori.setImg_kategori(kategoriLombaImg[i]);
            kategori.setTv_kategori(kategoriLombaText[i]);
            listKategori.add(kategori);
        }
        return listKategori;
    }
}
