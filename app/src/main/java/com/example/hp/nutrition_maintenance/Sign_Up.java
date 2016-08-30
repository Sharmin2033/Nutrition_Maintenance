package com.example.hp.nutrition_maintenance;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Sign_Up extends AppCompatActivity {
    Button b1;
    Button b3;
    DbHelper helper;
    SQLiteDatabase db;
    EditText name,email,password,userId,gender,dateOfBirth;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__up);
        name= (EditText) findViewById(R.id.name);
        email= (EditText) findViewById(R.id.mailid);
        password= (EditText) findViewById(R.id.password);
        userId= (EditText) findViewById(R.id.userid);
        gender= (EditText) findViewById(R.id.gender);
        dateOfBirth= (EditText) findViewById(R.id.dateofbirth);

//        shila();
    }
//    public void shila() {
//
//        b3 = (Button) findViewById(R.id.log_in);
//
//        b3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(getApplicationContext(), NutritionBalance.class);
//                startActivity(i);
//            }
//        });
//    }
    private Info GetALLDataFromView(){
        Info i=new Info();
        i.name=name.getText().toString();
        i.email=email.getText().toString();
        i.password=password.getText().toString();
        i.userId=userId.getText().toString();
        i.gender=gender.getText().toString();
        i.dateOfBirth=dateOfBirth.getText().toString();
        return i;
    }
    private void ClearField(){

        name.setText("");
        email.setText("");
        password.setText("");
        userId.setText("");
        gender.setText("");
        dateOfBirth.setText("");

    }



    public void SignUp(View v){
        helper=new DbHelper(this);
        db=helper.getWritableDatabase();
       helper.InsertData(GetALLDataFromView(),db);
        Toast.makeText(getApplicationContext(),"Data Inserted",Toast.LENGTH_LONG).show();
    }

}
