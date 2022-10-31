package com.example.digilabs.hematologi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.digilabs.R;

public class hitungLeukositActivity extends AppCompatActivity {


    @Override
    public void onBackPressed() {
        Intent i =  new Intent(hitungLeukositActivity.this, hematologiActivity.class);
        startActivity(i);
    }

    LinearLayout hl_langkah, hl_materi,hl_games,hl_info,hl_quiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_leukosit);

        hl_langkah =  findViewById(R.id.hl_langkah);
        hl_materi= findViewById(R.id.hl_materi);
        hl_games = findViewById(R.id.hl_games);
        hl_quiz =  findViewById(R.id.hl_quiz);
        hl_info =  findViewById(R.id.hl_info);

        hl_langkah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =  new Intent(hitungLeukositActivity.this, showPDF_langkah.class);
                startActivity(i);
            }
        });

        hl_materi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =  new Intent(hitungLeukositActivity.this, showPDF_materi.class);
                startActivity(i);
            }
        });

        hl_games.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =  new Intent(hitungLeukositActivity.this, gamesActivity1.class);
                startActivity(i);
            }
        });

        hl_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =  new Intent(hitungLeukositActivity.this, quizActivity.class);
                startActivity(i);
            }
        });

        hl_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent i =  new Intent(hitungLeukositActivity.this, infoActivity.class);
//                startActivity(i);

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://linktr.ee/DIGILABS"));
                startActivity(browserIntent);
            }
        });
    }
}