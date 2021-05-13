package lesson_1.task_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task_4 {
    int ismeter(int sm) {
        return sm / 100;
    }

    public static void main(String[] args) throws IOException {
        task_4 metr = new task_4();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Длина в сантиметрах: ");
        int dlina_sm = Integer.parseInt(reader.readLine());
        System.out.println(("Из них метров: " + metr.ismeter(dlina_sm)));

    }


}