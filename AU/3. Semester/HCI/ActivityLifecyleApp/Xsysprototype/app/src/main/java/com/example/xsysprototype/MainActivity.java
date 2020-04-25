package com.example.xsysprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    User user;
    EditText userNameEditText, buildingNumberEditText, roomNumberEditText;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userNameEditText = findViewById(R.id.userNameEditText);
        buildingNumberEditText = findViewById(R.id.userBuildingNumberEditText);
        roomNumberEditText = findViewById(R.id.userRoomNumberEditText);

        loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = userNameEditText.getText().toString(), buildingNumber = buildingNumberEditText.getText().toString(), roomNumber = roomNumberEditText.getText().toString();

                if (userName.length() > 0 && buildingNumber.length() > 0 && roomNumber.length() > 0) {
                    user = new User(userName, buildingNumber, roomNumber, false, false);
                    Intent startIntent = new Intent(getApplicationContext(), FrontPage.class);
                    startIntent.putExtra("user", user);
                    startActivity(startIntent);
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Please fill in all fields with your information", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
