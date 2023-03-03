package homeworkEigth.shape;

/*
P = 2PiR
        2
S = 2PiR
 */
public class Circle extends Shape {

    public Circle(int radius) {
        super(radius);
    }

    @Override
    public double getAria() {
        return Math.pow((2 * Math.PI * super.getRadius()), 2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * super.getRadius() * 2;
    }
}
