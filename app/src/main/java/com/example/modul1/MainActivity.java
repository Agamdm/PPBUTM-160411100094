package com.example.modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void klik(View view) {
        Intent a = new Intent(MainActivity.this,Tugas.class);
        startActivity(a);
    }

    public void klikmodul2(View view) {
        Intent b = new Intent(MainActivity.this, modul2.class);
        startActivity(b);
    }
}
