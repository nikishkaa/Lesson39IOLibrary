package by.itstep.goutor.javalesson.lesson39.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BinaryWorker {
    public static void write(String fileName) {

        OutputStream stream = null;
        try {
            stream = new FileOutputStream(fileName);

            for (int i = 0; i < 100; i++) {
                stream.write(i);
            }


            stream.flush();

            stream.close();


        } catch (FileNotFoundException exception) {
        } catch (IOException exception) {
            System.out.println(exception);

        }


    }
}
