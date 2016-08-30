package com.example.hp.nutrition_maintenance;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class New_login extends AppCompatActivity {
    Button b4;
    EditText usId, pass;
    DbHelper helper;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_login);
        usId = (EditText) findViewById(R.id.usId);
        pass = (EditText) findViewById(R.id.pass);
        sharmin();
    }

    public void sharmin() {

        b4 = (Button) findViewById(R.id.enter);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper = new DbHelper(getApplicationContext());
                db = helper.getReadableDatabase();
                if (helper.Check(usId.getText().toString(), pass.getText().toString(), db)) {
                    Intent i = new Intent(getApplicationContext(), NutritionBalance.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "Wrong UserName Password", Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}


