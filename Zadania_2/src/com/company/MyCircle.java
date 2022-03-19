package com.company;

public class MyCircle {
    double radius;

    MyCircle(double radius) {
        this.radius = radius;
    }

    public double circumference(double radius) {
        return 2*Math.PI*radius;
    }

    public double area(double radius) {
        return Math.PI*Math.pow(radius, 2);
    }

    public double diameter(double radius) {
        return radius*2;
    }

}
