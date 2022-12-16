package com.example.agriculture_fruits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.agriculture_fruits.ActivityList.ContactActivity;
import com.example.agriculture_fruits.DescriptionActivity.AppleDescriptionActivity;
import com.example.agriculture_fruits.DescriptionActivity.BananaDescriptionActivity;
import com.example.agriculture_fruits.DescriptionActivity.CarrotDescriptionActivity;
import com.example.agriculture_fruits.DescriptionActivity.CerelesDescriptionActivity;
import com.example.agriculture_fruits.DescriptionActivity.MeatDescriptionActivity;
import com.example.agriculture_fruits.DescriptionActivity.OnionDescriptionActivity;
import com.example.agriculture_fruits.DescriptionActivity.PulseDescriptionActivity;
import com.example.agriculture_fruits.DescriptionActivity.WheatDescriptionActivity;
import com.google.android.material.button.MaterialButton;

import de.hdodenhof.circleimageview.CircleImageView;

public class FruitesActivity extends AppCompatActivity  {

    private MaterialButton AppleDescription , AppleLiveData ,BananaDescription,BananaLiveData,CarrotDescription,CarrotLiveData,
            CerelesDescription,CerelesLiveData,MeatDescription,MeatsLiveData,OnionDescription,OnionLiveData,PulseDescription,
    PulseLiveData,WheatDescription,WheatLiveData;

    CircleImageView ContactProfile;


    String url;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruites);

        AppleDescription=findViewById(R.id.AppleDescription);
        AppleLiveData=findViewById(R.id.AppleLiveData);
        BananaDescription=findViewById(R.id.BananaDescription);
        BananaLiveData=findViewById(R.id.BananaLiveData);
        CarrotDescription=findViewById(R.id.CarrotDescription);
        CarrotLiveData=findViewById(R.id.CarrotLiveData);
        CerelesDescription=findViewById(R.id.CerelesDescription);
        CerelesLiveData=findViewById(R.id.CerelesLiveData);
        MeatDescription=findViewById(R.id.MeatDescription);
        MeatsLiveData=findViewById(R.id.MeatsLiveData);
        OnionDescription=findViewById(R.id.OnionDescription);
        OnionLiveData=findViewById(R.id.OnionLiveData);
        PulseDescription=findViewById(R.id.PulseDescription);
        PulseLiveData=findViewById(R.id.PulseLiveData);
        WheatDescription=findViewById(R.id.WheatDescription);
        WheatLiveData=findViewById(R.id.WheatLiveData);

        ContactProfile=findViewById(R.id.ContactProfile);
        ContactProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FruitesActivity.this, ContactActivity.class));
            }
        });

        //set onClickListener for Description
        AppleDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FruitesActivity.this, AppleDescriptionActivity.class));
            }
        });
        BananaDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FruitesActivity.this, BananaDescriptionActivity.class));
            }
        });
        CarrotDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FruitesActivity.this, CarrotDescriptionActivity.class));
            }
        });
        CerelesDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FruitesActivity.this, CerelesDescriptionActivity.class));
            }
        });
        MeatDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FruitesActivity.this, MeatDescriptionActivity.class));
            }
        });
        OnionDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FruitesActivity.this, OnionDescriptionActivity.class));
            }
        });
        PulseDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FruitesActivity.this, PulseDescriptionActivity.class));
            }
        });
        WheatDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FruitesActivity.this, WheatDescriptionActivity.class));
            }
        });


        //SetOnclickListener For LiveData
        AppleLiveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://thingspeak.com/login?skipSSOCheck=true";
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);

            }
        });
        BananaLiveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://thingspeak.com/login?skipSSOCheck=true";
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);

            }
        });

        CarrotLiveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://thingspeak.com/login?skipSSOCheck=true";
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);

            }
        });

        CerelesLiveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://thingspeak.com/login?skipSSOCheck=true";
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);

            }
        });

        OnionLiveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://thingspeak.com/login?skipSSOCheck=true";
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);

            }
        });

        MeatsLiveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://thingspeak.com/login?skipSSOCheck=true";
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);

            }
        });

        PulseLiveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://thingspeak.com/login?skipSSOCheck=true";
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);

            }
        });

        WheatLiveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "https://thingspeak.com/login?skipSSOCheck=true";
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);

            }
        });



    }


//    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//
//            //DescriptionActivity
//            case R.id.AppleDescription:
//                startActivity(new Intent(FruitesActivity.this, AppleDescriptionActivity.class));
//                break;
//            case R.id.BananaDescription:
//                startActivity(new Intent(FruitesActivity.this, BananaDescriptionActivity.class));
//                break;
//            case R.id.CarrotDescription:
//                startActivity(new Intent(FruitesActivity.this, CarrotDescriptionActivity.class));
//                break;
//            case R.id.CerelesDescription:
//                startActivity(new Intent(FruitesActivity.this, CerelesDescriptionActivity.class));
//                break;
//            case R.id.MeatDescription:
//                startActivity(new Intent(FruitesActivity.this, MeatDescriptionActivity.class));
//                break;
//            case R.id.OnionDescription:
//                startActivity(new Intent(FruitesActivity.this, OnionDescriptionActivity.class));
//                break;
//            case R.id.PulseDescription:
//                startActivity(new Intent(FruitesActivity.this, PulseDescriptionActivity.class));
//                break;
//            case R.id.WheatDescription:
//                startActivity(new Intent(FruitesActivity.this, WheatDescriptionActivity.class));
//                break;
//
//            //Set LiveDataActivity
//            case R.id.AppleLiveData:
//                url = "https://thingspeak.com/login?skipSSOCheck=true";
//                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//                startActivity(intent);
//                break;
//            case R.id.BananaLiveData:
//                url = "https://thingspeak.com/login?skipSSOCheck=true";
//                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//                startActivity(intent);
//                break;
//            case R.id.CarrotLiveData:
//                url = "https://thingspeak.com/login?skipSSOCheck=true";
//                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//                startActivity(intent);
//                break;
//            case R.id.CerelesLiveData:
//                url = "https://thingspeak.com/login?skipSSOCheck=true";
//                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//                startActivity(intent);
//                break;
//            case R.id.MeatsLiveData:
//                url = "https://thingspeak.com/login?skipSSOCheck=true";
//                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//                startActivity(intent);
//                break;
//            case R.id.OnionLiveData:
//                url = "https://thingspeak.com/login?skipSSOCheck=true";
//                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//                startActivity(intent);
//                break;
//            case R.id.PulseLiveData:
//                url = "https://thingspeak.com/login?skipSSOCheck=true";
//                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//                startActivity(intent);
//                break;
//            case R.id.WheatLiveData:
//                url = "https://thingspeak.com/login?skipSSOCheck=true";
//                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//                startActivity(intent);
//                break;
//
//        }
//    }
}