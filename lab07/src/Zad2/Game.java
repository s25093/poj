package Zad2;

public abstract class Game {
    private boolean console;
    private String title;

    Game (boolean console, String title) {
        this.title = title;
        this.console = console;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isConsole() {
        return console;
    }

    public void setConsole(boolean console) {
        this.console = console;
    }
}
