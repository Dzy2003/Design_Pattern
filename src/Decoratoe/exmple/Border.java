package Decoratoe.exmple;

/**
 * @author 白日
 * @description: Display的边框装饰
 * @since 2023/11/1 21:26
 */

public abstract class Border extends Display{
    protected Display display;
    public Border(Display display) {
        this.display = display;
    }
}
