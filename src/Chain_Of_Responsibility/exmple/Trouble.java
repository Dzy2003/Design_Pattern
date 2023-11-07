package Chain_Of_Responsibility.exmple;

/**
 * @author 白日
 * @create 2023/11/6 21:08
 */

public class Trouble {
    private int num;

    public Trouble(int num) {
        this.num = num;
    }
    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Trouble[" +
                "num=" + num +
                ']';
    }
}
