package com.podopryhora.lab.lecture4.taskmain;

import java.util.Scanner;

public class RecordController {

    private final RecordView recordView;
    private final RecordBook recordBook;
    private final Scanner scanner = new Scanner(System.in);
    private Record record;

    public RecordController(RecordView recordView, RecordBook recordBook) {
        this.recordView = recordView;
        this.recordBook = recordBook;
    }

    public void processInput() {
        Record record = new Record();
        String firstName;
        String lastName;
        String email;

        recordView.printMessage(Constants.MSG_ENTER_NAME_EN);
        firstName = readAndValidateInputString(Constants.MSG_WRONG_NAME_FORMAT_EN, Constants.REGEX_NAME_EN);

        recordView.printMessage(Constants.MSG_ENTER_LAST_NAME_EN);
        lastName = readAndValidateInputString(Constants.MSG_WRONG_NAME_FORMAT_EN, Constants.REGEX_NAME_EN);

        recordView.printMessage(Constants.MSG_ENTER_EMAIL_EN);
        email = readAndValidateInputString(Constants.MSG_WRONG_EMAIL_FORMAT, Constants.REGEX_EMAIL);

        record.setFirstName(firstName);
        record.setLastName(lastName);
        record.setEmail(email);

        recordBook.getRecordsBook().add(record);

        recordView.printMessage(Constants.MSG_SUCCESS_EN);
        recordBook.getRecordsBook().forEach(r -> recordView.printMessage(r.toString()));
    }

    private String readAndValidateInputString(String errorMessage, String regex) {
        String result;
        while (!(scanner.hasNext() && (result = scanner.next()).matches(regex))) {
            recordView.printMessage(errorMessage);
        }
        return result;
    }
}
