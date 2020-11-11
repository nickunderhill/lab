package com.podopryhora.lab.lecture6.taskmain;

import com.podopryhora.lab.lecture6.taskmain.controllers.RecordController;
import com.podopryhora.lab.lecture6.taskmain.models.Record;
import com.podopryhora.lab.lecture6.taskmain.models.RecordBook;
import com.podopryhora.lab.lecture6.taskmain.views.RecordView;

public class Main {

    public static void main(String[] args) {
        RecordView recordView = new RecordView();
        RecordBook recordBook = new RecordBook();
        recordBook.initTestValues();
        RecordController controller = new RecordController(recordView, recordBook);
        for (Record r:recordBook.getRecordsBook()
             ) {
            System.out.println(r.toString());
        }
        controller.processInput();
    }
}
