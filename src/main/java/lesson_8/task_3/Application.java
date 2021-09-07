package lesson_8.task_3;

import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Terminal> terminal = Arrays.asList(
                new QiwiTerminal("г. Москва, ул. Проходчиков, д.3"),
                new EleksnetTerminal("г. Москва, Измайловский пр-т, 73/2"),
                new EleksnetTerminal("г. Москва, ул. Бакунинская, д.1"),
                new EleksnetTerminal("г. Новосибирск, ул. Героев-Десантников, д. 4"),
                new TinkoffTerminal("г. Москва, Ленинградский пр-т, д. 15"));

        for (Terminal terminals : terminal) {
            terminals.pay("8 999-888-77-66", 0);
            terminals.pay("8 999-888-77-66", 50);
            terminals.pay("8 999-888-77-66", 300);
            terminals.pay("8 999-888-77-66", 500);
            terminals.pay("8 999-888-77-66", 1000);
            terminals.pay("8 999-888-77-66", 1050);
            terminals.pay("8 999-888-77-66", 1300);
            terminals.pay("8 999-888-77-66", 1500);
            terminals.pay("8 999-888-77-66", 2000);
            terminals.pay("8 999-888-77-66", 5000);
            terminals.pay("8 999-888-77-66", 50000);
        }
    }
}