package com.ilhammuhammadariq.tugasandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registrasi1 extends AppCompatActivity {
    EditText nama,alamat,email,phone;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi1);

        nama = findViewById(R.id.nama);
        alamat = findViewById(R.id.alamat);
        email = findViewById(R.id.email);
        phone =  findViewById(R.id.notelepon);}


    public void kirim(View view) {
        String namak,alamatk,emailk,phonek;

        Intent intent = new Intent(this, dataregis.class);
        namak = nama.getText().toString();
        alamatk = alamat.getText().toString();
        emailk = email.getText().toString();
        phonek = phone.getText().toString();

        intent.putExtra("data_nama",namak);
        intent.putExtra("data_alamat",alamatk);
        intent.putExtra("data_email",emailk);
        intent.putExtra("data_telepon",phonek);

        startActivity(intent);
    }
}