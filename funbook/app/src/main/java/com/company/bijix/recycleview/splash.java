package com.company.bijix.recycleview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final Thread splash = new Thread(){

            @Override
            public void run() {
                try {
                    sleep(2000);
                }
                catch (InterruptedException a){
                    a.printStackTrace();
                }
                finally {
                    startActivity( new Intent(splash.this , MainActivity.class));
                    finish();
                }
            }
        };
        splash.start();

    }
}
