package com.example.mykuis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HasilSkoringActivity extends AppCompatActivity {
    TextView mtvHasilAkhir;
    Button mbtnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_skoring);

        mtvHasilAkhir = (TextView) findViewById(R.id.tvSkorAkhir);
        mbtnMenu = (Button) findViewById(R.id.btnMenu);
        setSkor();

        mbtnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HasilSkoringActivity.this, KuisActivity.class);
                startActivity(i);
            }
        });
    }
    public void setSkor(){

        String activity = getIntent().getStringExtra("activity");
        String skorPilGan = getIntent().getStringExtra("skorAkhir");
        String skorEssay = getIntent().getStringExtra("skorAkhir2");

        if (activity.equals("PilihanGanda")){

            mtvHasilAkhir.setText("SKOR : "+skorPilGan);
        }else {

            mtvHasilAkhir.setText("Skor : "+skorEssay);
        }
    }
    public void onBackPressed(){
        Toast.makeText(this,"Tidak bisa kembali, Silahkan pindah menu", Toast.LENGTH_SHORT).show();

    }
}