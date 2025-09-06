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
        else if (command == Command.L){
            turnLeft();
        }
    }

    private void moveForward() {
        Direction direction = location.getDirection();
        switch (direction) {
            case N:
                location.setY(location.getLocationY() + 1);
                break;
            case E:
                location.setX(location.getLocationX() + 1);
                break;
            case S:
                location.setY(location.getLocationY() - 1);
                break;
            case W:
                location.setX(location.getLocationX() - 1);
                break;

        }
    }

    private void turnRight() {

    }

    private void turnLeft() {
        Direction direction = location.getDirection();
        switch (direction) {
            case N:
                location.setDirection(Direction.W);
                break;
            case E:
                location.setDirection(Direction.N);
                break;
        }
    }

    public Location getLocation() {
        return location;
    }
}
