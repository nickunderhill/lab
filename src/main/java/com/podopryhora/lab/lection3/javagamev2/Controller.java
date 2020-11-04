package com.podopryhora.lab.lection3.javagamev2;

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
        model.setMin(Constants.MIN_RANGE);
        model.setMax(Constants.MAX_RANGE);
        model.setSecretNumber(Model.rand(Constants.MIN_RANGE, Constants.MAX_RANGE));

        view.printMessage(View.MESSAGE_WELCOME);

        while (!model.isWin(currentNumber)) {
            currentNumber = readAndValidateInput();
            model.updateModelData(currentNumber, view);
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

            if (number <= model.getMin() || number >= model.getMax()) {
                view.printMessage(View.MESSAGE_WRONG_INPUT);
            }

        } while (number <= model.getMin() || number >= model.getMax());

        return number;
    }

}
