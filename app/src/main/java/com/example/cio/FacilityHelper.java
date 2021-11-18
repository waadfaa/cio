package com.example.cio;

public class FacilityHelper {

    String FacilityName,Email;
    int Password,FacilityCode;

    public FacilityHelper() {

    }

    public FacilityHelper(String facilityName, String email, int password, int facilityCode) {
        FacilityName = facilityName;
        Email = email;
        Password = password;
        FacilityCode = facilityCode;
    }

    public String getFacilityName() {
        return FacilityName;
    }

    public void setFacilityName(String facilityName) {
        FacilityName = facilityName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPassword() {
        return Password;
    }

    public void setPassword(int password) {
        Password = password;
    }

    public int getFacilityCode() {
        return FacilityCode;
    }

    public void setFacilityCode(int facilityCode) {
        FacilityCode = facilityCode;
    }
}
