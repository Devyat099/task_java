package lesson_2.task_4;

import java.util.Arrays;

public class Symbol {
    public static void main(String[] args) {
        String[] oneString = {"hello"};
        String[] twoString = {"world"};
        String[] array = {""};

        for (int i = 0; i < oneString.length; i++) {
            char[] charArray = oneString[i].toCharArray();
            Arrays.sort(charArray);

            for (char newChar : charArray) {
                String newString = String.valueOf(newChar);
                if (array[i].contains(newString))
                    continue;

                if (twoString[i].contains(newString))
                    array[i] += newString;
            }
            System.out.println(array[i]);
        }
    }
}
