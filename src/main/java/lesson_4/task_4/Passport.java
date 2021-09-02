package lesson_4.task_4;

public class Passport {
    private String series;
    private String number;

    public Passport() {
        PassportCheck.addPassport(this);
    }

    public Passport setSeries(String series) {
        if (series.matches("^\\d{4}$")) {
            if (PassportCheck.isPassportExist(series, number)) {
                return this;
            }
            this.series = series;
            return this;
        } else
            return this;
    }

    public Passport setNumber(String number) {
        if (number.matches("^\\d{6}$")) {
            if (PassportCheck.isPassportExist(series, number)) {
                return this;
            }
            this.number = number;
            return this;
        } else
            return this;
    }

    public String getSeries() {
        return series;
    }

    public String getNumber() {
        return number;
    }
}