package com.afs.tdd;

public class MarsRover {

    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommand(Command command) {
        if (command == Command.M){
            moveForward();
        }
    }

    private void moveForward() {
        Direction direction = location.getDirection();
        switch (direction) {
            case N:
                location.setY(location.getLocationY() + 1);
        }
    }

    private void turnRight() {
    }

    private void turnLeft() {
    }

    public Location getLocation() {
        return location;
    }
}
