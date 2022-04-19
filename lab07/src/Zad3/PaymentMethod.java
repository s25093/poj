package Zad3;

public abstract class PaymentMethod {
    protected double funds;

    protected PaymentMethod(double funds) {
        this.funds = funds;
    }

    public abstract boolean reduceFunds(double funds);

    public abstract double getFunds();

    public abstract void setFunds(double funds);
}
