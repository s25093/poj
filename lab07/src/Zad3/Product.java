package Zad3;

public abstract class Product {
    protected String name;
    protected double price;
    protected int code;
    protected int amount;

    protected Product(String name, double price, int code, int amount) {
        this.name = name;
        this.price = price;
        this.code = code;
        this.amount = amount;
    }

    public abstract String info();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
