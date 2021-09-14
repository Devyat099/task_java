package lesson_6.task_3;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Application {
    public static void main(String[] args) {
        Scholar scholar = new Scholar();
        Map<DayOfWeek, List<Lesson>> diary = new TreeMap<>();
        for (DayOfWeek day : DayOfWeek.values()) {
            diary.put(day, Lesson.generateLessons());
        }
        scholar.setDiary(diary);

        for (Map.Entry<DayOfWeek, List<Lesson>> dayEntry : scholar.getDiary().entrySet()) {
            StringBuilder format = new StringBuilder();
            format.append(dayEntry.getKey().getDay()).append(":");
            for (Lesson lesson : dayEntry.getValue()) {
                format.append(", ").append(lesson.getLessonName());
            }
            String formattedString = format.toString().replaceFirst(",", "");
            System.out.println(formattedString);
        }

        Map<Lesson, Integer> lessonCounters = new HashMap<>();
        for (Lesson lesson : Lesson.values())
            lessonCounters.put(lesson, 0);
        for (List<Lesson> lessons : scholar.getDiary().values()) {
            for (Lesson lesson : lessons) {
                lessonCounters.put(lesson, lessonCounters.get(lesson) + 1);
            }

        }
        System.out.printf("%n");
        int maxLesson = Collections.max(lessonCounters.values());
        int minLesson = Collections.min(lessonCounters.values());
        for (int i = maxLesson; i >= minLesson; i--) {
            for (Map.Entry<Lesson, Integer> entry : lessonCounters.entrySet()) {
                if (entry.getValue() == i)

                    System.out.printf("%s: %d%n", entry.getKey().getLessonName(), entry.getValue());
            }
        }
    }
}
