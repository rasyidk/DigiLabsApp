package com.example.digilabs.hematologi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.digilabs.R;

public class gamesActivity3 extends AppCompatActivity {

    ImageView img1,img2,img3,img4,imgdefault;
    Button btnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games3);

        img1 =  findViewById(R.id.g3_img1);
        img2 =  findViewById(R.id.g3_img2);
        img3 =  findViewById(R.id.g3_img3);
        img4 =  findViewById(R.id.g3_img4);

        imgdefault = findViewById(R.id.g3_imgdef);
        btnext = findViewById(R.id.g3_btnext);

        btnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =  new Intent(gamesActivity3.this, hitungLeukositActivity.class);
                startActivity(i);
            }
        });

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgdefault.setImageResource(R.drawable.pge2);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgdefault.setImageResource(R.drawable.pge1);
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgdefault.setImageResource(R.drawable.pge3);
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgdefault.setImageResource(R.drawable.pge4);
            }
        });
    }
}