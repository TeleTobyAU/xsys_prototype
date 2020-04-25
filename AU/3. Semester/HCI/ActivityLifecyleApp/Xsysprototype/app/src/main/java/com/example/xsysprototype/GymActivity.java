package com.example.xsysprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GymActivity extends AppCompatActivity {

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

        if (user.isGymMember()) {
            setContentView(R.layout.activity_gym_member);
        } else {
            setContentView(R.layout.activity_gym);

            signUpButton = findViewById(R.id.signUpButton);
            signUpButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    user.setGymMember(true);
                    Toast.makeText(getApplicationContext(), "You are now a member of the gym", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(), GymActivity.class).putExtra("user", user));
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
