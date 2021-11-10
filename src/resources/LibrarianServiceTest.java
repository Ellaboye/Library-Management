package resources;

import com.company.service.LibrarianService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class LibrarianServiceTest {

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