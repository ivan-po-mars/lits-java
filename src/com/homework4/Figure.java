package com.homework4;

public class Figure {
    public String name;
    public double area;

    public Figure(String name) {
        this.name = name;
    }

    public Figure(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }
}
