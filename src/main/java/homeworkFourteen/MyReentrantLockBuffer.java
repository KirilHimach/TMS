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
            while (i < 12) {
                System.out.println(Thread.currentThread().getName()
                        + " result = " + reader.readLine() + " - counter = " + counter);
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
