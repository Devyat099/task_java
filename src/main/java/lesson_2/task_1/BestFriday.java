package lesson_2.task_1;

public class BestFriday {
    public static void main(String[] args) {
        String[] friday = {"Пятница", "это", "лучший", "день", "недели"};
        BestFriday fridayDay = new BestFriday();
        fridayDay.forCycle(friday);
        fridayDay.whileCycle(friday);
        fridayDay.foreachCycle(friday);
    }

    void forCycle(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != (array.length - 1)) {
                System.out.print(" ");
            }
        }
        System.out.print(".");
        System.out.println();
    }

    void whileCycle(String[] array) {
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i]);
            if (i != (array.length - 1)) {
                System.out.print(" ");
            }
            i++;
        }
        System.out.print(".");
        System.out.println();
    }

    void foreachCycle(String[] array) {
        int k = 0;
        for (String i : array) {
            System.out.print(i);
            if (k != (array.length - 1)) {
                System.out.print(" ");
            }
            k++;
        }
        System.out.print(".");
    }


}
