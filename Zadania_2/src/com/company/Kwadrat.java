package com.company;

public class Kwadrat {
    double bok;

    Kwadrat(double bok) {
        this.bok = bok;
    }

    public double obwod(double bok) {
        return bok*4;
    }

    public double pole(double bok) {
        return Math.pow(bok, 2);
    }
}
