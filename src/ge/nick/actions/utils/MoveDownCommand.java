package ge.nick.actions.utils;

public class MoveDownCommand extends AbstractCommand {

    public MoveDownCommand(Game game) {
        super(game);
    }

    @Override
    public void execute() {
        System.out.println("Move player down");
    }
}
