package lesson_2.task_3;

public class TelephoneNumber {
    public static void main(String[] args) {
        TelephoneNumber phone = new TelephoneNumber();
        System.out.println(phone.matches("+7(910)423-73-12"));
        System.out.println(phone.matches("7(910)423-73-12"));
        System.out.println(phone.matches("89215310934"));
        System.out.println(phone.matches("+5(911)310-12-74"));
    }
    boolean matches(String telephoneNumber) {
        return telephoneNumber.matches("^\\+7\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$");
    }

}
