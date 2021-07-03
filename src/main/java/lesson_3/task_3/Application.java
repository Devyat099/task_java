package lesson_3.task_3;

public class Application {
    public static void main(String[] args) {
        Human grandfatherFather = new Human(75, "Валерий", null,null);
        Human grandmotherFather = new Human(80, "Александра", null, null);
        Human grandfatherMother = new Human(65, "Иван", null, null);

        Human father = new Human(23,"Сергей",grandmotherFather,grandfatherFather);
        Human mother = new Human(25, "Марина",null, grandfatherMother);

        Human children = new Human(3,"Виталий", mother,father);
        Human children2 = new Human(1,"Елена", mother,father);

        int i = 0;
        Human[] grandParents = new Human[4];

        for (Human children2grandparents : children2.parents) {
            for (Human grandParent : children2grandparents.parents) {
                grandParents[i] = grandParent;
                i++;
            }
        }

        System.out.println("Дедушек и бабушек Елены зовут:");

        for (Human grandparents : grandParents) {
            if (grandparents != null) {
                System.out.println(grandparents.name + " " + grandparents.age + " лет");
            }
        }
    }
}