package Adapter.test;

import java.io.*;
import java.util.Properties;

/**
 * @author 白日
 * @date Created in 2023/10/16 22:03
 */

public class FileProperties implements FileIO{
    Properties properties;

    public FileProperties() {
        this.properties = new Properties();
    }

    @Override
    public void readFromFile(String filename) throws IOException {
        InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
        properties.load(reader);
    }

    @Override
    public void writeFromFile(String filename) throws IOException {
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(filename));
        properties.store(writer,"");
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key,value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
