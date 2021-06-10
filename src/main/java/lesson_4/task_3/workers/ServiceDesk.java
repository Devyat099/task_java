package lesson_4.task_3.workers;


public class ServiceDesk {
    static int ticketNumber = 0;

    public static void createTicket(String description) {
        ticketNumber++;
        System.out.printf("Заявка %d была создана - %s%n", ticketNumber, description);
        if (description.matches("^.*((спра)|(отчет)|(бюджет)).*$")) {
            Accountant.takeTicket(ticketNumber);
            return;
        }
        if (description.matches("^.*((доставка)|(курьер)).*$")) {
            Logistician.takeTicket(ticketNumber);
            return;
        }
        if (description.matches("^.*((компьютер)|(принтер)|(сервер)).*$")) {
            SysAdmin.takeTicket(ticketNumber);
            return;
        }
        if (description.matches("^.*(убор).*$")) {
            Cleaner.takeTicket(ticketNumber);
            return;
        }
        else {
            System.out.println("Специалист по выполнению данной заявки не найден");
        }
    }
}