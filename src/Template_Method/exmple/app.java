package Template_Method.exmple;

/**
 * @author 白日
 * @date Created in 2023/10/19 15:28
 */

public class app {
    public static void main(String[] args) {
        AbstractDisplay charDisplay = new CharDisplay('c');
        AbstractDisplay stringDisplay = new StringDisplay("Hello,World!");
        System.out.println("展示字符：");
        charDisplay.display();
        System.out.println();
        System.out.println("展示字符串：");
        stringDisplay.display();
    }
}
