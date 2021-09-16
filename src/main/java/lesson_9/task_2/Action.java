package lesson_9.task_2;

public class Action {
    public static void anAction(Object obj) {
        if (obj instanceof Drawable) {
            Drawable drawable = (Drawable) obj;
            drawable.draw();
        }
        if (obj instanceof Movable) {
            ((Movable) obj).move();
        }
    }
}
