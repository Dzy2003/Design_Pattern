package Adapter.exmple.has;

/**
 * @author 白日
 * @date Created in 2023/10/16 20:58
 */

public class Banner {
    private String s;

    public Banner(String s){
        this.s = s;
    }

    public void showWithParen(){
        System.out.println(new StringBuilder().append("(").append(s).append(")"));
    }

    public void showWithAster(){
        System.out.println(new StringBuilder().append("*").append(s).append("*"));
    }
}
