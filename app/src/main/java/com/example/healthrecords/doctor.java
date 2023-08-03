package com.example.healthrecords;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class doctor extends AppCompatActivity {

     private String[][] doctor_details=
             {
                     {"doctor Name = Mahesh", "Hospital Address = Hyderabad", "phone number = 8568673468", "1500"},
                     //{"doctor Name = sr", "Hospital Address = wg", "phone number = 3242", "1233"},

             };

     Button btn;

    private   String[][] doctor_details1=
            {
                    {"doctor Name = sr", "Hospital Address = wg", "phone number = 3242", "1233"},
                    {"doctor Name = sd", "Hospital Address = ghcf", "phone number = 3242", "213"},
                    {"doctor Name = stft", "Hospital Address = bc", "phone number = 3242", "1657"},
            };
    ArrayList list;
    SimpleAdapter sa;

    HashMap<String,String> item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);

        btn = findViewById(R.id.buttonDDBack);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(doctor.this, HomeActivity.class));
            }
        });

        list = new ArrayList();
        item = new HashMap<String, String>();

        for(int i = 0;i<3;i++){
            item.put("line2", doctor_details1[i][0]);
            item.put("line3", doctor_details1[i][1]);
            item.put("line5", "Cons Fees: " + doctor_details1[i][3] + "/-");
            list.add(item);
        }
        sa = new SimpleAdapter(this,list,
                R.layout.multi_lines,
                new String[]{"lines1"},
                new int []{R.id.line_c});
        ListView lst = findViewById(R.id.listViewDD);
        lst.setAdapter(sa);



    }
}