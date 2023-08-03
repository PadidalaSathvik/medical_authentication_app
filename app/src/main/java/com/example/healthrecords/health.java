package com.example.healthrecords;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class health extends AppCompatActivity {

    private String[][] doctor_detail2=
            {
                    {"doctor Name = Mahesh", "Hospital Address = Hyderabad", "phone number = 8568673468", "1500"},
                    {"doctor Name = sr", "Hospital Address = wg", "phone number = 3242", "1233"},
                    {"doctor Name = Mahesh", "Hospital Address = Hyderabad", "phone number = 8568673468", "1500"},
                    {"doctor Name = sr", "Hospital Address = wg", "phone number = 3242", "1233"},
                    {"doctor Name = sr", "Hospital Address = wg", "phone number = 3242", "1233"},

            };

    Button btn;

    ArrayList list1;
    SimpleAdapter sa1;

    HashMap<String,String> item;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);
        btn = findViewById(R.id.buttonback);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(health.this, HomeActivity.class));
            }
        });
        list1 = new ArrayList();
        item = new HashMap<String, String>();

        for(int i = 0;i<3;i++){
            item.put("line1", doctor_detail2[i][0]);
            item.put("line2", doctor_detail2[i][1]);
            item.put("line3", "Cons Fees: " + doctor_detail2[i][3] + "/-");
            list1.add(item);
        }
        sa1 = new SimpleAdapter(this,list1,
                R.layout.multi_line1,
                new String[]{"lines2"},
                new int []{R.id.line_3});
        ListView lst = findViewById(R.id.listViewee);
        lst.setAdapter(sa1);
    }
}
