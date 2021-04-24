package lesson_1.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task_2 {

        boolean zn(int width, int height) {
        int perimeter = (width + height)*2;
        int square = width * height;
        return perimeter < square;
    }

    public static void main(String[] args) throws IOException
    {
        task_2 classs = new task_2();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Длина: ");
        int width = Integer.parseInt(reader.readLine());

        System.out.print("Ширина: ");
        int height = Integer.parseInt(reader.readLine());

        System.out.println(classs.zn(height, width));
        }
    }
