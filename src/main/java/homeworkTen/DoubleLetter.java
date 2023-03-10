package homeworkTen;

public class DoubleLetter {

    public static void getDoubleLetter(String value) {
        String result = "";
        for (int i = 0; i < value.length(); i++) {
            result = result + value.charAt(i) + value.charAt(i);
        }
        System.out.println("Task 5 = " + result + "\n");
    }
}
