package com.podopryhora.lab.lecture6.taskmain.model;

import java.time.LocalDate;

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
    private LocalDate creationDate;
    private LocalDate lastChange;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Method returns lastName field concatenated with space followed by first letter of firstName with period.
     * E.g, for lastName = "Doe", firstName "John" should be returned "Doe J.".
     * @return String
     */
    public String getInitials() {
        return String.format("%s %s.", lastName, firstName.substring(0, 1));
    }

    @Override
    public String toString() {
        return "{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

enum RecordGroup {
    group1,
    group2
}
