package homeworkEigth.shape;

import java.util.Arrays;

/*
1. �������� �������� ������� ��������.
������ -> ����������� -> ������������� -> ����.
����������� �-� �������� ������� ��� ������� ���� ������ � �������
���������. ������� ������������ �� ������� ������.
������� ������ �� 5 �����.
������� �� ����� ����� ���������� � ����� �������� ���� ����� �
�������.
 */
public class Shape {
    private int sideA;
    private int sideB;
    private int sideC;
    private int radius;

    public Shape(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Shape(int radius) {
        this.radius = radius;
    }

    public Shape(int sideA, int sideB, int sideC) {
        if (checkTriangle(sideA, sideB, sideC)) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            System.out.println("The triangle dose not exist!");
        }
    }

    public double getAria() {return 0;}

    public double getPerimeter() {return 0;}

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public int getRadius() {
        return radius;
    }

    public static void sumAria(Shape[] shapes) {
        System.out.println(String.format("%.2f", Arrays.stream(shapes)
                .mapToDouble(Shape::getAria)
                .sum()));
    }

    public static void sumPerimeter(Shape[] shapes) {
        System.out.println(String.format("%.2f", Arrays.stream(shapes)
                .mapToDouble(Shape::getPerimeter)
                .sum()));
    }

    private boolean checkTriangle(int sideA, int sideB, int sideC) {
        if (sideA < (sideB + sideC) && sideB < (sideA + sideC) && sideC < (sideA + sideB)) {
            return true;
        } else return false;
    }
}
