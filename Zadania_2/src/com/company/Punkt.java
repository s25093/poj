package com.company;

public class Punkt {
    double x;
    double y;

    Punkt() {
        x = 0;
        y = 0;
    }

    Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(double x, double y) {
        return Math.abs(x - y);
    }

    public double distanceObject(Punkt p) {
        return Math.abs(p.x - p.y);
    }

}
