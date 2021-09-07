package lesson_8.task_3;

public class TinkoffTerminal extends Terminal {


    public TinkoffTerminal(String terminalAddress) {
        super(terminalAddress);
        company = Company.TINKOFF;
        commission = 9;
        zeroCommission = 600;

    }

    @Override
    public void pay(String phone, double amount) {
        if (amount >= 100) {
            super.pay(phone, amount);
        } else {
            System.out.println("Баланс не пополнен. Пополните баланс более чем на 100 рублей");
        }
    }
}