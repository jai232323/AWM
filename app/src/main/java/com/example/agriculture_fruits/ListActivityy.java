package com.example.agriculture_fruits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.agriculture_fruits.ActivityList.AboutActivity;
import com.example.agriculture_fruits.ActivityList.ContactActivity;
import com.example.agriculture_fruits.ActivityList.LoginActivity;
import com.example.agriculture_fruits.ActivityList.RegisterActivity;
import com.google.android.material.card.MaterialCardView;

public class ListActivityy extends AppCompatActivity {

    MaterialCardView Register , Login , Admin , Contact , About ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

       // Register = findViewById(R.id.Register);
        Login = findViewById(R.id.Login);
        Admin = findViewById(R.id.Admin);
        Contact = findViewById(R.id.Contact);
        About = findViewById(R.id.About);




        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListActivityy.this, LoginActivity.class));
            }
        });
        Admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://thingspeak.com/login?skipSSOCheck=true";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        Contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListActivityy.this, ContactActivity.class));
            }
        });

        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListActivityy.this, AboutActivity.class));
            }
        });
    }
}