import homeworkSeven.car.Car;
import homeworkSeven.shapes.Circle;
import homeworkSeven.shapes.Rectangle;
import homeworkSeven.shapes.Shape;
import homeworkSeven.shapes.Triangle;

import static homeworkSeven.car.Car.getFastestCar;
import static homeworkSeven.car.Car.getOldestCar;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {new Car("Ferrari", "Gray", 1997, 126),
                new Car("Bugatti", "Light blue", 2021, 492),
                new Car("Lada", "Light yellow", 2020, 220),
                new Car("MAZ", "Red", 2009, 185)};
        Car[] cars1 = {new Car("KIA", "Pink", 2019, 267),
                new Car("Renault", "Light braun", 1987, 106),
                new Car("Iveco", "Dirt asphalt", 2023, 220),
                new Car("Ford", "Clear sky", 1997, 239)};
        System.out.println("The oldest car is: " + getOldestCar(cars, cars1));
        System.out.println("The fastest car is: " + getFastestCar(cars, cars1));
        System.out.println("\n                ------------------------------------\n");
        Shape[] shapes = {new Circle(15), new Rectangle(36, 9),
                new Triangle(8,15), new Triangle(9, 6, 7),
                new Rectangle(87, 60)};
        System.out.println("Sum of aria = " + Shape.sumAria(shapes));
        System.out.println("Sum of perimeter = " + Shape.sumPerimeter(shapes));
    }
}
