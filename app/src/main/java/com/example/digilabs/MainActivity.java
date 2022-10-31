package com.example.digilabs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.digilabs.hematologi.gamesActivity1;
import com.example.digilabs.hematologi.hematologiActivity;
import com.example.digilabs.hematologi.hitungLeukositActivity;
import com.example.digilabs.signIn.signInActivity;

public class MainActivity extends AppCompatActivity {

    ImageView nav_ht;
    Button bt_logout;
    TextView tv_uname;

    @Override
    public void onBackPressed() {
        return;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nav_ht =  findViewById(R.id.nav_ht);
        tv_uname =  findViewById(R.id.mn_tvusername);
        bt_logout =  findViewById(R.id.mn_btlogout);


                nav_ht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =  new Intent(MainActivity.this, hematologiActivity.class);
                startActivity(i);
            }
        });


        filldata();
        bt_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                keluar();
            }
        });
    }
    private void filldata() {
        SharedPreferences sharedPreferences = getSharedPreferences("logstatus",MODE_PRIVATE);
        String username = sharedPreferences.getString("username","");
        tv_uname.setText("Hi!, "+ username);
    }

    private void keluar() {
        SharedPreferences.Editor logstatus = getSharedPreferences("logstatus", MODE_PRIVATE).edit();
        logstatus.putString("username", "");
        logstatus.apply();

        Intent i =  new Intent(MainActivity.this, signInActivity.class);
        startActivity(i);
    }

}