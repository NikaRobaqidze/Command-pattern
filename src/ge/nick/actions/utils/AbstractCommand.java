package ge.nick.actions.utils;

public abstract class AbstractCommand implements Command {

    protected Game game;

    public AbstractCommand(Game game) {
        this.game = game;
    }


}
