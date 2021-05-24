package lesson_2.task_7;

public class Age {
    public static void main(String[] args) {
        System.out.println(age(32));
        System.out.println(age(52));
        System.out.println(age(66));
        System.out.println(age(82));
        System.out.println(age(25));
        System.out.println(age(44));
        System.out.println(age(60));
        System.out.println(age(75));
        System.out.println(age(23));
        System.out.println(age(119));
    }

    static String age(int age) {
        String years;
        if (age >= 25 && age < 44)
            years = age + " -" + " молодой возраст";
        else if (age >= 44 && age < 60)
            years = age + " -" + " средний возраст";
        else if (age >= 60 && age < 75)
            years = age + " -" + " пожилой возраст";
        else if (age >= 75 && age < 90)
            years = age + " -" + " старческий возраст";
        else years = age + " -" + " неизвестный программе возраст";
        return years;
    }
}
