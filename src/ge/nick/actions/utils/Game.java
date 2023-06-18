package ge.nick.actions.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Game implements Runnable {

    private final Scanner scanner = new Scanner(System.in);
    private boolean running;
    private Map<String, Command> commands = new HashMap<>();

    {
        commands.put("UP", new MoveUpCommand(this));
        commands.put("RIGHT", new MoveRightCommand(this));
        commands.put("DOWN", new MoveDownCommand(this));
        commands.put("LEFT", new MoveLeftCommand(this));
    }

    public void start() {
        new Thread(this).start();
    }

    @Override
    public void run() {
        running = true;
        while (running) {
            // Read commands
            Command command = readCommand();
            command.execute();
        }
    }

    private Command readCommand() {
        System.out.print("Enter your command: ");
        String line = scanner.nextLine();
        if (!commands.containsKey(line)) {
            throw new IllegalArgumentException("No such command available");
        }
        return commands.get(line);
    }
}
