package com.example.convertanywebsiteintoanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);



        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient()); // now everything is open in app

        webView.loadUrl("https://tuitionterminal.com.bd/");
    }
}