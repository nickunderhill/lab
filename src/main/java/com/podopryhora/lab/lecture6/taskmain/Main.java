package com.podopryhora.lab.lecture6.taskmain;

import com.podopryhora.lab.lecture6.taskmain.model.Record;
import com.podopryhora.lab.lecture6.taskmain.model.RecordBook;
import com.podopryhora.lab.lecture6.taskmain.view.RecordView;

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
