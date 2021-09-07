package lesson_8.task_3;

public abstract class Terminal implements TopUpBalance {

    String address;
    Company company;
    double commission;
    double zeroCommission;

    @Override
    public void pay(String phone, double amount) {
        double payment = amount >= zeroCommission ? amount : amount * (1d - commission / 100);
        System.out.printf("Внесена сумма %.1f для пополнения телефона %s. Баланс пополнен на сумму %.1f. С уважением, ваш %s, %s%n", amount, phone, payment, company.getName(), address);
    }

    public Terminal(String address) {
        this.address = address;
    }
}