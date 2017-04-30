package com.example.bimal.bubblegame;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Level2Activity extends AppCompatActivity {
    public static  int counter = 0;
    public static int SPLASH_TIME_OUT = 5000;
    private volatile boolean cancelled = false;

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        cancelled = true;
        this.finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);
        final Intent i = new Intent(getApplicationContext(), Win.class);
        ArrayList<View> allButtons;
        allButtons = ((RelativeLayout) findViewById(R.id.activity_level2)).getTouchables();
        final TextView mTextField = (TextView) findViewById(R.id.textView);
        // Count-Down (show timer)
        new CountDownTimer(SPLASH_TIME_OUT, 1000) {
            public void onTick(long millisUntilFinished) {
                mTextField.setText("seconds remaining: " + millisUntilFinished / 1000);
            }
            public void onFinish() {
                mTextField.setText("Time Up!");
            }
        }.start();

        //        SET TIME FOR GAME TO FINISH WITHIN TIME_OUT
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(cancelled){
                    finish();
                }else {
                    if (counter != 18) {
                        Intent i2 = new Intent(getApplicationContext(), Lose.class);
                        startActivity(i2);
                    }
                    counter = 0;
                    // close this activity
                    finish();
                }
            }
        }, SPLASH_TIME_OUT);


        for(final View button: allButtons){
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    counter++;
                    button.setVisibility(v.INVISIBLE);
                    if(counter == 18){
                        startActivity(i);
                    }
                }
            });
        }
    }
}
