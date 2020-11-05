package com.podopryhora.lab.lecture1.task1;

import java.util.Scanner;

public class Controller {

    View view;
    Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void readInput() {
        Scanner sc = new Scanner(System.in);

        view.printPromptMessage(View.INPUT_PROMPT, View.HELLO);
        while (!sc.nextLine().equals(View.HELLO)) {
            view.printPromptMessage(View.INPUT_PROMPT, View.HELLO);
        }

        view.printPromptMessage(View.INPUT_PROMPT, View.WORLD);
        while (!sc.nextLine().equals(View.WORLD)) {
            view.printPromptMessage(View.INPUT_PROMPT, View.WORLD);
        }

        model.constructMessage(View.HELLO, View.WORLD);
        view.printResultMessage(model.getMessage());
    }
}
