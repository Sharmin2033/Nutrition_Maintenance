package com.example.hp.nutrition_maintenance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Lunch extends AppCompatActivity {


    int count = 0;
    int value=0;
    TextView countstartrice,countstartmeat,countstartveg,countstartdal,showcalorieslunch;
    Button plusbuttonrice,minasbuttonrice,plusbuttonmeat,minasbuttonmeat,plusbuttondal,minasbuttondal,minasbuttonveg,plusbuttonveg;
    CheckBox rice,meat,veg,dal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);



        countstartrice= (TextView) findViewById(R.id.countstartrice);
        rice= (CheckBox) findViewById(R.id.rice);
        plusbuttonrice= (Button) findViewById(R.id.plusbuttonrice);
        minasbuttonrice= (Button) findViewById(R.id.minasbuttonrice);



        countstartveg= (TextView) findViewById(R.id.countstartveg);
        veg= (CheckBox) findViewById(R.id.veg);
        plusbuttonveg= (Button) findViewById(R.id.plusbuttonveg);
        minasbuttonveg= (Button) findViewById(R.id.minasbuttonveg);

        countstartmeat= (TextView) findViewById(R.id.countstartmeat);
        meat= (CheckBox) findViewById(R.id.meat);
        plusbuttonmeat= (Button) findViewById(R.id.plusbuttonmeat);
        minasbuttonmeat= (Button) findViewById(R.id.minasbuttonmeat);


        countstartdal= (TextView) findViewById(R.id.countstartdal);
        dal= (CheckBox) findViewById(R.id.dal);
        plusbuttondal= (Button) findViewById(R.id.plusbuttondal);
        minasbuttondal= (Button) findViewById(R.id.minasbuttondal);
    }


    public void addrice(View view) {
        countstartrice = (TextView) findViewById(R.id.countstartrice);
        count++;
        countstartrice.setText("" + count);

    }

    public void subrice(View view) {
        countstartrice = (TextView) findViewById(R.id.countstartrice);

        if (count < 1) {
            Toast.makeText(Lunch.this, "Sorry ! select Invalid", Toast.LENGTH_SHORT).show();

        } else {
            count--;
        }


        countstartrice.setText("" + count);


    }


    public void addveg(View view) {
        countstartveg = (TextView) findViewById(R.id.countstartveg);
        count++;
        countstartveg.setText("" + count);

    }

    public void subveg(View view) {
        countstartveg = (TextView) findViewById(R.id.countstartveg);

        if (count < 1) {
            Toast.makeText(Lunch.this, "Sorry ! select Invalid", Toast.LENGTH_SHORT).show();

        } else {
            count--;
        }


        countstartveg.setText("" + count);


    }



    public void addmeat(View view) {
        countstartmeat = (TextView) findViewById(R.id.countstartmeat);
        count++;
        countstartmeat.setText("" + count);

    }

    public void submeat(View view) {
        countstartmeat = (TextView) findViewById(R.id.countstartmeat);

        if (count < 1) {
            Toast.makeText(Lunch.this, "Sorry ! select Invalid", Toast.LENGTH_SHORT).show();

        } else {
            count--;
        }


        countstartmeat.setText("" + count);


    }

    public void adddal(View view) {
        countstartdal = (TextView) findViewById(R.id.countstartdal);
        count++;
        countstartdal.setText("" + count);

    }

    public void subdal(View view) {
        countstartdal = (TextView) findViewById(R.id.countstartdal);

        if (count < 1) {
            Toast.makeText(Lunch.this, "Sorry ! select Invalid", Toast.LENGTH_SHORT).show();

        } else {
            count--;
        }


        countstartdal.setText("" + count);


    }










    public void orderlunch(View view)
    {
        countstartrice= (TextView) findViewById(R.id.countstartrice);
        rice= (CheckBox) findViewById(R.id.rice);
        countstartveg= (TextView) findViewById(R.id.countstartveg);
        veg= (CheckBox) findViewById(R.id.veg);
        countstartmeat= (TextView) findViewById(R.id.countstartmeat);
        meat= (CheckBox) findViewById(R.id.meat);
        countstartdal= (TextView) findViewById(R.id.countstartdal);
        dal= (CheckBox) findViewById(R.id.dal);
        showcalorieslunch=(TextView)findViewById(R.id.showcalorieslunch);




        if(rice.isChecked()&& veg.isChecked() && meat.isChecked()&& dal.isChecked()){
            value=735;
            showcalorieslunch.setText("" + count * value);

        }
        else if(rice.isChecked()&& veg.isChecked() && meat.isChecked()==false && dal.isChecked()){
            value=593;
            showcalorieslunch.setText("" + count * value);

        }
        else if(rice.isChecked() && veg.isChecked()==false && meat.isChecked() && dal.isChecked()){
            value=435;
            showcalorieslunch.setText("" + count * value);

        }
        else if(rice.isChecked() && veg.isChecked() && meat.isChecked()&& dal.isChecked()==false){
            value=642;
            showcalorieslunch.setText(""+count*value);

        }
        else if(rice.isChecked() && veg.isChecked()==false && meat.isChecked()==false&& dal.isChecked()){
            value=293;
            showcalorieslunch.setText(""+count*value);

        }

        else{
            // newgoing();

            showcalorieslunch.setText("" + 0);
            Toast.makeText(Lunch.this, "Invalid input", Toast.LENGTH_SHORT).show();


        }




    }




}
