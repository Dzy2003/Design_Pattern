package Factory_Method.exmple.framework;

/**
 * @author 白日
 * @date Created in 2023/10/19 16:50
 */

/**
 *
 */
public abstract class Factory {

    public abstract Product createProduct(String owner);

    public abstract void RegisterProduct(Product product);

    public Product create(String owner){
        Product product = createProduct(owner);
        RegisterProduct(product);
        return product;
    }
}
