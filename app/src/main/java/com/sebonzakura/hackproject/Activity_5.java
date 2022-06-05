package com.sebonzakura.hackproject;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Activity_5 extends AppCompatActivity {
    private Button back;
    private Button seeds;
    private Button settings;
    private Button notifications;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        back = findViewById(R.id.button35);
        seeds = findViewById(R.id.button33);
        settings = findViewById(R.id.button34);
        notifications = findViewById(R.id.button32);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                fifthThird(Activity_3.class);
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

    }
    public void fifthThird(Class clas){
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