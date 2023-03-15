package homeworkEleven;


import java.util.Arrays;

public class MyArrayList<T> {
    private int defaultSize = 16;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[defaultSize];
    private int size = 0;

    public MyArrayList(int init) {
        this.defaultSize = init;
    }

    public MyArrayList() {
    }

    public int getSize() {
        return size;
    }

    public void add(T o) {
        if(size == array.length-1) resize(array.length * 2);
        array[size++] = o;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public boolean contains(T o) {
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public void remove(T o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(array[i])) {
                array[i] = null;
                size--;
                int box = i + 1;
                if (box < size) {
                    for (int j = box; j < size; j++) {
                        array[j - 1] = array[j];
                    }
                    return;
                }
            }
        }
    }

    public void removeAll() {
        array = new Object[defaultSize];
        size = 0;
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}
