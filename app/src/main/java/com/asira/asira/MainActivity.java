package com.asira.asira;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.asira.asira.webview.WebViewActivity;

public class MainActivity extends Activity {
    private Button mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWebView=(Button)findViewById(R.id.mWebView);


        //*****Listener for WebView Button************//
        mWebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        final Intent mainIntent = new Intent(MainActivity.this, WebViewActivity.class);
                        MainActivity.this.startActivity(mainIntent);
                        MainActivity.this.finish();
                    }
                }, 10000);


                //********Type-I declaration********//
/*
                startActivity(new Intent(MainActivity.this, WebViewActivity.class));
*/

                //********Type-II declaration********//
               /* Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                startActivity(intent);*/

            }
        });
    }
}
