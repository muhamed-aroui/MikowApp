package com.example.mikowapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numbersTxt = findViewById(R.id.numbers);
        TextView familyTxt = findViewById(R.id.family);
        TextView colorsTxt = findViewById(R.id.colors);
        TextView phrasesTxt = findViewById(R.id.phrases);
        numbersTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNumbersActivity = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(intentNumbersActivity);
            }
        });
        familyTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,FamilyActivity.class));
            }
        });
        colorsTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ColorsActivity.class));
            }
        });
        phrasesTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,PhrasesActivity.class));
            }
        });

    }
    }

