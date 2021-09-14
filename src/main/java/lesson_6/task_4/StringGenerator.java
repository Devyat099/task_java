package lesson_6.task_4;

import java.util.Random;

public class StringGenerator {
    private static final String NUMBERS = "0123456789";
    private static final String RUSSIAN_ALPHABET = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private static final String RANDOM_SYMBOLS = "CVFRTGOQAZXSWEBNHYUJMKILDP0123456789";

    public static String generate(IdentityDocumentType documentType) {
        switch (documentType) {
            case MILITARY_ID_CARD:
                return generateMilitary();
            case DIPLOMATIC_PASSPORT:
                return generateDiplomatic();
            case FOREIGN_CITIZEN:
                return generateForeignPassport();
            case RUSSIAN_PASSPORT:
                return generatePassport();
            case INTERNATIONAL_PASSPORT:
                return generateInternationalPassport();
            default:
                throw new IllegalArgumentException("Неизвестный тип документа");
        }
    }

    private static String generateMilitary() {
        StringBuilder military = new StringBuilder();
        if (50 > new Random().nextInt(100)) {
            military.append(generateRandomString(NUMBERS, 1));
        }
        military.append(generateRandomString(NUMBERS, 6));
        return military.toString();
    }

    private static String generateDiplomatic() {
        String diplomatic = generateRandomString(NUMBERS, 2) + " " + generateRandomString(NUMBERS, 7);
        return diplomatic;
    }

    private static String generateForeignPassport() {
        return generateRandomString(RANDOM_SYMBOLS, 25);
    }

    private static String generatePassport() {
        String russianPassport = generateRandomString(NUMBERS, 2) +
                generateRandomString(NUMBERS, 2) +
                generateRandomString(NUMBERS, 6);
        return russianPassport;
    }

    private static String generateInternationalPassport() {
        return generateRandomString(NUMBERS, 2);
    }

    private static String generateRandomString(String symbolsType, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(symbolsType.charAt(new Random().nextInt(symbolsType.length())));
        }
        return sb.toString();
    }
}