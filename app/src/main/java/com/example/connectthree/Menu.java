package com.example.connectthree;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;



public class Menu extends AppCompatActivity implements View.OnClickListener {

    Button playgameBtn;
    Button highscoresBtn;
    Button quitBtn;
    Button settingsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        playgameBtn = findViewById(R.id.mainGameBtn);
        highscoresBtn = findViewById(R.id.highScoreBtn);
        settingsBtn = findViewById(R.id.settingsBtn);
        quitBtn = findViewById(R.id.quitBtn);
        playgameBtn.setOnClickListener(this);
        highscoresBtn.setOnClickListener(this);
        settingsBtn.setOnClickListener(this);
        quitBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent i = null;

        switch (v.getId()) {

            case R.id.mainGameBtn:
                i = new Intent(this,Game.class);
                break;

            case R.id.highScoreBtn:
                i = new Intent(this,HighScores.class);
                break;

            case R.id.settingsBtn:
                i = new Intent(this,Settings.class);
                break;
            case R.id.quitBtn:
                finish();
                break;

            default:
                i= new Intent(this,Menu.class);

        }
        startActivity(i);



    }
}