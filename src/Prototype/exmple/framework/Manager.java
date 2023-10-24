package Prototype.exmple.framework;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 白日
 * @date Created in 2023/10/23 10:22
 */

public class Manager {
    private Map<String, Product> showcase = new HashMap<>();

    public void register(String name, Product product){
        showcase.put(name, product);
    }

    public Product create(String name){
        return showcase.get(name).createClone();
    }
}
