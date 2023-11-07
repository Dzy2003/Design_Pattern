package Chain_Of_Responsibility.exmple;

/**
 * @author 白日
 * @create 2023/11/6 21:18
 */

public class NoSupport extends Support{
    public NoSupport(String name) {
        super(name);
    }

    @Override
    public boolean resolve(Trouble trouble) {
        return false;
    }
}
