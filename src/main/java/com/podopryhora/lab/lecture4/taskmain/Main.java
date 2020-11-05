package com.podopryhora.lab.lecture4.taskmain;

public class Main {

    public static void main(String[] args) {
        RecordView recordView = new RecordView();
        Record record = new Record();
        RecordController controller = new RecordController(recordView, record);

        controller.start();
    }
}
