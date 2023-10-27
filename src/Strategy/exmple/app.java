package Strategy.exmple;

/**
 * @author 白日
 * @date Created in 2023/10/27 16:52
 */

public class app {
    public static void main(String[] args) {
        System.out.println(new Context(new OperationAdd()).executeStrategy(10, 5));
        System.out.println(new Context(new OperationMultiply()).executeStrategy(10, 5));
        System.out.println(new Context(new OperationSubtract()).executeStrategy(10, 5));
    }
}
