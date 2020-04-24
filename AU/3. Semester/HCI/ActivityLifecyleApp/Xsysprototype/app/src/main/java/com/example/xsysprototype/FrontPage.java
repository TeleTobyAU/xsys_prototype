package com.example.xsysprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class FrontPage extends AppCompatActivity {

    //TODO save instance and make other activities return to it when pressing the back button
    User user;
    ImageButton laundryButton, gymButton, barButton, musicButton;
    TextView userNameTextView, userBuildingTextView, userRoomTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);

        try {
            user = (User) getIntent().getExtras().get("user");
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "There was an error loading your user, please try again", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        }

        userNameTextView = findViewById(R.id.userNameTextView);
        userBuildingTextView = findViewById(R.id.buildingNumberTextView);
        userRoomTextView = findViewById(R.id.roomNumberTextView);

        userNameTextView.setText(user.getName());
        userBuildingTextView.setText(user.getBuildingNumber());
        userRoomTextView.setText(user.getRoomNumber());


        laundryButton = findViewById(R.id.laundryButton);
        gymButton = findViewById(R.id.gymButton);
        barButton = findViewById(R.id.barButton);
        musicButton = findViewById(R.id.musicButton);

        laundryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), LaundryActivity.class);
                startIntent.putExtra("user", user);
                startActivity(startIntent);
                finish();
            }
        });

        gymButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), GymActivity.class);
                startIntent.putExtra("user", user);
                startActivity(startIntent);
                finish();
            }
        });

        barButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), BarActivity.class);
                startIntent.putExtra("user", user);
                startActivity(startIntent);
                finish();
            }
        });

        musicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent= new Intent(getApplicationContext(), MusicActivity.class);
                startIntent.putExtra("user", user);
                startActivity(startIntent);
                finish();
            }
        });
    }

}
