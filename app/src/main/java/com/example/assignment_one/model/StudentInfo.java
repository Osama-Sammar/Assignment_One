package com.example.assignment_one.model;

public class StudentInfo {
    private String name;
    private String major;

    public StudentInfo(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {

//        return "Name : " + getName() + " , ID :" + getID() + " , Gender : " + getGender()
//                + " , Major : " + getMajor();
        return getName() + " --- " + getMajor();

    }
}
