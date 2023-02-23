package homeworkSeven.shapes;

/*
1. Написать иерархию классов «Фигуры».
Фигура -> Треугольник -> Прямоугольник -> Круг.
Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра.
Площадь треугольника по формуле Герона.
Создать массив из 5 фигур.
Вывести на экран сумму периметров и сумму площадей всех фигур в массиве.
 */
public class Shape {
    private int aria;
    private int perimeter;

    public Shape() {
    }

    public int getAria() {
        return 0;
    }

    public int getPerimeter() {
        return 0;
    }

    public static int sumAria(Shape[] shapes) {
        int sumShapes = 0;
        for (Shape shape : shapes) {
            sumShapes += shape.getAria();
        }
        return sumShapes;
    }

    public static int sumPerimeter(Shape[] shapes) {
        int sumPerimeter = 0;
        for (Shape shape : shapes) {
            sumPerimeter += shape.getPerimeter();
        }
        return sumPerimeter;
    }
}
