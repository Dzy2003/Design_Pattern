package Factory_Method.exmple.idcart;

import Factory_Method.exmple.framework.Product;

/**
 * @author 白日
 * @date Created in 2023/10/19 16:57
 */

public class IDCart extends Product {
    String owner;

    IDCart(String owner){
        this.owner = owner;
        System.out.println(owner + "的IDCart制作好了");
    }

    @Override
    public void use() {
        System.out.println(owner + "的IDCart被使用了");
    }

    public String getOwner() {
        return owner;
    }
}
