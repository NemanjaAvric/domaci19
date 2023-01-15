package org.example;

import java.util.ArrayList;

public class Bend {
    private String name;
    private ArrayList<String> bandMembers = new ArrayList<>();
    private int yearOfFormationOfTheBand;

    public Bend() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBandMembers(ArrayList<String> bandMembers) {
        this.bandMembers = bandMembers;
    }

    public void setYearOfFormation(int yearOfFormation) {
        this.yearOfFormationOfTheBand = yearOfFormation;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getBandMembers() {
        return bandMembers;
    }

    public int getYearOfFormation() {
        return yearOfFormationOfTheBand;
    }
}
