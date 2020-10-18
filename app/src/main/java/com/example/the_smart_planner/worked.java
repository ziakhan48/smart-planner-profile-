package com.example.the_smart_planner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class worked extends AppCompatActivity {
Button football ,wedding,univ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worked);

        football=findViewById(R.id.footballid);
        wedding=findViewById(R.id.weddingid);
univ=findViewById(R.id.univid);

        football.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(worked.this,football.class );
                startActivity(intent);
            }
        });
        wedding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent=new Intent(worked.this,wedding.class );
                    startActivity(intent);

            }
        });

        univ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(worked.this,unv_class.class );
                startActivity(intent);

            }
        });
    }
}
