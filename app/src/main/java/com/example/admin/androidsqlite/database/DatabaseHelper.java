package com.example.admin.androidsqlite.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.admin.androidsqlite.model.Memo;

/**
 * Created by admin on 19-04-2018.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    //Databae Name
    public static final String DATABASE_NAME="memo.db";

    //Database Version
    public static final int DATABASE_VERSION=1;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    //Create table
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table if not exists memotable( id INTEGER PRIMARY KEY AUTOINCREMENT,date TEXT,event TEXT)");

    }


//Upgrade database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
           //Drop table if exists
         db.execSQL("DROP TABLE IF EXISTS memotable");

         //Create table again
         onCreate(db);
    }


}
