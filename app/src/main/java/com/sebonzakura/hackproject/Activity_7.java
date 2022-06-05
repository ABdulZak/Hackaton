package com.sebonzakura.hackproject;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Activity_7 extends AppCompatActivity {
    private Button back;
    private Button seeds;
    private Button settings;
    private Button notifications;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        back = findViewById(R.id.button17);
        seeds = findViewById(R.id.button19);
        settings = findViewById(R.id.button20);
        notifications = findViewById(R.id.button18);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                sevenThird(Activity_3.class);
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
                setNotifications(Activity_5.class);
            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                setSettings(Activity_8.class);
            }
        });

    }
    public void sevenThird(Class clas){
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
    public void setNotifications(Class clas){
        Intent intent = new Intent(this,clas);
        startActivity(intent);
    }
    public void setSettings(Class clas){
        Intent intent = new Intent(this,clas);
        startActivity(intent);
    }
}