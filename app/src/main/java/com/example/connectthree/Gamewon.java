package com.example.connectthree;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Gamewon extends AppCompatActivity implements View.OnClickListener {
    //Variables
    MediaPlayer youwon;
    Button mainGameBtn2;
    Button submitHighScoreBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamewon);

        //playersInput = (EditText) findViewById(R.id.playersInput);
       // playersText = (TextView) findViewById(R.id.playersText) ;
        //dbHandler = new MyDBHandler(this, null, null, 1);
        //printDatabase();

        youwon = MediaPlayer.create(this, R.raw.youwon);

        submitHighScoreBtn = findViewById(R.id.submitHighScoreBtn);
        submitHighScoreBtn.setOnClickListener(this);
        mainGameBtn2 = findViewById(R.id.mainGameBtn2);
        mainGameBtn2.setOnClickListener(this);

        youwon.start();
        Thread background = new Thread(){
            public void run(){
                try{

                    sleep( 30*1000);



                    youwon.release();

                }catch (Exception e){

                }
            }

        };
        //start thread
        background.start();
    }


    @Override
    public void onClick(View v) {


        Intent i = null;

        switch (v.getId()) {
            case R.id.submitHighScoreBtn:
                i = new Intent(this, HighScores.class);
                startActivity(i);
                break;
            case R.id.mainGameBtn2:
                i = new Intent(this, Menu.class);
                startActivity(i);
                break;
            default:
                i= new Intent(this,Gamewon.class);
                startActivity(i);

        }

    }
}