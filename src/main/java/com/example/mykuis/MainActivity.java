package com.example.mykuis;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.btnLogin);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameKey = username.getText().toString();
                String passwordkey = password.getText().toString();

                if (usernameKey.equals("Kuis18")&& passwordkey.equals("123456")){
                    //login berhasil
                    Toast.makeText(getApplicationContext(),"Login sukses",
                            Toast.LENGTH_SHORT).show();
                    PrefManager prefManager = new PrefManager(getApplicationContext());
                    prefManager.setIsFirstTimeLaunch(true);
                    Intent intent = new Intent(MainActivity.this,SliderActivity.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                } else {
                    //login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Tebak Lagi !").setNegativeButton("COBA", null).create().show();
                }
            }
        });
    }
}