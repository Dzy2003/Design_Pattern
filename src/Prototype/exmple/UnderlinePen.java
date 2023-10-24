package Prototype.exmple;

import Prototype.exmple.framework.Product;

/**
 * @author 白日
 * @date Created in 2023/10/23 10:20
 */

public class UnderlinePen implements Product {
    private char underLineChar;

    public UnderlinePen(char underLineChar) {
        this.underLineChar = underLineChar;
    }

    @Override
    public void use(String s) {
        System.out.println(s);
        for(int i = 0; i < s.length(); i++){
            System.out.print(underLineChar);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        Product product = null;
        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}
