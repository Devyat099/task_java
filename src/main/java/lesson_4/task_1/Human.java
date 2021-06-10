package lesson_4.task_1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    private String lastName;
    private String firstName;
    private Date birthday;

    String LAST_NAME = " фамилии";
    String FIRST_NAME = " имени";
    String BIRTH_DATE = " даты рождения";
    SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");

    public void setFirstName(String firstName) {
        if (firstName.matches("^[А-Я][а-я]{2,}$")) {
            this.firstName = firstName;
            setCorrectPrint(FIRST_NAME, firstName);
        } else {
            setIncorrectPrint(firstName);
        }
    }

    public void setLastName(String lastName) {
        if (lastName.matches("^[А-Я][а-я]{2,}$")) {
            this.lastName = lastName;
            setCorrectPrint(LAST_NAME, lastName);
        } else {
            setIncorrectPrint(lastName);
        }
    }

    public void setBirthDate(Date birthDate) {
        Date today = new Date();
        if (birthDate.before(today)) {
            this.birthday = birthDate;
            setCorrectPrint(BIRTH_DATE, DATE_FORMAT.format(birthDate));
        } else {
            setIncorrectPrint(DATE_FORMAT.format(birthDate));
        }
    }

    public void setCorrectPrint(String type, String value) {
        System.out.println("Установлено корректное значение" + type + ": " + value);
    }

    private void setIncorrectPrint(String value) {
        System.out.println("Введенное значение некорректно: " + value);
    }
}