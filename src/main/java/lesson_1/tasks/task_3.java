package lesson_1.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task_3 {

    boolean chislo(int va) {
        int o = va % 2;
        return o == 0;
    }

    public static void main(String[] args) throws IOException {
        task_3 classs = new task_3();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введи число: ");
        int ch = Integer.parseInt(reader.readLine());
        //int chislo = Integer.parseInt(reader.readLine());
        System.out.println("Число четное: " + classs.chislo(ch));
    }

}
