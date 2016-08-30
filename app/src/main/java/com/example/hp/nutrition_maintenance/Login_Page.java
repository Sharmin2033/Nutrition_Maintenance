package com.example.hp.nutrition_maintenance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login_Page extends AppCompatActivity {
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__page);
        init();
        intt();
    }
    public void init(){

        b1=(Button)findViewById(R.id.buttonlog1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), New_login.class);
                startActivity(i);
            }
        });


    }
   public void intt(){
       b2=(Button)findViewById(R.id.buttonlog2);
       b2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i = new Intent(getApplicationContext(), Sign_Up.class);
               startActivity(i);
           }
       });

   }

}
