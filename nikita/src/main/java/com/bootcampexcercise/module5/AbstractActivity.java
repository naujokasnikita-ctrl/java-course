package com.bootcampexcercise.module5;

public class AbstractActivity {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Blue");
        rectangle.setHeight(12);
        rectangle.setWidth(5);

        System.out.println("Rectangle color: " + rectangle.getColor());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());

        Circle circle = new Circle();
        circle.setColor("Orange");
        circle.setRadius(4);
        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());
    }
    //Rectangle color: Blue
    //Rectangle area: 60.0
    //Rectangle perimeter: 34.0
    //Circle color: Orange
    //Circle area: 50.26548245743669
    //Circle perimeter: 25.132741228718345
}

