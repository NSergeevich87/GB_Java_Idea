package ru.gb.Unit_tests_seminar_4.message;


import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class NotificationServiceTest {
    @Test
    public void MessageServiceTest() {
        MessageService messageServiceMock = mock(MessageService.class);

        //when(messageServiceMock.sendMessage(anyString(), anyString()));

        NotificationService notificationService = new NotificationService(messageServiceMock);

        notificationService.sendNotification("Hello", "Fatty");

        verify(messageServiceMock, times(1)).sendMessage("Hello", "Fatty");
    }
}