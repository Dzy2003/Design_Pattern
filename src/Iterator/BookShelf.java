package Iterator;

/**
 * @author 白日
 * @date Created in 2023/10/15 21:52
 */

public class BookShelf implements Aggregate<Book>{
    Book[] books;
    int last = 0;

    public BookShelf(int shelfSize){
        books = new Book[shelfSize];
    }

    public void appendBook(Book book){
        books[last++] = book;
    }

    public int getLength(){
        return last;
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
