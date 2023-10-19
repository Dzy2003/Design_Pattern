package Template_Method.exmple;

/**
 * @author 白日
 * @date Created in 2023/10/19 15:25
 */

public class StringDisplay extends AbstractDisplay{
    private String s;
    private int width;
    public StringDisplay(String s){
        this.s = s;
        this.width = s.length();
    }
    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.print("|");
        System.out.print(s);
        System.out.println("|");
    }

    @Override
    public void close() {
        printLine();
    }
    private void printLine(){
        System.out.print("+");
        for (int i = 0; i < width; i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}
