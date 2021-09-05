package lesson_8.task_1;

import java.util.Objects;
import java.util.Random;

public class Person {
    public String firstName;
    public String lastName;

    public Person() {
        this.firstName = "\"Имя-" + (new Random().nextInt(20)) + "\"";
        this.lastName = "\"Фамилия-" + (new Random().nextInt(20)) + "\"";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person person = (Person) obj;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public String toString() {
        return "Фамилия: " + lastName + ", Имя: " + firstName;
    }
}