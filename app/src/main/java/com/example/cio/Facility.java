package com.example.cio;

public class Facility  {

    DBHelper db;
    String FacilityName;
    String Email;
    String Password;
    String FacilityCode;

    public static final String TABLE_NAME = "Facility ";

    public static final String COL_FacilityName = "FacilityName";
    public static final String COL_Email = "Email";
    public static final String COL_Password = "Password";
    public static final String COL_FacilityCode = "FacilityCode";


    public static final String CREATE_TABLE = "create table " + TABLE_NAME +
            "(" + COL_FacilityName + " string primary key autoincrement," + COL_Email +
            " text," + COL_Password + " integer," + COL_FacilityCode + "integer ,)";

    public static final String DROP_TABLE = "drop table if exists " + TABLE_NAME;


    public Facility(String FacilityName, String Email, String Password, String FacilityCode){
        this.FacilityName = FacilityName;
        this.Email = Email;
        this.Password = Password;
        this.FacilityCode = FacilityCode;
    }

    public Facility() {
    }
    public String getFacilityName () {
        return FacilityName;
    }

    public String getEmail () {
        return Email;
    }

    public String getPassword () {
        return Password;
    }
    public String getFacilityCode () {
        return FacilityCode;
    }


    public void setFacilityName (String FacilityName){
        this.FacilityName = FacilityName;
    }

    public void setEmail (String Email){
        this.Email = Email;
    }

    public void setPassword ( String Password){
        this.Password = Password;
    }

    public void setFacilityCode ( String FacilityCode){
        this.FacilityCode = FacilityCode;
    }
}
