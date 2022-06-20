package com.example.connectthree;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;



public class Settings extends AppCompatActivity implements View.OnClickListener {

    Button RetuMaMeBtn3;
    Button quitBtn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        RetuMaMeBtn3 = findViewById(R.id.RetuMaMeBtn3);
        RetuMaMeBtn3.setOnClickListener(this);
        quitBtn3 = findViewById(R.id.quitBtn3);
        quitBtn3.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        Intent i ;

        switch (view.getId()) {

            case R.id.RetuMaMeBtn3:
                i = new Intent(this, Menu.class);
                break;
            case R.id.quitBtn3:
                finish();
                break;
        }
    }
}