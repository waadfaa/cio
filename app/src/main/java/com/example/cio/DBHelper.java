package com.example.cio;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    SQLiteDatabase db;

    public DBHelper(Context context) {

        super(context, "CIO.db", null, 1);
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(Facility.CREATE_TABLE);
    }

    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL(Facility_SignUp.DROP_TABLE);
        onCreate(sqLiteDatabase);
    }


    public boolean insertFacility_SignUp(String FacilityName, String Email, int Password, int FacilityCode) {
        ContentValues cv = new ContentValues();
        cv.put(Facility_SignUp.COL_FacilityName, FacilityName);
        cv.put(Facility_SignUp.COL_Email, Email);
        cv.put(Facility_SignUp.COL_Password, Password);
        cv.put(Facility_SignUp.COL_FacilityCode, FacilityCode);
        long newRowID = db.insert(Facility_SignUp.TABLE_NAME, null, cv);
        return newRowID > 0;
    }

    public StringBuffer selectAllData() {
        StringBuffer data = new StringBuffer();
        String sql = "Select * from " + Facility_SignUp.TABLE_NAME +" order by "+ Facility_SignUp.COL_FacilityName + " DESC";
        Cursor c = db.rawQuery(sql, null);
        /*
        String[] columns = {Student.COL_ID, Student.COL_NAME, Student.COL_AVERAGE};
        Cursor c = db.query(Student.TABLE_NAME, columns, null, null, null, null, null);
        */
        c.moveToFirst();
        while (!c.isLast()) {
            int index1 = c.getColumnIndex(Facility_SignUp.COL_FacilityName);
            String FacilityName = c.getString(index1);
            int index2 = c.getColumnIndex(Facility_SignUp.COL_Email);
            String Email = c.getString(index2);
            int index3 = c.getColumnIndex(Facility_SignUp.COL_Password);
            int Password = c.getInt(index3);
            int index4 = c.getColumnIndex(Facility_SignUp.COL_FacilityCode);
            int FacilityCode = c.getInt(index4);

            data.append(FacilityName + " " + Email + " " + Password + "  " + FacilityCode + "\n");
            c.moveToNext();
        }
        return data;
    }


    public StringBuffer selectData(String name) {
        //select COL_NAME, COL_AVERAGE from TABLE_NAME where COL_NAME='name';
        StringBuffer data = new StringBuffer();

        String sql = "SELECT " + Facility_SignUp.COL_Email + ", " + Facility_SignUp.COL_FacilityCode + " FROM " + Facility_SignUp.TABLE_NAME + " WHERE " + Facility_SignUp.COL_FacilityName + " = ?";
        String[] selectionArgs = new String[]{name};
        Cursor c = db.rawQuery(sql, selectionArgs);
    /*
        String[] columns = {Student.COL_ID, Student.COL_AVERAGE};
        String selection = Student.COL_NAME + " = '" + name + "'";
        Cursor c = db.query(Student.TABLE_NAME, columns, selection, null, null, null, null);
    */
        while (c.moveToNext()) {
            int index1 = c.getColumnIndex(Facility_SignUp.COL_Email);
            String Email = c.getString(index1);
            int index2 = c.getColumnIndex(Facility_SignUp.COL_FacilityCode);
           int FacilityCode = c.getInt(index2);
            data.append(Email + " " + name + " " + FacilityCode + "\n");
        }
        return data;
    }

    public StringBuffer selectData(String name, int FacilityCode) {
        //select COL_ID from TABLE_NAME where COL_NAME=? AND average=?;
        StringBuffer data = new StringBuffer();
        String[] columns = {Facility_SignUp.COL_Email};
        String selection = Facility_SignUp.COL_FacilityName + " =? and " + Facility_SignUp.COL_FacilityCode + " =? ";
        String[] selectionArgs = {name, String.valueOf(FacilityCode)};
        Cursor c = db.query(Facility_SignUp.TABLE_NAME, columns, selection, selectionArgs, null, null, null);
        while (c.moveToNext()) {
            int index1 = c.getColumnIndex(Facility_SignUp.COL_Email);
            int Email = c.getInt(index1);
            data.append(Email + " " + name + " " + FacilityCode + "\n");
        }
        return data;
    }

    public boolean updateFacility_SignUp(String Email, String FacilityName, int FacilityCode) {
        ContentValues cv = new ContentValues();
        cv.put(Facility_SignUp.COL_FacilityName, FacilityName);
        cv.put(Facility_SignUp.COL_FacilityCode, FacilityCode);
        int count = db.update(Facility_SignUp.TABLE_NAME,cv ,Facility_SignUp.COL_Email + "= " + Email,null);
        //  int count = db.update(Student.TABLE_NAME, cv, Student.COL_ID + "=? " , new String[] {String.valueOf(id)});
        return count > 0;
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

