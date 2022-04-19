package Zad2;

public class PlaystationGame extends Game {
    private boolean console;
    private String title;

    PlaystationGame(String title) {
        super(true, title);
        this.title = title;
        this.console = true;
    }

    @Override
    public boolean isConsole() {
        return console;
    }

    @Override
    public void setConsole(boolean console) {
        this.console = console;
    }
}
