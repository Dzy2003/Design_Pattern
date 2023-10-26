package Bridge.exmple;

/**
 * @author 白日
 * @date Created in 2023/10/26 21:07
 */

public class app {
    public static void main(String[] args) {
        Display display = new Display(new StringDisplayImpl("Hello World!"));
        display.display();
        CountDisplay countDisplay = new CountDisplay(new StringDisplayImpl("Hello World!"));
        countDisplay.multiDisplay(5);
    }
}
