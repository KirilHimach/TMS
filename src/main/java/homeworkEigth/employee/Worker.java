package homeworkEigth.employee;

public class Worker implements GetInfo {
    @Override
    public void getInfo() {
        System.out.println("Hello! I`m the " + getClass().getSimpleName());
    }
}
