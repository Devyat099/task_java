package lesson_5.task_5;

public class Passport {
    private String series;
    private String number;

    public Passport(String series, String number) throws PassportIllegalArgumentException, NullPointerException, PassportAlreadyExistsException {
        if (PassportBase.passportAllReadyExist(series, number)) {
            throw new PassportAlreadyExistsException();
        }
        setSeries(series);
        setNumber(number);
        PassportBase.addPassport(this);
    }

    public String getSeries() {
        return series;
    }

    public Passport setSeries(String series) {
        if (series == null) {
            throw new PassportSeriesNullPointerException();
        }
        if (series.matches("^\\d{2}\\s\\d{2}$")) {
            this.series = series;
            return this;
        }
        throw new PassportSeriesArgumentException();
    }

    public String getNumber() {
        return number;
    }

    public Passport setNumber(String number) {
        if (number == null) {
            throw new PassportNumberNullPointerException();
        }
        if (number.matches("^\\d{6}$")) {
            this.number = number;
            return this;
        }
        throw new PassportNumberArgumentException();
    }
}