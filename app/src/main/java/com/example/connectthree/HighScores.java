package com.example.connectthree;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class HighScores extends AppCompatActivity implements View.OnClickListener{

    EditText playersInput;
    TextView playersText;
    MyDBHandler dbHandler;
    Button submitNameBtn;
    Button deleteBtn;
    Button retuMaMeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_scores);

        playersInput = (EditText) findViewById(R.id.playersInput);
        playersText = (TextView) findViewById(R.id.playersText) ;
        dbHandler = new MyDBHandler(this, null, null, 1);

        submitNameBtn = findViewById(R.id.submitNameBtn);
        submitNameBtn.setOnClickListener(this);
        deleteBtn = findViewById(R.id.deleteBtn);
        deleteBtn.setOnClickListener(this);
        retuMaMeBtn = findViewById(R.id.retuMaMeBtn);
        retuMaMeBtn.setOnClickListener(this);

    }
    public void addButtonClicked () {
        Players player  = new Players(playersInput.getText().toString());
        dbHandler.addPlayer(player);
    }
    //Delete items
    public void deleteButtonClicked(){
        String inputText = playersInput.getText().toString();
        dbHandler.deletePlayer(inputText);
        printDatabase();
    }
    private void printDatabase() {
        String dbString  = dbHandler.databaseToString();
        playersText.setText(dbString);
        playersInput.setText("");
    }
    public void onClick(View v) {

        Intent i = null ;

        switch (v.getId()) {
            case R.id.submitNameBtn:
                addButtonClicked();
                printDatabase();
                break;
            case R.id.deleteBtn:
                deleteButtonClicked();
                break;
            case R.id.retuMaMeBtn:
                i = new Intent(this, Menu.class);
                startActivity(i);
                break;
        }
    }
}