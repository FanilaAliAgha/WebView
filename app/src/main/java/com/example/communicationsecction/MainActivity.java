package com.example.communicationsecction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    public WebView ccomplier;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ccomplier=findViewById(R.id.ccompiler);

        ccomplier.loadUrl("https://google.com");

        WebSettings ccomplierSettings = ccomplier.getSettings();
        ccomplierSettings.setJavaScriptEnabled(true);




    }
}