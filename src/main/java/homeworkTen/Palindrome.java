package homeworkTen;

import java.util.Locale;

public class Palindrome {

    public static void isPalindrome(String value, int count) {
        String[] box = value.split(" ");
        if (count < box.length || count > box.length) {
            System.out.println("Task 4 = " + "This word dose not exist!");
        } else if (!(isPalindrome(box[count - 1].toLowerCase(Locale.ROOT)))) {
            System.out.println("Task 4 = " + "This word is not a palindrome!\n");
        } else System.out.println("Task 4 = " + "This word is a palindrome!\n");
    }

    private static boolean isPalindrome(String value) {
      StringBuilder builder = new StringBuilder(value);
        if (value.equals(String.valueOf(builder.reverse()))) {
            return true;
        } else return false;
    }
}
