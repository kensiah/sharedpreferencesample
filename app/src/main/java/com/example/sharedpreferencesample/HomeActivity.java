package com.example.sharedpreferencesample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    private TextView tvUsername;
    private String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        findViews();
        username = getIntent().getStringExtra("USERNAME");
        tvUsername.setText(username);
    }

    private void findViews(){
        tvUsername.findViewById(R.id.tv_username);
    }
}
