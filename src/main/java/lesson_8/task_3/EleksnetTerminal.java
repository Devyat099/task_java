package lesson_8.task_3;

public class EleksnetTerminal extends Terminal {
    public EleksnetTerminal(String address) {
        super(address);
        company = Company.ELEKSNET;
        commission = 11;
        zeroCommission = 300;
    }
}