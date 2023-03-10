package homeworkTen;

import java.util.Arrays;
import java.util.Comparator;

public class CompareString {
    public static void shortestMessage(String message) {
        System.out.println("Task 2 = " + sortMessage(message, true) + "\n");
    }

    public static void longestMessage(String message) {
        System.out.println("Task 2 = " + sortMessage(message, false) + "\n");
    }

    private static String sortMessage(String message, boolean value) {
        String[] box = message.split(" ");
        Arrays.sort(box, Comparator.comparingInt(String::length));
        if (value) {
            return box[0];
        } else return box[box.length - 1];
    }
}
