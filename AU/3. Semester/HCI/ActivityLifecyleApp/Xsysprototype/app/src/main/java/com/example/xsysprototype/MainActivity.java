package com.example.xsysprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    User user;
    EditText userNameEditText, buildingNumberEditText, roomNumberEditText;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO Make edittexts, remember error detection

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user = new User(userNameEditText.toString(), buildingNumberEditText.toString(), roomNumberEditText.toString(), false, false);
                Intent startIntent = new Intent(getApplicationContext(), FrontPage.class);
                startIntent.putExtra("user", user);
                startActivity(startIntent);
            }
        });

    }
}
