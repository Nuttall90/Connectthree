package com.example.connectthree;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Game extends AppCompatActivity implements View.OnClickListener {
    //this is declaring the buttons as variables.
    Button[] buttons = new Button[17];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_page);
        //this finds the buttons as their string names and links to them to a number.
        buttons[1] = findViewById(R.id.one);
        buttons[2] = findViewById(R.id.two);
        buttons[3] = findViewById(R.id.three);
        buttons[4] = findViewById(R.id.four);
        buttons[5] = findViewById(R.id.five);
        buttons[6] = findViewById(R.id.six);
        buttons[7] = findViewById(R.id.seven);
        buttons[8] = findViewById(R.id.eight);
        buttons[9] = findViewById(R.id.nine);
        buttons[10] = findViewById(R.id.ten);
        buttons[11] = findViewById(R.id.eleven);
        buttons[12] = findViewById(R.id.twelve);
        buttons[13] = findViewById(R.id.thirteen);
        buttons[14] = findViewById(R.id.fourteen);
        buttons[15] = findViewById(R.id.fifteen);
        buttons[16] = findViewById(R.id.sixteen);
        //this clears the numbers from the grid when the program is running.
        clearGrid();
        //for statement makes the buttons clickable.
        for (int i = 1; i <= 16; i++) {
            buttons[i].setOnClickListener(this);
        }


    }

    @Override
    public void onClick(View v) {

        // this switch statement makes it so that the boxes will be clicked and will link to the 'makemove' method to determine whether it will be a 'X' or an 'O'
        switch (v.getId()) {

            case R.id.one:
                makeMove(1);
                break;
            case R.id.two:
                makeMove(2);
                break;
            case R.id.three:
                makeMove(3);
                break;
            case R.id.four:
                makeMove(4);
                break;
            case R.id.five:
                makeMove(5);
                break;
            case R.id.six:
                makeMove(6);
                break;
            case R.id.seven:
                makeMove(7);
                break;
            case R.id.eight:
                makeMove(8);
                break;
            case R.id.nine:
                makeMove(9);
                break;
            case R.id.ten:
                makeMove(10);
                break;
            case R.id.eleven:
                makeMove(11);
                break;
            case R.id.twelve:
                makeMove(12);
                break;
            case R.id.thirteen:
                makeMove(13);
                break;
            case R.id.fourteen:
                makeMove(14);
                break;
            case R.id.fifteen:
                makeMove(15);
                break;
            case R.id.sixteen:
                makeMove(16);
                break;


        }


    }
    //this method will clear the grid of the numbers
    public void clearGrid() {
        for (int i = 1; i <= 16; i++) {
            buttons[i].setText("");
            buttons[i].setEnabled(true);
        }


    }
    //this make move command will make is so when a box is clicked it will appear with a 'O' and make it so the box cannot be clicked anymore.
    void respond() {
        for (int i = 1; i <= 16; i++) {

            int column =0; //Declaring a variable that will store information about which row the button that has been clicked is in
            if  ((i==1) || (i==5) || (i==9) || (i==13)) { //if the button clicked is the 1st, 5th, 9th or 13th then...
                column = 1;
            }
            if ((i == 2) || (i == 6) || (i == 10) || (i == 14)) {
                column = 2;
            }
            if  ((i==3) || (i==7) || (i==11) || (i==15)) {
                column = 3;
            }
            if ((i == 4) || (i == 8) || (i == 12) || (i == 16)) {
                column = 4;
            }
            if (column==1){  // if we are in the first row
                if (buttons[13].isEnabled()) { //check if the bottom button is enabled
                    buttons[13].setText("O"); //if it is set text to x and...
                    buttons[13].setEnabled(false);//set enabled to be false.
                    break;
                }
                else if(buttons[9].isEnabled()) { //do the same for this.
                    buttons[9].setText("O");
                    buttons[9].setEnabled(false);
                    break;
                }
                else if (buttons[5].isEnabled()) {
                    buttons[5].setText("O");
                    buttons[5].setEnabled(false);
                    break;
                }
                else if (buttons[1].isEnabled()) {
                    buttons[1].setText("O");
                    buttons[1].setEnabled(false);
                    break;
                }
            }
            if (column==2){
                if (buttons[14].isEnabled()) {
                    buttons[14].setText("O");
                    buttons[14].setEnabled(false);
                    break;
                }
                else if(buttons[10].isEnabled()) { //do the same for this.
                    buttons[10].setText("O");
                    buttons[10].setEnabled(false);
                    break;
                }
                else if (buttons[6].isEnabled()) {
                    buttons[6].setText("O");
                    buttons[6].setEnabled(false);
                    break;
                }
                else if (buttons[2].isEnabled()) {
                    buttons[2].setText("O");
                    buttons[2].setEnabled(false);
                    break;
                }

            }
            if (column==3){  // if we are in the third row
                if (buttons[15].isEnabled()) { //check if the bottom button is enabled
                    buttons[15].setText("O"); //if it is set text to x and...
                    buttons[15].setEnabled(false); //set enabled to be false.
                    break;
                }
                else if(buttons[11].isEnabled()) { //do the same for this.
                    buttons[11].setText("O");
                    buttons[11].setEnabled(false);
                    break;
                }
                else if (buttons[7].isEnabled()) {
                    buttons[7].setText("O");
                    buttons[7].setEnabled(false);
                    break;
                }
                else if (buttons[3].isEnabled()) {
                    buttons[3].setText("O");
                    buttons[3].setEnabled(false);
                    break;
                }

            }
            if (column==4){  // if we are in the forth row
                if (buttons[16].isEnabled()) { //check if the bottom button is enabled
                    buttons[16].setText("O"); //if it is set text to x and...
                    buttons[16].setEnabled(false); //set enabled to be false.
                    break;
                }
                else if(buttons[12].isEnabled()) { //do the same for this.
                    buttons[12].setText("O");
                    buttons[12].setEnabled(false);
                    break;
                }
                else if (buttons[8].isEnabled()) {
                    buttons[8].setText("O");
                    buttons[8].setEnabled(false);
                    break;
                }
                else if (buttons[4].isEnabled()) {
                    buttons[4].setText("O");
                    buttons[4].setEnabled(false);
                    break;
                }

            }


        }
    }
    //this make move command will make is so when a box is clicked it will appear with a 'X' and make it so the box cannot be clicked anymore.*
    public void makeMove ( int i){

        int column =0; //Declaring a variable that will store information about which row the button that has been clicked is in
        if  ((i==1) || (i==5) || (i==9) || (i==13)) { //if the button clicked is the 1st, 5th, 9th or 13th then...
            column = 1;
        }
        if ((i == 2) || (i == 6) || (i == 10) || (i == 14)) {
            column = 2;
        }
        if  ((i==3) || (i==7) || (i==11) || (i==15)) {
            column = 3;
        }
        if ((i == 4) || (i == 8) || (i == 12) || (i == 16)) {
            column = 4;
        }
        if (column==1){  // if we are in the first row
            if (buttons[13].isEnabled()) { //check if the bottom button is enabled
                buttons[13].setText("X"); //if it is set text to x and...
                buttons[13].setEnabled(false); //set enabled to be false.
            }
            else if(buttons[9].isEnabled()) { //do the same for this.
                buttons[9].setText("X");
                buttons[9].setEnabled(false);
            }
            else if (buttons[5].isEnabled()) {
                buttons[5].setText("X");
                buttons[5].setEnabled(false);
            }
            else if (buttons[1].isEnabled()) {
                buttons[1].setText("X");
                buttons[1].setEnabled(false);
            }
        }
        if (column==2){
            if (buttons[14].isEnabled()) {
                buttons[14].setText("X");
                buttons[14].setEnabled(false);
            }
            else if(buttons[10].isEnabled()) { //do the same for this.
                buttons[10].setText("X");
                buttons[10].setEnabled(false);
            }
            else if (buttons[6].isEnabled()) {
                buttons[6].setText("X");
                buttons[6].setEnabled(false);
            }
            else if (buttons[2].isEnabled()) {
                buttons[2].setText("X");
                buttons[2].setEnabled(false);
            }

        }
        if (column==3){  // if we are in the third row
            if (buttons[15].isEnabled()) { //check if the bottom button is enabled
                buttons[15].setText("X"); //if it is set text to x and...
                buttons[15].setEnabled(false); //set enabled to be false.
            }
            else if(buttons[11].isEnabled()) { //do the same for this.
                buttons[11].setText("X");
                buttons[11].setEnabled(false);
            }
            else if (buttons[7].isEnabled()) {
                buttons[7].setText("X");
                buttons[7].setEnabled(false);
            }
            else if (buttons[3].isEnabled()) {
                buttons[3].setText("X");
                buttons[3].setEnabled(false);
            }

        }
        if (column==4){  // if we are in the forth row
            if (buttons[16].isEnabled()) { //check if the bottom button is enabled
                buttons[16].setText("X"); //if it is set text to x and...
                buttons[16].setEnabled(false); //set enabled to be false.
            }
            else if(buttons[12].isEnabled()) { //do the same for this.
                buttons[12].setText("X");
                buttons[12].setEnabled(false);
            }
            else if (buttons[8].isEnabled()) {
                buttons[8].setText("X");
                buttons[8].setEnabled(false);
            }
            else if (buttons[4].isEnabled()) {
                buttons[4].setText("X");
                buttons[4].setEnabled(false);
            }

        }

        respond();

        //This links to the game won page if you win against the computer.
        if (hasAPlayerWon() == 1) {
            Intent gameWon = new Intent(this, Gamewon.class);
            startActivity(gameWon);
        }
        //this will send you to the game lost page if you lose against the computer.
        if (hasAPlayerWon() == 2) {
            Intent gameLost = new Intent(this, Gamelost.class);
            startActivity(gameLost);


        }
    }
    //this method will recognise when either the player or the computer has won. this is done by looking at all the possible combinations that can happen and selecting the winner
    private int hasAPlayerWon () {

        for ( int i = 1; i <= 16; i++)

        if ((buttons[1].getText() == "X") && (buttons[2].getText() == "X") && (buttons[3].getText() == "X")) {
            return 1;
        }
        if ((buttons[1].getText() == "X") && (buttons[5].getText() == "X") && (buttons[9].getText() == "X")) {
            return 1;
        }
        if ((buttons[1].getText() == "X") && (buttons[6].getText() == "X") && (buttons[11].getText() == "X")) {
            return 1;
        }
        if ((buttons[2].getText() == "X") && (buttons[3].getText() == "X") && (buttons[4].getText() == "X")) {
            return 1;
        }
        if ((buttons[2].getText() == "X") && (buttons[6].getText() == "X") && (buttons[10].getText() == "X")) {
            return 1;
        }
        if ((buttons[2].getText() == "X") && (buttons[7].getText() == "X") && (buttons[12].getText() == "X")) {
            return 1;
        }
        if ((buttons[3].getText() == "X") && (buttons[6].getText() == "X") && (buttons[9].getText() == "X")) {
            return 1;
        }
        if ((buttons[3].getText() == "X") && (buttons[7].getText() == "X") && (buttons[11].getText() == "X")) {
            return 1;
        }
        if ((buttons[4].getText() == "X") && (buttons[7].getText() == "X") && (buttons[10].getText() == "X")) {
            return 1;
        }
        if ((buttons[4].getText() == "X") && (buttons[8].getText() == "X") && (buttons[12].getText() == "X")) {
            return 1;
        }
        if ((buttons[5].getText() == "X") && (buttons[6].getText() == "X") && (buttons[7].getText() == "X")) {
            return 1;
        }
        if ((buttons[5].getText() == "X") && (buttons[9].getText() == "X") && (buttons[13].getText() == "X")) {
            return 1;
        }
        if ((buttons[5].getText() == "X") && (buttons[10].getText() == "X") && (buttons[15].getText() == "X")) {
            return 1;
        }
        if ((buttons[6].getText() == "X") && (buttons[10].getText() == "X") && (buttons[14].getText() == "X")) {
            return 1;
        }
        if ((buttons[6].getText() == "X") && (buttons[7].getText() == "X") && (buttons[8].getText() == "X")) {
            return 1;
        }
        if ((buttons[6].getText() == "X") && (buttons[11].getText() == "X") && (buttons[16].getText() == "X")) {
            return 1;
        }
        if ((buttons[7].getText() == "X") && (buttons[11].getText() == "X") && (buttons[15].getText() == "X")) {
            return 1;
        }
        if ((buttons[7].getText() == "X") && (buttons[10].getText() == "X") && (buttons[13].getText() == "X")) {
            return 1;
        }
        if ((buttons[8].getText() == "X") && (buttons[12].getText() == "X") && (buttons[16].getText() == "X")) {
            return 1;
        }
        if ((buttons[8].getText() == "X") && (buttons[11].getText() == "X") && (buttons[14].getText() == "X")) {
            return 1;
        }
        if ((buttons[9].getText() == "X") && (buttons[10].getText() == "X") && (buttons[11].getText() == "X")) {
            return 1;
        }
        if ((buttons[10].getText() == "X") && (buttons[11].getText() == "X") && (buttons[12].getText() == "X")) {
            return 1;
        }
        if ((buttons[13].getText() == "X") && (buttons[14].getText() == "X") && (buttons[15].getText() == "X")) {
            return 1;
        }
        if ((buttons[14].getText() == "X") && (buttons[15].getText() == "X") && (buttons[16].getText() == "X")) {
            return 1;
        }
        if ((buttons[1].getText() == "O") && (buttons[2].getText() == "O") && (buttons[3].getText() == "O")) {
            return 2;
        }
        if ((buttons[1].getText() == "O") && (buttons[5].getText() == "O") && (buttons[9].getText() == "O")) {
            return 2;
        }
        if ((buttons[1].getText() == "O") && (buttons[6].getText() == "O") && (buttons[11].getText() == "O")) {
            return 2;
        }
        if ((buttons[2].getText() == "O") && (buttons[3].getText() == "O") && (buttons[4].getText() == "O")) {
            return 2;
        }
        if ((buttons[2].getText() == "O") && (buttons[6].getText() == "O") && (buttons[10].getText() == "O")) {
            return 2;
        }
        if ((buttons[2].getText() == "O") && (buttons[7].getText() == "O") && (buttons[12].getText() == "O")) {
            return 2;
        }
        if ((buttons[3].getText() == "O") && (buttons[6].getText() == "O") && (buttons[9].getText() == "O")) {
            return 2;
        }
        if ((buttons[3].getText() == "O") && (buttons[7].getText() == "O") && (buttons[11].getText() == "O")) {
            return 2;
        }
        if ((buttons[4].getText() == "O") && (buttons[7].getText() == "O") && (buttons[10].getText() == "O")) {
            return 2;
        }
        if ((buttons[4].getText() == "O") && (buttons[8].getText() == "O") && (buttons[12].getText() == "O")) {
            return 2;
        }
        if ((buttons[5].getText() == "O") && (buttons[6].getText() == "O") && (buttons[7].getText() == "O")) {
            return 2;
        }
        if ((buttons[5].getText() == "O") && (buttons[9].getText() == "O") && (buttons[13].getText() == "O")) {
            return 2;
        }
        if ((buttons[5].getText() == "O") && (buttons[10].getText() == "O") && (buttons[15].getText() == "O")) {
            return 2;
        }
        if ((buttons[6].getText() == "O") && (buttons[10].getText() == "O") && (buttons[14].getText() == "O")) {
            return 2;
        }
        if ((buttons[6].getText() == "O") && (buttons[7].getText() == "O") && (buttons[8].getText() == "O")) {
            return 2;
        }
        if ((buttons[6].getText() == "O") && (buttons[11].getText() == "O") && (buttons[16].getText() == "O")) {
            return 2;
        }
        if ((buttons[7].getText() == "O") && (buttons[11].getText() == "O") && (buttons[15].getText() == "O")) {
            return 2;
        }
        if ((buttons[7].getText() == "O") && (buttons[10].getText() == "O") && (buttons[13].getText() == "O")) {
            return 2;
        }
        if ((buttons[8].getText() == "O") && (buttons[12].getText() == "O") && (buttons[16].getText() == "O")) {
            return 2;
        }
        if ((buttons[8].getText() == "O") && (buttons[11].getText() == "O") && (buttons[14].getText() == "O")) {
            return 2;
        }
        if ((buttons[9].getText() == "O") && (buttons[10].getText() == "O") && (buttons[11].getText() == "O")) {
            return 2;
        }
        if ((buttons[10].getText() == "O") && (buttons[11].getText() == "O") && (buttons[12].getText() == "O")) {
            return 2;
        }
        if ((buttons[13].getText() == "O") && (buttons[14].getText() == "O") && (buttons[15].getText() == "O")) {
            return 2;
        }
        if ((buttons[14].getText() == "O") && (buttons[15].getText() == "O") && (buttons[16].getText() == "O")) {
            return 2;
        }
        return 0;
    }
}

