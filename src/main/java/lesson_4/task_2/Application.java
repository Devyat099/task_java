package lesson_4.task_2;


public class Application {
    public static void main(String[] args) {
        Validator.validatorFormatString("пробел пробел пробел пробел ");

        String[] array = Validator.stringSplit("");

        Human human = new Human();
        human.setFirstName("Владимир");
        human.setSecondName("Петраков");

        System.out.println(Validator.humanCheck(human));

        Human[] humans = new Human[2];

        System.out.println(Validator.arrayIsFullCheck(humans));

        for (int i = 0; i < humans.length; i++) {
            humans[i] = new Human();
            humans[i].setFirstName("Иван" + i);
            humans[i].setSecondName("Владимир" + i);
            humans[i].setBirthDay("10.12.2020");

        }

        System.out.println(Validator.arrayIsFullCheck(humans));
    }
}