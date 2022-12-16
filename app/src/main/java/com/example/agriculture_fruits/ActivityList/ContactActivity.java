package com.example.agriculture_fruits.ActivityList;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.agriculture_fruits.R;

public class ContactActivity extends AppCompatActivity {


//    TextView phonecall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

//        phonecall=findViewById(R.id.phonecall);
//        phonecall.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                String phoneNo = "8098809872";
//                Intent intent = new Intent(Intent.ACTION_CALL);
//                intent.setData(Uri.parse("tel:"+phoneNo));
//                startActivity(intent);
//            }
//        });
    }
}