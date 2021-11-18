package com.example.cio;

public class Facility {
    private  String FacilityName;
    private String  Email;
    private String Password;
    private String FacilityCode;
    public static final String TABLE_NAME = "Facility";

    public  final String COL_FacilityName = "FacilityN";
    public static final String COL_Email = "email";
    public static final String COL_Password = "password";
    public static final String COL_FacilityCode = "FacilityC";

    public  final String CREATE_TABLE = "create table " + TABLE_NAME +
            "(" + COL_FacilityName + " String primary key autoincrement," + COL_Email +
            " text," + COL_Password + " text," +COL_FacilityCode + "text)";

    public static final String DROP_TABLE = "drop table if exists " + TABLE_NAME;

    public Facility(String FacilityN, String email, String password, String FacilityCode ) {
        this.FacilityName = FacilityN;
        this.Email = email;
        this.Password = password;
        this.FacilityCode= FacilityCode;
    }

    public Facility() {
    }



    public String getFacilityName() {
        return FacilityName;
    }
    public String getEmail() {
        return Email;
    }
    public String getPassword() {
        return Password;
    }
    public String getFacilityCode() {
        return FacilityCode;
    }




    public void setFacilityName(String FacilityName) {
        this.FacilityName = FacilityName;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }
    public void setFacilityCode(String FacilityCode) {
        this.FacilityCode = FacilityCode;
    }


}

