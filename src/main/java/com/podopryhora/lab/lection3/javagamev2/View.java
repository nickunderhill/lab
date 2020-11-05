package com.podopryhora.lab.lection3.javagamev2;

public class View {

    public static final String MESSAGE_WELCOME = "Welcome to the \"Guess the number\" game!";
    public static final String MESSAGE_ATTEMPTS = "Total attempts performed: %d, valid attempts performed: %d%n";
    public static final String MESSAGE_GUESS = "Please, enter the number from range (%d, %d):%n";
    public static final String MESSAGE_WRONG_INPUT = "Error: the input number is out of range!";
    public static final String MESSAGE_TRY_BIGGER = "Try a bigger number!";
    public static final String MESSAGE_TRY_SMALLER = "Try a smaller number!";
    public static final String MESSAGE_CONGRATULATIONS = "That's the right number! You won!";
    public static final String MESSAGE_ATTEMPTS_HISTORY = "Winning numbers sequence: %s";


    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessage(String message, int param1, int param2) {
        System.out.printf(message, param1, param2);
    }

    public void printSummary(Model model) {
        System.out.println(MESSAGE_CONGRATULATIONS);
        System.out.printf(MESSAGE_ATTEMPTS, model.getTotalAttempts(), model.getValidAttemptsList().size());
        System.out.printf(MESSAGE_ATTEMPTS_HISTORY, model.getValidAttemptsList());
    }
}
