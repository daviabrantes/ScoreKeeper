package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button resetScore;

    private Button teamAGoal;
    private Button teamAPass;
    private Button teamAShoot;

    private Button teamBGoal;
    private Button teamBPass;
    private Button teamBShoot;

    private TextView teamAScore;
    private TextView teamBScore;

    int teamATotal = 0;
    int teamBTotal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();
        setupListeners();
    }

    private void setupViews() {
        resetScore = findViewById(R.id.score_reset);

        teamBScore = findViewById(R.id.team_b_score);
        teamAScore = findViewById(R.id.team_a_score);

        teamAGoal = findViewById(R.id.team_a_goal);
        teamAPass = findViewById(R.id.team_a_pass);
        teamAShoot = findViewById(R.id.team_a_shoot);

        teamBShoot = findViewById(R.id.team_b_shoot);
        teamBPass = findViewById(R.id.team_b_pass);
        teamBGoal = findViewById(R.id.team_b_goal);
    }

    private void setupListeners() {
        teamAGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamATotal += 5;
                displayScores();
            }
        });
        teamAPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamATotal += 1;
                displayScores();
            }
        });
        teamAShoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamATotal += 1;
                displayScores();
            }
        });
        teamBGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamBTotal += 5;
                displayScores();
            }
        });
        teamBPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamBTotal += 1;
                displayScores();
            }
        });
        teamBShoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamBTotal += 1;
                displayScores();
            }
        });
        resetScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamATotal = 0;
                teamBTotal = 0;
                displayScores();
            }
        });
    }

    private void displayScores() {
        teamAScore.setText(String.valueOf(teamATotal));
        teamBScore.setText(String.valueOf(teamBTotal));
    }
}
