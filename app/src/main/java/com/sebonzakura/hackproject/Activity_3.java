package com.sebonzakura.hackproject;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Activity_3 extends AppCompatActivity {
    private Button back;
    private Button tashkent;
    private Button seeds;
    private Button settings;
    private Button notifications;
    private Button informations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        back = findViewById(R.id.button6);
        tashkent = findViewById(R.id.button);
        seeds = findViewById(R.id.button4);
        settings = findViewById(R.id.button5);
        notifications = findViewById(R.id.button3);
        informations = findViewById(R.id.button2);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                thirdSecond(Activity_2.class);
            }
        });
        tashkent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                tashkentWeather(Activity_4.class);
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


    }
    public void thirdSecond(Class clas){
        Intent intent = new Intent(this, clas);
        startActivity(intent);
    }
    public void tashkentWeather(Class clas){
        Intent intent = new Intent(this,clas);
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


}