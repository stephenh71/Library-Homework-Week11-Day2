import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowed;

    public Borrower (String name){
        this.name = name;
        this.borrowed = new ArrayList<Book>();
    }


    public int borrowedCount() {
        return borrowed.size();
    }

    public void borrowBook(Library library, Book book) {
        if (library.stockCount() > 0) {
            borrowed.add(book);
            library.lendBook(book);
        }
    }
}
