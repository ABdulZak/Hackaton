package com.sebonzakura.hackproject;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Activity_4 extends AppCompatActivity {
    private Button notif;
    private Button back;
    private Button seeds;
    private Button settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        back = findViewById(R.id.button11);
        settings = findViewById(R.id.button9);
        notif = findViewById(R.id.button7);
        seeds = findViewById(R.id.button8);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fourThird(Activity_3.class);
            }
        });
        seeds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                setSeeds(Activity_6.class);
            }
        });
        notif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                setappNotifications(Activity_5.class);
            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                setSettings(Activity_8.class);
            }
        });
    }
    public void fourThird(Class clas){
        Intent intent = new Intent(this, clas);
        startActivity(intent);
    }
    public void setSeeds(Class clas){
        Intent intent = new Intent(this,clas);
        startActivity(intent);
    }
    public void setappNotifications(Class clas){
        Intent intent = new Intent(this,clas);
        startActivity(intent);
    }
    public void setSettings(Class clas){
        Intent intent = new Intent(this,clas);
        startActivity(intent);
    }
}