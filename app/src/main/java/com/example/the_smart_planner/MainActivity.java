package com.example.the_smart_planner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
ImageView logoimage;
TextView services, team, partners,contact,gallery, workdone;
ImageView servicesimg, teamimg,partnerimg,contactimg,galleryimg,workimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logoimage=findViewById(R.id.logo);
        services=findViewById(R.id.text2);
        team=findViewById(R.id.text3);
        partners=findViewById(R.id.text4);
        contact=findViewById(R.id.text6);
       // gallery=findViewById(R.id.text7);
        workdone=findViewById(R.id.text5);

        servicesimg=findViewById(R.id.serviceid);
        teamimg=findViewById(R.id.teamid);
        partnerimg=findViewById(R.id.partnerid);
        contactimg=findViewById(R.id.contctid);
      //galleryimg=findViewById(R.id.galleryid);
        workimg=findViewById(R.id.workdoneid);



        servicesimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ourservices.class);
                startActivity(intent);
            }
        });

        teamimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,team.class);
                startActivity(intent);
            }
        });
        workimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,worked.class);
                startActivity(intent);
            }
        });
        contactimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,contactclass.class);
                startActivity(intent);
            }
        });

     partnerimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,mediapartner.class);
                startActivity(intent);
            }
        });

    }
}