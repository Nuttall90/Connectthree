package com.example.connectthree;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Login extends AppCompatActivity implements View.OnClickListener {

    Button LoginBtn;
    EditText editUsername;
    EditText editPassword;
    // this method will check that the inputted username and password is correct and will change to the mainmenu page or return to the login page
    public boolean checkPassword() {
        if (editUsername.getText().toString().equals("test") &&
                (editPassword.getText().toString().equals("1234")))
            return true;
        else
            return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        LoginBtn = findViewById(R.id.LogInBtn);
        editUsername = findViewById(R.id.editUsername);
        editPassword = findViewById(R.id.editPassword);
        LoginBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (checkPassword()) {

            Intent i = new Intent(this,Menu.class);
            startActivity(i);
            





        }

    }
}
