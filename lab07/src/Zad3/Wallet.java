package Zad3;

public class Wallet extends PaymentMethod {
    public Wallet(double funds) {
        super(funds);
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
}
