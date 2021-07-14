package lesson_5.task_4;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Cat[] cats = new Cat[10];
        for (int i = 0; i < 10; i++) {
            try {
                cats[i] = new Cat("New Cat", new Random().nextInt(100) - 80);
            } catch (AgeTooHighException age) {
                cats[i] = null;
                System.out.println("Слишком большой возраст для кота");
            }
        }
        System.out.println("Коты:");
        for (Cat cat : cats) {
            try {
                System.out.printf("Имя: %s, Возраст: %d%n", cat.getName(), cat.getAge());
            } catch (NullPointerException nullpoint) {
                System.out.println("Ошибка ввода данных");
            }
        }
    }
}