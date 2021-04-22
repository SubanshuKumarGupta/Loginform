package com.ram.loginform;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {
    EditText username, email, password, password2;
    Button btnreg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resistation_forms);
        btnreg = findViewById(R.id.btnreg);
        username = findViewById(R.id.username);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        password2 = findViewById(R.id.password2);

        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (username.getText().toString().equals(""));
                AlertDialog.Builder builder = new AlertDialog.Builder(RegistrationActivity.this);
                builder.setTitle("");
                startActivity(new Intent(RegistrationActivity.this,LoginActivity.class));
              //  else {
                    Toast.makeText(RegistrationActivity.this, "Envalid usename", Toast.LENGTH_SHORT).show();
                //}



            }
        });
    }}