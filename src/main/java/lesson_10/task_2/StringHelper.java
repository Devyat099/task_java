package lesson_10.task_2;

import java.util.Random;

public class StringHelper {

    public static String generate() {
        StringBuilder sb = new StringBuilder();
        int rMin = Config.getIntegerProperty("lines.max.length");
        int rMax = Config.getIntegerProperty("lines.min.length");

        String pattern = Config.getProperty("lines.pattern");
        int linesTotal = rMin + new Random().nextInt(rMax);
        for (int i = 0; i < linesTotal; i++) {
            sb.append(pattern.charAt(new Random().nextInt(linesTotal)));
        }
        System.out.printf((Config.getProperty("lines.message")) + "%n", sb.toString());
        return sb.toString();
    }
}