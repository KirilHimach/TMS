package homeworkNine;

public class MyMain {
    public static void main(String[] args) {
        try {
            Registration.check("login", "qwerty1", "qwerty1");
            Thread.sleep(1000);
            Registration.check("as dfg2", "qwerty1", "qwerty1");
            Thread.sleep(1000);
            Registration.check("login", "qwe rty1", "qwerty1");
            Thread.sleep(1000);
            Registration.check("login", "qwerty", "qwerty");
        } catch (Exception e) {
            System.out.println();
        }

    }
}
