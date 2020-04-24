package com.example.xsysprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GymActivity extends AppCompatActivity {

    Button signUpButton;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            user = (User) getIntent().getExtras().getSerializable("user");
        } finally {
            user = new User("Test User", "00", "00", true, true);
        }

        if (user.isGymMember()) {
            setContentView(R.layout.activity_gym_member);
        } else {
            setContentView(R.layout.activity_gym);

            signUpButton = findViewById(R.id.signUpButton);
            signUpButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }

    }
}
