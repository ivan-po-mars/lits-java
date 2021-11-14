package com.homework4;

public class Rectangle extends Figure {
    String figureName = "Rectangle";

    public Rectangle(String name) {
        super(name);
    }

    public Rectangle(String name, double w, double h) {
        super(name, w * h);
    }

    public Rectangle(String name, double w, double l, double h) {
        super(name, 0.5 * (w + l) * h);
    }

    public void printFigureInfo() {
        System.out.println("" + this.getName() + " " + this.figureName + " " + this.getArea());
    }
}
