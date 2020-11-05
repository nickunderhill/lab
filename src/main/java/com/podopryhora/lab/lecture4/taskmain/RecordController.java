package com.podopryhora.lab.lecture4.taskmain;

import java.util.Scanner;

public class RecordController {

    private final RecordView recordView;
    private final Record record;
    private final Scanner scanner = new Scanner(System.in);

    public RecordController(RecordView recordView, Record record) {
        this.recordView = recordView;
        this.record = record;
    }

    public void start() {
    }
}
