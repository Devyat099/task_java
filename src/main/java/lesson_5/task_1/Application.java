package lesson_5.task_1;

import java.util.Random;

public class Application {
    public static void main(String[] args)  {
        int m = new Random().nextInt(5) + 5;
        int n = new Random().nextInt(5) + 5;

        int[] dividends = new int[m];
        int[] dividers = new int[n];
        int[][] result = new int[n][m];

        for (int i = 0; i < m; i++) {
            dividends[i] = new Random().nextInt(4) + 5;
        }
        for (int i = 0; i < n; i++) {
            dividers[i] = new Random().nextInt(3);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                try {
                    result[j][i] = dividends[i] / dividers[j];
                } catch (ArithmeticException ex) {
                    result[j][i] = -1;
                }
            }
        }
        System.out.println("Входные данные dividend[]");
        for (int dividend1 : dividends)
            System.out.print(dividend1 + " ");
        System.out.println();

        System.out.println("Входные данные divider[]");
        for (int divider1 : dividers)
            System.out.print(divider1 + " ");
        System.out.println();

        System.out.println("Полученный результат");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[j][i] + " ");
            }
            System.out.println();
        }
    }
}