package com.teamtreehouse.vending;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinTest {

    Bin bin;

    @BeforeEach
    void setUp() {
        bin = new Bin(10);
    }

    @Test
    void getItemPriceWhenItemIsPresentAfterRestocking() {
        bin.restock("CocoCola",6,30,35);
        assertEquals(35,bin.getItemPrice());
    }

    @Test
    void getItemPriceWhenItemIsAbsent() {
        assertEquals(0,bin.getItemPrice());
    }

    @Test
    void checkingRestockWhenAmountIsGreaterThanAvailableSlot() {
        Throwable exception = assertThrows(IllegalArgumentException.class,()->{
            bin.restock("CocoCola",266,30,35);
        });
        assertEquals("There are only 10 spots left",exception.getMessage());
    }
}