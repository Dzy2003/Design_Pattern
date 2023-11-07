package Chain_Of_Responsibility.exmple;

/**
 * @author 白日
 * @create 2023/11/6 21:34
 */

public class SpecialSupport extends Support{
    private int num;
    public SpecialSupport(String name,int num) {
        super(name);
        this.num = num;
    }

    @Override
    public boolean resolve(Trouble trouble) {
        return num == trouble.getNum();
    }
}
