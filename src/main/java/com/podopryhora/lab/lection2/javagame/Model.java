package com.podopryhora.lab.lection2.javagame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Model {

    private static final Random RANDOM = new Random();
    private int totalAttempts = 0;
    private final List<Integer> validAttemptsList = new ArrayList<>();
    private final int secretNumber;
    private int min;
    private int max;

    public Model(int min, int max) {
        this.min = min;
        this.max = max;
        this.secretNumber = rand(min, max);
    }

    public int getTotalAttempts() {
        return totalAttempts;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public List<Integer> getValidAttemptsList() {
        return validAttemptsList;
    }

    public static int rand(int min, int max) {
        return RANDOM.nextInt(max - min - 1) + min;
    }

    public static int rand() {
        return RANDOM.nextInt(Integer.MAX_VALUE);
    }

    public void incrementTotalAttempts() {
        totalAttempts++;
    }

}
