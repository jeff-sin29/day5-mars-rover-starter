package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void should_move_when_executeCommand_given_M(){
        // Given
        Location location = new Location(0,0, Direction.N);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand(Command.M);
        //Then
        Location currentLocation = new Location(0, 1, Direction.N);
        assertEquals(currentLocation.getLocationY(), marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(), marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }
}
