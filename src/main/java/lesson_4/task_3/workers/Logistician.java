package lesson_4.task_3.workers;

public class Logistician {
    private static int ticketNumber;

    public static void takeTicket(int ticketNumber) {
        Logistician.ticketNumber = ticketNumber;
        System.out.printf("Заявка %d была принята логистом%n%n", ticketNumber);
    }
}
