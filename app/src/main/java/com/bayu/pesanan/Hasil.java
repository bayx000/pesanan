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

        TextView textViewBurger = findViewById(R.id.textViewBurger);
        TextView textViewNasiGoreng = findViewById(R.id.textViewNasiGoreng);
        TextView textViewBakso = findViewById(R.id.textViewBakso);
        TextView textViewTotal = findViewById(R.id.textViewTotal);

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
