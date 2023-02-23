import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        createAndModifiedArray();
        scanner.close();
        createChessBoard();
    }

    /*
    1. ������� ���������� ������ �� ����� �����.
    � ������� ������ "������" �� ����� ������� � ��������� ������ ������� �� �������� �����.
    ����� �����, �� ������� ����� ������������� ������ �������, �������� �� �������.
     */
    private static void createAndModifiedArray() {
        System.out.println("Run task one");
        System.out.println();
        System.out.print("Enter a number: ");
        int initializationArray = 1;
        int countScanner = scanner.nextInt();
        int[][] doubleArray = new int[5][5];
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] = initializationArray++;
            }
        }
        System.out.println("Original array: " + Arrays.deepToString(doubleArray));
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] += countScanner;
            }
        }
        System.out.println("Modified array: " + Arrays.deepToString(doubleArray));
        System.out.println("              ------------------------");
    }

    /*
    2. ��������� �����.
    ������� ��������� ��� ��������� ��������� ����� � ������� �����.
    ������� ��������� ������ String'�� 8�8. � ������� ������ ������ ���������
    ������ �������� B(Black) ��� W(White). ��������� ������ ���������:
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
     */
    private static void createChessBoard() {
        System.out.println("Run task two");
        System.out.println();
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                chessBoard[i][j] = ((i % 2) == 0) ? (((j % 2) == 0) ? "W" : "B") : (((j % 2) == 0) ? "B" : "W");
            }
        }
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("              ------------------------");
    }
}
