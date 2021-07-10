package lesson_3.task_4;

public class Application {
    public static void main(String[] args) {

        Human sergey = new Human("Сергей");
        Human mihail = new Human("Михаил");
        Human egor = new Human("Егор");
        Human valerii = new Human("Валерий");
        Human stanislav = new Human("Станислав");
        Human grigorii = new Human("Григорий");
        Human alexandr = new Human("Александр");

        sergey.addToFriends(valerii);
        sergey.addToFriends(grigorii);

        valerii.addToFriends(sergey);
        valerii.addToFriends(stanislav);

        stanislav.addToFriends(valerii);
        stanislav.addToFriends(mihail);

        mihail.addToFriends(stanislav);
        mihail.addToFriends(alexandr);

        egor.addToFriends(alexandr);
        egor.addToFriends(grigorii);

        alexandr.addToFriends(mihail);
        alexandr.addToFriends(egor);
        alexandr.addToFriends(grigorii);

        grigorii.addToFriends(alexandr);
        grigorii.addToFriends(sergey);
        grigorii.addToFriends(egor);

        System.out.println(isFriends(sergey, grigorii));
        System.out.println(isFriends(sergey, alexandr));
        System.out.println(isFriends(stanislav, mihail));
        System.out.println(isFriends(mihail, valerii));
    }

    public static boolean isFriends(Human friend1, Human friend2) {
        String firstName = friend1.name;
        for (int i = 0; i < friend2.friends.length; i++) {
            String secondName = friend2.friends[i].name;
            if (secondName.equals(firstName)) {
                return true;
            }
        }
        return false;
    }
}
