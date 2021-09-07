package lesson_8.task_3;

public class QiwiTerminal extends Terminal {

    public QiwiTerminal(String address) {
        super(address);
        company = Company.QIWI;
        commission = 7;
        zeroCommission = 1000;
    }
}