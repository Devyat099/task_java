package lesson_6.task_1;

public class AgeGenerator {
    public static int ageGenerator() {
        int age = 20 + (int) (Math.random() * 55);
        return age;
    }
}