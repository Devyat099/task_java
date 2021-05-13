package lesson_1.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task_1 {

    double square(int radius) {
        return 3.14 * radius * radius;
    }


    public static void main(String[] args) throws IOException
    {
        task_1 square = new task_1();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Радиус: ");
        int radius = Integer.parseInt(reader.readLine());
        System.out.println("Площадь: " + square.square(radius));
    }

}
