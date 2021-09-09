package lesson_10.task_1;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Application {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("src/main/java/lesson_10/task_1/input.txt");
        File outputFile = new File("src/main/java/lesson_10/task_1/output.txt");
        FileHelper.readFile(inputFile);

        Map<String, String> content = FileHelper.readFile(inputFile);

        FileHelper.saveFile(outputFile, content);
    }
}