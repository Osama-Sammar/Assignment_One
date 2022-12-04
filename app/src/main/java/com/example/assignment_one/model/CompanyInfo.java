package com.example.assignment_one.model;

public class CompanyInfo {
    private String name;
    private String location;
    private String position;

    public CompanyInfo(String name, String location, String position) {
        this.name = name;
        this.location = location;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPosition() { return position;}

    public void setPosition(String position) { this.position = position;}

    @Override
    public String toString() {
        //return " Name : " + getName() + " , Location : " + getLocation();
        return getName() + " --- " + getLocation() + " --- " + getPosition();

    }
}
