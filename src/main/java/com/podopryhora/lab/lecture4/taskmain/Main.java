package com.podopryhora.lab.lecture4.taskmain;

public class Main {

    public static void main(String[] args) {
        RecordView recordView = new RecordView();
        RecordBook recordBook = new RecordBook();
        RecordController controller = new RecordController(recordView, recordBook);

        controller.processInput();
    }
}
