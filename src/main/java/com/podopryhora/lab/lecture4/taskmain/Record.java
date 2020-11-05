package com.podopryhora.lab.lecture4.taskmain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Record {
    private String lastName;
    private String firstName;
    private String middleName;
    private String initials;
    private String nickname;
    private String comment;
    private RecordGroup recordGroup;
    private String phone;
    private String mobilePhone;
    private String mobilePhone2;
    private String email;
    private String skype;
    private Address address;
    LocalDate creationDate;
    LocalDate lastChange;


    public String getInitials() {
        return String.format("%s %s.", lastName, firstName.substring(0,1));
    }

}

enum RecordGroup {
    group1,
    group2
}
