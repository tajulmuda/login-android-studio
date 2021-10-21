package com.example.mykuis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class KuisActivity extends AppCompatActivity {
    LinearLayout mlinePilGan, mlineEssay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);

        mlinePilGan = (LinearLayout) findViewById(R.id.linePilGan);
        mlineEssay = (LinearLayout) findViewById(R.id.lineEssay);

        mlinePilGan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KuisActivity.this, KuisPilihanGandaActivity.class);
                startActivity(i);
            }
        });

        mlineEssay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KuisActivity.this, KuisEssayActivity.class);
                startActivity(i);
            }
        });
    }
}