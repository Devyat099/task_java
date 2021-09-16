package lesson_9.task_3;

public class Generator {
    public static int iteration = 1;

    public static Figure generateFigure(){
        if (iteration == 1) {
            iteration++;
            return new Rectangle();
        }
        return null;
    }
}