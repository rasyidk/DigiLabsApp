package com.example.digilabs.hematologi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.digilabs.R;
import com.github.barteksc.pdfviewer.PDFView;

public class showPDF_langkah extends AppCompatActivity {

    ImageView imgback;
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_p_d_f_langkah);

        imgback =  findViewById(R.id.lk_imgback);
        pdfView =  findViewById(R.id.pdfView_langkah);

        pdfView.fromAsset("LANGKAH.pdf").load();
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =  new Intent(showPDF_langkah.this, hitungLeukositActivity.class);
                startActivity(i);
            }
        });
    }
}