package com.podopryhora.lab.lecture4.taskmain;

import java.util.Scanner;

public class RecordController {

    private final RecordView recordView;
    private final RecordBook recordBook;
    private final Scanner scanner = new Scanner(System.in);

    public RecordController(RecordView recordView, RecordBook recordBook) {
        this.recordView = recordView;
        this.recordBook = recordBook;
    }

    /**
     * Processes user's input from console. If all input data is valid - saves it to AddressBook.
     */
    public void processInput() {
        Record record = new Record();
        String firstName;
        String lastName;
        String email;

        recordView.printLocalizedMessage(TextConstants.MSG_ENTER_NAME);
        firstName = readAndValidateInputString(TextConstants.MSG_WRONG_NAME_FORMAT, RegexConstants.REGEX_NAME_EN);

        recordView.printLocalizedMessage(TextConstants.MSG_ENTER_LAST_NAME);
        lastName = readAndValidateInputString(TextConstants.MSG_WRONG_NAME_FORMAT, RegexConstants.REGEX_NAME_EN);

        recordView.printLocalizedMessage(TextConstants.MSG_ENTER_EMAIL);
        email = readAndValidateInputString(TextConstants.MSG_WRONG_EMAIL_FORMAT, RegexConstants.REGEX_EMAIL);

        record.setFirstName(firstName);
        record.setLastName(lastName);
        record.setEmail(email);

        recordBook.getRecordsBook().add(record);

        recordView.printLocalizedMessage(TextConstants.MSG_SUCCESS);
        recordBook.getRecordsBook().forEach(r -> recordView.printText(r.toString()));
    }

    /**
     * Validates user input using given regex and returns errorMessage if input doesn't match.
     * @param errorMessage - message to return in case of not valid input
     * @param regex - regular expression to validate input
     * @return valid String
     */
    private String readAndValidateInputString(String errorMessage, String regex) {
        String result;
        while (!(scanner.hasNext() && (result = scanner.next()).matches(regex))) {
            recordView.printLocalizedMessage(errorMessage);
        }
        return result;
    }
}
