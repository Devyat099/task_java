package lesson_2.task_6;
import java.util.Random;


public class TwoArray {
    public static void main(String[] args) {
        Random random = new Random();
        final int m = random.nextInt(3) + 3;
        final int c = random.nextInt(3) + 3;

        int[][] one = new int[m][c];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < c; j++) {
                one[i][j] = random.nextInt(10);
                System.out.print(one[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        int[][] fin = new int[c][m];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < m; j++) {
                fin[i][j] = one[j][i];
                System.out.print(fin[i][j]);
            }
            System.out.println();
        }
    }
}
