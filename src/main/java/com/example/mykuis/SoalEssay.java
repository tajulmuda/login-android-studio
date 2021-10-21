package com.example.mykuis;

public class SoalEssay {
    public String pertanyaan[] = {
            "Siapa nama Presiden Indonesia yang pertama ?",
            "Ideologi dasar bagi negara indonesia adalah ? ",
            "Bhineka Tunggal Ika mempunyai arti ?",
            "Ibukota Negara Indonesia saat ini adalah ?",
            "Negara apa yang menjajah negara indonesia selama 350 tahun ?",
            "saat masa penjajahan, senjata yang biasa digunakan masyarakat indonesia saat itu adalah ?",
            "MONAS berada di kota ?",
            "teks yang dibacakan oleh Soekarno adalah ?",
            "Pulau terbesar di indonesia adalah",
    };
    private String image[] = {
            "foto_soekarno",
            "lambang_garuda",
            "lambang_garuda",
            "jakarta",
            "penjajahan",
            "bambu_runcing",
            "monas",
            "teks_proklamasi",
            "pulau_kalimantan",

    };

    private String jawabanBenar[] = {
            "Ir.Soekarno",
            "Pancasila",
            "berbeda beda tetapi tetap satu",
            "jakarta",
            "belanda",
            "bambu runcing",
            "monas",
            "proklamasi",
            "kalimantan",
    };

    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    public String getStringGambar(int x){
        String gambar = image[x];
        return gambar;
    }

    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }

}
