package homeworkFourteen;

import java.io.BufferedReader;
import java.io.IOException;

public class MySynchronizedBuffer implements Runnable {
    static int counter = 0;
    BufferedReader reader;

    public MySynchronizedBuffer(BufferedReader reader) {
        this.reader = reader;
    }

    @Override
    public void run() {
        synchronized (reader) {
            try
            {
                int i = 0;
                while (i < 12) {
                    System.out.println(Thread.currentThread().getName()
                            + " result = " + reader.readLine() + " - counter = " + counter);
                    i++;
                }
                counter++;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
