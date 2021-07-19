package lesson_6.task_2;

import java.util.Random;

public class Chance {

    public static Boolean calculateChance(int rand) {
        int chance = new Random().nextInt(120);
        return chance <= rand;
    }
}