package com.company;

public class Wyscig {
    public static void psvm() {
        Zawodnik zawodnik1 = new Zawodnik();
        zawodnik1.setImie("Adam");
        zawodnik1.setPredkoscMinimalna(5);
        zawodnik1.setPredkoscMaksymalna(15);

        Zawodnik zawodnik2 = new Zawodnik();
        zawodnik2.setImie("Julia");
        zawodnik2.setPredkoscMinimalna(5);
        zawodnik2.setPredkoscMaksymalna(15);

        Zawodnik zawodnik3 = new Zawodnik();
        zawodnik1.setImie("Robert");
        zawodnik3.setPredkoscMinimalna(5);
        zawodnik3.setPredkoscMaksymalna(15);

        double max = 0;
        do {
            zawodnik1.biegnij();
            System.out.println("Adam: " + zawodnik1.getPokonanaOdleglosc());
            zawodnik2.biegnij();
            System.out.println("Julia: " + zawodnik2.getPokonanaOdleglosc());
            zawodnik3.biegnij();
            System.out.println("Robert: " + zawodnik3.getPokonanaOdleglosc());

            if ((zawodnik1.getPokonanaOdleglosc() > zawodnik2.getPokonanaOdleglosc())
                    && (zawodnik1.getPokonanaOdleglosc() > zawodnik3.getPokonanaOdleglosc())) {
                max = zawodnik1.getPokonanaOdleglosc();
                System.out.println("Adam najwięcej");
                if (max >= 50) {
                    System.out.println("Zwycięzcą jest Adam");
                }
            }

            if ((zawodnik2.getPokonanaOdleglosc() > zawodnik1.getPokonanaOdleglosc())
                    && (zawodnik2.getPokonanaOdleglosc() > zawodnik3.getPokonanaOdleglosc())) {
                max = zawodnik2.getPokonanaOdleglosc();
                System.out.println("Julia najwięcej");
                if (max >= 50) {
                    System.out.println("Zwycięzcą jest Julia");
                }
            }

            if ((zawodnik3.getPokonanaOdleglosc() > zawodnik2.getPokonanaOdleglosc())
                    && (zawodnik3.getPokonanaOdleglosc() > zawodnik1.getPokonanaOdleglosc())) {
                max = zawodnik3.getPokonanaOdleglosc();
                System.out.println("Robert najwięcej");
                if (max >= 50) {
                    System.out.println("Zwycięzcą jest Robert");
                }
            }
        } while (max < 50);

        zawodnik1.setPokonanaOdleglosc(0);
        zawodnik2.setPokonanaOdleglosc(0);
        zawodnik3.setPokonanaOdleglosc(0);

    }

}

