package com.example.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button btnRegisterIntent;
    ImageButton btnLogin;
    EditText edtNim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnRegisterIntent = findViewById(R.id.btn_Register_Intent);
        btnLogin = findViewById(R.id.btn_login);
        edtNim = findViewById(R.id.edt_nim);

        getSupportActionBar().hide();

        btnRegisterIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                finish();
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "Selamat Datang " + edtNim.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
