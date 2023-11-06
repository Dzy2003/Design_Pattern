package Decoratoe.exmple;

/**
 * @author 白日
 * @description: 测试装饰器模式
 * @since 2023/11/1 21:38
 */

public class app {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("hello,DesignPatten!");
        Display b2 = new SideBorder(b1, '*');
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();
        //生成一个由四个全部边框和一个两侧边框的字符串，并显示。
        Display b4 = new FullBorder(new SideBorder(new FullBorder(new StringDisplay("hello,DesignPatten!")), '*'));
        b4.show();
    }
}
