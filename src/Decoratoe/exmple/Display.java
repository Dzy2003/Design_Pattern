package Decoratoe.exmple;

/**
 * @author 白日
 * @discription: 显示字符的接口
 * @since 2023/11/1 21:10
 */

public abstract class Display {
    abstract int getColumns();
    abstract int getRows();
    abstract String getRowText(int row);
    final void show(){
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
