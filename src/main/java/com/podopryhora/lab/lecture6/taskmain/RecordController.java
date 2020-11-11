package com.podopryhora.lab.lecture6.taskmain;

import com.podopryhora.lab.lecture6.taskmain.controller.RegexConstants;
import com.podopryhora.lab.lecture6.taskmain.exception.NotUniqueEmailException;
import com.podopryhora.lab.lecture6.taskmain.model.Record;
import com.podopryhora.lab.lecture6.taskmain.model.RecordBook;
import com.podopryhora.lab.lecture6.taskmain.view.RecordView;

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
    private String readAndValidateName() {
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
    private String readAndValidateEmail() {
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
