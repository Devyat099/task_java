package lesson_7.task_1;

import java.util.ArrayList;

public class MyArrayList<T> extends ArrayList<T> {

//    @Override
    public int size() {
        System.out.println("Размер списка: " + super.size());
        return super.size();
    }

    @Override
    public boolean add(T t) {
        System.out.println("Добавлен обьект " + t + " в список");
        return super.add(t);
    }

    @Override
    public boolean contains(Object o) {
        System.out.printf("Объект %s содержится в списке %n", super.contains(o) ? "уже" : "не");
        return super.contains(o);
    }

    @Override
    public T get(int index) {
        T object = null;
        try {
            object = super.get(index);
        }
        catch (IndexOutOfBoundsException ignored) {
        }
        System.out.printf("Получен объект %s из списка%n", object);
        return object;
    }

    @Override
    public void add(int index, T element) {
        if (index < super.size() && index >= 0) {
            super.add(index, element);
            System.out.printf("Добавлен объект %s в список на позицию %d%n", element, index);
        } else {
            super.add(0, element);
            System.out.printf("Добавлен объект %s в список на позицию 0 %n", element);
        }
    }
}