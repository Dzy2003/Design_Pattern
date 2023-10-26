package Bridge.exmple;

/**
 * @author 白日
 * @date Created in 2023/10/26 21:03
 */

public class StringDisplayImpl implements DisplayImpl{
    private String s;
    private int width;
    public StringDisplayImpl(String s){
        this.s = s;
        this.width = s.length();
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.print("|");
        System.out.print(s);
        System.out.println("|");
    }

    @Override
    public void rawClose() {
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
