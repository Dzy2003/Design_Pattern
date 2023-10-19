package Template_Method.exmple;

/**
 * @author 白日
 * @date Created in 2023/10/19 15:23
 */

public class CharDisplay extends AbstractDisplay{
    private char ch;
    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.print(">>");
    }
}
