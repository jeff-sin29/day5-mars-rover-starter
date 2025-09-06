package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void should_move_when_executeCommand_given_M_and_Direction_is_N(){
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

    @Test
    void should_move_when_executeCommand_given_M_and_Direction_is_E(){
        // Given
        Location location = new Location(0,0, Direction.E);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand(Command.M);
        //Then
        Location currentLocation = new Location(1, 0, Direction.E);
        assertEquals(currentLocation.getLocationY(), marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(), marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }

    @Test
    void should_move_when_executeCommand_given_M_and_Direction_is_S(){
        // Given
        Location location = new Location(0,0, Direction.S);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand(Command.M);
        //Then
        Location currentLocation = new Location(0, -1, Direction.S);
        assertEquals(currentLocation.getLocationY(), marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(), marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }

    @Test
    void should_move_when_executeCommand_given_M_and_Direction_is_W(){
        // Given
        Location location = new Location(0,0, Direction.W);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand(Command.M);
        //Then
        Location currentLocation = new Location(-1, 0, Direction.W);
        assertEquals(currentLocation.getLocationY(), marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(), marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }

    @Test
    void should_turn_left_when_executeCommand_given_L_and_Direction_is_N(){
        // Given
        Location location = new Location(0,0, Direction.N);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand(Command.L);
        //Then
        Location currentLocation = new Location(0, 0, Direction.W);
        assertEquals(currentLocation.getLocationY(), marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(), marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }

    @Test
    void should_turn_left_when_executeCommand_given_L_and_Direction_is_E(){
        // Given
        Location location = new Location(0,0, Direction.E);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand(Command.L);
        //Then
        Location currentLocation = new Location(0, 0, Direction.N);
        assertEquals(currentLocation.getLocationY(), marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(), marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }

    @Test
    void should_turn_left_when_executeCommand_given_L_and_Direction_is_S(){
        // Given
        Location location = new Location(0,0, Direction.S);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand(Command.L);
        //Then
        Location currentLocation = new Location(0, 0, Direction.E);
        assertEquals(currentLocation.getLocationY(), marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(), marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }

    @Test
    void should_turn_left_when_executeCommand_given_L_and_Direction_is_W(){
        // Given
        Location location = new Location(0,0, Direction.W);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand(Command.L);
        //Then
        Location currentLocation = new Location(0, 0, Direction.S);
        assertEquals(currentLocation.getLocationY(), marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(), marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }

    @Test
    void should_turn_right_when_executeCommand_given_R_and_Direction_is_N(){
        // Given
        Location location = new Location(0,0, Direction.N);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand(Command.R);
        //Then
        Location currentLocation = new Location(0, 0, Direction.E);
        assertEquals(currentLocation.getLocationY(), marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(), marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }

    @Test
    void should_turn_right_when_executeCommand_given_R_and_Direction_is_E(){
        // Given
        Location location = new Location(0,0, Direction.E);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand(Command.R);
        //Then
        Location currentLocation = new Location(0, 0, Direction.S);
        assertEquals(currentLocation.getLocationY(), marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(), marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }

    @Test
    void should_turn_right_when_executeCommand_given_R_and_Direction_is_S(){
        // Given
        Location location = new Location(0,0, Direction.S);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand(Command.R);
        //Then
        Location currentLocation = new Location(0, 0, Direction.W);
        assertEquals(currentLocation.getLocationY(), marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(), marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }

    @Test
    void should_turn_right_when_executeCommand_given_R_and_Direction_is_W(){
        // Given
        Location location = new Location(0,0, Direction.W);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand(Command.R);
        //Then
        Location currentLocation = new Location(0, 0, Direction.N);
        assertEquals(currentLocation.getLocationY(), marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(), marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }

    @Test
    void should_mov_backward_when_executeCommand_given_B_and_Direction_is_N(){
        // Given
        Location location = new Location(0,0, Direction.N);
        MarsRover marsRover = new MarsRover(location);
        // When
        marsRover.executeCommand(Command.B);
        //Then
        Location currentLocation = new Location(0, -1, Direction.N);
        assertEquals(currentLocation.getLocationY(), marsRover.getLocation().getLocationY());
        assertEquals(currentLocation.getLocationX(), marsRover.getLocation().getLocationX());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }
}
