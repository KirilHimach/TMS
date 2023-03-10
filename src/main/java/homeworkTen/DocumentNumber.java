package homeworkTen;

import java.util.Locale;

/*
xxxx-yyy-xxxx-yyy-xyxy, где x Ч это число, а y Ч это буква
 */
public class DocumentNumber {

    public static void getNumber(String number) {
        System.out.println(number.substring(0, 4) + number.substring(9, 13));
        System.out.println();
    }

    public static void replaceNumber(String number) {
        System.out.println(number
                .replaceFirst(number.substring(5, 8), "***")
                .replaceFirst(number.substring(14, 17), "***"));
        System.out.println();
    }

    public static void getLetters(String number) {
        System.out.println(String.format("%s/%s/%s/%s", number.substring(5, 8),
                number.substring(14, 17),
                number.charAt(19),
                number.charAt(21)));
        System.out.println();
    }

    public static void getUpperLetters(String number) {
        StringBuilder builder = new StringBuilder(number);
        System.out.println(String.format("\"Letters:%S/%S/%S/%S\"",
                builder.substring(5, 8),
                builder.substring(14, 17),
                builder.substring(19, 20),
                builder.substring(21, 22)));
        System.out.println();
    }

    public static void indexOfNumber(String number) {
        if (!number.toLowerCase(Locale.ROOT).contains("abc")) {
            System.out.println("\"abc\" dose not exist.");
        } else System.out.println("\"abc\" is exist.");
        System.out.println();
    }

    public static void startsWith(String number) {
        System.out.println(number.startsWith("555"));
        System.out.println();
    }

    public static void endsWith(String number) {
        System.out.println(number.endsWith("1a2b"));
        System.out.println();
    }
}
