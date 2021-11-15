package com.example.cio;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DBNAME = "Login.DB";


    public DBHelper(Context context) {

        super(context, "Login.db", null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase MyDB) {
        MyDB.execSQL("create Table Facility(FacilityName TEXT primary key  , Email TEXT ,Password TEXT ,FacilityCode TEXT ) ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int oldVersion, int newVersion) {
        MyDB.execSQL("drop Table if exists Facility");
    }

    public boolean insertData(String FacilityName, String Email, String Password, String FacilityCode) {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues  contentValues = new ContentValues();
        contentValues.put("FacilityName", FacilityName);
        contentValues.put("Email", Email);
        contentValues.put("Password", Password);
        contentValues.put("FacilityCode", FacilityCode);
        long reslut=MyDB.insert("Facility", null, contentValues);
        if (reslut==-1)return false;
        else
            return true;
    }

    public boolean checkFacilityName(String FacilityName){
        SQLiteDatabase MyDB = this .getWritableDatabase();
        Cursor cursor  = MyDB.rawQuery("select * from  Facility where  FacilityName = ?" ,new String [] {FacilityName});
        if (cursor.getCount() >0 )
            return true;
            else
                return false;
    }
    public boolean checkFacilityNameEmailPasswordFacilityCode(String FacilityName , String Email, String Password , String FacilityCode){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from Facility where FacilityName = ? and Email = ? and Password = ? and FacilityCode = ?", new String[] {FacilityName , Email, Password ,FacilityCode });
        if (cursor.getCount()>0)
            return  true;
        else
            return false;
    }

    public boolean checkEmailPassword( String Email, String Password ){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from Facility where  Email = ? and Password = ? ", new String[] {  Email, Password  });
        if (cursor.getCount()>0)
            return  true;
        else
            return false;
    }

}
