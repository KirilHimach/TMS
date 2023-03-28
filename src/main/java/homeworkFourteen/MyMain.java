package homeworkFourteen;

import java.io.*;
import java.util.concurrent.locks.ReentrantLock;

public class MyMain {
    public static void main(String[] args) throws InterruptedException, IOException {

        //Task1
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is thread 1");
                int j = 0;
                for (int i = 0; i < 1_000_000_000; i++) {
                    j = i;
                }
                System.out.println("Thread 1 result = " + j);
            }
        });
        Thread thread2 = new Thread(() -> System.out.println("This is thread 2"));
        Thread thread3 = new Thread(() -> {
            System.out.println("This is thread 3");
            int j = 0;
            for (int i = 0; i < 1_000_000_000; i++) {
                j = i;
            }
            System.out.println("Thread 3 result = " + j);
        });

        thread3.start();
        thread3.join();

        thread2.start();
        thread2.join();

        thread1.start();
        thread1.join();

        System.out.println();
        System.out.println("\n===========================================\n");

        //Task2
        ReentrantLock lock = new ReentrantLock();
        FileInputStream fileInputStream =
                new FileInputStream("src/main/java/homeworkFourteen/Exampl");
        BufferedReader bufferedReader
                = new BufferedReader(new InputStreamReader(fileInputStream));
        for (int j = 0; j < 6; j++) {
            Thread thread = new Thread(new MyReentrantLockBuffer(lock, bufferedReader));
            thread.start();
        }

        System.out.println("\n===========================================\n");


    }
}
