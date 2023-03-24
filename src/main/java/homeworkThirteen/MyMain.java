package homeworkThirteen;

import org.apache.commons.math3.util.CombinatoricsUtils;
import java.util.*;

public class MyMain {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      //Task1
      MyDate date = new MyDate();
      System.out.println("Task 1");
      System.out.println("Enter your date in the format \"dd.mm.yyyy\"");
      date.getDayOfWeek(scanner.nextLine());
      System.out.println("\n======================================\n");

      //Task2
      System.out.println("Task 2");
      System.out.println();
      System.out.println("Enter your date in the format \"dd.mm.yyyy\"");
      date.getNextTuesday(scanner.nextLine());
      System.out.println("\n======================================\n");

      //Task3
      System.out.println("Task 3");
      System.out.println("Max value for the factorial !> 20");
      System.out.println("Enter the number 1 or 2");
      int box = Integer.parseInt(scanner.nextLine());
      if (box == 1) {
         MyInterface<String, String> reversString = value -> String.valueOf(new StringBuilder(value).reverse());
         System.out.println("Revers result = " + reversString.getResult(scanner.nextLine()));
      } else if (box == 2) {
         MyInterface<Integer, Long> inputValue = CombinatoricsUtils::factorial;
         System.out.println("The factorial = " + inputValue.getResult(Integer.parseInt(scanner.nextLine())));
      }
      System.out.println("\n======================================\n");



      //Task4
      System.out.println("Task 4\n");
       List<Integer> numbers = new ArrayList<>(
              Arrays.asList(1, 45, 94, 462, 13, 945, 21, 17, 14, 12,
                      2, 4, 5, 12, 0, -6, -99, 10, 99, 68, 8, 321, 3, 3, 7, 64, 92, 24, 1));


      System.out.println("\nDelete duplicate");
                  numbers.stream()
                          .distinct()
                          .toList().forEach(i -> System.out.print(i + " "));
      System.out.println("\n======================================\n");

      System.out.println("Output x % 2 == 0 && x >= 7 && x <= 17");
                  numbers.stream()
                          .filter(x -> x % 2 == 0 && x >= 7 && x <= 17)
                          .forEach(i -> System.out.print(i + " "));
      System.out.println("\n======================================\n");

      System.out.println("Each of elements * 2");
                  numbers.stream()
                          .map(i -> i * 2)
                          .forEach(i -> System.out.print(i + " "));
      System.out.println("\n======================================\n");

      System.out.println("The elements sort and show elements from the first to the four");
                  numbers.stream()
                          .sorted()
                          .limit(4)
                          .forEach(x -> System.out.print(x + " "));
      System.out.println("\n======================================\n");

      System.out.println("Show collection size");
      System.out.println("Count of the stream = " + numbers.size());
      System.out.println("\n======================================\n");

      System.out.println("Show average the collection");
      System.out.println(String.format("%.2f",
              numbers.stream()
                      .mapToInt(x -> x)
                      .average()
                      .getAsDouble()));
      System.out.println("\n======================================\n");
   }
}
