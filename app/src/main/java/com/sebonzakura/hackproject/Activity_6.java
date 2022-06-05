package com.sebonzakura.hackproject;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Activity_6 extends AppCompatActivity {
    private Button back;
    private Button seeds;
    private Button settings;
    private Button notifications;
    private Button informations;
    private Button addNewOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        back = findViewById(R.id.button10);
        seeds = findViewById(R.id.button13);
        settings = findViewById(R.id.button14);
        notifications = findViewById(R.id.button12);
        informations = findViewById(R.id.inf);
        addNewOne = findViewById(R.id.button16);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                sixThird(Activity_3.class);
            }
        });
        seeds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                setSeeds(Activity_6.class);
            }
        });
        notifications.setOnClickListener(new View.OnClickListener() {
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
        informations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                setInfo(Activity_7.class);
            }
        });
        addNewOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                setAddNewOne(Activity_9.class);
            }
        });
    }
    public void sixThird(Class clas){
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
    public void setInfo(Class clas){
        Intent intent = new Intent(this,clas);
        startActivity(intent);
    }
    public void setAddNewOne(Class clas){
        Intent intent = new Intent(this,clas);
        startActivity(intent);
    }
}