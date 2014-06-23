package com.MJCPrevert.lescinastes2.app;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;


public class Acceuil extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil);

        Button btnContact = (Button)findViewById(R.id.btnContact);

        btnContact.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View btnCon) {

                Intent voircontact; //declare une nouvelle activite
                voircontact = new Intent(Acceuil.this, Contact.class);
                startActivity(voircontact); //demarre l'activité precedemment declaree
                overridePendingTransition(R.anim.right_in, R.anim.left_out); //modification de la transition entre les pages

            }
        });

        Button btnAffiche = (Button)findViewById(R.id.btnAffiche);

        btnAffiche.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View btnAff) {

                Intent voiraffiche; //declare une nouvelle activite
                voiraffiche = new Intent(Acceuil.this, Affiche.class);
                startActivity(voiraffiche); //demarre l'activite precedemment declaree
                overridePendingTransition(R.anim.right_in, R.anim.left_out); //modification de la transition
            }
        });
    }
}

