package com.example.kautharlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

         final Intent sanha = getIntent();
        String km = sanha.getStringExtra("KM");
        String other = sanha.getStringExtra("other");
        String measure = sanha.getStringExtra("sp");

        startActivity(sanha);
        Button btn2 = (Button) findViewById(R.id.bt2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedShare = getSharedPreferences("filedata", MODE_PRIVATE);
                String km = sharedShare.getString("km", "");
                String other = sharedShare.getString("other", "");
                String measure = sharedShare.getString("sp", "");

                //EDT1.clear();
                Toast.makeText(getApplicationContext(), "data clear", Toast.LENGTH_LONG).show();
                //EDT1.commit();

                startActivity(sanha);
            }

        });
    }
    }