
package com.sebonzakura.hackproject;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Activity_2 extends AppCompatActivity {
    private Button butTash;
    private Button informations;
    private Button notifications;
    private Button seeds;
    private Button settings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        butTash = findViewById(R.id.Tashkent);
        informations = findViewById(R.id.button_2);
        notifications = findViewById(R.id.button_3);
        seeds = findViewById(R.id.button_4);
        settings = findViewById(R.id.button_5);

        butTash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                secondThird(Activity_3.class);
            }
        });
        informations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                setAnotherInfo(Activity_7.class);
            }
        });
        notifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                setappNotifications(Activity_5.class);
            }
        });
        seeds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                setSeeds(Activity_6.class);
            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                setSettings(Activity_8.class);
            }
        });






    }
    public void secondThird(Class clas) {
        Intent intent = new Intent(this, clas);
        finish();
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
    public void setAnotherInfo(Class clas){
        Intent intent = new Intent(this,clas);
        startActivity(intent);
    }

//    public void onBackPressed(){
//        Intent intent = new Intent(this, Activity_1.class);
//        finish();
//        startActivity(intent);
//    }
}