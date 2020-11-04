package com.podopryhora.lab.lection1.task1;

public class View {

    public static final String INPUT_PROMPT = "Please, enter \"%s\":";
    public static final String HELLO = "Hello";
    public static final String WORLD = "world";

    public void printResultMessage(String message) {
        System.out.println(message + "!");
    }

    public void printPromptMessage(String message, String input) {
        System.out.println(String.format(message, input));
    }
}
