package lesson_4.task_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Human {

    private String firstName;
    private String secondName;
    private LocalDate birthDay;

    // Типыы полей класса
    private final String FIRST_NAME = "имени";
    private final String SECOND_NAME = "фамилии";
    private final String BIRTH_DAY = "даты рождения";

    public void setFirstName(String firstName) {
        if (firstName.matches("\\b[А-ЯЁ]?[а-яё]*\\b") && firstName.length() >= 3) {
            setCorrectPrint(FIRST_NAME, firstName);
            this.firstName = firstName;
        } else {
            setIncorrectPrint(firstName);
        }
    }

    public void setSecondName(String secondName) {
        if (secondName.matches("\\b[А-ЯЁ]?[а-яё]*\\b") && secondName.length() >= 3) {
            setCorrectPrint(SECOND_NAME, secondName);
            this.secondName = secondName;
        } else {
            setIncorrectPrint(secondName);
        }
    }

    public void setBirthDay(String birthDay) {
        final DateTimeFormatter BIRTHDAY_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate = LocalDate.parse(birthDay, BIRTHDAY_FORMATTER);

        if (localDate.isBefore(LocalDate.now())) {
            this.birthDay = localDate;
            setCorrectPrint(BIRTH_DAY, this.birthDay.format(BIRTHDAY_FORMATTER));
        } else {
            setIncorrectPrint(localDate.format(BIRTHDAY_FORMATTER));
        }
    }

    public String getFirstName() {
        getPrint(FIRST_NAME, firstName);
        return firstName;
    }

    public String getSecondName() {
        getPrint(SECOND_NAME, secondName);
        return secondName;
    }

    public String getBirthDay() {
        if (birthDay != null) {
            final DateTimeFormatter BIRTHDAY_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            getPrint(BIRTH_DAY, birthDay.format(BIRTHDAY_FORMATTER));
            return birthDay.format(BIRTHDAY_FORMATTER);
        }
        getPrint(BIRTH_DAY, null);
        return null;
    }

    public void getPrint(String typeOfPrint, String print) {
        System.out.printf("Получено значение %s: %s%n", typeOfPrint, print);
    }

    public void setCorrectPrint(String typeOfCorrectPrint, String correctPrint) {
        System.out.printf("Установлено корректное значение %s: %s%n", typeOfCorrectPrint, correctPrint);
    }

    public void setIncorrectPrint(String incorrectPrint) {
        System.out.printf("Введенное значение некорректно: %s%n", incorrectPrint);
    }
}