package Zad3;

public class CreditCard extends PaymentMethod {
    private String pin;
    public CreditCard(double funds, String pin) {
        super(funds);
        this.pin = pin;
    }

    @Override
    public boolean reduceFunds(double funds) {
        if(this.funds - funds < 0) {
            return false;
        } else {
            this.funds-=funds;
            return true;
        }
    }

    @Override
    public double getFunds() {
        return this.funds;
    }

    @Override
    public void setFunds(double funds) {
        this.funds = funds;
    }

    public boolean checkPin(String pin) {
        return this.pin.equals(pin);
    }
}
