package com.example.xsysprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LaundryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laundry);
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
