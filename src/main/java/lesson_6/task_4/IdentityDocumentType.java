package lesson_6.task_4;

public enum IdentityDocumentType {
    MILITARY_ID_CARD("07", "Военный билет"),
    DIPLOMATIC_PASSPORT("09", "Дипломатический паспорт"),
    FOREIGN_CITIZEN("10", "Паспорт иностранного гражданина"),
    RUSSIAN_PASSPORT("21", "Паспорт гражданина Российской Федерации"),
    INTERNATIONAL_PASSPORT("22", "Загранпаспорт гражданина Российской Федерации");

    private final String code;
    private final String description;

    IdentityDocumentType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static IdentityDocumentType getByCode(String code) {
        for (IdentityDocumentType documentType : values()) {
            if (documentType.code.equals(code)) {
                return documentType;
            }
        }
        return null;
    }
}