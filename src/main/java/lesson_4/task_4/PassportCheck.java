package lesson_4.task_4;

import java.util.Arrays;

public class PassportCheck{

    private static Passport[] passports = new Passport[0];

    public static void addPassport(Passport passport) {

        if (passports.length == 0) {
            passports = Arrays.copyOf(passports, 1);
            passports[0] = passport;
            System.out.println("Пасспорт успешно добавлен.");
            return;
        }

        passports = Arrays.copyOf(passports, passports.length + 1);
        passports[passports.length - 1] = passport;
        System.out.println("Пасспорт успешно добавлен.");
    }

    public static boolean isPassportExist(String series, String number) {

        for (Passport passport : passports) {
            String actualPassportSeries = passport.getSeries();
            String actualPassportNumber = passport.getNumber();

            if (actualPassportSeries == null || actualPassportNumber == null)
                continue;

            if (actualPassportSeries.equals(series) && actualPassportNumber.equals(number)) {
                System.out.println("Паспорт с такой серией или номером уже существуют.");
                return true;
            }
        }
        return false;
    }
}