package lesson_6.task_1;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Human> humanz = new ArrayList<>();

        for (int i = 0; i < 500; i++) {
            String surname = NameGenerator.nameGenerate();
            String name = NameGenerator.nameGenerate();
            int age = AgeGenerator.ageGenerator();
            String phone = PhoneGenerator.phoneGenerator();
            Human human = new Human(surname, name, phone, age);
            humanz.add(human);
        }

        for (Human human : humanz) {
            if (human.getAge() == 35)
                System.out.printf
                        ("%s %s, возраст %d, телефон %s%n",
                                human.getSurname(),
                                human.getName(),
                                human.getAge(),
                                human.getPhone());
        }
    }
}