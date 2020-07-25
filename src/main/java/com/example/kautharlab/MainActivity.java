package com.example.kautharlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity<km, other> extends AppCompatActivity {
TextView tv1,tv2,tv3;
EditText ed1,ed2;
Button btn;
Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.tex1);
        tv2 = (TextView) findViewById(R.id.tex2);
        tv3 = (TextView) findViewById(R.id.tex3);
        ed1 = (EditText) findViewById(R.id.edt1);
        ed2 = (EditText) findViewById(R.id.edt2);
        btn = (Button) findViewById(R.id.bt1);
        sp = (Spinner) findViewById(R.id.sp1);
        String[] measure = {"km_mile", "km_cm", "km_m"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, measure);
        sp.setAdapter(adapter);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences share = getSharedPreferences("filedata", MODE_PRIVATE);

                SharedPreferences.Editor EDT1 = share.edit();
                EDT1.putString("KM", ed1.getText().toString());
                EDT1.putString("OTHER", ed2.getText().toString());
                // EDT1.putString("measure", sp.);
                EDT1.apply();
                Toast.makeText(getApplicationContext(), "data saved succesfull ", Toast.LENGTH_LONG).show();


                Intent sanha = new Intent(getApplicationContext(), activity2.class);
                String km = ed1.getText().toString();
                String other = ed2.getText().toString();
                //  String sp = sp.;

                sanha.putExtra("KM", km);
                sanha.putExtra("OTHER", other);
                startActivity(sanha);

            }

        });

    }
}