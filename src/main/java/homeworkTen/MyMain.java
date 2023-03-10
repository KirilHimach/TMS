package homeworkTen;

public class MyMain {
    //xxxx-yyy-xxxx-yyy-xyxy, где x Ч это число, а y Ч это буква
    //1234-qwe-9517-gop-5b6d
    public static void main(String[] args) {
        //Task1
        DocumentNumber.getNumber("1234-qwe-9517-gop-5b6d");
        DocumentNumber.replaceNumber("1234-qwe-9517-gop-5b6d");
        DocumentNumber.getLetters("1234-qwe-9517-gop-5b6d");
        DocumentNumber.getUpperLetters("1234-qwe-9517-gop-5b6d");
        DocumentNumber.indexOfNumber("1234-abc-9517-gop-5b6d");
        DocumentNumber.startsWith("5554-abc-9517-gop-5b6d");
        DocumentNumber.endsWith("5554-abc-9517-gop-1a2b");

        //Task2
        CompareString.shortestMessage("afdsg ggg gfdssfdfsdf g qw");
        CompareString.longestMessage("afdsg ggg gfdssfdfsdf g qw");

        //Task3
        MinDifferentLetter.minLetters("asdd fffff ab f 1234 jkjk");

        //Task4
        Palindrome.isPalindrome("qwe asdsa", 2);

        //Task5
        DoubleLetter.getDoubleLetter("Hello!");
    }
}
