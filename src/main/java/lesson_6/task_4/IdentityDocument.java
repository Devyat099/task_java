package lesson_6.task_4;

import java.util.Random;

public class IdentityDocument {
    private final IdentityDocumentType identityDocumentType;
    private String id;

    public IdentityDocument(IdentityDocumentType documentType, String id) {
        this.identityDocumentType = documentType;
        this.id = id;
    }

    public IdentityDocumentType getDocumentType() {
        return identityDocumentType;
    }

    public static IdentityDocument random() {
        int documentTypeCount = IdentityDocumentType.values().length;
        IdentityDocumentType RandomDocumentType = IdentityDocumentType.values()[new Random().nextInt(documentTypeCount)];
        String randomId = StringGenerator.generate(RandomDocumentType);
        return new IdentityDocument(RandomDocumentType, randomId);
    }
}