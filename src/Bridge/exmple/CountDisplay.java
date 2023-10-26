package Bridge.exmple;

/**
 * @author 白日
 * @date Created in 2023/10/26 21:02
 */

public class CountDisplay extends Display{

    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }
    public void multiDisplay(int n){
        open();
        for (int i = 0; i < n; i++) {
            print();
        }
        close();
    }

}
