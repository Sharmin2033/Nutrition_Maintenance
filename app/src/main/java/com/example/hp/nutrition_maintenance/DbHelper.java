 package com.example.hp.nutrition_maintenance;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 4/11/2016.
 */
public class DbHelper extends SQLiteOpenHelper {
    private static final String CREATE_TABLE_QUERY = "CREATE TABLE LOGIN ( name TEXT, email TEXT,password TEXT,gender TEXT,dateOfBirth TEXT,userId Text);";

    public DbHelper(Context context) {
        super(context, "ProjectDb", null, 1);
    }


    public void InsertData(Info info, SQLiteDatabase db) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", info.name);
        contentValues.put("email", info.email);
        contentValues.put("password", info.password);
        contentValues.put("dateOfBirth", info.dateOfBirth);
        contentValues.put("gender", info.gender);
        contentValues.put("userId", info.userId);
        db.insert("LOGIN", null, contentValues);
        Log.e("Database operation", "Data Insertion Successfull");
    }
    public boolean Check(String usrId,String pass,SQLiteDatabase db){
        boolean confirm=false;
        String[] projection={"name", "email","password","gender","userId","dateOfBirth"};
        Cursor cursor=db.query("Login",projection,null,null,null,null,null);
        while (cursor.moveToNext()){
            if ((cursor.getString(cursor.getColumnIndex("userId"))).equals(usrId) && (cursor.getString(cursor.getColumnIndex("password"))).equals(pass) ){
                confirm=true;
                break;

            }
            else {
                confirm=false;
            }

        }
        return confirm;
    }


//        public boolean Check(Info info SQLiteDatabase db) {
//
//        String[] projection = {"name", "email","password","gender","userId","dateOfBirth"};
//       // Cursor c = db.query("Login", projection, null, null, null, null, null);
//
//        while (c.moveToNext()) {
//            Info i = new Info();
//            i.name = c.getString(c.getColumnIndex("name"));
//            i.email = c.getString(c.getColumnIndex("email"));
//            list.add(i);
//        }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_QUERY);
        Log.e("Database Operation", "Table Created");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
