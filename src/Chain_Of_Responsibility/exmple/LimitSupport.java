package Chain_Of_Responsibility.exmple;

/**
 * @author 白日
 * @create 2023/11/6 21:31
 */

public class LimitSupport extends Support{
    private int limit;
    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    public boolean resolve(Trouble trouble) {
        return trouble.getNum() < limit;
    }
}
