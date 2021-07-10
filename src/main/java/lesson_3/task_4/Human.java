package lesson_3.task_4;

import java.util.Arrays;


public class Human {
    String name;
    Human[] friends = new Human[0];

    public Human(String name) {
        this.name = name;
    }

    public void addToFriends(Human friend) {
        Human[] array = Arrays.copyOf(friends, friends.length+1);
        if (array[friends.length] == null) {
            array[friends.length] = friend;
            friends = Arrays.copyOf(array, array.length);
        }
    }
}
