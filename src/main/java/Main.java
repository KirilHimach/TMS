import java.math.BigInteger;
import java.util.*;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        runTaskZero();
        runTaskOne();
        runTaskTwo();
        runTaskThree();
        scanner.close();
    }

    /*
    0. Создайте массив целых чисел. Напишете программу, которая выводит
сообщение о том, входит ли заданное число в массив или нет. Пусть
число для поиска задается с консоли (класс Scanner).
     */
    private static void runTaskZero() {
        System.out.println("Run task zero:");
        System.out.println();
        int[] fiveDifferentNumbers = {5, 9, 45, 96, 126};
        System.out.print("Enter a number: ");
        int box = scanner.nextInt();
        Arrays.sort(fiveDifferentNumbers);
        if (Arrays.binarySearch(fiveDifferentNumbers, box) >= 0) {
            System.out.println("The number exists");
        } else System.out.println("The number dose not exists");
        System.out.println("                   -----------------------                  ");
    }

    /*
    1. Создайте массив целых чисел. Удалите все вхождения
заданного числа из массива.
Пусть число задается с консоли (класс Scanner). Если такого числа нет
- выведите сообщения об этом.
В результате должен быть новый массив без указанного числа.
     */
    private static void runTaskOne() {
        System.out.println("Run task one:");
        System.out.println();
        int[] fiveDifferentNumbers = {6, 8, 6, 63, 45};
        System.out.print("Enter a number: ");
        int key = scanner.nextInt();
        int count = 0;
        for (int i : fiveDifferentNumbers) {
            if (i == key) count++;
        }
        if (count != 0) {
            int[] arrayBox = new int[fiveDifferentNumbers.length - count];
            int arrayBoxLength = 0;
            for (int i = 0; i < fiveDifferentNumbers.length; i++) {
                if (fiveDifferentNumbers[i] != key && arrayBoxLength < arrayBox.length) {
                    arrayBox[arrayBoxLength] = fiveDifferentNumbers[i];
                    arrayBoxLength++;
                }
            }
            System.out.print("The new array: ");
            System.out.println(Arrays.toString(arrayBox));
        } else System.out.println("The number dose not exists");
        System.out.println("                   -----------------------                  ");
    }

    /*
    2. Создайте и заполните массив случайным числами и выведете
максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random().
Пусть будет возможность создавать массив произвольного
размера. Пусть размер массива вводится с консоли.
     */
    private static void runTaskTwo() {
        System.out.println("Run task two:");
        System.out.println();
        System.out.print("Enter the array length: ");
        int[] array = new int[scanner.nextInt()];
        Random randomNumberForArray = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumberForArray.nextInt();
        }
        Arrays.sort(array);
        int minNumberFromArray = array[0];
        int maxNumberFromArray = array[array.length - 1];
        BigInteger averageValueFromArray = new BigInteger("0");
        for (int i : array) {
            averageValueFromArray = averageValueFromArray.add(BigInteger.valueOf(i));
        }
        averageValueFromArray = averageValueFromArray.divide(BigInteger.valueOf(array.length));
        System.out.println("Min value = " + minNumberFromArray);
        System.out.println("Average value = " + averageValueFromArray);
        System.out.println("Max value = " + maxNumberFromArray);
        System.out.println("                   -----------------------                  ");
    }

    /*
    3. Создайте 2 массива из 5 чисел.
Выведите массивы на консоль в двух отдельных строках.
Посчитайте среднее арифметическое элементов каждого массива и
сообщите, для какого из массивов это значение оказалось больше (либо
сообщите, что их средние арифметические равны).
     */
    private static void runTaskThree() {
        System.out.println("Run task three:");
        System.out.println();
        int[] arrayOne = {34, 95, -85, 46, -6};
        int[] arrayTwo = {-9, 68, 34, -1456, 0};
        System.out.println("Array one - " + Arrays.toString(arrayOne));
        System.out.println("Array two - " + Arrays.toString(arrayTwo));
        System.out.println();
        int countArrayOne = 0;
        int countArrayTwo = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            countArrayOne += arrayOne[i];
            countArrayTwo += arrayTwo[i];
        }
        countArrayOne /= arrayOne.length;
        countArrayTwo /= arrayTwo.length;
        if (countArrayOne == countArrayTwo) {
            System.out.println("Array one = array two");
        } else if (countArrayOne > countArrayTwo) {
            System.out.println("Array one > then array two");
        } else System.out.println("Array one < then array two");
        System.out.println("                   -----------------------                  ");
    }
}
