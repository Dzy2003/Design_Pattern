package Iterator;

/**
 * @author 白日
 * @date Created in 2023/10/15 21:57
 */

public class BookShelfIterator implements Iterator<Book>{
    private int index;
    private BookShelf bookShelf;
    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
        index = 0;
    }
    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Book next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
