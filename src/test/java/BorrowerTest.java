import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;
    private ArrayList<Book> borrowed;

    @Before
    public void setUp() {
        borrower = new Borrower("Stephen");
        library = new Library(2);
        book = new Book("Jaws", "Peter Benchely", "Fiction");
    }

    @Test
    public void numberOfBorrowBooks() {
        assertEquals(0, borrower.borrowedCount());
    }

    @Test
    public void borrowBookLibraryHasNoStock() {
        borrower.borrowBook(library, book);
        assertEquals(0, borrower.borrowedCount());
    }

    @Test
    public void borrowBookLibraryHasStock() {
        library.addBook(book);
        borrower.borrowBook(library, book);
        assertEquals(1, borrower.borrowedCount());
    }
}