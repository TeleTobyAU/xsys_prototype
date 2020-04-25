package com.example.xsysprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class BarActivity extends AppCompatActivity {

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

        setContentView(R.layout.activity_bar);
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
