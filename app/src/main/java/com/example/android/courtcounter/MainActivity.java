package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds touchdown points +6 for Team A
     */
    public void addSixTeamA(View view){
        final int touchdown = 6;
        scoreTeamA = scoreTeamA + touchdown;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds touchdown points +6 for Team B
     */
    public void addSixTeamB(View view){
        final int touchdown = 6;
        scoreTeamB = scoreTeamB + touchdown;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds field goal +3 points for Team A
     */
    public void addThreeTeamA(View view){
        final int fieldGoal = 3;
        scoreTeamA = scoreTeamA + fieldGoal;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds field goal +3 points for Team B
     */
    public void addThreeTeamB(View view){
        final int fieldGoal = 3;
        scoreTeamB = scoreTeamB + fieldGoal;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds two points for Team A
     */
    public void addTwoTeamA(View view){
        final int twoPoints = 2;
        scoreTeamA = scoreTeamA + twoPoints;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds two points for Team B
     */
    public void addTwoTeamB(View view){
        final int twoPoints = 2;
        scoreTeamB = scoreTeamB + twoPoints;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds extra point +1 for Team A
     */
    public void addOneTeamA(View view){
        final int extraPoint = 1;
        scoreTeamA = scoreTeamA + extraPoint;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds extra point +1 for Team B
     */
    public void addOneTeamB(View view){
        final int extraPoint = 1;
        scoreTeamB = scoreTeamB + extraPoint;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Reset the score for both teams to zero
     */
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
