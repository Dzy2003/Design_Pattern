package Prototype.exmple;

import Prototype.exmple.framework.Product;

/**
 * @author 白日
 * @date Created in 2023/10/23 10:26
 */

public class MassageBox implements Product {
    private char borderChar;

    public MassageBox(char borderChar) {
        this.borderChar = borderChar;
    }

    @Override
    public void use(String s) {
        int width = s.getBytes().length;
        printLine(width);
        System.out.println("*" + s + "*");
        printLine(width);
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

    private void printLine(int width){
        for (int i = 0; i < width; i++){
            System.out.print(borderChar);
        }
        System.out.println();
    }
}
