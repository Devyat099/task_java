package lesson_10.task_2;

import java.nio.file.Paths;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.List;

public class FileHelper {

    public static void write(List<String> content) throws IOException {
        Path path = Paths.get(Config.getProperty("output.file"));
        OutputStream os = new FileOutputStream(String.valueOf(path));
        String fullString = String.join(",", content.toString());
        byte[] outputContent = fullString.getBytes(StandardCharsets.UTF_8);
        os.write(outputContent);
        os.flush();
        os.close();
    }

}