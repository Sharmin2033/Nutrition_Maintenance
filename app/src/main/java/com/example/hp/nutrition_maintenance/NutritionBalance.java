package com.example.hp.nutrition_maintenance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.hp.nutrition_maintenance.R.id.log_in;

public class NutritionBalance extends AppCompatActivity {
    Button b5, b6, b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition_balance);
        tan();
        tanj();
        tanji();
    }

    public void tan() {

        b5 = (Button) findViewById(R.id.breakfast);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Breakfast.class);
                startActivity(i);
            }
        });
    }

    public void tanj() {

        b6 = (Button) findViewById(R.id.lunch);

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Lunch.class);
                startActivity(i);
            }
        });
    }

    public void tanji() {

        b7 = (Button) findViewById(R.id.dinner);

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Dinner.class);
                startActivity(i);
            }
        });
    }
}