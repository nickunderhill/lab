package com.podopryhora.lab.lecture6.taskmain.controllers;

import com.podopryhora.lab.lecture6.taskmain.constants.RegexConstants;
import com.podopryhora.lab.lecture6.taskmain.constants.TextConstants;
import com.podopryhora.lab.lecture6.taskmain.exceptions.NotUniqueEmailException;
import com.podopryhora.lab.lecture6.taskmain.models.Record;
import com.podopryhora.lab.lecture6.taskmain.models.RecordBook;
import com.podopryhora.lab.lecture6.taskmain.views.RecordView;

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
        String email = null;

        recordView.printLocalizedMessage(TextConstants.MSG_ENTER_NAME);
        firstName = readAndValidateName();

        recordView.printLocalizedMessage(TextConstants.MSG_ENTER_LAST_NAME);
        lastName = readAndValidateName();

        while (true) {
            recordView.printLocalizedMessage(TextConstants.MSG_ENTER_EMAIL);
            try {
                email = readAndValidateEmail();
                break;
            } catch (NotUniqueEmailException e) {
                System.out.println(e.getMessage());
            }
        }

        record.setFirstName(firstName);
        record.setLastName(lastName);
        record.setEmail(email);

        recordBook.addRecord(record);

        recordView.printLocalizedMessage(TextConstants.MSG_SUCCESS);
        recordBook.getRecordsBook().forEach(r -> recordView.printText(r.toString()));
    }

    /**
     * Validates user input name/surname against regex.
     *
     * @return valid name String
     */
    public String readAndValidateName() {
        String result;
        while (!(scanner.hasNext() && (result = scanner.next()).matches(RegexConstants.REGEX_NAME_EN))) {
            recordView.printLocalizedMessage(TextConstants.MSG_WRONG_NAME_FORMAT);
        }
        return result;
    }

    /**
     * Validates user input email against regex.
     *
     * @return valid email String
     */
    public String readAndValidateEmail() {
        String result;
        while (!(scanner.hasNext() && (result = scanner.next()).matches(RegexConstants.REGEX_EMAIL))) {
            recordView.printLocalizedMessage(TextConstants.MSG_WRONG_EMAIL_FORMAT);
        }
        if (!recordBook.isUniqueEmail(result)) {
            throw new NotUniqueEmailException("This email is already in use");
        }
        return result;
    }

}
