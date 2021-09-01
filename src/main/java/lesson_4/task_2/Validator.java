package lesson_4.task_2;

public class Validator {

    public static void validatorFormatString(String stringForCheck) {

        if (!stringForCheck.matches("(^\\w+\\s?\\w+\\s?\\w*)|(^\\s\\s)$")) {
            System.out.println("Пробелов > 2");
        }
    }

    public static String[] stringSplit(String stringForSplit) {
        String[] stringArray = stringForSplit.split(" ");
        return stringArray;
    }

    public static boolean humanCheck(Human human) {

        if (human.getFirstName() == null) {
            return false;
        }
        if (human.getBirthDay() == null) {
            return false;
        }
        if (human.getSecondName() == null) {
            return false;
        }
        return true;
    }

    public static boolean arrayIsFullCheck(Human[] humans) {
        boolean isFull = false;

        for (Human human : humans) {
            if (human != null) {
                isFull = true;
                break;
            }
        }
        return isFull;
    }
}