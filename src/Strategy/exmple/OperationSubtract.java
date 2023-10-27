package Strategy.exmple;

/**
 * @author 白日
 * @date Created in 2023/10/27 16:51
 */

public class OperationSubtract implements OperationStrategy{
    @Override
    public int doOperation(int a, int b) {
        return a / b;
    }
}
