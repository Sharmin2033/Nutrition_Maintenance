package com.example.hp.nutrition_maintenance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Dinner extends AppCompatActivity {



    int count = 0;
    int value=0;
    TextView countstartricedinner,countstartrutidinner,countstartvegdinner,countstartfishdinner,showcaloriesdinner;
    Button plusbuttonricedinner,minasbuttonricedinner,plusbuttonrutidinner,minasbuttonrutidinner,plusbuttonfishdinner,minasbuttonfishdinner,minasbuttonvegdinner,plusbuttonvegdinner;
    CheckBox ricedinner,rutidinner,vegdinner,daldinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);


        countstartricedinner= (TextView) findViewById(R.id.countstartricedinner);
        ricedinner= (CheckBox) findViewById(R.id.ricedinner);
        plusbuttonricedinner= (Button) findViewById(R.id.plusbuttonricedinner);
        minasbuttonricedinner= (Button) findViewById(R.id.minasbuttonricedinner);



        countstartvegdinner= (TextView) findViewById(R.id.countstartvegdinner);
        countstartvegdinner= (CheckBox) findViewById(R.id.vegdinner);
        plusbuttonvegdinner= (Button) findViewById(R.id.plusbuttonvegdinner);
        minasbuttonvegdinner= (Button) findViewById(R.id.minasbuttonvegdinner);

        countstartrutidinner= (TextView) findViewById(R.id.rutidinner);
        rutidinner= (CheckBox) findViewById(R.id.rutidinner);


    }
}
