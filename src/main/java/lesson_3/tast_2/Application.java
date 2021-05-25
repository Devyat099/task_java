package lesson_3.tast_2;

public class Application {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat(2, 5, "Барсик"),
                new Cat(3, 11, "Мурзик"),
                new Cat(7, 2, "Матильда"),
                new Cat(1, 3, "Леопольд"),
                new Cat(11, 4, "Базилио")
        };

        String[] nameCat = new String[cats.length];
        for (int i = 0; i < cats.length; i++) {
            nameCat[i] = cats[i].name;
        }

        for (String name: nameCat){
            for (Cat cat : cats) {
                if (cat.name.contains(name)) {
                    System.out.println("Имя: " + cat.name + " Возраст: " + cat.age + "Вес: " + cat.weight);
                    break;
                }
            }
        }
    }
}
