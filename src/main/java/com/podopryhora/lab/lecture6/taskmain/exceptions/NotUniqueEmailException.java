package com.podopryhora.lab.lecture6.taskmain.exceptions;

public class NotUniqueEmailException extends RuntimeException {
    public NotUniqueEmailException(String message) {
        super(message);
    }
}
