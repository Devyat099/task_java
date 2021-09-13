package lesson_7.task_2;
import java.util.Random;

public class Passport {
    private int series;
    private int number;

    Passport() {
        series = new Random().nextInt(9999);
        number = new Random().nextInt(999999);


    }

    @Override
    public String toString() {
    return String.format("Паспорт серия: %s, номер: %s", series, number);
    }
}