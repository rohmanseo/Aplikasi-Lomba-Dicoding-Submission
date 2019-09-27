package com.rohman.aplikasilomba;

import java.util.ArrayList;

class LombaDisimpanData {
    private static String[] judulLomba = {
            "Lomba Menulis Cerpen Nasional 2019 di Komunitas Fun Bahasa",
            "Lomba Menulis Artikel Nasional 2019, Hadiah 47,5 Jt",
            "Geotrek Asean Geo-Smart Competition 2020"

    };

    private static String[] diskripsiLomba = {
            "Penyelenggaraan agenda ini dilakukan dalam memperingati Bulan Bahasa yang jatuh pada bulan Oktober, dimana komunitas Fun Bahasa (@funbahasa) mengadakan lomba cipta cerpen tingkat nasional. Yang mengangkat tema besar dalam lomba adalah : \nBebas",
            "Perlombaan menulis ini sendiri sepenuhnya diselenggarakan oleh BKPM dalam serangkaian nama agendanya yakni Go Write Competition. Dimana dalam event menulis ini mengangkat tema besar sebagai berikut\nInvestasi bagi Peningkatan Lapangan Kerja dan Pendapatan Masyarakat",
            "Setidaknya dalam agenda ini sendiri dilakukan untuk tahapan seleksinya terdiri atas\n\nVideo Ilmiah\nOlimpiade Tulis\nGeotrek\n"
    };

    private static String[] syaratLomba = {
            "Peserta yang mendaftar dalam ajang kegiatan event menulis cerpen tingkat nasional di tahun 2019 ini adalah masyarakat Indonesia secara umum, baik mahasiswa, pelajar, atau siapapun yang hobi menulis cerpen\n\nPenulis yang ingin mengikutsertakan karya cerpennya tidak ada batasa usia\n\nPeserta dalam lomba ini haruslah perseorangan/individu\n\nKarya yang dikirimkan dalam lomba adalaj karya asli\n\nKarya yang dikirimkan dalam event ini belum pernah menjadi juara dalam lomba sejenis\n\nPeserta dalam lomba ini bisa mengirimkan 1 cerpen akan tetapi bisa juga dengan mengirimkan 3 naskah cerpen\n\nKarya yang dikirimkan dalam lomba ini haruslah bebas dari unsur sara\n\nPeserta dalam lomba membayar biaya pendaftaran, dimana untuk biaya pendaftarannya untuk 1 cerpen 35K, untuk 2 Cerpen 60 K, dan untuk 3 cerpen 90 K Keputusan pemenang dalam lomba tidak dapat dianggu gugat\n\nSetiap peserta dalam event ini wajib mengisi formulir pendaftaran secara online, formulir tersebut bisa lho kalian dapatkan disini\n\nBatas akhir pendaftaran 04 Oktober 2019\n\nBatas akhir pengiriman naskah: 06 Oktober 2019\n\nPenjurian: 07-14 Oktober 2019\n\nPengumuman Pemenang: 15 Oktober 2019\n\n",
            "Peserta yang bisa mendaftar dalam lomba menulis ini adalah masyarakat umum, yakni masyarakat Indonesia\n\nPeserta yang bisa mendaftar dalam lomba ini terdapat 3 kategori, yaitu Jurnalis, Masyarakat Umum dan Mahasiswa.\n\nBiaya pendaftaran dalam ajang lomba ini sepenuhnya gratis\n\nPeserta dalam lomba membuat karya yang sesuai dengan tema\n\nArtikel yang dikirimkan serta diikutsertakan dalam lomba adalah karya sendiri\n\nNo plagiat\n\nKarya yang dikirimkan dalam lomba belum pernah menjadi juara dalam event sejenis\n\nPeserta yang mau ikutan dalam Lomba Menulis Artikel Nasional 2019 ini haruslah mengirimkan karya sebelum deadline pendaftaran\n\nAdapun batas akhir pendaftaran dalam lomba menulis artikel gratis di tahun 2019 ini sampai dengan tanggal 22 Oktober tahun 2019\n\nPeserta dalam ajang lomba ini haruslah mengisi formulir pendaftaran secara online\n\nFormulir pendaftaran online dalam ajang lomba ini bisa kaliak klik disini\n\nKeputusan pemenang dalam lomba tidak dapat dianggu gugat\n\n",
            "Peserta yang mendaftar dalam ajang ini adalah para pelajar yang duduk di tingkat SMA/MA/SMK/Sederajat di Asia Tenggara\n\nPeserta yang mendaftar dalam lomba ini haruslah dilakukan dengan tim\n\nTim dalam lomba atau kelompok ajang ini terdiri atas 2 orang siswa dengan dielengkapai pula oleh 1 orang guru pendampaing\n\nKarya yang dikirimkan dalam karya asli\n\nNo plagiat\n\nKarya yang diikutsertakan dalam lomba ini belum pernah menjadi juara dalam event sejenis\n\nPendaftaran dalam Lomba Video, Olimpiade Tulis, dan Geotrek Asean Geo-Smart Competition 2020 di mulai dari tanggal 14 Agustus dengan batas akhirnya \n\nsampai dengan tanggal 20 November 2019. \n\nKeputusan pemenang dalam event ini tidak dapat dianggu gugat\n\n"
    };
    private static String[] hadiahLomba = {
            "JUARA 1: Rp 1.000.000 + MEDALI + SERTIFIKAT CETAK JUARA\n\nJUARA 2: Rp 500.000 + MEDALI + SERTIFIKAT CETAK JUARA\n\nJUARA 3: Rp 300.000 + MEDALI + SERTIFIKAT CETAK JUARA\n\nSEMUA PESERTA: E-SERTIFIKAT NASIONAL",
            "Pemenang yang menjadi artikel terbaik dalam lomba ini untuk semua kategori akan mendapatkan hadiah total senilai 47,5 juta rupiah.",
            "Total hadiah yang bisa diikutsertakan dalam lomba ini untuk para pemenang adalah puluhan juta rupiah"
    };

    private static int[] fotoLomba = {
            R.drawable.lomba1,
            R.drawable.lomba2,
            R.drawable.lomba3
    };

    static ArrayList<Lomba> getLombaData() {
        ArrayList<Lomba> list = new ArrayList<>();
        for (int i = 0; i < judulLomba.length; i++) {
            Lomba lomba = new Lomba();
            lomba.setImg_lomba(fotoLomba[i]);
            lomba.setTv_des_lomba(diskripsiLomba[i]);
            lomba.setTv_jdl_lomba(judulLomba[i]);
            lomba.setTv_syarat_lomba(syaratLomba[i]);
            lomba.setTv_hadiah_lomba(hadiahLomba[i]);
            list.add(lomba);
        }
        return list;
    }
}
