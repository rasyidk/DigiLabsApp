package com.example.digilabs.hematologi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.digilabs.MainActivity;
import com.example.digilabs.R;

public class hematologiActivity extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        Intent i =  new Intent(hematologiActivity.this, MainActivity.class);
        startActivity(i);
    }

    RelativeLayout ht_hl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hematologi);

        ht_hl =  findViewById(R.id.ht_hl);
        ht_hl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =  new Intent(hematologiActivity.this, hitungLeukositActivity.class);
                startActivity(i);
            }
        });
    }
}