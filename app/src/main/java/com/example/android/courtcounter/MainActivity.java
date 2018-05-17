package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int scoreTeamA = 0;
    int scoreTeamB = 0;
    static final String SCOREA = "Score for Team A";
    static final String SCOREB = "Score for Team B";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*Generated initially by Android Studio*/
        super.onCreate(savedInstanceState);

        /*Checks for saved scores*/
        if (savedInstanceState != null) {
            scoreTeamA = savedInstanceState.getInt(SCOREA);
            scoreTeamB = savedInstanceState.getInt(SCOREB);
        }

        /*Generated initially by Android Studio*/
        setContentView(R.layout.activity_main);

        /*Display the team scores from initial create or when reloaded by a change in device orientation*/
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        /*Save the user's current game state*/
        savedInstanceState.putInt(SCOREA, scoreTeamA);
        savedInstanceState.putInt(SCOREB, scoreTeamB);

        /*Always call the superclass so it can save the view hierarchy state*/
        super.onSaveInstanceState(savedInstanceState);
    }

    /*Displays the given score for Team A.*/
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /*Adds 3 points to Team A*/
    public void add3Points4TeamA(View view){

        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /*Adds 2 points to Team A*/
    public void add2Points4TeamA(View view){

        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /*Adds 1 point to Team A*/
    public void add1Point4TeamA(View view){

        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /*Displays the given score for Team B.*/
    public void displayForTeamB(int score) {

        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /*Adds 3 points to Team B*/
    public void add3Points4TeamB(View view){

        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }
    /*Adds 2 points to Team B*/
    public void add2Points4TeamB(View view){

        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }
    /*Adds 1 point to Team B*/
    public void add1Point4TeamB(View view){

        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }
    /*Resets the scores to 0*/
    public void resetGame(View view){

        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }



}
