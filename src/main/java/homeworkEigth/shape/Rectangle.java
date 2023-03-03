package homeworkEigth.shape;

/*
P = (A + B)*2
S = A * B
 */
public class Rectangle extends Shape {

    public Rectangle(int sideA, int sideB) {
        super(sideA, sideB);
    }

    @Override
    public double getAria() {
        return super.getSideA() * super.getSideB();
    }

    @Override
    public double getPerimeter() {
        return (super.getSideA() + super.getSideB()) * 2;
    }
}
