package lesson_7.task_2;
import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) throws Exception {
        ThreeHashMap<Integer, Person, Passport> threeHashMap = new ThreeHashMap();
        for (int i = 0; i < 10; i++) {
            threeHashMap.put(i, new Person(), new Passport());
        }

        Map<Integer, Person> persons = new HashMap<>();
        Map<Integer, Passport> passports = new HashMap<>();
        for (int i = 0; i < 20; i++) {
            persons.put(i, new Person());
            passports.put(i + 10, new Passport());
        }

        threeHashMap.putAll(persons, passports);
        threeHashMap.printAll();
    }
}