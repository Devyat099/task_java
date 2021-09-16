package lesson_9.task_3;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Figure> figure = new ArrayList<>();
        for (int i = 0; i < 18; i++) {
            figure.add(Generator.generateFigure());
        }

        for (Figure x : figure) {
        if (x instanceof TwoParameterFigure) {
            TwoParameterFigure opf = (TwoParameterFigure) x;
            System.out.printf("Класс фигуры %s: Длина %.1f, Площадь %.1f %n",
                    opf.getClass().getSimpleName(),
                    opf.getParam(),
                    opf.getLength2());
        }
        }
    }
}