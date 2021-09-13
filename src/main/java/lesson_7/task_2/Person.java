package lesson_7.task_2;

import java.util.Random;

public class Person {
    private String firstName;
    private String lastName;

    public static class NameGenerator {
        public static String generate() {
            Random random = new Random();
            StringBuilder name = new StringBuilder();

            name.append((char) (random.nextInt(32) + 'А'));
            for (int i = 0; i < 5; i++) {
                name.append((char) (random.nextInt(32) + 'а'));
            }
            return name.substring(1);
        }
    }


    Person() {
        firstName = NameGenerator.generate();
        lastName = NameGenerator.generate();
    }
    @Override
    public String toString() {
        return String.format("Имя: %s, Фамилия: %s", firstName, lastName);
    }
}