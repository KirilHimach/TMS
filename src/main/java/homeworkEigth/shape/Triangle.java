package homeworkEigth.shape;

/*
S =корень из p(p - A)(p - B)(p - C)
P = A + B + C
 */
public class Triangle extends Shape {

    public Triangle(int sideA, int sideB, int sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    public double getAria() {
        double halfP = getPerimeter() / 2;
        return Math.sqrt(halfP * (halfP - super.getSideA())
                * (halfP - super.getSideB()) * (halfP - super.getSideC()));
    }

    @Override
    public double getPerimeter() {
        return super.getSideA() + super.getSideB() + super.getSideC();
    }
}
