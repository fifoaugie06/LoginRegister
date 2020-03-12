package com.example.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    Button btnLoginIntent;
    ImageButton btnRegister;
    EditText edtNick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnLoginIntent = findViewById(R.id.btn_Login_Intent);
        btnRegister = findViewById(R.id.btn_Register);
        edtNick = findViewById(R.id.edt_nick);

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

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegisterActivity.this, edtNick.getText() + " Didaftarkan", Toast.LENGTH_SHORT).show();
            }
        });

        getSupportActionBar().hide();
    }
}
