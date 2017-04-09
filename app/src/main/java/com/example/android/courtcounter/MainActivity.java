package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.data;
import static android.app.PendingIntent.getActivity;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void addThreeForTeamA(View v){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
        Toast.makeText(MainActivity.this,
                "Great!!!", Toast.LENGTH_LONG).show();
    }

    public void addTwoForTeamA(View v){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
        Toast.makeText(MainActivity.this,
                "Almost there!!!", Toast.LENGTH_LONG).show();
    }

    public void addOneForTeamA(View v){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
        Toast.makeText(MainActivity.this,
                "yuhuu!!!", Toast.LENGTH_LONG).show();
    }


    public void addThreeForTeamB(View v){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
        Toast.makeText(MainActivity.this,
                "Great!!!", Toast.LENGTH_LONG).show();
    }

    public void addTwoForTeamB(View v){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
        Toast.makeText(MainActivity.this,
                "Almost there!!!", Toast.LENGTH_LONG).show();
    }

    public void addOneForTeamB(View v){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
        Toast.makeText(MainActivity.this,
                "yuhuu!!!", Toast.LENGTH_LONG).show();
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

    public void resetScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        Toast.makeText(MainActivity.this,
                "Back to the beginning!", Toast.LENGTH_LONG).show();;
    }
}
