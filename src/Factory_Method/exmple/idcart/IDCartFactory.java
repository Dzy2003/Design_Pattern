package Factory_Method.exmple.idcart;

import Factory_Method.exmple.framework.Factory;
import Factory_Method.exmple.framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 白日
 * @date Created in 2023/10/19 16:56
 */

public class IDCartFactory extends Factory {
    private Map<String,Integer> database = new HashMap<>();
    private int serial = 1;
    @Override
    public Product createProduct(String owner) {
        return new IDCart(owner,serial++);
    }

    @Override
    public void RegisterProduct(Product product) {
        IDCart idCart = (IDCart) product;
        database.put(idCart.getOwner(),idCart.getSerial());
    }

    public Map getOwners() {
        return database;
    }
}
