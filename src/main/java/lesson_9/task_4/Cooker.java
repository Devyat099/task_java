package lesson_9.task_4;


import java.util.ArrayList;
import java.util.List;

public class Cooker {
    List<Food> order = new ArrayList<>();

    public void addFood(Food food) {
        order.add(food);
    }

    public int getSummCookingTime() {
        int cookingTime = 0;
        if (order.size() == 0) {
            return 0;
        }
        for (Food food : order) {
            cookingTime += food.getCookingTime();
        }
        return cookingTime;
    }

    public int getOrderSize() {
        return order.size();
    }

    public void clearOrder() {
        order.clear();
    }
}