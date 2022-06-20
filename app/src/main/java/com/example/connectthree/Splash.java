package com.example.connectthree;

import android.content.Intent;
import android.media.MediaPlayer;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class Splash extends AppCompatActivity {
    //variables
    ImageView connectthree;
    MediaPlayer splashsound;
    Animation animFadeIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ImageView connectthree = (ImageView) findViewById(R.id.connectthree);
        connectthree.setImageResource(R.drawable.connectthree);
        splashsound = MediaPlayer.create(this, R.raw.splashsound);
        // Start media player and sound plays when the app is loaded.
        splashsound.start();
        //Animates the connect-3 logo and make it fade in.
        animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        connectthree.startAnimation(animFadeIn);

        // Displays Splash screen is only on for around 3 seconds and then login screen.
        Thread background = new Thread(){

            public void run(){
                try{

                    sleep( 3*1000);

                    Intent i = new Intent(getBaseContext(),Login.class);
                    startActivity(i);

                    splashsound.release();
                    finish();
                }catch (Exception e){

                }
            }

        };
        //start thread
        background.start();
    }
}