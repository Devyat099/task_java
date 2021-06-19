package lesson_5.task_3;

import java.util.Random;

public class Application {

    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;
        int total = random.nextInt(1000);

        for (int i = 0; i <= total; i++) {
            int m = random.nextInt(4);
            int n = random.nextInt(4);
            try {
                int j = m / n;
            } catch (ArithmeticException error) {
                count++;
            }
        }
        System.out.printf("Из %d операций деления %d было выполнено с ошибкой", total, count);
    }
}