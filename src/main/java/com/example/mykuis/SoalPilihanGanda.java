package com.example.mykuis;

public class SoalPilihanGanda {

    public String pertanyaan[] ={
            "Siapa nama Presiden Indonesia pertama ?",
            "Ideologi dasar negara indonesia ?",
            "Bhinneka Tunggal Ika yang artinya ?",
            "Ibu kota negara indonesia adalah ?",
            "Negara apakah yang menjajah negara indonesia selama 350 tahun ?",
            "Saat masa penjajahan, para rakyat indonesia melawan dengan menggunakan senjata ?",
            "Monumen untuk mengenang seorang pahlawan indonesia adalah ?",
            "Teks apa yang dibaca presiden indonesia pertama kali dalam mendeklarasikan kemerdekaan bangsa indonesia ? ",
            "Pulau indonesia dengan penduduk terbanyak adalah ?"
    };


    private String pilihanJawaban[][] = {
        {"Ir.Soekarno","Megawati","BJ Habibie","Jokowi"},
        {"UUD 1945","Pancasila","Bhinneka Tunggal Ika", "PPKI"},
        {"Berbeda-beda tapi tetap jua","sama ajalah yang penting sehat","beda cuman tetap satu, kami satu karna kami berbeda beda"},
        {"Aceh","Padang","Jakarta","Banten"},
        {"Jepang","Belanda","Kroasia","Ekuador"},
        {"RPG","Bambu","Runcing","Runcing","bambunya","pisau dapur"},
        {"patung pancoran","segar sari", "bogor", "taman indah"},
        {"UUD 1945","lamaprok","proklamasi","pancasila"},
        {"Jawa","Bali","Sumatera","Amerika"},
    };

    private String jawabanBenar[] ={
            "Ir.Soekarno",
            "Pancasila",
            "Berbeda beda tapi tetap satu",
            "Jakarta",
            "Belanda",
            "Bambu Runcing",
            "Monas",
            "Proklamasi",
            "Jawa",
    };

    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban [x][0];
        return jawaban1;
    }

    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    public String getPilihanJawaban3(int x){
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    public String getPilihanJawaban4(int x){
        String jawaban4 = pilihanJawaban[x][3];
        return jawaban4;
    }

    public String getjawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;

    }
}
