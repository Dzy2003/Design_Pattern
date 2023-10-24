package Singleton.exmple;

/**
 * @author 白日
 * @date Created in 2023/10/19 17:50
 */

public class Singleton {
    private static final Singleton singleton = new Singleton();
    private Singleton(){
        System.out.println("生成了一个实例。");
    }
    public static Singleton getInstance(){
        return singleton;
    }
}
