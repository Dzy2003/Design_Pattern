package Adapter.exmple.has;

/**
 * @author 白日
 * @date Created in 2023/10/16 21:09
 */

public class app {
    public static void main(String[] args) {
        Print print = new PrintBanner("Hello World!");
        print.printWeak();
        print.printStrong();
    }
}
