package lesson_1.tasks;

public class task_5 {

    boolean one(boolean a, boolean b) {
        return !(a | b);

    }

    boolean two(boolean a, boolean b) {
        return !a & !b;
    }

    public static void main(String[] args) {
        task_5 bool = new task_5();
        // Выполнение первого метода:
        System.out.println("Первый метод: ");
        System.out.println(bool.one(false, false));
        System.out.println(bool.one(false, true));
        System.out.println(bool.one(true, false));
        System.out.println(bool.one(true, true));
        // Выполнение второго метода:
        System.out.println("Второй метод: ");
        System.out.println(bool.two(false, false));
        System.out.println(bool.two(false, true));
        System.out.println(bool.two(true, false));
        System.out.println(bool.two(true, true));
    }

}