package lesson_9.task_1;

import java.util.Random;

public class Factory {

    public static Car make() {
        int random = new Random().nextInt(100);
        if (random >= 0 && random < 40)
            return new Renault();
        if (random >= 40 && random < 70)
            return new Nissan();
        if (random >= 70 && random < 90)
            return new Mitsubishi();
        if (random >= 90)
            return new Mercedes();
        throw new IllegalStateException();
    }
}