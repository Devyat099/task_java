package lesson_7.task_4;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        double amount = 300_000d;
        double rate = 16.9d;
        int duration = 12;

        BaseCredit baseCredit = new BaseCredit(amount, rate, duration);
        BaseCredit differentiate = new DifferentiateCredit(amount, rate, duration);
        BaseCredit annuity = new AnnuityCredit(amount, rate, duration);

        List<Double> basePay = baseCredit.getMonthPayments();
        List<Double> differPay = differentiate.getMonthPayments();
        List<Double> annuityPay = annuity.getMonthPayments();

        for (int i = 0; i < annuityPay.size(); i++) {
            System.out.printf("%d: %.2f %.2f %.2f%n", i, basePay.get(i),
                    differPay.get(i), annuityPay.get(i));
        }
        System.out.printf("Переплата составляет:%n %.2f  %.2f  %.2f",
                baseCredit.overPay(), differentiate.overPay(), annuity.overPay());


    }
}