package com.uas.islami;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.uas.islami.Halal;
import com.uas.islami.MainMenuActivity;
import com.uas.islami.R;
import com.uas.islami.Sholat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Muslim Aplication");

        findViewById(R.id.btn_jadwal_sholat).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Sholat.class));
            }
        });

        findViewById(R.id.btn_produk_halal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Halal.class));
            }
        });

        findViewById(R.id.btn_doa_harian).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainMenuActivity.class));
            }
        });
    }
}
