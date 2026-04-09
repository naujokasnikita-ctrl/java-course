package com.bootcampexcercise.module5;

public class AbstractActivity {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Blue");

        System.out.println("Rectangle color: " + rectangle.getColor());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());

        System.out.println("----------");

        Circle circle = new Circle(7);
        circle.setColor("Orange");

        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());
    }
}

