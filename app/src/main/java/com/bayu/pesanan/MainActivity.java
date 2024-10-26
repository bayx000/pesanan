package com.bayu.pesanan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int countBurger = 0;
    private int countNasiGoreng = 0;
    private int countBakso = 0;

    private TextView textCountBurger;
    private TextView textCountNasiGoreng;
    private TextView textCountBakso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textCountBurger = findViewById(R.id.text_count);
        textCountNasiGoreng = findViewById(R.id.text_count2);
        textCountBakso = findViewById(R.id.text_count3);

        Button minusBurger = findViewById(R.id.minus);
        Button plusBurger = findViewById(R.id.plus);
        Button minusNasiGoreng = findViewById(R.id.bottom_minus2);
        Button plusNasiGoreng = findViewById(R.id.bottom_plus2);
        Button minusBakso = findViewById(R.id.bottom_minus3);
        Button plusBakso = findViewById(R.id.bottom_plus3);
        Button submitButton = findViewById(R.id.button2);

        minusBurger.setOnClickListener(view -> updateCount(textCountBurger, --countBurger));
        plusBurger.setOnClickListener(view -> updateCount(textCountBurger, ++countBurger));

        minusNasiGoreng.setOnClickListener(view -> updateCount(textCountNasiGoreng, --countNasiGoreng));
        plusNasiGoreng.setOnClickListener(view -> updateCount(textCountNasiGoreng, ++countNasiGoreng));

        minusBakso.setOnClickListener(view -> updateCount(textCountBakso, --countBakso));
        plusBakso.setOnClickListener(view -> updateCount(textCountBakso, ++countBakso));

        submitButton.setOnClickListener(view -> submitOrder());
    }

    private void updateCount(TextView textView, int count) {
        if (count < 0) count = 0;
        textView.setText(String.valueOf(count));
    }

    private void submitOrder() {
        int priceBurger = 35000;
        int totalBurger = countBurger * priceBurger;
        int priceNasiGoreng = 25000;
        int totalNasiGoreng = countNasiGoreng * priceNasiGoreng;
        int priceBakso = 15000;
        int totalBakso = countBakso * priceBakso;

        int grandTotal = totalBurger + totalNasiGoreng + totalBakso;

        Intent intent = new Intent(MainActivity.this, Hasil.class);
        intent.putExtra("totalBurger", totalBurger);
        intent.putExtra("totalNasiGoreng", totalNasiGoreng);
        intent.putExtra("totalBakso", totalBakso);
        intent.putExtra("grandTotal", grandTotal);
        startActivity(intent);
    }
}
