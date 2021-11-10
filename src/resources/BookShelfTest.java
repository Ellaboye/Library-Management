package resources;

import com.company.service.LibrarianService;
import com.company.utils.BookShelf;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class BookShelfTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Queries map for book")
    void getBook() throws IOException {
        BookShelf bookShelf = new BookShelf();
        assertEquals("Sorry book not Available",bookShelf.getBook("Decagon handbook"));
        assertEquals("8 still available",bookShelf.getBook("the great gatsby"));
    }

    static class LibrarianServiceTest {

        @BeforeEach
        void setUp() {
        }

        @Test
        @DisplayName("Lends book by first come first serve")
        void lendBookByPriority() throws IOException {
            LibrarianService librarianService = new LibrarianService("john", "012");
            assertEquals("book available", librarianService.lendBookFirstComeFirstServe.lendBookByPriorityAndQueue());
        }
        @Test
        @DisplayName("Lends book by priority")
        void lendBookFirstComeFirstServe() throws IOException {
            LibrarianService librarianService = new LibrarianService("peter","042");
            assertEquals("book not available", librarianService.lendBookByPriority.lendBookByPriorityAndQueue());
            // String actualResult = librarianService.lendBookFirstComeFirstServe();
        }
    }
}