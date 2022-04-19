package Zad3;

public class Drink extends Product {
    private boolean carbonated; //gazowany

    public Drink(String name, double price, int code, int amount, boolean carbonated) {
        super(name, price, code, amount);
        this.carbonated = carbonated;
    }

    @Override
    public String info() {
        return "Name: " + this.name +
                ", Price: " + this.price + ", Carbonated: " + this.carbonated;
    }

    public boolean isCarbonated() {
        return carbonated;
    }

    public void setCarbonated(boolean carbonated) {
        this.carbonated = carbonated;
    }
}
