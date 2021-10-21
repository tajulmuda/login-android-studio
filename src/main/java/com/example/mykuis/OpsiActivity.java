package com.example.mykuis;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class OpsiActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opsi);
    }

    public void QuizPindah(View view){
        Intent intent = new Intent(OpsiActivity.this, KuisActivity.class);
        startActivity(intent);
    }

    public void MoneyConvert(View view){
        Intent intent = new Intent(OpsiActivity.this, ConvertMoneyActivity.class);
        startActivity(intent);
    }
}