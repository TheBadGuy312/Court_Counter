package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
        int sa,sb;
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
         sa= score+ sa;
        scoreView.setText(String.valueOf(sa));
    }

    public void threeA(View view){displayForTeamA(3);}
    public void twoA(View view){displayForTeamA(2);}
    public void oneA(View view){displayForTeamA(1);}


    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        sb= score+ sb;
        scoreView.setText(String.valueOf(sb));
    }

    public void threeB(View view){displayForTeamB(3);}
    public void twoB(View view){displayForTeamB(2);}
    public void oneB(View view){displayForTeamB(1);}

    public void resetScore(View view)
    {
        sa=0;
        sb=0;
        displayForTeamB(0);
        displayForTeamA(0);
    }
}


