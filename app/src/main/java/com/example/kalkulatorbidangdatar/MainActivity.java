package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Kalkulator Bidang Datar");
    }

    public void fragmentPertama(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new PertamaFragment()).commit();

    }

    public void fragmentKedua(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new KeduaFragment()).commit();

    }

    public void fragmentKetiga(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new KetigaFragment()).commit();

    }

    @Override
    protected void onStart() {
        super.onStart();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new PertamaFragment()).commit();
    }
}