package com.ilhammuhammadariq.tugasandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class dataregis extends AppCompatActivity {
    TextView tvnama,tvalamat,tvemail,tvtelepon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dataregis);

        tvnama = findViewById(R.id.textView1);
        tvalamat = findViewById(R.id.textView2);
        tvemail = findViewById(R.id.textView3);
        tvtelepon = findViewById(R.id.textView4);

        tvnama.setText(getIntent().getStringExtra("data_nama"));
        tvalamat.setText(getIntent().getStringExtra("data_alamat"));
        tvemail.setText(getIntent().getStringExtra("data_email"));
        tvtelepon.setText(getIntent().getStringExtra("data_telepon"));

    }


}
