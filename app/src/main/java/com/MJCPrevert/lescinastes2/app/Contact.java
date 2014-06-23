package com.MJCPrevert.lescinastes2.app;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Contact extends Activity {
    ImageButton imgBtnMail;
    ImageButton imgBtnTel;
    ImageButton imgBtnTwi;
    ImageButton imgBtnFac;
    ImageButton imgBtnSite;

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        overridePendingTransition(R.anim.left_in, R.anim.right_out); //modification de l'animation de retour
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        imgBtnTel = (ImageButton)findViewById(R.id.imgBtnTel);
        imgBtnMail = (ImageButton)findViewById(R.id.imgBtnMail);
        imgBtnSite = (ImageButton)findViewById(R.id.imgBtnSite);
        imgBtnTwi = (ImageButton)findViewById(R.id.imgBtnTwi);
        imgBtnFac = (ImageButton)findViewById(R.id.imgBtnFac);

        imgBtnTel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View tel) {
                final Intent telIntent = new Intent(Intent.ACTION_CALL); //donne l'action de l'activite
                telIntent.setData(Uri.parse("tel:0243512818")); //parametre pour l'activite
                startActivity(telIntent);//demarre l'activite avec les parametres
            }
        });

        imgBtnMail.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View mail) {

                final Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND); //donne l'action de l'activite
                emailIntent.setType("plain/text");
                emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"infos@les-cineastes.fr"}); //renseignement de l'adresse mail
                //emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Objet du mail");
                //emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Corps du message ");
                startActivity(Intent.createChooser(emailIntent, "Envoi email… "));//demarre l'activite

            }
        });

        imgBtnTwi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View twi) {

                String urlTwi = "https://twitter.com/LesCineastes";

                Intent twIntent = new Intent(Intent.ACTION_VIEW); //donne l'action
                twIntent.setData(Uri.parse(urlTwi));//parametre avec l'url
                startActivity(twIntent);//demarre l'activite
            }
        });

        imgBtnFac.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View fac) {
                String urlFac = "http://facebook.com/cinema.cineastes";

                Intent facIntent = new Intent(Intent.ACTION_VIEW); //donne l'action
                facIntent.setData(Uri.parse(urlFac));//paremetre avec l'url
                startActivity(facIntent);//demarre l'activite
            }
        });

        imgBtnSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View site) {
                String urlSite = "http://les-cineastes.fr";

                Intent siIntent = new Intent(Intent.ACTION_VIEW);//donne l'action
                siIntent.setData(Uri.parse(urlSite));//parametre avec l'url
                startActivity(siIntent);//demarre l'activite
            }
        });
    }

}
