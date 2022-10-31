package com.example.digilabs.hematologi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import com.example.digilabs.R;

public class quizActivity extends AppCompatActivity {


    SwipeRefreshLayout swipe;
    WebView webView;
    ImageView imback;

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        swipe = findViewById(R.id.qz_swipe);
        webView =  findViewById(R.id.qz_webview);
        imback =  findViewById(R.id.qz_imgback);
        imback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =  new Intent(quizActivity.this, hitungLeukositActivity.class);
                startActivity(i);
            }
        });

        swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                WebAction();
            }
        });

        WebAction();

    }

    private void WebAction() {


        WebView webView = (WebView) findViewById(R.id.qz_webview);
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);

        // Tiga baris di bawah ini agar laman yang dimuat dapat
        // melakukan zoom.
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        // Baris di bawah untuk menambahkan scrollbar di dalam WebView-nya
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSdbHLXyC0oEQWCwwOnnak-aBK9qYc4eH60QVQghFfzRpnYnxw/viewform");

        final ProgressDialog pd = ProgressDialog.show(this, "", "Loading...",true);

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                if(pd!=null && pd.isShowing())
                {
                    pd.dismiss();
                }
            }
        });

//        webView.getSettings().setJavaScriptEnabled(true);
//        webView.getSettings().setAppCacheEnabled(true);
//        webView.loadUrl("https://www.google.com/");
//        swipe.setRefreshing(true);

    }
}
