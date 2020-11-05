package com.podopryhora.lab.lecture4.taskmain;

public class Main {

    public static void main(String[] args) {
        RecordView recordView = new RecordView();
        RecordController controller = new RecordController(recordView);

        controller.start();
    }
}
