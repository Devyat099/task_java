package lesson_5.task_2;

public class Application {
    public static void main(String[] args) {
        Cat cat0 = new Cat("Барс", 0);
        Cat cat1 = new Cat("Тигр", 1);
        Cat cat3 = new Cat("Угн", 3);
        Cat cat4 = new Cat("test", 4);
        Cat[] cats = {cat0, cat1, null, cat3, cat4};

        for (Cat Cats : cats) {
            try {
                System.out.printf("Имя: %s, Возраст: %d%n", Cats.getName(), Cats.getAge());
            } catch (NullPointerException e) {
                System.out.println("Ошибка: Null");
            }
        }

    }
}