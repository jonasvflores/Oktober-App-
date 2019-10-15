package com.oktober.oktoberapp17;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;


public class MainActivity extends Activity {

    private WebView mWebView;
    ProgressBar progressBar;


    MyApplication myApplication;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myApplication = MyApplication.getInstance();

        //webview use to call own site
        mWebView =(WebView)findViewById(R.id.activity_main_webview);
        progressBar = (ProgressBar) findViewById(R.id.progressBar1);
        mWebView.setWebViewClient(new WebViewClient());
        mWebView .getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl("https://app.oktoberfest.org.br/home");




    }
}
