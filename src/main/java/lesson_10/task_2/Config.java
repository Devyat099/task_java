package lesson_10.task_2;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

    static Properties properties = new Properties();
    static {
        try {
            properties.load(new FileInputStream("C:/Users/devya/IdeaProjects/Java//src/main/java/lesson_10/task_2/application.properties"));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private static Boolean getBooleanProperty(String key, Boolean defaultValue) {
        return Boolean.parseBoolean(properties.getProperty(key));
    }

    static Integer getIntegerProperty(String key) {
        return Integer.parseInt(properties.getProperty(key));
    }

    static String getProperty(String key) {
        return properties.getProperty(key);
    }
}