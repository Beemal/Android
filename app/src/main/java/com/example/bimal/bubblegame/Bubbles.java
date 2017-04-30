package com.example.bimal.bubblegame;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Bubbles extends AppCompatActivity {
    public static int SPLASH_TIME_OUT = 5000;
    public static int counter = 0;
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
        setContentView(R.layout.activity_bubbles);
        final Button bubble1, bubble2, bubble3, bubble4, bubble5;
        final Intent i = new Intent(getApplicationContext(), Win.class);
        final TextView mTextField = (TextView) findViewById(R.id.textView8);

        bubble1 = (Button) findViewById(R.id.bubble_1);
        bubble2 = (Button) findViewById(R.id.bubble_2);
        bubble3 = (Button) findViewById(R.id.bubble3);
        bubble4 = (Button) findViewById(R.id.bubble4);
        bubble5 = (Button) findViewById(R.id.bubble5);


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
                 if (counter != 5) {
                     Intent i2 = new Intent(getApplicationContext(), Lose.class);
                     startActivity(i2);
                 }
                 counter = 0;
//                 close this activity
                 finish();
             }
            }
        }, SPLASH_TIME_OUT);

        bubble1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                bubble1.setVisibility(v.INVISIBLE);
                if(counter == 5){
                    startActivity(i);
                }
            }
        });
        bubble2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                bubble2.setVisibility(v.INVISIBLE);
                if(counter == 5){
                    startActivity(i);
                }
            }
        });
        bubble3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                bubble3.setVisibility(v.INVISIBLE);
                if(counter == 5){
                    startActivity(i);
                  }
            }
        });
        bubble4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                bubble4.setVisibility(v.INVISIBLE);
                if(counter == 5){
                   startActivity(i);
                }
            }
        });
        bubble5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                bubble5.setVisibility(v.INVISIBLE);
                if(counter == 5){
                    startActivity(i);
                  }
            }
        });


    }
}
