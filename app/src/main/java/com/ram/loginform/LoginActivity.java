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

public class LoginActivity extends AppCompatActivity {
    EditText email, pass;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);
        email = findViewById(R.id.email);
        pass =findViewById(R.id.pass);
        btnlogin = findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (email.getText().toString().equals("Ram")&&
                    pass.getText().toString().equals("12345")){

                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                    builder.setTitle("Login Successfully!! ");
                    builder.setMessage("Welcome");
                    builder.setNegativeButton("yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    AlertDialog alertDialog= builder.create();
                    alertDialog.show();
                }else {
                    Toast.makeText(LoginActivity.this, "Invalid Email id & password", Toast.LENGTH_SHORT).show();
                }

               // startActivity(new Intent(LoginActivity.this, RegistrationActivity.class));
            }
        });

    }
}