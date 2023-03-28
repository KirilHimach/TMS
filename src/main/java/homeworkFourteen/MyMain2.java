package homeworkFourteen;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class MyMain2 {
    public static void main(String[] args) throws FileNotFoundException {

        //Task3
        FileInputStream fileInputStream2 =
                new FileInputStream("src/main/java/homeworkFourteen/Exampl");
        BufferedReader bufferedReader2
                = new BufferedReader(new InputStreamReader(fileInputStream2));
        for (int j = 0; j < 6; j++) {
            Thread thread = new Thread(new MySynchronizedBuffer(bufferedReader2));
            thread.start();
        }
    }
}
