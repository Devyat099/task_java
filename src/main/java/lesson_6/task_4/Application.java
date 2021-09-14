package lesson_6.task_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            persons.add(Person.random());
        }

        Map<IdentityDocumentType, Integer> documentTypeCount = new HashMap<>();
        for (IdentityDocumentType documentType : IdentityDocumentType.values()) {
            Integer documentCount = 0;
            for (Person person : persons) {
                if (person.document.getDocumentType().equals(documentType)) {
                    documentCount++;
                }
            }
            documentTypeCount.put(documentType, documentCount);
        }

        List<String> identityDocumentTypeCodes = new ArrayList<>();
        for (IdentityDocumentType documentType : IdentityDocumentType.values()) {
            identityDocumentTypeCodes.add(documentType.getCode());
        }
        Collections.sort(identityDocumentTypeCodes);
        Collections.reverse(identityDocumentTypeCodes);

        for (String code : identityDocumentTypeCodes) {
            IdentityDocumentType documentType = IdentityDocumentType.getByCode(code);
            System.out.printf("%s (%s): %d%n", documentType.getDescription(), code, documentTypeCount.get(documentType));
        }

        persons.removeIf(person -> !person.getIdentityDocument().getDocumentType().getCode().equals("21"));

        System.out.format("%n");
        System.out.println("Всего в списке: " + persons.size());
    }
}