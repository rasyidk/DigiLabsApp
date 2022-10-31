package com.example.digilabs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.digilabs.signIn.signInActivity;

import java.util.Timer;
import java.util.TimerTask;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Timer t =new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {

                SharedPreferences sharedPreferences = getSharedPreferences("logstatus",MODE_PRIVATE);
                String username = sharedPreferences.getString("username","");

                if(username == ""){
                    Intent i =  new Intent(splashScreen.this, signInActivity.class);
                    startActivity(i);
                    finish();
                }else{
                    Intent i =  new Intent(splashScreen.this, MainActivity.class);
                    startActivity(i);
                    finish();
                }

            }
        },2000);
    }
}