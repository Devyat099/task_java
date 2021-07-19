package lesson_6.task_2.generators;

import lesson_6.task_2.Chance;
import lesson_6.task_2.Human;
import lesson_6.task_2.PhoneType;

import java.util.HashMap;
import java.util.Map;

public class HumanGenerator {
    public static Human humanGenerator() {
        String lastName = NameGenerator.nameGenerate();
        String firstName = NameGenerator.nameGenerate();
        int age = AgeGenerator.ageGenerator();
        Map<PhoneType, String> phones = new HashMap<>();

        for (int i = 0; i < PhoneType.values().length; i++) {
            if (Chance.calculateChance(20)) {
                PhoneType phoneType = PhoneType.values()[i];
                phones.put(phoneType, PhoneGenerator.phoneGenerator());
            }
        }
        return new Human(lastName, firstName, age, phones);
    }
}
