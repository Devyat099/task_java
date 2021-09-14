package lesson_6.task_4;

public class Person {
    private final String firstName;
    private final String lastName;
    protected IdentityDocument document;

    Person(String firstName, String lastName, IdentityDocument document) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.document = document;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public IdentityDocument getIdentityDocument() {
        return document;
    }

    public static Person random() {
        return new Person(NameGenerator.generate(), NameGenerator.generate(), IdentityDocument.random());
    }
}