package homeworkSeven.shapes;

/*
S = ab - для равностороннего
P = a+b+c+d - для равностороннего
 */
public class Rectangle extends Shape {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int getAria() {
        return sideA * sideB;
    }

    @Override
    public int getPerimeter() {
        return (sideA + sideB) * 2;
    }
}
