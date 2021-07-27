package lesson_7.task_4;

import java.util.ArrayList;
import java.util.List;

public class BaseCredit {
    double amount;
    double rate;
    int duration;

    public BaseCredit(double amount, double rate, int duration) {
        this.amount = amount;
        this.rate = rate;
        this.duration = duration;
    }

    public List<Double> getMonthPayments() {
        List<Double> month = new ArrayList<>();
        for (int i = 0; i < duration; i++) {
            month.add(amount / duration);
        }
        return month;
    }

    public Double overPay() {
        Double amount = 0d;
        for (Double Pay : getMonthPayments()) {
            amount += Pay;
        }
        return amount - this.amount;
    }
}