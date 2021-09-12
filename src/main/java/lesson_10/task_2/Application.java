package lesson_10.task_2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) throws IOException {
        int lines_count = Config.getIntegerProperty("lines.amount");
        List<String> content = new ArrayList<>();
        for (int i = 0; i < lines_count; i++) {
            content.add(StringHelper.generate());
        }

        FileHelper.write(content);
    }
}