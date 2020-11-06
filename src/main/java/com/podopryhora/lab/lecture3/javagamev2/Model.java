package com.podopryhora.lab.lecture3.javagamev2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Model {

    private int min;
    private int max;
    private int secretNumber;
    private int totalAttempts = 0;

    private final List<Integer> validAttemptsList = new ArrayList<>();

    private static final Random RANDOM = new Random();

    public Model() {
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

    public void setSecretNumber(int secretNumber) {
        this.secretNumber = secretNumber;
    }

    public List<Integer> getValidAttemptsList() {
        return validAttemptsList;
    }

    public static int rand(int min, int max) {
        return RANDOM.nextInt(max - min - 1) + min + 1;
    }

    public void incrementTotalAttempts() {
        totalAttempts++;
    }

    public boolean isWin(int number) {
        return number == getSecretNumber();
    }

    public void updateRangeAndLog(int number) {
        if (number > getSecretNumber()) {
            setMax(number);
        } else if (number < getSecretNumber()) {
            setMin(number);
        }
        validAttemptsList.add(number);
    }
}
