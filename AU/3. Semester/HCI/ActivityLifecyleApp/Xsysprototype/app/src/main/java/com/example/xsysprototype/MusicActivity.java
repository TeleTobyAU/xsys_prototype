package com.example.xsysprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

import java.util.Calendar;

public class MusicActivity extends AppCompatActivity {

    CalendarView calendar;
    Button signUpButton;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            user = (User) getIntent().getExtras().get("user");
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "There was an error loading your user, please try again", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        }

        if (user.isMusicMember()) {
            setContentView(R.layout.activity_music_member);
            calendar = findViewById(R.id.musicCalendarView);

        } else {
            setContentView(R.layout.activity_music);

            signUpButton = findViewById(R.id.signUpButton);
            signUpButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    user.setMusicMember(true);
                    Toast.makeText(getApplicationContext(), "You are now a member of the music room", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(), MusicActivity.class).putExtra("user", user));
                    finish();
                }
            });
        }
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), FrontPage.class).putExtra("user", user));
        finish();
    }
}