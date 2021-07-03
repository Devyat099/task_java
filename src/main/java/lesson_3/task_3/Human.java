package lesson_3.task_3;

public class Human {
    protected int age;
    protected String name;
    protected Human[] parents;

    public Human(int age, String name, Human mother, Human father) {
        this.age = age;
        this.name = name;
        this.parents = new Human[]{father, mother};
    }
}