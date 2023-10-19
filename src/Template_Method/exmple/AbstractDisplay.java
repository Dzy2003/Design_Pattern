package Template_Method.exmple;

/**
 * @author 白日
 * @date Created in 2023/10/19 15:18
 */

public abstract class AbstractDisplay {
    protected abstract void open();

    protected abstract void print();

    protected abstract void close();

    public final void display(){
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
