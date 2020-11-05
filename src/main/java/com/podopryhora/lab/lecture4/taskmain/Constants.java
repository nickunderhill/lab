package com.podopryhora.lab.lecture4.taskmain;

public class Constants {

    // REGEX
    public final static String REGEX_NAME_UA = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{2,20}";

    public final static String REGEX_NAME_EN = "^[a-zA-Z]{2,20}";

    public final static String REGEX_EMAIL = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

    public final static String REGEX_NICKNAME = "";

    public final static String REGEX_COMMENT = "";

    public final static String REGEX_PHONE = "";

    public final static String REGEX_MOBILE_PHONE = "";

    public final static String REGEX_SKYPE = "";

    public final static String REGEX_ZIP = "";

    public final static String REGEX_CITY = "";

    public final static String REGEX_STREET = "";

    public final static String REGEX_HOUSE = "";

    public final static String REGEX_APARTMENT = "";

    // Messages
    public static final String MSG_WRONG_EMAIL_FORMAT = "Wrong format! Email should match pattern \"login@domain.com\"";
    public static final String MSG_WRONG_NAME_FORMAT_EN = "Wrong format! Enter between 2 and 20 latin letters";
    public static final String MSG_WRONG_NAME_FORMAT_UA = "Невірний формат. Введіть від 2 до 20 україньких літер";
    public static final String MSG_SUCCESS_EN = "Record Added!";
    public static final String MSG_ENTER_NAME_EN = "Please, enter your name (2-20 latin letters):";
    public static final String MSG_ENTER_LAST_NAME_EN = "Please, enter your last name (2-20 latin letters):";
    public static final String MSG_ENTER_EMAIL_EN = "Please, enter your email:";
}
