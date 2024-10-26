package com.bayu.pesanan;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Hasil extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textViewBurger = findViewById(R.id.textViewing);
        TextView textViewNasiGoreng = findViewById(R.id.textView2);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textViewBakso = findViewById(R.id.textView3);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textViewTotal = findViewById(R.id.textViewend);

        int totalBurger = getIntent().getIntExtra("totalBurger", 0);
        int totalNasiGoreng = getIntent().getIntExtra("totalNasiGoreng", 0);
        int totalBakso = getIntent().getIntExtra("totalBakso", 0);
        int grandTotal = getIntent().getIntExtra("grandTotal", 0);

        textViewBurger.setText("Cheese Burger: Rp " + totalBurger);
        textViewNasiGoreng.setText("Nasi Goreng: Rp " + totalNasiGoreng);
        textViewBakso.setText("Bakso: Rp " + totalBakso);
        textViewTotal.setText("Total: Rp " + grandTotal);
    }
}