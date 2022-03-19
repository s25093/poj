package com.company;

public class Wiatrak {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    int speed = 0;
    boolean on = false;
    double radius = 0;
    String color = "";

    Wiatrak() {
        speed = 2;
        on = true;
        radius = 15;
        color = "WHITE";
    }

    Wiatrak(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String informacje(Wiatrak fan) {
        return "Speed: " + fan.speed + "\n" +
                "ON?: " + fan.on + "\n" +
                "Radius: " + fan.radius + "\n" +
                "Color: " + fan.color;
    }

}
