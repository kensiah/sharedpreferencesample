package com.example.sharedpreferencesample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editUsername;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setListeners();
    }

    private void findViews(){
        editUsername = findViewById(R.id.edit_temp_username);
        btnLogin = findViewById(R.id.btn_login);
    }

    private void setListeners(){
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Pass username to the next activity, then start the activity
                String username = editUsername.getText().toString();
                if (username.isEmpty()){
                    editUsername.setError("Username Must Not Be Empty");
                } else{
                    Intent i = new Intent(MainActivity.this,HomeActivity.class);
                    i.putExtra("USERNAME",username);
                    startActivity(i);
                }
            }
        });
    }
}
