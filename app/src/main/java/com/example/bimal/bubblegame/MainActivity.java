package com.example.bimal.bubblegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button startBtn, level2, level3, level4, level5, level6, level7;
        startBtn = (Button) findViewById(R.id.start_btn);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Bubbles.class);
                startActivity(i);
            }
        });

        level2 = (Button) findViewById(R.id.button2);
        level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Level2Activity.class);
                startActivity(i);
            }
        });

        level3 = (Button) findViewById(R.id.button3);
        level3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Level3Activity.class);
                startActivity(i);
            }
        });
        level4 = (Button) findViewById(R.id.button4);
        level4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Level 4 Under Construction",Toast.LENGTH_SHORT).show();
            }
        });
        level5 = (Button) findViewById(R.id.button5);
        level5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Level 5 Under Construction",Toast.LENGTH_SHORT).show();
            }
        });
        level6 = (Button) findViewById(R.id.button6);
        level6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Level 6 Under Construction",Toast.LENGTH_SHORT).show();
            }
        });
        level7 = (Button) findViewById(R.id.button7);
        level7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Level 7 Under Construction",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
