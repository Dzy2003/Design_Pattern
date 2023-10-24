package Prototype.exmple;

import Prototype.exmple.framework.Manager;
import Prototype.exmple.framework.Product;

/**
 * @author 白日
 * @date Created in 2023/10/23 10:37
 */

public class app {
    public static void main(String[] args) {
        //将实例注册到Manager中管理
        Manager manager = new Manager();
        manager.register("underlinePen", new UnderlinePen('_'));
        manager.register("massageBox", new MassageBox('*'));
        //获取到clone实例并使用
        Product underlinePen = manager.create("underlinePen");
        Product massageBox = manager.create("massageBox");
        underlinePen.use("Hello, World!");
        massageBox.use("Hello, World!");
    }
}
