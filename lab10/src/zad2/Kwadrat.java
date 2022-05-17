package zad2;

public class Kwadrat implements Figura, Comparable<Figura> {
    private double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    @Override
    public int compareTo(Figura o) {
        return this.obliczPole().compareTo(o.obliczPole());
    }

    @Override
    public Double obliczPole() {
        return this.bok * this.bok;
    }

    @Override
    public Double obliczObwod() {
        return this.bok * 4;
    }

    public double getBok() {
        return bok;
    }

    public void setBok(double bok) {
        this.bok = bok;
    }
}
