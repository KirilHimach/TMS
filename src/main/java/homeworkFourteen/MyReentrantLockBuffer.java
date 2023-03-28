package homeworkFourteen;

import java.io.*;
import java.util.concurrent.locks.ReentrantLock;

public class MyReentrantLockBuffer implements Runnable {
    static int counter = 0;
    ReentrantLock reentrantLock;
    BufferedReader reader;


    public MyReentrantLockBuffer(ReentrantLock reentrantLock, BufferedReader reader) {
        this.reentrantLock = reentrantLock;
        this.reader = reader;
    }

    @Override
    public void run() {
        reentrantLock.lock();
        try
        {
            int i = 0;
            String box;
            while ((box = reader.readLine()) != null && i < 12) {
                System.out.println(Thread.currentThread().getName()
                        + " result = " + box + " - counter = " + counter
                        + " - loop counter = " + i);
                i++;
            }
            counter++;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
    }
}
