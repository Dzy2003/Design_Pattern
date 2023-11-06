package Decoratoe.exmple;

/**
 * @author 白日
 * @description: 为display装饰完整的边框
 * @since 2023/11/1 21:33
 */

public class FullBorder extends Border{
    public FullBorder(Display display) {
        super(display);
    };
    @Override
    int getColumns() {
        return display.getColumns() + 2;
    }

    @Override
    int getRows() {
        return display.getRows() + 2;
    }

    @Override
    String getRowText(int row) {
        if (row == 0 || row == getRows() - 1) {
            return makeLine(row);
        } else {
            return "|" + display.getRowText(row - 1) + "|";
        }
    }
    private String  makeLine(int row){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("+");
        for (int i = 0; i < getColumns() - 2; i++) {
            stringBuilder.append("-");
        }
        stringBuilder.append("+");
        return stringBuilder.toString();
    }
}
