package com.podopryhora.lab.lecture6.taskmain.model;

import com.podopryhora.lab.lecture6.taskmain.exception.NotUniqueEmailException;

import java.util.ArrayList;
import java.util.List;

public class RecordBook {
    private List<Record> recordsBook = new ArrayList<>();

    public List<Record> getRecordsBook() {
        return recordsBook;
    }

    public void setRecordsBook(List<Record> recordsBook) {
        this.recordsBook = recordsBook;
    }

    public void addRecord(Record record) throws NotUniqueEmailException {
        recordsBook.add(record);
    }

    public boolean isUniqueEmail(String email) {
        for (Record r : recordsBook) {
            if (r.getEmail().equals(email)) {
                return false;
            }
        }
        return true;
    }

    public void initTestValues() {
        Record record = new Record();
        record.setFirstName("John");
        record.setLastName("Doe");
        record.setEmail("john@gmail.com");
        recordsBook.add(record);
    }
}
