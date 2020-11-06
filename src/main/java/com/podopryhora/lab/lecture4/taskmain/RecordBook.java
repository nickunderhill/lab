package com.podopryhora.lab.lecture4.taskmain;

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
}
