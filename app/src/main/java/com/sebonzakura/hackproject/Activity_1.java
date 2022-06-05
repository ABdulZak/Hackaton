package com.sebonzakura.hackproject;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Activity_1 extends AppCompatActivity {
    private LinearLayout act_1;
    private Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        but=findViewById(R.id.bgs);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstsecond();
            }
        });
    }
    public void firstsecond() {
        Intent intent = new Intent(this, Activity_2.class);
        startActivity(intent);
    }

}