package Factory_Method.exmple;

import Factory_Method.exmple.framework.Factory;
import Factory_Method.exmple.framework.Product;
import Factory_Method.exmple.idcart.IDCartFactory;

/**
 * @author 白日
 * @date Created in 2023/10/19 17:04
 */

public class app {
    public static void main(String[] args) {
        Factory factory = new IDCartFactory();
        Product owner1 = factory.create("小红");
        Product owner2 = factory.create("小明");
        Product owner3 = factory.create("小刚");
        owner1.use();
        owner2.use();
        owner3.use();
    }
}
