package zad2;

public class Trojkat implements Figura, Comparable<Figura> {
    private double a;
    private double b;
    private double c;
    private double h;

    public Trojkat(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public int compareTo(Figura o) {
        return this.obliczPole().compareTo(o.obliczPole());
    }

    @Override
    public Double obliczPole() {
        return (this.a * this.h) / 2;
    }

    @Override
    public Double obliczObwod() {
        return this.a + this.h + this.c;
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
