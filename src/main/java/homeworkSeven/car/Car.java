package homeworkSeven.car;

/*
Создать класс Машина со следующими параметрами:
модель, цвет, год производства, максимальная скорость (используем принципы инкапсуляции).
В основном классе создать два массива объектов класса машина с
разными моделями машин (по 4 объекта в каждом). Через сравнение всех моделей машин,
вывести самую старую модель и самую быструю.
 */
public class Car {
    private String model;
    private String colour;
    private int yearProduction;
    private int maxSpeed;

    public Car(String model, String colour, int yearProduction, int maxSpeed) {
        this.model = model;
        this.colour = colour;
        this.yearProduction = yearProduction;
        this.maxSpeed = maxSpeed;
    }

    public static Car getOldestCar(Car[] cars, Car[] cars1) {
        Car oldCar = cars[0];
        for (int i = 0; i < cars.length; i++) {
            oldCar = (oldCar.yearProduction < cars[i].yearProduction) ?
                    ((oldCar.yearProduction < cars1[i].yearProduction) ? oldCar : cars1[i]) :
                    ((cars[i].yearProduction < cars1[i].yearProduction) ? cars[i] : cars1[i]);
        }
        return oldCar;
    }

    public static Car getFastestCar(Car[] cars, Car[] cars1) {
        Car fastCar = cars[0];
        for (int i = 0; i < cars.length; i++) {
            fastCar = (fastCar.maxSpeed > cars[i].maxSpeed) ?
                    ((fastCar.maxSpeed > cars1[i].maxSpeed) ? fastCar : cars1[i]) :
                    ((cars[i].maxSpeed > cars1[i].maxSpeed) ? cars[i] : cars1[i]);
        }
        return fastCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", yearProduction=" + yearProduction +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}