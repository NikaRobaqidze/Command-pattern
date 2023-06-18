package ge.nick.building.utils;

public abstract class Room {

    private Command command;

    public Room(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void switchLight() {
        command.execute();
    }
}
