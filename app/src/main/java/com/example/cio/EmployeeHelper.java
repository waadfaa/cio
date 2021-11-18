package com.example.cio;

import android.widget.RadioButton;

public class EmployeeHelper {

    String FirstName, LastName, Email;
    int Password, FacilityCodeE;
    RadioButton Male, Female;

    public EmployeeHelper() {

    }

    public EmployeeHelper(String firstName, String lastName, String email, int password, int facilityCodeE, RadioButton male, RadioButton female) {
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Password = password;
        FacilityCodeE = facilityCodeE;
        Male = male;
        Female = female;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
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

    public int getFacilityCodeE() {
        return FacilityCodeE;
    }

    public void setFacilityCodeE(int facilityCodeE) {
        FacilityCodeE = facilityCodeE;
    }

    public RadioButton getMale() {
        return Male;
    }

    public void setMale(RadioButton male) {
        Male = male;
    }

    public RadioButton getFemale() {
        return Female;
    }

    public void setFemale(RadioButton female) {
        Female = female;
    }
}

