package com.MJCPrevert.lescinastes2.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {
    private static int SPLASH_TIME_OUT = 3000; //determine la duree de l'activite

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
                //execute la methode une fois le timer termine
                //demarre l'activite principale
                Intent i = new Intent(SplashScreen.this, Acceuil.class);
                startActivity(i);

                //ferme l'activite precedente
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

}