package com.podopryhora.lab.lecture1.task1;

public class Model {
    String message;

    public String getMessage() {
        return message;
    }

    public void constructMessage(String... words) {
        message = String.join(" ", words);
    }
}
