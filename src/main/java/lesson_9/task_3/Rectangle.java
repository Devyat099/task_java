package lesson_9.task_3;

public class Rectangle extends TwoParameterFigure {

    public double getArea() {
        return (length * length2);
    }


    public int getLength() {
        return (int) (2 * (length + length2));
    }
}