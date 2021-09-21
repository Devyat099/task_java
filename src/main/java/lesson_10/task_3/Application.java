package lesson_10.task_3;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        Generator generator = new FileGen(10);
        generator.generate();
    }

}
