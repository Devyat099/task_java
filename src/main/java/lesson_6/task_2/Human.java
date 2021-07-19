package lesson_6.task_2;

import java.util.Map;

public class Human {
    private String lastName;
    private String firstName;
    private int age;
    private Map<PhoneType, String> phones;

    public Human(String firstName, String lastName, int age, Map<PhoneType, String> phones) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phones = phones;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Map<PhoneType, String> getPhones() {
        return phones;
    }

    public int getAge() {
        return age;
    }

    public Human setAge(int age) {
        this.age = age;
        return this;
    }


}