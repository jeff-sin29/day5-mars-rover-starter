package com.afs.tdd;

public class Location {
    private int x;
    private int y;
    private Direction direction;

    public Location(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getLocationX() {
        return x;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getLocationY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }
}
