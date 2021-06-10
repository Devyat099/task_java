package lesson_4.task_3.workers;

public class SysAdmin {
    private static int ticketNumber;

    public static void takeTicket(int ticketNumber) {
        SysAdmin.ticketNumber = ticketNumber;
        System.out.printf("Заявка %d была принята системным администратором%n%n", ticketNumber);
    }
}