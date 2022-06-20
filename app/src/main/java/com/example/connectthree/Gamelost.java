package com.example.connectthree;

import android.content.Intent;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Gamelost extends AppCompatActivity implements View.OnClickListener {

    //Variables
    MediaPlayer gameOver;
    Button mainGameBtn;
    Button quitBtn5;
    Button submitHighBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamelost);


        gameOver = MediaPlayer.create(this, R.raw.gameover);


        quitBtn5 = findViewById(R.id.quitBtn5);
        quitBtn5.setOnClickListener(this);
        mainGameBtn = findViewById(R.id.mainGameBtn);
        mainGameBtn.setOnClickListener(this);
        submitHighBtn = findViewById(R.id.submitHighBtn);
        submitHighBtn.setOnClickListener(this);

        gameOver.start();
        Thread background = new Thread(){
        public void run(){
            try{

                sleep( 10*1000);

                gameOver.release();
                finish();
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
            case R.id.submitHighBtn:
                i = new Intent(this, HighScores.class);
                startActivity(i);
                break;
            case R.id.mainGameBtn:
                i = new Intent(this, Menu.class);
                startActivity(i);
                break;
            case R.id.quitBtn5:
                finish();
                break;
            default:
                i= new Intent(this,Gamelost.class);
                startActivity(i);
        }

    }
}