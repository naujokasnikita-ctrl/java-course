package com.bootcampexcercise.module5;

public class Rectangle extends Shape {
    // give meaning to the atributes
    private double width;
    private double height;
//setter for width and height
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    // calculate area
    public double calculateArea() {return width * height;}
    //calculate perimeter
    public double calculatePerimeter() {return 2 * (width + height);}
}
