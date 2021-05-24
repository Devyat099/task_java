package lesson_2.task_8;

public class OutA {
    public static void main(String[] args) {
        outA(-1);
        System.out.println();
        outA(2);
        System.out.println();
        outA(4);
        System.out.println();
        outA(7);
        System.out.println();
        outA(0);
        System.out.println();
    }

    static void outA(int a) {
        switch (a) {
            default:
                System.out.print("A");
            case 4:
                System.out.print("A");
            case 3:
                System.out.print("A");
            case 2:
                System.out.print("A");
            case 1:
                System.out.print("A");
        }
    }
}
