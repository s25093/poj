package Zad1;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;
    private double h;

    Triangle (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        double eq1 = a = b;
        double eq2 = a + c;
        double eq3 = b + c;

        if ((eq1 > c) && (eq2 > b) && (eq3 > a)) {
            double s = (a+b+c)/2;
            double area = (Math.sqrt(s*(s-a)*(s-b)*(s-c)));
            this.h = (2.0*area)/a;
        } else {
            this.a = 0;
            this.b = 0;
            this.c = 0;
            System.out.println("This triangle cannot be created.");
        }
    }

    @Override
    public double getArea() {
        return (a*h)/2.0;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

}
