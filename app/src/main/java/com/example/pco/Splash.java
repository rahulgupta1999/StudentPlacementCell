package com.example.pco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Runnable r =new Runnable(){
            @Override
            public void run()
            {
                Intent home=new Intent(Splash.this,MainActivity.class);
                startActivity(home);
                finish();
            }

        };
        new Handler().postDelayed(r,2000);

    }
}
