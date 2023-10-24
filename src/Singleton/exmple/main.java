package Singleton.exmple;

/**
 * @author 白日
 * @date Created in 2023/10/19 17:52
 */

public class main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if(obj1 == obj2){
            System.out.println("生成了同一个实例");
        }else{
            System.out.println("生成了两个不同的实例");
        }
    }
}
