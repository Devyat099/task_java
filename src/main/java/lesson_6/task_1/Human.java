package lesson_6.task_1;

public class Human {
    String surname;
    String name;
    String phone;
    int age;

    protected Human(String surname, String name, String phone, int age) {
        this.surname = surname;
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }
}