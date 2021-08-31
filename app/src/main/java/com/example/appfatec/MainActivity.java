package com.example.appfatec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView w = findViewById(R.id.web);
        w.setWebViewClient(new WebViewClient());
        w.setWebChromeClient(new WebChromeClient());
            //habilitando a execução do JS
        WebSettings conf = w.getSettings();
        conf.setJavaScriptEnabled(true);
        w.loadUrl("file:///android_asset/index.html");
    }
}