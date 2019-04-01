package com.example.modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class No1 extends AppCompatActivity {

    TextView text1, text2; //deklarasi variable
    String coba;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no1);

        name =(EditText)findViewById(R.id.nama); //inisialisasi berdasarkan id

        text2=(TextView)findViewById(R.id.hasil);

    }

    public void cekHasil(View view){
        coba = name.getText().toString();//mengambil inputan dari edittext(name)
        text2.setText("Nama Saya adalah " + coba);// text2 di set dengan ("Nama Saya adalah " + coba(name))

    }
}
