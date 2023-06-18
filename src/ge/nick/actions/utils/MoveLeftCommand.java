package ge.nick.actions.utils;

public class MoveLeftCommand extends AbstractCommand {

    public MoveLeftCommand(Game game) {
        super(game);
    }


    @Override
    public void execute() {
        System.out.println("Move player left");
    }
}
