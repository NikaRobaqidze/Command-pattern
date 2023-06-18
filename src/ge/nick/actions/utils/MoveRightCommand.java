package ge.nick.actions.utils;

public class MoveRightCommand extends AbstractCommand {

    public MoveRightCommand(Game game) {
        super(game);
    }

    @Override
    public void execute() {
        System.out.println("Move player right");
    }
}
