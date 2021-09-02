package lesson_5.task_5;

import java.util.Arrays;

public class PassportBase {
    private static Passport[] passports = new Passport[0];

    public static void addPassport(Passport passport) {
        if (passports.length == 0) {
            passports = Arrays.copyOf(passports, passports.length + 1);
            passports[0] = passport;
            return;
        }
        passports = Arrays.copyOf(passports, passports.length + 1);
        passports[passports.length - 1] = passport;
    }

    public static boolean passportAllReadyExist(String series, String number) {
        for (Passport passport : passports) {
            String actualPassportSeries = passport.getSeries();
            String actualPassportNumber = passport.getNumber();

            if (actualPassportSeries.equals(series) && actualPassportNumber.equals(number)) {
                throw new PassportAlreadyExistsException();
            }
        }
        return false;
    }
}