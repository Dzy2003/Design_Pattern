package Iterator;

import java.util.ArrayList;

/**
 * @author 白日
 * @date Created in 2023/10/15 21:52
 */

public class BookShelf implements Aggregate<Book>{
    ArrayList<Book> books;
    int last = 0;

    public BookShelf(int shelfSize){
        books = new ArrayList(shelfSize);
    }

    public void appendBook(Book book){
        books.add(book);
        last++;
    }

    public int getLength(){
        return last;
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
