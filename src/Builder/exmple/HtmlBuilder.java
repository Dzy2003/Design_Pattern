package Builder.exmple;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 白日
 * @date Created in 2023/10/25 20:54
 */

public class HtmlBuilder extends Builder{
    private String filename;
    private PrintWriter printWriter;
    @Override
    void makeTitle(String title) {
        filename = title + ".html";
        try {
            printWriter = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        printWriter.println("<html><head><title>" + title + "</title></head><body>");
        printWriter.println("<h1>" + title + "</h1>");
    }

    @Override
    void makeString(String str) {
        printWriter.println("<p>" + str + "</p>");
    }

    @Override
    void makeItem(String[] items) {
        printWriter.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            printWriter.println("<li>" + items[i] +" <li>");
        }
        printWriter.println("</ul>");
    }

    @Override
    void close() {
        printWriter.println("</body></html>");
        printWriter.close();
    }
    public String getResult(){
        return filename;
    }
}
