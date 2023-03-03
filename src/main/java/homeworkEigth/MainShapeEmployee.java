package homeworkEigth;

import homeworkEigth.employee.Accountant;
import homeworkEigth.employee.Director;
import homeworkEigth.employee.Worker;
import homeworkEigth.shape.Circle;
import homeworkEigth.shape.Rectangle;
import homeworkEigth.shape.Shape;
import homeworkEigth.shape.Triangle;

public class MainShapeEmployee {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(9),
                new Rectangle(6, 8),
                new Triangle(1, 5, 7), //Catch mistake!!!!!
                new Triangle(4, 6, 9),
                new Circle(15)};
        System.out.println("Exercise #1\n");
        System.out.print("Sum of the perimeter of shapes = ");
        Shape.sumPerimeter(shapes);
        System.out.print("Sum of the arias of shapes = ");
        Shape.sumAria(shapes);
        System.out.println("\n                   =============================\n");

        System.out.println("Exercise #2\n");
        Director director = new Director();
        Accountant accountant = new Accountant();
        Worker worker = new Worker();
        director.getInfo();
        accountant.getInfo();
        worker.getInfo();
        System.out.println("\n                   =============================\n");
    }
}