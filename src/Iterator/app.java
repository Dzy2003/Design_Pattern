package Iterator;

/**
 * @author 白日
 * @date Created in 2023/10/15 22:05
 */

public class app {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(5);
        bookShelf.appendBook(new Book("罪与罚"));
        bookShelf.appendBook(new Book("月亮与六便士"));
        bookShelf.appendBook(new Book("罗生门"));
        bookShelf.appendBook(new Book("局外人"));
        Iterator<Book> iterator = bookShelf.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }
    }
}
