package com.example.agriculture_fruits.ActivityList;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.agriculture_fruits.FruitesActivity;
import com.example.agriculture_fruits.R;

public class LoginActivity extends AppCompatActivity {

    EditText Email , Password ;

    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Email=findViewById(R.id.Email);
        Password=findViewById(R.id.Password);
        Login=findViewById(R.id.Login);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = Email.getText().toString();
                String password = Password.getText().toString();


                if (email.isEmpty()){
                    Email.setError("Email Empty");
                    Email.requestFocus();
                }else if (password.isEmpty()){
                    Password.setError("Password Empty");
                    Password.requestFocus();
                }
                else if (email.equals("gayathri@gmail.com") == password.equals("gayathri28")){
                    startActivity(new Intent(LoginActivity.this, FruitesActivity.class));
                    finish();
                }else {
                    Toast.makeText(LoginActivity.this,"Something Error",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}