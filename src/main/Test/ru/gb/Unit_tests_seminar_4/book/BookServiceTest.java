package ru.gb.Unit_tests_seminar_4.book;


import org.junit.jupiter.api.Test;

import java.util.*;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    @Test
    public void BookServiceTests() {
        BookRepository mockBookRepository = mock(BookRepository.class);

        List<Book> books = new ArrayList<>();
        Book book_1 = new Book("1");
        Book book_2 = new Book("2");
        books.add(book_1);
        books.add(book_2);

        when(mockBookRepository.findAll()).thenReturn(books);
        when(mockBookRepository.findById("1")).thenReturn(book_1);

        BookService bookService = new BookService(mockBookRepository);

        List<Book> test_books = bookService.findAllBooks();
        Book book = bookService.findBookById("1");

        assertEquals(2, books.size());
        assertEquals("1", book.getId());
    }
}