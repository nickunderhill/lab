package com.podopryhora.lab.lecture4.taskmain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecordTest {
    Record record = new Record();

    @Test
    void getInitials() {
        record.setLastName("Doe");
        record.setFirstName("John");

        assertEquals("Doe J.",record.getInitials());
        assertNotEquals("John D.",record.getInitials());
    }
}