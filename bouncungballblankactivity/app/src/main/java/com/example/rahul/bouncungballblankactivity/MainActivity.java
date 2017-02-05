package com.example.rahul.bouncungballblankactivity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView balls_funTextView;
    Button easyButton, mediumButton, difficultButton, highScoresButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        setIDs();
        setOnClickListeners();
    }

    public void setIDs(){
        balls_funTextView = (TextView)findViewById(R.id.balls_funTextView);
        easyButton = (Button)findViewById(R.id.easyButton);
        mediumButton= (Button)findViewById(R.id.mediumButton);
        difficultButton = (Button)findViewById(R.id.difficultButton);
        highScoresButton = (Button)findViewById(R.id.highScoreButton);
    }

    public void setOnClickListeners(){
        easyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mediumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        difficultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        highScoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
