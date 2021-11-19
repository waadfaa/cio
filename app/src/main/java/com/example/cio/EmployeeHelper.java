package com.example.cio;

public class EmployeeHelper {

    String FirstName, LastName, Email;
    int Password, FacilityCodeE;
    String Male, Female;

    public EmployeeHelper() {

    }

    public EmployeeHelper(String firstName, String lastName, String email, int password, int facilityCodeE, String male, String female) {
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

    public String getMale() {
        return Male;
    }

    public void setMale(String male) {
        Male = male;
    }

    public String getFemale() {
        return Female;
    }

    public void setFemale(String female) {
        Female = female;
    }
}

