package lesson_4.task_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Application {
        public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        public static void main(String[] args) throws ParseException {
            Human human = new Human();
            human.setLastName("Иванов");
            human.setLastName("Ива");
            human.setLastName("Иванoв");
            human.setLastName("ИВАНОВ");
            human.setLastName("Иванoв1");
            human.setLastName("%%");
            System.out.println();

            human.setFirstName("Петр");
            human.setFirstName("Пет");
            human.setFirstName("Петp");
            human.setFirstName("ПЕТР");
            human.setFirstName("Петр1");
            human.setFirstName("??");
            System.out.println();

            human.setBirthDate(dateFormat.parse("12.04.1990"));
            human.setBirthDate(dateFormat.parse("09.06.2021"));
            human.setBirthDate(dateFormat.parse("15.05.1990"));
            human.setBirthDate(dateFormat.parse("30.06.2021"));
        }
    }

