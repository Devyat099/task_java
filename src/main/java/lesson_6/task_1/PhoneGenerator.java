package lesson_6.task_1;

public class PhoneGenerator {
    public static String phoneGenerator() {
        String phone = new StringBuilder()
                .append("+7")
                .append("(")
                .append(phoneNumber())
                .append(phoneNumber())
                .append(phoneNumber())
                .append(")")
                .append(phoneNumber())
                .append(phoneNumber())
                .append(phoneNumber())
                .append(phoneNumber())
                .append(phoneNumber())
                .append(phoneNumber())
                .append(phoneNumber()).toString();
        return phone.toString();
    }

    private static int phoneNumber() {
        int randomNumber = (int) (Math.random() * 8);
        return randomNumber;
    }
}