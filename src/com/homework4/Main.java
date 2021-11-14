package com.homework4;

public class Main {
    public static void main(String[] args) {
        Square square = new Square("square1", 5, 5);
        Rectangle rectangle = new Rectangle("rectangle1", 5, 10);
        Parallelogram parallelogram = new Parallelogram("parallelogram1", 5, 10);
        Trapezoid trapezoid = new Trapezoid("trapezoid1", 5, 10, 8);

        square.printFigureInfo();
        rectangle.printFigureInfo();
        parallelogram.printFigureInfo();
        trapezoid.printFigureInfo();
    }
}
