package com.podopryhora.lab.lecture4.taskmain;

public class Constants {

    // REGEX
    public final static String REGEX_NAME_UA = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{2,20}";

    public final static String REGEX_NAME_EN = "^[a-zA-Z]{2,20}";

    public final static String REGEX_EMAIL = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

    public final static String REGEX_COMMENT = ".{3,1000}";

    public final static String REGEX_PHONE = "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$";

    public final static String REGEX_SKYPE = "^[a-zA-Z][a-zA-Z0-9_.,-]{5,31}$";

    public final static String REGEX_ZIP = "[0-9]+{4,10}";

    public final static String REGEX_CITY = "^[a-zA-Z]{2,20}";

    public final static String REGEX_STREET = "^[a-zA-Z0-9.]{2,50}";

    public final static String REGEX_HOUSE = "^[a-zA-Z0-9./]{1,10}";

    public final static String REGEX_APARTMENT = "^[a-zA-Z0-9.]{1,10}";

    // Messages
    public static final String MSG_WRONG_EMAIL_FORMAT = "Wrong format! Email should match pattern \"login@domain.com\"";
    public static final String MSG_WRONG_NAME_FORMAT_EN = "Wrong format! Enter between 2 and 20 latin letters";
    public static final String MSG_WRONG_NAME_FORMAT_UA = "Невірний формат. Введіть від 2 до 20 україньких літер";
    public static final String MSG_SUCCESS_EN = "Record Added!";
    public static final String MSG_ENTER_NAME_EN = "Please, enter your name (2-20 latin letters):";
    public static final String MSG_ENTER_LAST_NAME_EN = "Please, enter your last name (2-20 latin letters):";
    public static final String MSG_ENTER_EMAIL_EN = "Please, enter your email:";
}
