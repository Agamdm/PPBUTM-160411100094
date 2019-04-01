package com.example.modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class modul2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modul2);
    }

    public void klikmod2tgs1(View view) {
        Intent klikaku = new Intent(modul2.this, inimodul2.class);
        startActivity(klikaku);
    }
}
