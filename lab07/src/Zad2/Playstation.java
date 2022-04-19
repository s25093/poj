package Zad2;

public class Playstation extends GameConsole {
    @Override
    public void playGame(Game game) {
        if (game.isConsole()) {
            System.out.println("Playing " + game.getTitle() + "\n");
        } else {
            System.out.println("This is an Xbox game." + "\n");
        }
    }
}
