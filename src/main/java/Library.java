import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> stock;

    public Library (int capacity){
        this.capacity = capacity;
        this.stock = new ArrayList<Book>();
    }


    public int stockCount() {
        return stock.size();
    }

    public void addBook(Book book) {
        if(isStockFull() == false) {
            stock.add(book);
        }
    }

    public boolean isStockFull() {
        if(stockCount() == capacity){
            return true;
        }
        return false;
    }

    public void lendBook(Book book){
        this.stock.remove(book);
    }


}
