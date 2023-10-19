package Adapter.exmple.is;

/**
 * @author 白日
 * @date Created in 2023/10/16 21:06
 */

public class PrintBanner extends Banner implements Print{

    public PrintBanner(String s) {
        super(s);
    }
    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
