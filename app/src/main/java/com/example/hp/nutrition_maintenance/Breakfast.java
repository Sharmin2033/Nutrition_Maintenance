package com.example.hp.nutrition_maintenance;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Breakfast extends AppCompatActivity {


    int count = 0;
    int value=0;
    TextView countstart,countstartveg,countstartmilk,showcalories;
    Button plusbutton,minasbutton,plusbuttonveg,minasbuttonveg,plusbuttonmilk,minasbuttonmilk;
    CheckBox ruti,veg,milk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);

        countstart= (TextView) findViewById(R.id.countstart);
        ruti= (CheckBox) findViewById(R.id.ruti);
        plusbutton= (Button) findViewById(R.id.plusbutton);
        minasbutton= (Button) findViewById(R.id.minasbutton);

        countstartveg= (TextView) findViewById(R.id.countstartveg);
        veg= (CheckBox) findViewById(R.id.veg);
        plusbuttonveg= (Button) findViewById(R.id.plusbuttonveg);
        minasbuttonveg= (Button) findViewById(R.id.minasbuttonveg);

        countstartmilk= (TextView) findViewById(R.id.countstartmilk);
        milk= (CheckBox) findViewById(R.id.milk);
        plusbuttonmilk= (Button) findViewById(R.id.plusbuttonmilk);
        minasbuttonmilk= (Button) findViewById(R.id.minasbuttonmilk);
    }

    public void add(View view) {
        countstart = (TextView) findViewById(R.id.countstart);
        count++;
        countstart.setText("" + count);

    }

    public void sub(View view) {
        countstart = (TextView) findViewById(R.id.countstart);

        if (count < 1) {
            Toast.makeText(Breakfast.this, "Sorry ! select Invalid", Toast.LENGTH_SHORT).show();

        } else {
            count--;
        }


        countstart.setText("" + count);


    }


    public void addveg(View view) {
        countstartveg = (TextView) findViewById(R.id.countstartveg);
        count++;
        countstartveg.setText("" + count);

    }

    public void subveg(View view) {
        countstartveg = (TextView) findViewById(R.id.countstartveg);

        if (count < 1) {
            Toast.makeText(Breakfast.this, "Sorry ! select Invalid", Toast.LENGTH_SHORT).show();

        } else {
            count--;
        }


        countstartveg.setText("" + count);


    }



    public void addmilk(View view) {
        countstartmilk = (TextView) findViewById(R.id.countstartmilk);
        count++;
        countstartmilk.setText("" + count);

    }

    public void submilk(View view) {
        countstartmilk = (TextView) findViewById(R.id.countstartmilk);

        if (count < 1) {
            Toast.makeText(Breakfast.this, "Sorry ! select Invalid", Toast.LENGTH_SHORT).show();

        } else {
            count--;
        }


        countstartmilk.setText("" + count);


    }

    public void order(View view)
    {
        countstart=(TextView)findViewById(R.id.countstart);
        ruti= (CheckBox) findViewById(R.id.ruti);
        countstartveg= (TextView) findViewById(R.id.countstartveg);
        veg= (CheckBox) findViewById(R.id.veg);
        countstartmilk= (TextView) findViewById(R.id.countstartmilk);
        milk= (CheckBox) findViewById(R.id.milk);
        showcalories=(TextView)findViewById(R.id.showcalories);





        if(ruti.isChecked()==false&& veg.isChecked() && milk.isChecked()){
            value=370;
            showcalories.setText("" + count * value);

        }
        else if(ruti.isChecked()&&veg.isChecked() && milk.isChecked()==false){
            value=450;
            showcalories.setText("" + count * value);

        }
        else if(ruti.isChecked() && veg.isChecked()==false && milk.isChecked()){
            value=220;
            showcalories.setText("" + count * value);

        }
        else if(ruti.isChecked() && veg.isChecked() && milk.isChecked()){
            value=520;
            showcalories.setText(""+count*value);

        }
        else{
            // newgoing();

            showcalories.setText("" + 0);
            Toast.makeText(Breakfast.this, "Invalid input", Toast.LENGTH_SHORT).show();


        }




    }


}
