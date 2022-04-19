package Zad1;

public class Square extends Shape {
    private double a;

    Square (double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return a*a;
    }

    @Override
    public double getPerimeter() {
        return a*4.0;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}
