package com.example.digilabs.hematologi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.digilabs.R;
import com.example.digilabs.signIn.signInActivity;
import com.example.digilabs.splashScreen;

public class gamesActivity1 extends AppCompatActivity {

    ImageView img1,img2,img3,img4,img5,img6,imgdefault;
    Button btnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games1);

        img1 =  findViewById(R.id.g1_img1);
        img2 =  findViewById(R.id.g1_img2);
        img3 =  findViewById(R.id.g1_img3);
        img4 =  findViewById(R.id.g1_img4);
        img5 =  findViewById(R.id.g1_img5);
        img6 =  findViewById(R.id.g1_img6);
        imgdefault = findViewById(R.id.g1_imgdef);
        btnext = findViewById(R.id.g1_btnext);

        btnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =  new Intent(gamesActivity1.this, gamesActivity2.class);
                startActivity(i);
            }
        });

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgdefault.setImageResource(R.drawable.pga1);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgdefault.setImageResource(R.drawable.pga2);
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgdefault.setImageResource(R.drawable.pga3);
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgdefault.setImageResource(R.drawable.pga4);
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgdefault.setImageResource(R.drawable.pga5);
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgdefault.setImageResource(R.drawable.pga6);
            }
        });


    }
}