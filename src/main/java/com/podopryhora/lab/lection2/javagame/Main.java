package com.podopryhora.lab.lection2.javagame;

public class Main {

    public static void main(String[] args) {
        View view = new View();
        Model model = new Model(Constants.MIN_RANGE, Constants.MAX_RANGE);
        Controller controller = new Controller(view, model);

        controller.startGame();
    }
}
