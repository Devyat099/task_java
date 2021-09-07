package lesson_8.task_3;

public enum Company {
    QIWI("ООО \"Киви\""),
    ELEKSNET("ООО \"Элекснет\""),
    TINKOFF("АО \"Тинькофф\"");

    private final String name;

    Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}