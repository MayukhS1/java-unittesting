package com.teamtreehouse.vending;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditorTest {

    private Creditor cr;

    @BeforeEach
    void setUp() {
        cr = new Creditor();

        cr.addFunds(50);
        cr.addFunds(15);
    }

    @Test
    void testingRefundIsEqualWithTotalFunds() {
        assertEquals(65,cr.refund());
    }

    @Test
    void testingToalFundIsZeroAfterRefund() {
        cr.refund();

        assertEquals(0,cr.getAvailableFunds());
    }

    @Test
    void testingCurrentFundOfCreditor() {
         assertEquals(65, cr.getAvailableFunds());
    }


}