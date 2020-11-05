package com.podopryhora.lab.lecture3.javagamev2;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {
    static Model model;

    @BeforeAll
    static void init() {
        model = new Model();
    }

    @Test
    public void rand() {
        List<Integer> numbers = new ArrayList<>();
        int lowerRangeExclude = 0;
        int upperRangeExclude = 10;
        for (int i = 0; i < 10000; i++) {
            numbers.add(Model.rand(lowerRangeExclude,upperRangeExclude));
        }

        assertTrue(numbers.contains(1));
        assertTrue(numbers.contains(2));
        assertTrue(numbers.contains(3));
        assertTrue(numbers.contains(4));
        assertTrue(numbers.contains(5));
        assertTrue(numbers.contains(6));
        assertTrue(numbers.contains(7));
        assertTrue(numbers.contains(8));
        assertTrue(numbers.contains(9));

        assertFalse(numbers.contains(0));
        assertFalse(numbers.contains(10));
    }

    @RepeatedTest(10)
    public void incrementTotalAttempts() {
        int before = model.getTotalAttempts();
        model.incrementTotalAttempts();
        int after = model.getTotalAttempts();

        assertEquals(before + 1, after);
        assertTrue(before < after);
        assertNotEquals(before, after);
    }

    @Test
    public void isWin() {
        model.setSecretNumber(100);

        assertTrue(model.isWin(100));
        assertFalse(model.isWin(1));
    }

    @Test
    public void updateRangeAndLog() {
        int secretNumber = 50;
        int smallerNumber = 10;
        int biggerNumber = 100;
        List<Integer> list = model.getValidAttemptsList();
        model.setSecretNumber(secretNumber);

        model.updateRangeAndLog(smallerNumber);

        assertEquals(smallerNumber, model.getMin());
        assertNotEquals(biggerNumber, model.getMin());
        assertEquals(smallerNumber, list.get(list.size() - 1));

        model.updateRangeAndLog(biggerNumber);

        assertEquals(biggerNumber, model.getMax());
        assertNotEquals(smallerNumber, model.getMax());
        assertEquals(biggerNumber, list.get(list.size() - 1));

        model.updateRangeAndLog(secretNumber);

        assertNotEquals(secretNumber, model.getMax());
        assertNotEquals(secretNumber, model.getMax());
        assertEquals(secretNumber, list.get(list.size() - 1));
    }
}