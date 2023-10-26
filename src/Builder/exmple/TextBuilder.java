package Builder.exmple;

/**
 * @author 白日
 * @date Created in 2023/10/24 22:08
 */

public class TextBuilder extends Builder{
    StringBuilder stringBuilder = new StringBuilder();
    @Override
    void makeTitle(String title) {
        stringBuilder.append("=========================\n");
        stringBuilder.append("【" + title +"】\n" );
        stringBuilder.append("\n");
    }

    @Override
    void makeString(String str) {
        stringBuilder.append("*" + str + "\n");
    }

    @Override
    void makeItem(String[] items) {
        for (int i = 0; i < items.length; i++) {
            stringBuilder.append("   " + items[i] + "\n");
        }
        stringBuilder.append("\n");
    }

    @Override
    void close() {
        stringBuilder.append("===================");
    }

    String getResult() {
        return stringBuilder.toString();
    }
}
