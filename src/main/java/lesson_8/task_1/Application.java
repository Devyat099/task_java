package lesson_8.task_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            persons.add(new Person());
        }

        List<Person> personEq = new ArrayList<>();
        for (int i = 0; i < persons.size(); i++) {
            for (int j = i + 1; j < persons.size(); j++) {
                if (persons.get(i).equals(persons.get(j)))
                    personEq.add(persons.get(i));
            }
        }

        for (Person persona : personEq) {
            System.out.println(persona);
        }

        Set<Person> setPersons = new HashSet<>();
        for (int i = 0; i < 2000; i++) {
            setPersons.add(new Person());
        }

        System.out.println(setPersons.size());
    }
}