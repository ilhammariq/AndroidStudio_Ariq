package com.ilhammuhammadariq.tugasandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void registrasi(View view) {
       Intent regis = new Intent(this,Registrasi1.class);
       startActivity(regis);
    }

    public void callcenter(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("tel:0222009562"));
        startActivity(intent);
    }
    public void website (View view) {
        browser ( "http://poltekpos.ac.id/");
    }
    private void browser(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent poltekpos = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(poltekpos);
    }


}
