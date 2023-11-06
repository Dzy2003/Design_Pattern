package Decoratoe.exmple;

/**
 * @author 白日
 * @description: 显示单行字符串的内容
 * @since 2023/11/1 21:19
 */

public class StringDisplay extends Display{
    private String str;
    public StringDisplay(String str){
        this.str = str;
    }
    @Override
    int getColumns() {
        return str.length();
    }

    @Override
    int getRows() {
        return 1;
    }

    @Override
    String getRowText(int row) {
        //当row为0时返回值
        return row == 0? str : null;
    }
}
