package homeworkEigth.employee;

public class Director implements GetInfo {
    @Override
    public void getInfo() {
        System.out.println("Hello! I`m the " + getClass().getSimpleName());
    }
}
