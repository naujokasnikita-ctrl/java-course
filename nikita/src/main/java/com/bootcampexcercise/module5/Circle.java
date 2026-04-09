package com.bootcampexcercise.module5;

public class Circle extends Shape {
    public double radius;
    public void setRadius(double radius) {this.radius = radius;};
    // setter for radius
    public double calculateArea() {return Math.PI * radius * radius;}
    public double calculatePerimeter() {return 2 * Math.PI * radius;}
}