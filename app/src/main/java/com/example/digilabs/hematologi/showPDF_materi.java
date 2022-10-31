package com.example.digilabs.hematologi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.digilabs.R;
import com.github.barteksc.pdfviewer.PDFView;

public class showPDF_materi extends AppCompatActivity {
    ImageView imgback;
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_p_d_f_materi);

        imgback =  findViewById(R.id.mt_imgback);
        pdfView =  findViewById(R.id.pdfView_materi);

        pdfView.fromAsset("MATERI.pdf").load();
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =  new Intent(showPDF_materi.this, hitungLeukositActivity.class);
                startActivity(i);
            }
        });
    }
}