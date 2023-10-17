package Adapter.exmple.has;

/**
 * @author 白日
 * @date Created in 2023/10/16 21:11
 */

public class PrintBanner implements Print{
    Banner banner;

    public PrintBanner(String s) {
        banner = new Banner(s);
    }

    @Override
    public void printWeak() {
        banner.showWithAster();
    }

    @Override
    public void printStrong() {
        banner.showWithParen();
    }
}
