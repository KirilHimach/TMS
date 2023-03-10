package homeworkTen;

public class MinDifferentLetter {

    public static void minLetters(String value) {
        String[] box = value.split(" ");
        String result = box[0];
        for (String i : box) {
            if (checkWord(i) < checkWord(result)) {
                result = i;
            }
        }
        System.out.println("Task 3 = " + result + "\n");
    }

    private static int checkWord(String value) {
        String result = "";
        for (int i = 0; i < value.length(); i++) {
            if (!result.contains(String.valueOf(value.charAt(i)))) {
                result = result + value.charAt(i);
            }
        }
        return result.length();
    }
}
