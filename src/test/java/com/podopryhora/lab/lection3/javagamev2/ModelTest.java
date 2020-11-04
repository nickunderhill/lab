package com.podopryhora.lab.lection3.javagamev2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ModelTest {

    @Test
    public void rand() {
    }

    @Test
    public void incrementTotalAttempts() {
    }

    @Test
    public void testIsWin() {
        Model model = new Model();
        model.setSecretNumber(100);
        assertTrue(model.isWin(100));
        assertFalse(model.isWin(1));
    }

    @Test
    public void testUpdateModelData() {
    }
}