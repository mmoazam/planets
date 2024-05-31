package com.space.planets.model;

public class Planets {

    private String name;
    private String distance;
    private String type;
    private String size;
    private String yearLength;
    private String orbitalCircumference;
    private String moons;

    public Planets(String name, String distance, String type, String size, String yearLength, String orbitalCircumference, String moons) {
        this.name = name;
        this.distance = distance;
        this.type = type;
        this.size = size;
        this.yearLength = yearLength;
        this.orbitalCircumference = orbitalCircumference;
        this.moons = moons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getYearLength() {
        return yearLength;
    }

    public void setYearLength(String yearLength) {
        this.yearLength = yearLength;
    }

    public String getOrbitalCircumference() {
        return orbitalCircumference;
    }

    public void setOrbitalCircumference(String orbitalCircumference) {
        this.orbitalCircumference = orbitalCircumference;
    }

    public String getMoons() {
        return moons;
    }

    public void setMoons(String moons) {
        this.moons = moons;
    }

    public String toString() {
        return "Planet: " + name
                + "\nDistance from the Sun: " + distance
                + "\nType: " + type
                + "\nSize: " + size
                + "\nYear Length: " + yearLength
                + "\nOrbital Circumference: " + orbitalCircumference
                + "\nMoons: " + moons;
    }

    /*
    * This planet object should contain
- planet name
- distance from the sun
- planet type
- size
- year length in days
- orbital circumference
- list of moons (if any)*/
}
