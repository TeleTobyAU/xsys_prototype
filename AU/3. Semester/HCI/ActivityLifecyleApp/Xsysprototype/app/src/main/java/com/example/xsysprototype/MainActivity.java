package com.example.xsysprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    User user;
    ImageButton laundryButton, gymButton, barButton, musicButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = new User("Magnus Haxen", "45", "19");

        laundryButton = findViewById(R.id.laundryButton);
        gymButton = findViewById(R.id.gymButton);
        barButton = findViewById(R.id.barButton);
        musicButton = findViewById(R.id.musicButton);

        laundryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(this, LaundryActivity.class);
                startActivity(startIntent);
            }
        });

        gymButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(this, GymActivity.class);
                startActivity(startIntent);
            }
        });

        barButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(this, BarActivity.class);
                startActivity(startIntent);
            }
        });

        musicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent= new Intent(this, MusicActivity.class);
                startActivity(startIntent);
            }
        });
    }
}
