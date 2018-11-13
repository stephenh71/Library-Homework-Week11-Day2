import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {
    
    Library library;
    Book book;
    Borrower borrower;
    private ArrayList<Book> stock;
    
    
    @Before
    public void setUp(){
        library = new Library(2);
        book = new Book ("Jaws", "Peter Benchely", "Fiction");
        borrower = new Borrower ("Stephen");
    }

    @Test
    public void numberOfBooks() {
        assertEquals(0, library.stockCount());
    }

    @Test
    public void addBookSpareCapacity() {
        library.addBook(book);
        assertEquals(1,library.stockCount());
    }

    @Test
    public void addBookAboveCapacity() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(2,library.stockCount());
    }

    @Test
    public void isStockFullFalse() {
        assertEquals(false, library.isStockFull());
    }

    @Test
    public void isStockFullTrue() {
        library.addBook(book);
        library.addBook(book);
        assertEquals(true, library.isStockFull());
    }

    @Test
    public void lendBook() {
        library.addBook(book);
        library.addBook(book);
        borrower.borrowBook(library, book);
        assertEquals(1,library.stockCount());
    }


}
    


