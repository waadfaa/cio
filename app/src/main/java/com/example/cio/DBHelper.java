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
        MyDB.execSQL("create Table Employee(FirstName TEXT, LastName TEXT, email TEXT, password TEXT, FacilityCodeE TEXT , male RADIOBUTTON , female RADIOBUTTON)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int oldVersion, int newVersion) {
        MyDB.execSQL("drop Table if exists Facility");
        MyDB.execSQL("drop Table if exists Employee");
    }

    public boolean insertDataE(String FirstN,String LastN, String Email, String password, String FacilityC) {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues  contentValues = new ContentValues();
        contentValues.put("FirstName", FirstN);
        contentValues.put("LastName", LastN);
        contentValues.put("Email", Email);
        contentValues.put("Password", password);
        contentValues.put("FacilityCode", FacilityC);
        long reslut=MyDB.insert("Employee", null, contentValues);
        if (reslut==-1)return false;
        else
            return true;
    }

    public boolean checkFirstName(String FirstName){
        SQLiteDatabase MyDB = this .getWritableDatabase();
        Cursor cursor  = MyDB.rawQuery("select * from  Empolyee where  FirstName = ?" ,new String [] {FirstName});
        if (cursor.getCount() >0 )
            return true;
            else
                return false;
    }
    public boolean checkFirstNameLastNameEmailPasswordFacilityCode(String FirstName ,String LastName, String Email, String Password , String FacilityCode){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from Facility where FirstName = ? and LastName = ? and Email = ? and Password = ? and FacilityCode = ?", new String[] {FirstName , LastName, Email, Password ,FacilityCode });
        if (cursor.getCount()>0)
            return  true;
        else
            return false;
    }

    public boolean checkEmailPasswordE( String Email, String Password ){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from Employee where  Email = ? and Password = ? ", new String[] {  Email, Password  });
        if (cursor.getCount()>0)
            return  true;
        else
            return false;
    }

    public boolean insertDataF(String FacilityName, String Email, String Password, String FacilityCode) {
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
