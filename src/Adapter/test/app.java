package Adapter.test;

import java.io.IOException;

/**
 * @author 白日
 * @date Created in 2023/10/16 22:13
 */

public class app {
    public static void main(String[] args) throws IOException {
        FileIO fileProperties = new FileProperties();
        fileProperties.readFromFile("src/Adapter/test/file.txt");
        //fileProperties.setValue("year", "2004");
        fileProperties.setValue("mouth", "4");
        fileProperties.setValue("day", "21");
        //fileProperties.writeFromFile("src/Adapter/test/newFile.txt");
        System.out.println(fileProperties.getValue("year"));
    }
}
