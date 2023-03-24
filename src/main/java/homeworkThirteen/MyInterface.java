package homeworkThirteen;

@FunctionalInterface
public interface MyInterface<T, R> {
    R getResult(T t);
}
