package com.example.modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tugas extends AppCompatActivity {

    Button but1, but2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas);
        but1 = findViewById(R.id.tugas1);
        but2 = findViewById(R.id.tugas2);
    }

    public void klik1(View view) {
        Intent b = new Intent(Tugas.this, No1.class);
        startActivity(b);
    }

    public void klik2(View view) {
        Intent c = new Intent(Tugas.this, Tugas2.class);
        startActivity(c);
    }
}
