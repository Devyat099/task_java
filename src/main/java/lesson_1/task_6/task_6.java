package lesson_1.task_6;

public class task_6 {
    boolean one(boolean a, boolean b, boolean c, boolean d){
        return a && b && !(c || d);
    }

    public static void main(String[] args) {
        task_6 bool = new task_6();
        System.out.println(bool.one(false,false,false,false));
        System.out.println(bool.one(true,true,true,true));
        System.out.println(bool.one(true, true,false,false));

    }
}