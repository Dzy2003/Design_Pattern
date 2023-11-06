package Decoratoe.exmple;

/**
 * @author 白日
 * @description: 为Display添加边框
 * @since 2023/11/1 21:28
 */

public class SideBorder extends Border{
    private char BorderChar;
    public SideBorder(Display display, char ch) {
        super(display);
        this.BorderChar = ch;
    }
    @Override
    int getColumns() {
        return display.getColumns() + 2;
    }

    @Override
    int getRows() {
        return display.getRows();
    }

    @Override
    String getRowText(int row) {
        return BorderChar + display.getRowText(row) + BorderChar;
    }
}
