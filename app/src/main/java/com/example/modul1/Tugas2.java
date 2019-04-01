package com.example.modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tugas2 extends AppCompatActivity {


    TextView BeratBadan, TinggiBadan, Arti, Hasil;//deklarasi variable
    String str_BB, str_TB, str_BMI;
    double BB, TB, BMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas2);
    }

    public void hasil(View view) {
        BeratBadan = (TextView) findViewById(R.id.Inputan_BB); //inisialisasi berdasarekan id
        TinggiBadan = (TextView) findViewById(R.id.Inputan_TB);
        Hasil = (TextView) findViewById(R.id.Hasil_BMI);
        Arti = (TextView) findViewById(R.id.Arti_BMI);

        str_BB = BeratBadan.getText().toString();//mengambil inputan dari editText berat badan
        str_TB = TinggiBadan.getText().toString();

        if (str_BB.equals("") || str_TB.equals("")) {//jika
            BeratBadan.setText("");
            TinggiBadan.setText("");
        } else {
            BB = Double.valueOf(str_BB);
            TB = Double.valueOf(str_TB);

            BMI = BB / (TB * TB);

            if (BMI < 18.5) {
                Arti.setText("Underweight");
            } else if (BMI >= 18.5 && BMI <= 24.9) {
                Arti.setText("Normal Weight");
            } else if (BMI >= 25 && BMI <= 29.9) {
                Arti.setText("OverWeight");
            } else if (BMI >= 30 && BMI <= 34.9) {
                Arti.setText("Obesitas 1");
            } else if (BMI >= 35 && BMI <= 39.9) {
                Arti.setText("Obesitas 2");
            } else {
                Arti.setText("Obesitas 3");
            }

            Hasil.setText(" " + Double.toString(BMI));

        }
    }
}
