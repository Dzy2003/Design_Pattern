package Factory_Method.exmple.idcart;

import Factory_Method.exmple.framework.Factory;
import Factory_Method.exmple.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 白日
 * @date Created in 2023/10/19 16:56
 */

public class IDCartFactory extends Factory {
    ArrayList<String> owners = new ArrayList<>();
    @Override
    public Product createProduct(String owner) {
        return new IDCart(owner);
    }

    @Override
    public void RegisterProduct(Product product) {
        IDCart idCart = (IDCart) product;
        owners.add(idCart.getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
