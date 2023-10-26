package Bridge.exmple;

/**
 * @author 白日
 * @date Created in 2023/10/26 20:55
 */

public class Display {
    DisplayImpl impl;

    public Display(DisplayImpl impl){
        this.impl = impl;
    }

    public void open() {
        impl.rawOpen();
    }
    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }

    public final void display(){
        open();
        print();
        close();
    }
}
