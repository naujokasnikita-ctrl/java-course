package com.bootcampexcercise.module5;

public class Rectangle extends Shape {
    // give meaning to the atributes
    private double width = 10.3;
    private double height = 4.1;

    // calculate area
    public double calculateArea() {return width * height;}
    //calculate perimeter
    public double calculatePerimeter() {return 2 * (width + height);}
}
