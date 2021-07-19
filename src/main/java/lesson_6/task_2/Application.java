package lesson_6.task_2;

import lesson_6.task_2.generators.HumanGenerator;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;


public class Application {
    public static void main(String[] args) {
        Set<Human> humans = new HashSet<>();
        for (int i = 0; i < 2000; i++) {
            humans.add(HumanGenerator.humanGenerator());
        }

        Iterator<Human> iterator = humans.iterator();
        while (iterator.hasNext()) {
            Human human = iterator.next();

            Set<PhoneType> phoneType = human.getPhones().keySet();
            if (phoneType.contains(PhoneType.HOME) &&
                    phoneType.contains(PhoneType.MOBILE) &&
                    phoneType.contains(PhoneType.WORK)) {
                System.out.printf("%s %s, возраст %d, тел: дом. %s, моб. %s, раб. %s%n",
                        human.getLastName(),
                        human.getFirstName(),
                        human.getAge(),
                        human.getPhones().get(PhoneType.HOME),
                        human.getPhones().get(PhoneType.MOBILE),
                        human.getPhones().get(PhoneType.WORK));
            }
        }
    }
}