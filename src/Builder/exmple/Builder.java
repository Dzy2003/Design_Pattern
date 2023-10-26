package Builder.exmple;

/**
 * @author 白日
 * @date Created in 2023/10/24 21:11
 */

public abstract class Builder {

    abstract void makeTitle(String title);

    abstract void makeString(String str);

    abstract void makeItem(String[] items);

    abstract void close();
}
