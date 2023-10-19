package Factory_Method.exmple.idcart;

import Factory_Method.exmple.framework.Product;

/**
 * @author 白日
 * @date Created in 2023/10/19 16:57
 */

public class IDCart extends Product {
    private String owner;
    private int serial;

    IDCart(String owner,int serial){
        this.owner = owner;
        this.serial = serial;
        System.out.println(owner + "的IDCart制作好了！编号为：" + serial);
    }

    @Override
    public void use() {
        System.out.println(owner + "的IDCart被使用了!编号为：" + serial);
    }

    public String getOwner() {
        return owner;
    }
    public int getSerial() {
        return serial;
    }
}
