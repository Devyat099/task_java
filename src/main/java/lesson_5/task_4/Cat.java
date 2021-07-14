package lesson_5.task_4;

import java.util.Objects;

public class Cat {
    private String name;
    private int age;

    Cat(String name, int age) throws AgeTooHighException {
        try {
            if (age < 0)
                throw new AgeUnderZeroException();
            if (age > 20)
                throw new AgeTooHighException();
            this.name = name;
            this.age = age;
        } catch (AgeUnderZeroException exception) {
            StackTraceElement element = exception.getStackTrace()[0];
            System.out.println(element);
        }
    }

    public String getName() {
        if (name == null) throw new NullPointerException();
        return name;
    }

    public int getAge() {
        return age;
    }
}
