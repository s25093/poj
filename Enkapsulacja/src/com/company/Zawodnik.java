package com.company;

public class Zawodnik {
    private String imie;
    private double predkoscMinimalna;
    private double predkoscMaksymalna;
    private double pokonanaOdleglosc;

    public Zawodnik() {
        this.imie = "Robert";
        this.predkoscMinimalna = 2;
        this.predkoscMaksymalna = 12;
        this.pokonanaOdleglosc = 0;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public double getPredkoscMinimalna() {
        return predkoscMinimalna;
    }

    public void setPredkoscMinimalna(double predkoscMinimalna) {
        this.predkoscMinimalna = predkoscMinimalna;
    }

    public double getPredkoscMaksymalna() {
        return predkoscMaksymalna;
    }

    public void setPredkoscMaksymalna(double predkoscMaksymalna) {
        this.predkoscMaksymalna = predkoscMaksymalna;
    }

    public double getPokonanaOdleglosc() {
        return pokonanaOdleglosc;
    }

    public void setPokonanaOdleglosc(double pokonanaOdleglosc) {
        this.pokonanaOdleglosc = pokonanaOdleglosc;
    }

    public void przedstawSie() {
        System.out.println("Jestem " + imie + " biegam z prędkością "
        + predkoscMinimalna + "-" + predkoscMaksymalna + "km/h.");
    }

    public void biegnij() {
        this.pokonanaOdleglosc += Math.random() * (predkoscMaksymalna - predkoscMinimalna);
    }
}
