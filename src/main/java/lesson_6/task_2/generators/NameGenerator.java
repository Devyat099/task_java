package lesson_6.task_2.generators;

import java.util.Random;

public class NameGenerator {
    public static String nameGenerate() {
        int nameLength = 2 + (int) (Math.random() * 7);
        StringBuilder name = new StringBuilder();
        name.append(BigCharName());

        for (int i = 0; i < nameLength; i++)
            name.append(SmallCharName());
        return name.toString();
    }

    public static char SmallCharName() {
        Random r = new Random();
        int c = r.nextInt(1) + 'а';
        return (char) c;
    }

    public static char BigCharName() {
        Random r = new Random();
        int c = r.nextInt(1) + 'А';
        return (char) c;
    }

}