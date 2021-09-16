package lesson_9.task_2;

public class Generator {
    public static int iteration = 1;

    public static Object generate() {
        if (iteration > 4)
            iteration = 1;
        switch (iteration) {
            case (1):
                iteration++;
                return new Square();
            case (2):
                iteration++;
                return new Circle();
            case (3):
                iteration++;
                return new Table();
            case (4):
                iteration++;
                return new Box();
        }
        throw new IllegalArgumentException();
    }
}

