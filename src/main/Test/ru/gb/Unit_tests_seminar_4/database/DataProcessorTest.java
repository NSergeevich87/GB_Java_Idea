package ru.gb.Unit_tests_seminar_4.database;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;

class DataProcessorTest {
    @Test
    public void DataProcessorTest() {
        Database databaseMock = mock(Database.class);

        when(databaseMock.query(anyString())).thenReturn(Arrays.asList("First", "Second", "Third"));

        DataProcessor dataProcessor = new DataProcessor(databaseMock);

        List<String> dataCheck = dataProcessor.processData("select * from table");

        assertEquals(3, dataCheck.size());
    }
}