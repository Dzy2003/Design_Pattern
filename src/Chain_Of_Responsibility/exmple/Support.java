package Chain_Of_Responsibility.exmple;

/**
 * @author 白日
 * @create 2023/11/6 21:09
 */

public abstract class Support {
    private String name;
    private Support next;
    public Support(String name) {
        this.name = name;
    }
    public Support setNext(Support next) {
        this.next = next;
        return next;
    }
    public void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if(next != null) {
            next.support(trouble);
        }else{
            fail(trouble);
        }
    }
    protected void done(Trouble trouble) {
        System.out.println(trouble.toString() + "被" + name + "解决");
    }
    protected void fail(Trouble trouble) {
        System.out.println(trouble.toString() + " 没有人能够解决");
    }
    public abstract boolean resolve(Trouble trouble);

}
