package com.asira.asira.splash_screen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.asira.asira.MainActivity;
import com.asira.asira.R;

/**
 * Created by sitaramaprasad on 1/18/2017.
 */

public class SplashScreenActivity extends Activity {

    // Splah screen timing
    private static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity

                //  List<User> getUserRecords = User.listAll(User.class);


                Intent i = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(i);
                // close this activity
                finish();


            }
        }, SPLASH_TIME_OUT);
    }

  /*  ///////////////////////////////////Checking Networkconectivity ///////////////////////////////////////

    public boolean isOnline() {
        ConnectivityManager cm =
                (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }*/
}