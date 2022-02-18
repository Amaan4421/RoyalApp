package com.royalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    int time=3000;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imageView = findViewById(R.id.ic_img);
        
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
           Intent i = new Intent(SplashActivity.this,MainActivity.class);
           startActivity(i);
           finish();
            }
        },time);
    }
}