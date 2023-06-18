package ge.nick.building;

import ge.nick.building.utils.*;

public class Launcher {

    public static void main(String[] args) {
        House house = new House();

        // Bedroom
        Bedroom bedroom = new Bedroom(
                new SwitchLightCommand(new Light())
        );
        house.addRoom(bedroom);

        // Kitchen
        Kitchen kitchen = new Kitchen(
                new SwitchLightCommand(new Light())
        );        house.addRoom(kitchen);

        house.getRooms().forEach(Room::switchLight);
        house.getRooms().forEach(Room::switchLight);
    }
}