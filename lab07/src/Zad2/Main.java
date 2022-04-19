package Zad2;

public class Main {

    public static void main(String[] args) {
        XboxGame xboxGame = new XboxGame("Sea of Thieves");
        PlaystationGame playstationGame = new PlaystationGame("God of War");

        Xbox xbox = new Xbox();
        Playstation ps = new Playstation();

        xbox.playGame(xboxGame);
        ps.playGame(playstationGame);

        xbox.playGame(playstationGame);
        ps.playGame(xboxGame);

    }
}
