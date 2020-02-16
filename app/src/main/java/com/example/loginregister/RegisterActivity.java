package com.example.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {
    Button btnLoginIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnLoginIntent = findViewById(R.id.btn_Login_Intent);

        btnLoginIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnLoginIntent.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                        finish();
                    }
                });
            }
        });

        getSupportActionBar().hide();
    }
}
