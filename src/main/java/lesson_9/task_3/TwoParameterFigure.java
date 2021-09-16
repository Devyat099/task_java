package lesson_9.task_3;

import java.util.Random;

public abstract class TwoParameterFigure extends Figure {
    protected double length2;

    public double getLength2() {
        return length2;
    }

    public TwoParameterFigure() {
        this.length = new Random().nextInt(10);
        this.length2 = new Random().nextInt(10);
    }
}