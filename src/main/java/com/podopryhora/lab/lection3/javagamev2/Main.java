package com.podopryhora.lab.lection3.javagamev2;

public class Main {

    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(view, model);

        controller.startGame();
    }
}
