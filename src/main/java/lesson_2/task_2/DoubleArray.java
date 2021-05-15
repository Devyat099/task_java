package lesson_2.task_2;

public class DoubleArray {
    public static void main(String[] args) {
        DoubleArray newArray = new DoubleArray();
        int[][] doubleArray = new int[8][8];
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                doubleArray[x][y] = (x + y) % 2;
            }
        }
        newArray.forCycle(doubleArray);
        newArray.whileCycle(doubleArray);
        newArray.foreachCycle(doubleArray);
    }

    void forCycle(int[][] array) {
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                System.out.print(array[x][y]);
            }
            System.out.println();
        }
        System.out.println();
    }

    void whileCycle(int[][] array) {
        int x = 0;
        while (x < 8) {
            int y = 0;
            while (y < 8) {
                System.out.print(array[x][y]);
                y++;
            }
            System.out.println();
            x++;
        }
    }
        void foreachCycle(int[][] array) {
            for (int row[] : array) {
                for (int number : row) {
                    System.out.print(number);
                }
                System.out.println();
            }

            System.out.println();
        }
    }