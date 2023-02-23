public class Main {

    public static void main(String[] args) {
        runTaskOne(-55);
        runTaskTwo(5, 6, 7);
        runTaskThree(-5);
        runTaskFour(5, -5, 99);
        runTaskFive(1, -5, 6);
        runTaskSix(9, 2);
        runTaskSeven(10);
    }

    /*
    В переменную записываем число. Надо вывести на экран сколько в этом
числе цифр и положительное оно или отрицательное. Например, "это
однозначное положительное число". Достаточно будет определить, является ли
число однозначным, "двухзначным или трехзначным и более.
     */
    public static void runTaskOne(int value) {
        System.out.println("Task one result:");
        System.out.println();
        int valueLength = String.valueOf(value).length();
        if (value >= 0) {
            switch (valueLength) {
                case 0 -> System.out.println("This is zero");
                case 1 -> System.out.println("this is a single-digit positive number");
                case 2 -> System.out.println("this is a two-digit positive number");
                case 3 -> System.out.println("this is a three-digit positive number");
                default -> System.out.println("the number is very large");
            }
        } else {
            switch (valueLength) {
                case 2 -> System.out.println("this is a single-digit negative number");
                case 3 -> System.out.println("this is a two-digit negative number");
                case 4 -> System.out.println("this is a three-digit negative number");
                default -> System.out.println("the number is very large");
            }
        }
        System.out.println("--------------------------------------");
    }

    /*
    Треугольник существует только тогда, когда сумма любых двух его сторон
больше третьей. Определить существует ли такой треугольник. Дано: a, b, c –
стороны предполагаемого треугольника. Требуется сравнить длину каждого
отрезка-стороны с суммой двух других. Если хотя бы в одном случае отрезок
окажется больше суммы двух других, то треугольника с такими сторонами не
существует.
     */
    public static void runTaskTwo(int lengthOne, int lengthTwo, int lengthThree) {
        System.out.println("Task two result:");
        System.out.println();
        if (lengthOne < (lengthTwo + lengthThree) || lengthTwo < (lengthOne + lengthThree)
                || lengthThree < (lengthOne + lengthTwo)) {
            System.out.println("the triangle exists");
        } else System.out.println("the triangle dose not exists");
        System.out.println("--------------------------------------");
    }

    /*
    Дано целое число. Если оно является положительным, то прибавить к нему 1.
Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
10. Вывести полученное число.
     */
    public static void runTaskThree(int value) {
        System.out.println("Task three result:");
        System.out.println();
        if (value == 0) {
            System.out.println(10);
        } else if (value > 0) {
            System.out.println(value + 1);
        } else {
            System.out.println(value - 2);
        }
        System.out.println("--------------------------------------");
    }

    /*
    Даны 3 целых числа. Найти количество положительных чисел в исходном
наборе.
     */
    public static void runTaskFour(int valueOne, int valueTwo, int valueThree) {
        System.out.println("Task four result:");
        System.out.println();
        int result = 0;
        if (valueOne > 0) {
            result++;
        } if (valueTwo > 0) {
            result++;
        } if (valueThree > 0) {
            result++;
        }
        System.out.println(result);
        System.out.println("--------------------------------------");
    }

    /*
    Даны 3 целых числа. Найти количество положительных и отрицательных
чисел в исходном наборе.
     */
    public static void runTaskFive(int valueOne, int valueTwo, int valueThree) {
        System.out.println("Task five result:");
        System.out.println();
        int positiveResult = 0;
        int negativeResult = 0;
        if (valueOne > 0) {
            positiveResult++;
        } else if (valueOne < 0) {
            negativeResult++;
        }
        if (valueTwo > 0) {
            positiveResult++;
        } else if (valueTwo < 0) {
            negativeResult++;
        }
        if (valueThree > 0) {
            positiveResult++;
        } else if (valueThree < 0) {
            negativeResult++;
        }
        System.out.println("positive number - " + positiveResult);
        System.out.println("negative number - " + negativeResult);
        System.out.println("--------------------------------------");
    }

    /*
    Даны 2 числа. Вывести большее из них.
     */
    public static void runTaskSix(int valueOne, int valueTwo) {
        System.out.println("Task six result:");
        System.out.println();
        System.out.println(Math.max(valueOne, valueTwo));
        System.out.println("--------------------------------------");
    }

    /*
    (Дополнительно) В переменную записываете количество программистов. В
зависимости от количества программистов необходимо вывести правильно
окончание. Например:
• 2 программиста
• 1 программиста
• 10 программистов
• и т.д.
     */
    public static void runTaskSeven(int value) {
        System.out.println("Task seven result:");
        System.out.println();
        if (value == 1) {
            System.out.println(value + " программист");
        } else if (value >= 2 && value <= 4) {
            System.out.println(value + " программиста");
        } else if (value >= 5 && value <= 10 || value == 0) {
            System.out.println(value + " программистов");
        } else System.out.println("очень много программистов");
        System.out.println("--------------------------------------");
    }
}
