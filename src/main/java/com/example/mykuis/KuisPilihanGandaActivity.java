package com.example.mykuis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class KuisPilihanGandaActivity extends AppCompatActivity {

    TextView mtvSkor, mtvSoal;
    RadioGroup mrgPilihanJawaban;
    RadioButton mrbPilihanJawaban1,mrbPilihanJawaban2,mrbPilihanJawaban3,mrbPilihanJawaban4;
    Button mbtnSubmit;
    int skor=0;
    int arr;
    int x;
    String jawaban;

    SoalPilihanGanda soalPG = new SoalPilihanGanda();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_pilihan_ganda);

        mtvSkor = (TextView) findViewById(R.id.tvSkor);
        mtvSoal = (TextView) findViewById(R.id.tvsoal);
        mrgPilihanJawaban = (RadioGroup) findViewById(R.id.rgpilihanjawaban);
        mrbPilihanJawaban1 = (RadioButton) findViewById(R.id.rbpilihanjawaban1);
        mrbPilihanJawaban2 = (RadioButton) findViewById(R.id.rbpilihanjawaban2);
        mrbPilihanJawaban3 = (RadioButton) findViewById(R.id.rbpilihanjawaban3);
        mrbPilihanJawaban4 = (RadioButton) findViewById(R.id.rbpilihanjawaban4);
        mbtnSubmit = (Button) findViewById(R.id.btnSubmit);

        //set konten
        mtvSkor.setText(""+skor);
        setKonten();

        mbtnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                cekJawaban();
            }
        });
    }


    public void setKonten(){
        mrgPilihanJawaban.clearCheck();
        arr = soalPG.pertanyaan.length;
        if (x >= arr){
            String jumlahSkor = String.valueOf(skor);
            Intent i = new Intent(KuisPilihanGandaActivity.this, HasilSkoringActivity.class);

            i.putExtra("skorAkhir",jumlahSkor);
            i.putExtra("activity","PilihanGanda");
            startActivity(i);

        } else {
            mtvSoal.setText(soalPG.getPertanyaan(x));
            mrbPilihanJawaban1.setText(soalPG.getPilihanJawaban1(x));
            mrbPilihanJawaban2.setText(soalPG.getPilihanJawaban2(x));
            mrbPilihanJawaban3.setText(soalPG.getPilihanJawaban3(x));
            mrbPilihanJawaban4.setText(soalPG.getPilihanJawaban4(x));
        }
        x++;
    }

    public void cekJawaban(){
        if (mrbPilihanJawaban1.isChecked()){

            if (mrbPilihanJawaban1.getText().toString().equals(jawaban)){
                skor = skor + 10;
                mtvSkor.setText(""+skor);
                Toast.makeText(this,"Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKonten();

            }else{
                mtvSkor.setText(""+skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }

        }else if (mrbPilihanJawaban2.isChecked()){

            if (mrbPilihanJawaban2.getText().toString().equals(jawaban)){
                skor = skor + 10;
                mtvSkor.setText(""+skor);
                Toast.makeText(this,"Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKonten();

            }else {
                mtvSkor.setText(""+skor);
                Toast.makeText(this,"Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();

            }
        }else if (mrbPilihanJawaban3.isChecked()){

            if (mrbPilihanJawaban3.getText().toString().equals(jawaban)){
                skor = skor + 10;
                mtvSkor.setText(""+skor);
                Toast.makeText(this,"Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKonten();

            }else {
                mtvSkor.setText(""+skor);
                Toast.makeText(this,"Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();

            }
        }else if (mrbPilihanJawaban4.isChecked()){

            if (mrbPilihanJawaban4.getText().toString().equals(jawaban)){
                skor = skor + 10;
                mtvSkor.setText(""+skor);
                Toast.makeText(this,"Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKonten();
            }else {
                mtvSkor.setText(""+skor);
                Toast.makeText(this,"Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }else {
            Toast.makeText(this, "Silahkan Memilih Jawabannya terlebih dahulu", Toast.LENGTH_SHORT).show();
        }
    }

    public void onBackPressed(){
        Toast.makeText(this, "selesaikan kuis",Toast.LENGTH_SHORT).show();

    }
}