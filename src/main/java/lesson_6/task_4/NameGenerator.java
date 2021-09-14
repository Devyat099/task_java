package lesson_6.task_4;

import java.util.Random;

public class NameGenerator {
    private static final String SYMBOL = "qazwsxedcrfvtgbyhnujmikolp";

    public static String generate() {
        StringBuilder randomString = new StringBuilder();
        int length = 1 + new Random().nextInt(1);
        for (int i = 0; i < length; i++) {
            randomString.append(SYMBOL.charAt(new Random().nextInt(SYMBOL.length())));
        }
        return randomString.toString();
    }
}