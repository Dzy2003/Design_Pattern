package Chain_Of_Responsibility.exmple;

/**
 * @author 白日
 * @create 2023/11/6 21:33
 */

public class OddSupport extends Support{

    public OddSupport(String name) {
        super(name);
    }

    @Override
    public boolean resolve(Trouble trouble) {
        return trouble.getNum() % 2 != 0;
    }
}
