package zad2;

public class Kolo implements Figura, Comparable<Figura> {
    private double r;

    public Kolo(double r) {
        this.r = r;
    }

    @Override
    public int compareTo(Figura o) {
        return this.obliczPole().compareTo(o.obliczPole());
    }

    @Override
    public Double obliczPole() {
        return Math.PI * Math.sqrt(this.r);
    }

    @Override
    public Double obliczObwod() {
        return 2 * Math.PI * this.r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
