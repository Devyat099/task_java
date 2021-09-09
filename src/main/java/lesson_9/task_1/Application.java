package lesson_9.task_1;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            cars.add(Factory.make());
        }

        int renault = 0;
        int nissan = 0;
        int mitsubishi = 0;
        int mercedes = 0;
        int regular = 0;
        int premium = 0;

        for (Car car: cars) {
            if (car instanceof Renault)
                renault++;
            if (car instanceof Nissan)
                nissan++;
            if (car instanceof Mitsubishi)
                mitsubishi++;
            if (car instanceof Mercedes)
                mercedes++;
            if (car instanceof Regular)
                regular++;
            if (car instanceof Premium)
                premium++;
        }

        System.out.println("Изготовлено авто Renault: " + renault);
        System.out.println("Изготовлено авто Nissan: " + nissan);
        System.out.println("Изготовлено авто Mitsubishi: " + mitsubishi);
        System.out.println("Изготовлено авто Mercedes: " + mercedes);
        System.out.println("Изготовлено авто потребительский сегмент: " + regular);
        System.out.println("Изготовлено авто премиум: " + premium);
    }

}