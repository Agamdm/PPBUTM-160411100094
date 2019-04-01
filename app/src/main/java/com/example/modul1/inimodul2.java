package com.example.modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class inimodul2 extends AppCompatActivity {
    RadioButton id_language, en_language, hot1, hot2, hot3, cold1, cold2, cold3;
    CheckBox cappuchino_chck, moccachino_chck, cocholatos_chck;
    EditText cappuchino_edt, moccachino_edt, cocholatos_edt, owner_name, pay;
    Button order_btn, pay_btn, plus1_btn, min1_btn, plus2_btn, min2_btn, plus3_btn, min3_btn;
    TextView menu_txt, sajian_txt, nama_txt, bayar_txt, kembalianlbl_txt, kembalian_txt, printOut_txt, total_txt, info_nama, info_menu1, info_menu2, info_menu3;
    Integer sajian, cappuchino, moccachino, cocholatos, count_pay, cappuchino_price, moccachino_price, cocholatos_price;;
    String nama_pemesan, menu1_str, sajian1_str, banyak_pesanan1, menu2_str, sajian2_str, banyak_pesanan2, menu3_str, sajian3_str, banyak_pesanan3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inimodul2);

        id_language = findViewById(R.id.id);
        en_language = findViewById(R.id.en);
        hot1 = findViewById(R.id.hot1);
        hot2 = findViewById(R.id.hot2);
        hot3 = findViewById(R.id.hot3);
        cold1 = findViewById(R.id.cold1);
        cold2 = findViewById(R.id.cold2);
        cold3 = findViewById(R.id.cold3);

        cappuchino_chck = findViewById(R.id.cappucino);
        moccachino_chck = findViewById(R.id.moccachino);
        cocholatos_chck = findViewById(R.id.chocolatos);

        cappuchino_edt = findViewById(R.id.many1);
        moccachino_edt = findViewById(R.id.many2);
        cocholatos_edt = findViewById(R.id.many3);
        owner_name = findViewById(R.id.nama);
        pay = findViewById(R.id.bayar);

        order_btn = findViewById(R.id.orderbtn);
        pay_btn = findViewById(R.id.bayarbtn);
        plus1_btn = findViewById(R.id.plus1);
        plus2_btn = findViewById(R.id.plus2);
        plus3_btn = findViewById(R.id.plus3);
        min1_btn = findViewById(R.id.min1);
        min2_btn = findViewById(R.id.min2);
        min3_btn = findViewById(R.id.min3);

        menu_txt = findViewById(R.id.menu);
        sajian_txt = findViewById(R.id.sajian);
        nama_txt = findViewById(R.id.nametxt);
        bayar_txt = findViewById(R.id.bayartxt);
        //kembalianlbl_txt = findViewById(R.id.kembaiantxt);
        kembalian_txt = findViewById(R.id.kembalian);
        //printOut_txt = findViewById(R.id.printOut);
        total_txt = findViewById(R.id.total);
        //info_txt = findViewById(R.id.info);
        info_nama = findViewById(R.id.infonama);
        info_menu1 = findViewById(R.id.infomenu1);
        info_menu2 = findViewById(R.id.infomenu2);
        info_menu3 = findViewById(R.id.infomenu3);
    }

    public void count(View view) {
        menu1_str = "";
        menu2_str = "";
        menu3_str = "";
        sajian1_str = "";
        sajian2_str = "";
        sajian3_str = "";
        count_pay = 0;
        sajian = 0;
        cappuchino_price = 4000;
        moccachino_price = 5000;
        cocholatos_price = 3000;
        if (cappuchino_chck.isChecked()){
            menu1_str += "Cappuchino";
            sajian1_str = "Hangat";
            if (cold1.isChecked()){
                sajian = 1000;
                sajian1_str = "Dingin";
            }
            cappuchino = Integer.parseInt(cappuchino_edt.getText().toString());
            count_pay += cappuchino_price*cappuchino+cappuchino*sajian;
            info_menu1.setText(menu1_str + ", "+sajian1_str+", Jumlah : "+cappuchino);
        }
        if (moccachino_chck.isChecked()){
            menu2_str += "Moccachino";
            sajian2_str = "Hangat";
            if (cold2.isChecked()){
                sajian = 1000;
                sajian2_str = "Dingin";
            }
            moccachino = Integer.parseInt(moccachino_edt.getText().toString());
            count_pay += moccachino_price*moccachino+moccachino*sajian;
            info_menu2.setText(menu2_str + ", "+sajian2_str+", Jumlah : "+moccachino);
        }
        if (cocholatos_chck.isChecked()){
            menu3_str += "Cocholatos";
            sajian3_str = "Hangat";
            if (cold3.isChecked()){
                sajian = 1000;
                sajian3_str = "Dingin";
            }
            cocholatos = Integer.parseInt(cocholatos_edt.getText().toString());
            count_pay += cocholatos_price*cocholatos+cocholatos*sajian;
            info_menu3.setText(menu3_str + ", "+sajian3_str+", Jumlah : "+cocholatos);
        }

        /*if (moccachino_chck.isChecked()){
            if (hot2.isChecked()==false && cold2.isChecked()==false){
                Toast.makeText(getApplicationContext(),"Pilih Sajian Terlebih Dahulu",Toast.LENGTH_LONG).show();
            }
            moccachino = Integer.parseInt(moccachino_edt.getText().toString());
            count_pay += moccachino_price*moccachino;
        }
        if (cocholatos_chck.isChecked()){
            if (hot3.isChecked()==false && cold3.isChecked()==false){
                Toast.makeText(getApplicationContext(),"Pilih Sajian Terlebih Dahulu",Toast.LENGTH_LONG).show();
            }
            cocholatos = Integer.parseInt(cocholatos_edt.getText().toString());
            count_pay += cocholatos_price*cocholatos;
        }*/
        nama_pemesan = owner_name.getText().toString();
        info_nama.setText("Nama : "+nama_pemesan);

        total_txt.setText(count_pay.toString());
    }
    public void trigger_cappuchino(View view) {
        hot1.setChecked(true);
        cappuchino_edt.setText(Integer.toString(1));
    }
    public void tambah1(View view) {
        cappuchino_edt.setText(Integer.toString(Integer.parseInt(cappuchino_edt.getText().toString())+1));
    }
    public void minus1(View view) {
        Integer jumlah = Integer.parseInt(cappuchino_edt.getText().toString())-1;
        if (jumlah<0){
            jumlah = 0;
        }
        cappuchino_edt.setText(Integer.toString(jumlah));
    }

    public void trigger_moccachino(View view) {
        hot2.setChecked(true);
        moccachino_edt.setText(Integer.toString(1));
    }
    public void tambah2(View view) {
        moccachino_edt.setText(Integer.toString(Integer.parseInt(moccachino_edt.getText().toString())+1));
    }
    public void minus2(View view) {
        Integer jumlah = Integer.parseInt(moccachino_edt.getText().toString())-1;
        if (jumlah<0){
            jumlah = 0;
        }
        moccachino_edt.setText(Integer.toString(jumlah));
    }
    public void trigger_cocholatos(View view) {
        hot3.setChecked(true);
        cocholatos_edt.setText(Integer.toString(1));
    }
    public void tambah3(View view) {
        cocholatos_edt.setText(Integer.toString(Integer.parseInt(cocholatos_edt.getText().toString())+1));
    }
    public void minus3(View view) {
        Integer jumlah = Integer.parseInt(cocholatos_edt.getText().toString())-1;
        if (jumlah<0){
            jumlah = 0;
        }
        cocholatos_edt.setText(Integer.toString(jumlah));
    }

    public void order(View view) {


    }

}
