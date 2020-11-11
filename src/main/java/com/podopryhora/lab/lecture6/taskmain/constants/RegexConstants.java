package com.podopryhora.lab.lecture6.taskmain.constants;

public class RegexConstants {

    public final static String REGEX_NAME_UA = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{2,20}";
    public final static String REGEX_NAME_EN = "^[a-zA-Z]{2,20}";
    public final static String REGEX_EMAIL = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
    public final static String REGEX_COMMENT = ".{3,1000}";
    public final static String REGEX_PHONE = "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$";
    public final static String REGEX_SKYPE = "^[a-zA-Z][a-zA-Z0-9_.,-]{5,31}$";
    public final static String REGEX_ZIP = "[0-9]+{4,10}";
    public final static String REGEX_CITY = "^[a-zA-Z]{2,20}";
    public final static String REGEX_STREET = "^[a-zA-Z0-9.]{2,50}";
    public final static String REGEX_HOUSE = "^[a-zA-Z0-9./]{1,10}";
    public final static String REGEX_APARTMENT = "^[a-zA-Z0-9.]{1,10}";
}
