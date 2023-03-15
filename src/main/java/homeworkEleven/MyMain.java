package homeworkEleven;

public class MyMain {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("A"); list.add("B"); list.add("C"); list.add("D"); list.add("A"); list.add("B"); list.add("C");
        list.add("D"); list.add("A"); list.add("B"); list.add("C"); list.add("D"); list.add("A"); list.add("B");
        list.add("C"); list.add("D"); list.add("A"); list.add("B"); list.add("C"); list.add("D"); list.add("A");
        list.add("B"); list.add("C"); list.add("D");

        System.out.println(list.getSize());

        for (int i = 0; i < list.getSize(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n");
        System.out.println(list.contains("Q"));
        System.out.println(list.contains("D"));

        System.out.println("\nremove object");
        list.remove("A");
        System.out.println(list.getSize());

        System.out.println();
        list.removeAll();
        System.out.println(list.getSize());
    }
}
