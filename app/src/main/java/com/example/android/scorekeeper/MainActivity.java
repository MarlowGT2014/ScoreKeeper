package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int guestScore = 0;
    int homeScore = 0;
    int currentBall = 0;
    int currentInning = 0;
    int currentStrike = 0;
    int currentOut = 0;

    //Guest Score
    public void updateScoreGuest(int score) {
        TextView scoreView = (TextView) findViewById(R.id.guestScore);
        scoreView.setText(String.valueOf(score));
    }

    public void minusGuest(View view) {

        if (guestScore > 0) {
            guestScore--;
            updateScoreGuest(guestScore);
        }
    }

    public void plusGuest(View view) {

        guestScore++;
        updateScoreGuest(guestScore);
    }


    //Home Score
    public void updateScoreHome(int score) {
        TextView scoreView = (TextView) findViewById(R.id.homeScore);
        scoreView.setText(String.valueOf(score));
    }

    public void minusHome(View view) {
        if (homeScore > 0) {
            homeScore--;
            updateScoreHome(homeScore);
        }
    }

    public void plusHome(View view) {
        homeScore++;
        updateScoreHome(homeScore);
    }

    //Inning Update
    public void updateInning(int score) {
        TextView scoreView = (TextView) findViewById(R.id.currentInning);
        scoreView.setText(String.valueOf(score));
    }

    public void minusInning(View view) {
        if (currentInning > 0) {
            currentInning--;
            updateInning(currentInning);
        }
    }

    public void plusInning(View view) {
        currentInning++;
        updateInning(currentInning);
    }

    //Ball Update
    public void updateBall(int score) {
        TextView scoreView = (TextView) findViewById(R.id.currentBall);
        scoreView.setText(String.valueOf(score));
    }

    public void minusBall(View view) {
        if (currentBall > 0) {
            currentBall--;
            updateBall(currentBall);
        }
    }

    public void plusBall(View view) {
        if (currentBall < 4) {
            currentBall++;
            updateBall(currentBall);
        }
    }

    //Strike Update
    public void updateStrike(int score) {
        TextView scoreView = (TextView) findViewById(R.id.currentStrike);
        scoreView.setText(String.valueOf(score));
    }

    public void minusStrike(View view) {
        if (currentStrike > 0) {
            currentStrike--;
            updateStrike(currentStrike);
        }
    }

    public void plusStrike(View view) {
        if (currentStrike < 3) {
            currentStrike++;
            updateStrike(currentStrike);
        }
    }

    //Out Update
    public void updateOut(int score) {
        TextView scoreView = (TextView) findViewById(R.id.currentOut);
        scoreView.setText(String.valueOf(score));
    }

    public void minusOut(View view) {
        if (currentOut > 0) {
            currentOut--;
            updateOut(currentOut);
        }
    }

    public void plusOut(View view) {
        if (currentOut < 3) {
            currentOut++;
            updateOut(currentOut);
        }
    }

    //Reset Game
    public void resetGame(View view) {
        homeScore = 0;
        guestScore = 0;
        currentBall = 0;
        currentInning = 0;
        currentStrike = 0;
        currentOut = 0;

        updateScoreHome(0);
        updateScoreGuest(0);
        updateInning(0);
        updateBall(0);
        updateStrike(0);
        updateOut(0);
    }
}
