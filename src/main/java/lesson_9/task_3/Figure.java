package lesson_9.task_3;


public abstract class Figure implements FigureArea, FigureLength {
    protected double length;

    public double getParam() {
        return length;
    }
}