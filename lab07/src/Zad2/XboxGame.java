package Zad2;

public class XboxGame extends Game {
    private boolean console;
    private String title;

    XboxGame(String title) {
        super(false, title);
        this.title = title;
        this.console = false;
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
