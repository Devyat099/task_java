package lesson_6.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum Lesson {
    ENGLISH("Английский"),
    PHYSICS("Физика"),
    MUSIC("Музыка"),
    BIOLOGY("Биология"),
    HISTORY("История");

    private String lessonName;

    Lesson(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getLessonName() {
        return lessonName;
    }

    public static List<Lesson> generateLessons() {
        List<Lesson> lessons = new ArrayList<>();
        int count = 4 + new Random().nextInt(2);
        for (int i = 0; i < count; i++) {
            lessons.add(values()[new Random().nextInt(3)]);
        }
        return lessons;
    }
}
