package lesson_1.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class task_1 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Radius: ");
        // String radius = reader.readLine();
        int s = Integer.parseInt(reader.readLine());
        //int radius = Integer.parseInt(radius);
        double pi = 3.14;
        double sa = pi * s*s;


        System.out.println("Square: " + sa);

    }

}
