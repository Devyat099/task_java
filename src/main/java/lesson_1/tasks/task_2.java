package lesson_1.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task_2 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Длина: ");
        int width = Integer.parseInt(reader.readLine());
        System.out.print("Ширина ");
        int height = Integer.parseInt(reader.readLine());

        System.out.println(width);
        System.out.println(height);
        //System.out.println(s);
        int perimeter = (width + height)*2;
        int square = width * height;


        //boolean ui =

        //if (perimeter < square) {
          //  return 2 == 2;
        }


    }
