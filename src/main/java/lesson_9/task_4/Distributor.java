package lesson_9.task_4;

import java.util.List;

public abstract class Distributor implements CookChooser {

    @Override
    public abstract Cooker chooseCooker(List<Cooker> cookers);

    public void addFood(Food food, List<Cooker> cookers) {
        chooseCooker(cookers).addFood(food);
    }
}
