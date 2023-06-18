package ge.nick.actions.utils;

public class MoveUpCommand extends AbstractCommand {

    public MoveUpCommand(Game game) {
        super(game);
    }

    @Override
    public void execute() {
        System.out.println("Move player up");
    }
}
