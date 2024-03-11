package ru.gb.Unit_tests_seminar_4.hotel;


import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class BookingServiceTest {

    @Test
    public void BookingServiceTest() {
        HotelService hotelServiceMock = mock(HotelService.class);

        when(hotelServiceMock.isRoomAvailable(anyInt())).thenAnswer(i -> (Integer) i.getArgument(0) % 2 == 0);

        BookingService bookingService = new BookingService(hotelServiceMock);

        assertTrue(bookingService.bookRoom(2));
        assertFalse(bookingService.bookRoom(3));

        verify(hotelServiceMock, times(2)).isRoomAvailable(anyInt());
    }
}