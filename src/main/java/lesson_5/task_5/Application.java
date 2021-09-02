package lesson_5.task_5;

public class Application {
    public static void main(String[] args) {
        try {
            Passport passport = newPassport("1234", "567890");

        } catch (PassportSeriesArgumentException pasae) {
            System.out.println("Введите верные значения серии и номера паспорта");
        } catch (PassportNumberArgumentException pnae) {
            System.out.println("Введите верные значения серии и номера паспорта");
        } catch (PassportSeriesNullPointerException psnpe) {
            System.out.println("Введите верные значения серии и номера паспорта");
        } catch (PassportNumberNullPointerException pnnpe) {
            System.out.println("Введите верные значения серии и номера паспорта");
        } catch (PassportAlreadyExistsException paee) {
            System.out.println("Данные серия и номер паспорта уже существуют");
        }
    }

    public static Passport newPassport(String series, String number) {
        Passport passport = new Passport(series, number);
        return passport;
    }
}