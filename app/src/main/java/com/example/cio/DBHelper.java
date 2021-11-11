package com.example.cio;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    SQLiteDatabase db;

    public DBHelper(Context context) {

        super(context, "CIO.db", null, 1);
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(Facility_SignUp.CREATE_TABLE);
    }

    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL(Facility_SignUp.DROP_TABLE);
        onCreate(sqLiteDatabase);
    }


    public boolean insertStudent(String FacilityName, String Email, int Password, int FacilityCode) {
        ContentValues cv = new ContentValues();
        cv.put(Facility_SignUp.COL_FacilityName, FacilityName);
        cv.put(Facility_SignUp.COL_Email, Email);
        cv.put(Facility_SignUp.COL_Password, Password);
        cv.put(Facility_SignUp.COL_FacilityCode, FacilityCode);
        long newRowID = db.insert(Facility_SignUp.TABLE_NAME, null, cv);
        return newRowID > 0;
    }



    //@Override
    // public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    //   db.execSQL("drop Table if exists ORG");
    //}
    //  public Boolean insert(String FacilityName,String Email,String Password,String FacilityCode){
    //    SQLiteDatabase db= this.getWritableDatabase();
    //  ContentValues contentValues= new ContentValues();
//        contentValues.put("FacilityName",FacilityName);
    //      contentValues.put("Email",Email);
    //       contentValues.put("Password",Password);
    //     contentValues.put("FacilityCode",FacilityCode);
    //     long results= db.insert("ORG",null,contentValues );
    //      if(results==-1){
    //        return false;
    //  }else{
    //    return true;
//        }
//    }
//    public Cursor getData(){
//        SQLiteDatabase db=this.getWritableDatabase();
//        Cursor cursor=db.rawQuery("Select * from ORG", null );
//        return cursor;
//    }}
}

