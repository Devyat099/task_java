package lesson_8.task_2;

import java.util.HashSet;
import java.util.Set;

public class Application {

    public static void main(String[] args) {
        for (int count = 10; count <= 30; count++) {
            int duble = 0;

            for (int i = 0; i < 100_000; i++) {
                Set<Person> persons = new HashSet<>();
                for (int j = 0; j < count; j++) {
                    persons.add(new Person());
                }
                if (persons.size() != count) {
                    duble++;
                }
            }
            double chance = (100f * duble) / 100000;
            System.out.printf("%d: %.2f%%%n", count, chance);

        }
    }
}