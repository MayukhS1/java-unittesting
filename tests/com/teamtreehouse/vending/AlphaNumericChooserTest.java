package com.teamtreehouse.vending;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphaNumericChooserTest {

    private AlphaNumericChooser chooser;
    @BeforeEach
    void setUp() {
        chooser = new AlphaNumericChooser(10,15);
    }

    @Test
    void returnsLocationFromInputString() throws InvalidLocationException {

        AlphaNumericChooser.Location loc = chooser.locationFromInput("B15");

        assertEquals(1,loc.getRow(),"@ Row checking");
        assertEquals(14,loc.getColumn(),"@ Column checking");
    }

    @Test
    void inputHigherThanMaxRowOrColumnNotRemitted(){
        assertThrows(InvalidLocationException.class,()->{
            AlphaNumericChooser.Location loc = chooser.locationFromInput("B18");
        },"Oh! Dear, Exception was not Thrown");
    }

}