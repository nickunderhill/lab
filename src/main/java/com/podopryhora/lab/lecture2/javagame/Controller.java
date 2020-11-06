package com.podopryhora.lab.lecture2.javagame;

import java.util.Scanner;

public class Controller {

    private final View view;
    private final Model model;
    private final Scanner scanner = new Scanner(System.in);

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void startGame() {
        int currentNumber = 0;

        view.printMessage(View.MESSAGE_WELCOME);

        while (!isWin(currentNumber)) {
            currentNumber = readAndValidateInput();
            updateModelData(currentNumber);
        }

        model.getValidAttemptsList().add(currentNumber);
        view.printSummary(model);
    }

    private int readAndValidateInput() {
        int number;
        do {
            view.printMessage(View.MESSAGE_ATTEMPTS, model.getTotalAttempts(), model.getValidAttemptsList().size());
            view.printMessage(View.MESSAGE_GUESS, model.getMin(), model.getMax());

            while (!scanner.hasNextInt()) {
                view.printMessage(View.MESSAGE_WRONG_INPUT);
                model.incrementTotalAttempts();
                scanner.next();
            }
            number = scanner.nextInt();
            model.incrementTotalAttempts();
            if (number < model.getMin() || number > model.getMax()) {
                view.printMessage(View.MESSAGE_WRONG_INPUT);
            }

        } while (number < model.getMin() || number > model.getMax());

        return number;
    }

    //move to model
    private void updateModelData(int number) {
        if (number > model.getSecretNumber()) {
            view.printMessage(View.MESSAGE_TRY_SMALLER);

            model.setMax(number);
            model.getValidAttemptsList().add(number);
        } else if (number < model.getSecretNumber()) {
            view.printMessage(View.MESSAGE_TRY_BIGGER);
            model.setMin(number);
            model.getValidAttemptsList().add(number);
        }
    }

    private boolean isWin(int number) {
        return number == model.getSecretNumber();
    }

}
