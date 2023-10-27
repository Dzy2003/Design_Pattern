package Strategy.exmple;

/**
 * @author 白日
 * @date Created in 2023/10/27 16:45
 */

public class Context {

    OperationStrategy strategy;
    public Context(OperationStrategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return strategy.doOperation(a, b);
    }

}
