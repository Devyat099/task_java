package lesson_9.task_3;

import java.util.Random;

public abstract class OneParameterFigure extends Figure {
    public OneParameterFigure() {
        this.length = new Random().nextInt(10) + 1;
    }
}