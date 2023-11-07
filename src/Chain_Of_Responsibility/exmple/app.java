package Chain_Of_Responsibility.exmple;

/**
 * @author 白日
 * @create 2023/11/7 16:09
 */

public class app {
    public static void main(String[] args) {
        LimitSupport ming = new LimitSupport("小明",20);
        NoSupport ben = new NoSupport("小笨");
        OddSupport hong = new OddSupport("小红");
        SpecialSupport gang = new SpecialSupport("小刚", 99);
        ming.setNext(ben).setNext(hong).setNext(gang);
        for (int i = 0; i < 100; i++) {
            ming.support(new Trouble(i));
        }
    }
}
