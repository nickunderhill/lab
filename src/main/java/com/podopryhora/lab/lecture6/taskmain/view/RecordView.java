package com.podopryhora.lab.lecture6.taskmain.view;

import java.util.Locale;
import java.util.ResourceBundle;

public class RecordView {

    // Resource Bundle Installation's
    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME, new Locale("en"));
//                    MESSAGES_BUNDLE_NAME, new Locale("ua", "UA"));


    public void printText(String message) {
        System.out.println(message);
    }

    public void printLocalizedMessage(String message) {
        printText(bundle.getString(message));
    }
}
