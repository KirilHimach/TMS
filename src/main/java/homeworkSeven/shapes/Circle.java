package homeworkSeven.shapes;

/*
S=PiR2
P=2PiR
 */
public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int getAria() {
        return (int) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public int getPerimeter() {
        return (int) (Math.PI * radius * 2);
    }
}
