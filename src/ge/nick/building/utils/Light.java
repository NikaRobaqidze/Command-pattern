package ge.nick.building.utils;

public class Light {

    private boolean switchedOn;

    public boolean isSwitchedOn() {
        return switchedOn;
    }

    public void setSwitchedOn(boolean switchedOn) {
        System.out.printf("Changed lights from: %s to %s\n", this.switchedOn, switchedOn);
        this.switchedOn = switchedOn;
    }
}
