package com.bootcampexcercise.module5;
//class abstract
public abstract class Shape {
    public String color;

    public Shape() {}

    // Abstract methods
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
//setter for color
    public void setColor(String c) {color = c;}
//getter for color
    public String getColor() {return color;}
}
